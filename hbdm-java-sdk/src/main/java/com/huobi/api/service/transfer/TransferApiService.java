package com.huobi.api.service.transfer;

import com.huobi.api.enums.AccountTypeEnum;
import com.huobi.api.enums.TransferDirectionEnum;
import com.huobi.api.response.transfer.FuturesTransferResponse;
import com.huobi.api.response.transfer.SwapTransferResp;

import java.math.BigDecimal;

public interface TransferApiService {

    FuturesTransferResponse transfer(String currency, BigDecimal amount, TransferDirectionEnum transferDirection);

    SwapTransferResp swapAndSpotTransfer(String currency, BigDecimal amount, AccountTypeEnum from, AccountTypeEnum to);
}
