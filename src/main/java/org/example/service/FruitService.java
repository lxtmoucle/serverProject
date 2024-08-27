package org.example.service;

import org.example.dao.FruitMapper;
import org.example.model.entity.Fruit;
import org.example.model.param.ListFruitParam;

import java.math.BigDecimal;
import java.util.Objects;

public class FruitService implements FruitMapper {
    public BigDecimal getFruitPrice(String fruitName) {
        return switch (fruitName) {
            case "apple" -> applePrice;
            case "strawberry" -> strawberryPrice;
            case "mango" -> mangoPrice;
            default -> BigDecimal.ZERO;
        };
    }

    public BigDecimal calFruitTotalPrice(ListFruitParam listFruitParam) throws Exception {
        if (Objects.isNull(listFruitParam) || Objects.isNull(listFruitParam.getFruits()) || listFruitParam.getFruits().isEmpty()) {
            System.out.print("食物信息不能为空");
            throw new IllegalArgumentException("食物信息不能为空");
        }
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Fruit fruit : listFruitParam.getFruits()) {
            BigDecimal totalApplePrice = getFruitPrice(fruit.getFruitName())
                    .multiply(fruit.getWeight())
                    .multiply(BigDecimal.valueOf(fruit.getDiscount()));
            totalPrice = totalPrice.add(totalApplePrice);
        }

        if (Objects.nonNull(listFruitParam.getPromotionActivity())) {
            if (totalPrice.compareTo(new BigDecimal(100)) >= 0) {
                totalPrice = totalPrice.subtract(BigDecimal.valueOf(listFruitParam.getPromotionActivity().getShouldReduce()));
            }
        }

        return totalPrice;
    }
}
