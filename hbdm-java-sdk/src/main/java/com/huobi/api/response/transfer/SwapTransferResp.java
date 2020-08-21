package com.huobi.api.response.transfer;

import lombok.Data;

/**
 * @author MLL
 * @title: SwapTransferResp
 * @projectName huobi-contract-api
 * @description 永续合约与币币账户转账响应类
 * @date 2020/8/21 15:25
 */
@Data
public class SwapTransferResp {

    private String code;

    private String message;

    private Boolean success;

    private Object data;
}
