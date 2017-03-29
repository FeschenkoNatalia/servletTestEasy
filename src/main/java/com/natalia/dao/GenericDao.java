package com.natalia.dao;

import com.natalia.model.User;

/**
 * Created by User on 19.03.2017.
 */
public interface GenericDao <T>{
    T save(T t);
  //  T getByName(T t);
  //  T remove(T t);
    T update(T t);
}
