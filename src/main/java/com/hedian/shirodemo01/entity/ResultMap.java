package com.hedian.shirodemo01.entity;

public class ResultMap {

    private String msg;

    private String code;

    public ResultMap() {
    }

    public ResultMap(String code,String msg) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ResultMap success() {
        return new ResultMap("200", "success");
    }

    public ResultMap message(String msg) {
        this.msg = msg;
        return this;
    }
}
