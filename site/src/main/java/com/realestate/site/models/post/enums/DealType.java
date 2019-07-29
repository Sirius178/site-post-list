package com.realestate.site.models.post.enums;

public enum DealType {
    NONE("-"),
    SELL ("Продажа"),
    RENT ("Аренда");
    private String value;
    DealType (String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}