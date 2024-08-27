package org.example.model.param;


import org.example.enums.PromotionEnum;
import org.example.model.entity.Fruit;

import java.util.List;

public class ListFruitParam {
    private List<Fruit> fruits;

    /**
     * 促销活动: 1:满100-10，2：满200-20
     */
    private PromotionEnum promotionActivity;

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public PromotionEnum getPromotionActivity() {
        return promotionActivity;
    }

    public void setPromotionActivity(PromotionEnum promotionActivity) {
        this.promotionActivity = promotionActivity;
    }
}
