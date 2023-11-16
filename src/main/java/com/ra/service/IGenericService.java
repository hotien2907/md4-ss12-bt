package com.ra.service;

import java.util.List;

public interface IGenericService <T,ID> {
    List<T> findAll();

    Boolean save(T t);
    T findById(ID id);
    Boolean updateById(T t, ID id);
    void deleteById(ID id);
}
