package com.xiaozhu.handler;

/**
 * @program: XMORM
 *
 * @description: 类型转换
 *
 * @author: zhusm@bsoft.com.cn
 *
 * @create: 2019-04-04 11:09
 **/
public interface TypeConvertorHandler<T,O> {
    
    /***
     * @Author: zhusm@bsoft.com.cn
     * @Description: java转成jdbc
     * @CreateTime: 11:11 2019/4/4
     * @Params: [o]
     * @return: T
     **/
    T JavaTypeToJdbc(O o);

    /***
     * @Author: zhusm@bsoft.com.cn
     * @Description: jdbc转Java
     * @CreateTime: 11:13 2019/4/4
     * @Params: [o]
     * @return: O
     **/
    O JdbcTypeToJava(T o);
}
