package com.zzw.hellofriend.exceptions;

import com.zzw.hellofriend.dto.ret.GetRetCodeEnum;
import com.zzw.hellofriend.dto.ret.RetCodeEnum;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class HelloFriendRuntimeException extends Exception implements GetRetCodeEnum {

    private final RetCodeEnum retCodeEnum;

    public HelloFriendRuntimeException() {
        this.retCodeEnum = RetCodeEnum.ERROR;
    }

    @Override
    public RetCodeEnum getRetCodeEnum() {
        return this.retCodeEnum;
    }
}
