package com.zcb.test.demo;

import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by zhuocongbin
 * date 2018/11/5
 */
public class Server {
    public static void main(String[] args) {
        InputStream resourceAsStream = Server.class.getClassLoader().getResourceAsStream("application.properties");
        Properties properties = new Properties();
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(properties.getProperty("mongo.ip"));
        String port = properties.getProperty("ip.port");
        if (!StringUtils.isEmpty(port)) {
            System.out.println(Long.valueOf(port));
        }
    }
}
