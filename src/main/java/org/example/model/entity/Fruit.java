package org.example.model.entity;

import java.math.BigDecimal;

public class Fruit {
    /**
     * 食物名
     */
    private String fruitName;

    /**
     * 食物重量
     */
    private BigDecimal weight;

    /**
     * 折扣
     */
    private double discount = 1;

    public Fruit() {}

    public Fruit(String fruitName, BigDecimal weight) {
        this.fruitName = fruitName;
        this.weight = weight;
    }

    public Fruit(String fruitName, BigDecimal weight, double discount) {
        this.fruitName = fruitName;
        this.weight = weight;
        this.discount = discount;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }


    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
