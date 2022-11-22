package com.github.haohuiw.FactoryMethod;

import com.github.haohuiw.FactoryMethod.framework.Factory;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory<IDCard> {
    private final List<IDCard> idCards=new ArrayList<>();
    @Override
    protected IDCard createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(IDCard idCard) {
        idCards.add(idCard);
    }

    public List<IDCard> getIdCards(){
        return idCards;
    }
}
