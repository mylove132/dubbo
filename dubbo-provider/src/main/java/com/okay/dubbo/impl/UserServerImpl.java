package com.okay.dubbo.impl;

import com.okay.dubbo.IUserServer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liuzhanhui
 * @Decription:
 * @Date: Created in 2018-06-22:13:44
 * Modify date: 2018-06-22:13:44
 */
public class UserServerImpl implements IUserServer {

    @Override
    public List<String> getUsers(int requestid) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", requestid - 1));
        demo.add(String.format("Permission_%d", requestid));
        demo.add(String.format("Permission_%d", requestid + 1));
        return demo;
    }
}
