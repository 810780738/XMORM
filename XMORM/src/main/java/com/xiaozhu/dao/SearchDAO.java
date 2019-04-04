package com.xiaozhu.dao;

import com.xiaozhu.exception.DaoException;

/**
 * @program: XMORM
 *
 * @description: Search抽象基类
 *
 * @author: zhusm@bsoft.com.cn
 *
 * @create: 2019-04-04 10:24
 **/
public interface SearchDAO<T> {

    T findAll() throws DaoException;

    T findByObject(T object) throws DaoException;
}
