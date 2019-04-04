package com.xiaozhu.dao;

import com.xiaozhu.exception.DaoException;

/**
 * @program: XMORM
 *
 * @description: interface，update抽象基类
 *
 * @author: zhusm@bsoft.com.cn
 *
 * @create: 2019-04-04 10:23
 **/
public interface UpdateDAO<T> {

    T save(T object) throws DaoException;

    T update(T object) throws DaoException;

    void remove(T object) throws DaoException;
}
