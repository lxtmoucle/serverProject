package org.example;

import org.example.enums.PromotionEnum;
import org.example.model.entity.Fruit;
import org.example.model.param.ListFruitParam;
import org.example.service.FruitService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
 * 现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
 * 请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 * <p>
 * 2、超市增加了一种水果芒果，其定价为 20 元/斤。
 * 现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 * <p>
 * 3、超市做促销活动，草莓限时打 8 折。
 * 现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 * <p>
 * 4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
 * 现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
 * 请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        FruitService fruitService = new FruitService();
        ListFruitParam listFruitParam = new ListFruitParam();
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", new BigDecimal(10)));
        fruits.add(new Fruit("strawberry", new BigDecimal(10)));
        listFruitParam.setFruits(fruits);

        System.out.println("顾客A购买苹果、草莓各10斤");
        System.out.println("顾客A购买的总价为：" + fruitService.calFruitTotalPrice(listFruitParam) + "元");

        fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", new BigDecimal(10)));
        fruits.add(new Fruit("strawberry", new BigDecimal(10)));
        fruits.add(new Fruit("mango", new BigDecimal(10)));
        listFruitParam.setFruits(fruits);

        System.out.println("顾客A购买苹果、草莓、芒果各10斤");
        System.out.println("顾客B购买的总价为：" + fruitService.calFruitTotalPrice(listFruitParam) + "元");

        fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", new BigDecimal(10)));
        fruits.add(new Fruit("strawberry", new BigDecimal(10), 0.8));
        fruits.add(new Fruit("mango", new BigDecimal(10)));
        listFruitParam.setFruits(fruits);
        System.out.println("顾客A购买苹果、草莓、芒果各10斤， 并且草莓打8折");
        System.out.println("顾客C购买的总价为：" + fruitService.calFruitTotalPrice(listFruitParam) + "元");

        fruits = new ArrayList<>();
        fruits.add(new Fruit("apple", new BigDecimal(10)));
        fruits.add(new Fruit("strawberry", new BigDecimal(10), 0.8));
        fruits.add(new Fruit("mango", new BigDecimal(10)));
        listFruitParam.setPromotionActivity(PromotionEnum.Subtract10From100);
        System.out.println("顾客A购买苹果、草莓、芒果各10斤， 并且草莓打8折以及购物满 100 减 10 块");
        System.out.println("顾客D购买的总价为：" + fruitService.calFruitTotalPrice(listFruitParam) + "元");
    }
}