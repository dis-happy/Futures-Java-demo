package com.huobi.api.enums;

/**
 * @Description  币币账户和交割账户转账方向枚举类,从合约账户到现货账户：“futures-to-pro”，从现货账户到合约账户： “pro-to-futures”
 * @param
 * @rerurn
 * @throws
 * @author MLL
 * @date 2020/8/21 15:43
 */
public enum TransferDirectionEnum {

    SPOT2DELIVERY("pro-to-futures"),
    DELIVERY2SPOT("futures-to-pro");

    private String value;

    TransferDirectionEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
