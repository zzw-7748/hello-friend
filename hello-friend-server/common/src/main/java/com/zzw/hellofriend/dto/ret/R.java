package com.zzw.hellofriend.dto.ret;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {

    public String code;

    public String msg;

    public T data;

    public static <T> R<T> success(T data) {
        return new R<>(RetCodeEnum.SUCCESS.getCode(), RetCodeEnum.SUCCESS.getMsg(), data);
    }

    public static <T> R<T> error(T data) {
        return new R<>(RetCodeEnum.ERROR.getCode(), RetCodeEnum.ERROR.getMsg(), data);
    }

    public static <T> R<T> error(RetCodeEnum retCodeEnum,T data) {
        return new R<>(retCodeEnum.getCode(), retCodeEnum.getMsg(), data);
    }

    public static <T> R<T> error(GetRetCodeEnum getRetCodeEnum,T data) {
        return error(getRetCodeEnum.getRetCodeEnum(),data);
    }

    public static <T> R<T> error(Exception exception,T data) {
        if (exception instanceof GetRetCodeEnum) {
            return error((GetRetCodeEnum)exception,data);
        } else {
            return error(data);
        }
    }

}
