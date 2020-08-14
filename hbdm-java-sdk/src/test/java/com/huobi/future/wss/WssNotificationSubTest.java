package com.huobi.future.wss;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.huobi.wss.handle.WssNotificationHandle;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URISyntaxException;
import java.util.List;

public class WssNotificationSubTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    //private String URL = "wss://api.hbdm.com/notification";//订单推送访问地址
    String api_key = "c972cb08-qv2d5ctgbn-f1650458-7b5b9";
    String secret_key ="9ae3bc75-5396bf8d-5672406a-20567";
    //private final Logger logger = LoggerFactory.getLogger(getClass());
    private String URL = "wss://api.btcgateway.pro/notification";//订单推送访问地址
    WssNotificationHandle wssNotificationHandle = new WssNotificationHandle(URL, api_key, secret_key);
    //WssNotificationHandle wssNotificationHandle = new WssNotificationHandle(URL, "", "");


    @Test
    public void test1() throws URISyntaxException, InterruptedException {
        List<String> channels = Lists.newArrayList();
        channels.add("positions.eth");
        channels.add("accounts.eth");
        channels.add("orders.eth");
        wssNotificationHandle.sub(channels, response -> {
            logger.info("用户收到的数据===============:{}", JSON.toJSON(response));
        });
        Thread.sleep(Integer.MAX_VALUE);
    }


}
