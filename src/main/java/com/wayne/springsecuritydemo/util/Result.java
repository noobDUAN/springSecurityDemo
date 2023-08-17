package com.wayne.springsecuritydemo.util;

import lombok.Data;

@Data
public class Result {
    private int code = 200;
    private String msg = "操作成功";
    private Object data;

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


}
