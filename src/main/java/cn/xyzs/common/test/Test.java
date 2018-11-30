package cn.xyzs.common.test;

import cn.xyzs.common.util.HttpUtil;

public class Test {
    public static void main(String[] args) throws Exception {
        String json = HttpUtil.doPost("http://localhost:8089/App/index.do","");
        System.err.println(json);
    }
}
