package org.example.enums;

public enum PromotionEnum {
    Subtract10From100(1,10),
    Subtract20From200(2,20);

    private final Integer type;
    private final Integer shouldReduce;

    PromotionEnum(Integer type, Integer shouldReduce) {
        this.type = type;
        this.shouldReduce = shouldReduce;
    }
    public Integer getType() {return type;}

    public Integer getShouldReduce() {
        return shouldReduce;
    }
}
