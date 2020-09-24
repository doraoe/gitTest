package com.example.demogit.celue.demo3;

public enum ServiceTypeEnum {

    Apply("apply","授信"),
    Use("use","用信");
    private String code;
    private String desc;

    ServiceTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


}
