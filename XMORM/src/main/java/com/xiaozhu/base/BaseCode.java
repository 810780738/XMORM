package com.xiaozhu.base;

/**
 * @Author: zhusm@bsoft.com.cn
 *
 * @Description: aseCode
 *
 * @Create: 2019-04-04 10:47
 **/
public interface BaseCode {
    public int getCode();
    public String getMessage();
    public Throwable getCause();
    public StackTraceElement[] getStackTrace();
    void throwThis() throws Exception;
}
