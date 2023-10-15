package com.test.product.dto;


import lombok.Data;

import java.util.Collections;


//@Data
public class ApiResponseDTO<T> {
    private Integer code;
    private String msg;
    private T data;

    public ApiResponseDTO() {
        this.code = ResponseEnum.OK.getValue();
    }

    public ApiResponseDTO(T data) {
        this.code = ResponseEnum.OK.getValue();
        this.data = data;
    }

    public ApiResponseDTO(ResponseEnum responseEnum) {
        this.code = responseEnum.getValue();
        this.msg = responseEnum.getReasonPhrase();
        this.data = (T) Collections.emptyList();
    }

    public ApiResponseDTO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = (T) Collections.emptyList();
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public String toString() {
        return "ApiResponseDTO(code=" + this.getCode() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ")";
    }

    public ApiResponseDTO(final Integer code, final String msg, final T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
