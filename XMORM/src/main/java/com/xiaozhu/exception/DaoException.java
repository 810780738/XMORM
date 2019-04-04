package com.xiaozhu.exception;

import com.xiaozhu.base.BaseCode;

import java.io.Serializable;

/**
 * @Author: zhusm@bsoft.com.cn
 *
 * @Description: dao异常错误信息
 *
 * @Create: 2019-04-04 10:48
 **/
public class DaoException extends RuntimeException implements BaseCode,Serializable {

    private static final long serialVersionUID = -4436594655128859360L;
    protected int code = 500;
    protected String message;
    protected Throwable throwable;

    public DaoException() {
        super();
    }

    public DaoException(int code) {
        super();
        this.code = code;
    }

    public DaoException(String message, int code) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public DaoException(String message, Throwable cause, int code) {
        super(message, cause);
        this.code = code;
        this.message = message;
        this.throwable = cause;
    }

    public DaoException(Throwable cause, int code) {
        super(cause);
        this.code = code;
        this.throwable = cause;
    }

    public DaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.throwable = cause;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public Throwable getCause() {
        return this.throwable;
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return new StackTraceElement[0];
    }

    public void throwThis() throws Exception {
        throw this;
    }
}
