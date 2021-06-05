package com.huifu.newdemo.retrofit;

import java.util.HashMap;
import java.util.Map;

public class Contant {
    public static final String baseUrl = "http://172.31.10.143:8092/supayfront/controller4301/getLoginFactor/";
    public static final HashMap<String,String> body = new HashMap<String,String>();
    public static final HashMap<String,String> head = new HashMap<String,String>();
    static {
        body.put("jsonStr","{\"infVersion\":\"3.0.1\",\"loginId\":\"UPmiKTrxwytBFHRGCXGNGA==\",\"orgId\":\"310001\"}");
        body.put("checkValue","b950946ed1d9176e9e0d1dd51a47705585a148648f810eb22f77bc8d39497209");

        head.put("beginTime",System.currentTimeMillis() + "");
    }

}
