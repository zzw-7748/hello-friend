package com.zzw.hellofriend.dto.ret;

import lombok.Getter;

@Getter
public enum RetCodeEnum {

    SUCCESS("0000","success"),
    ERROR("1000","error");

    private final String code;

    private final String msg;

    RetCodeEnum(String code,String msg) {
        this.code = code;
        this.msg = msg;
    }

}
