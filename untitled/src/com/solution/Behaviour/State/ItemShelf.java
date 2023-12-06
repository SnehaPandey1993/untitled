package com.solution.Behaviour.State;

public class ItemShelf {
    Item item;
    Boolean soldout;
    int code;
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Boolean getSoldout() {
        return soldout;
    }

    public void setSoldout(Boolean soldout) {
        this.soldout = soldout;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }


}
