package com.groupeisi.companyspringmvctiles.dao;


import com.groupeisi.companyspringmvctiles.entities.PanierEntity;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    boolean save(T t);
    boolean delete(long id,T t);
    boolean update(T t);
    List<T> list(T t);
    public T get(long id,T t);
}
