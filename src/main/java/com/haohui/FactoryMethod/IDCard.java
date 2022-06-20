package com.haohui.FactoryMethod;

import com.haohui.FactoryMethod.framework.Product;

public class IDCard extends Product {
    private final String owner;

    IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
