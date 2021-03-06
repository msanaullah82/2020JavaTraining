package com.aspire.training.functional.step0;

@FunctionalInterface
public interface MyFunction<T,V> {

    public V apply(T t);

    default  <W> MyFunction<W,V> compose(MyFunction<W,T> g){


        return x->apply(g.apply(x));
    }
}
