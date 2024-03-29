package com.github.haohuiw.FactoryMethod.framework;

public abstract class Factory<T extends Product> {
    public final T create(String owner){
        T p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract T createProduct(String owner);
    protected abstract void registerProduct(T product);
}
