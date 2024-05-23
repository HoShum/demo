package com.example.common;

import lombok.Data;

/**
 * @author ：haoshen
 * @date ：2024-05-23
 * @description : 返回类
 */
@Data
public class R<T> {
    private static final int SUCCESS = 200;
    private static final int FAIL = 500;

    private T data;
    private Integer code;
    private String msg;

    public static <T> R<T> OK(T data, String msg) {
        R<T> r = new R<>();
        r.setData(data);
        r.setCode(SUCCESS);
        r.setMsg(msg);
        return r;
    }

    public static <T> R<T> fail(String msg) {
        R<T> r = new R<>();
        r.setCode(FAIL);
        r.setMsg(msg);
        return r;
    }
}
