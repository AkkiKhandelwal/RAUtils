package com.iamakki.ra_utils;

public interface RAPredicate<T>  {
    public T select(String varaibleName, Class aClass);

    public T greaterThen(int i);

    public T smallerThen(int i);
    public  T rEqualTo(Object obj);


    public  T  rContatins(Object obj);

    public  T inverse();
}
