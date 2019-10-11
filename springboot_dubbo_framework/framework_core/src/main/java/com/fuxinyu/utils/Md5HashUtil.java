package com.fuxinyu.utils;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * @author： fuxinyu
 * Date: 2019/10/8
 * Time: 10:57
 * Description:
 */
public class Md5HashUtil {
    public static void main(String[] args) {
        //对单个信息进行加密
        Md5Hash md5 = new Md5Hash("admin");
        System.out.println(md5.toString());

        // 加密添加盐值 增大解密难度
        md5 = new Md5Hash("123456", "aaa");
        System.out.println(md5.toString());


        // 加密添加盐值 增大解密难度  迭代1024次
        md5 = new Md5Hash("123456", "aaa", 1024);
        System.out.println(md5);


    }
}
