package com.okay.dubbo;

import java.util.List;

/**
 * @Author: liuzhanhui
 * @Decription:
 * @Date: Created in 2018-06-22:11:39
 * Modify date: 2018-06-22:11:39
 */
public interface IUserServer {

    List<String> getUsers(int requestid);
}
