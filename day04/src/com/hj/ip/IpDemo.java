package com.hj.ip;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: day01
 * @ClassName IpDemo
 * @description:
 * @author: huJie
 * @create: 2020-10-16 15:36
 **/
public class IpDemo {
    public static void main(String[] args) {

        String ip1 = "192.168.1.21";
        String mask1 = "255.255.255.0";


        String ip2 = "192.168.1.102";
        String mask2 = "255.255.255.0";


        String subnet1 = subnet(ip1, mask1);
        String subnet2 = subnet(ip2, mask2);

        if (subnet1.equals(subnet2)) {
            System.out.println("相同子网");
        } else {
            System.out.println("不相同子网");
        }


    }

    public static String subnet(String ip, String mask) {
        String[] ip_arr_str = ip.split("\\.");
        String[] mask_arr_str = mask.split("\\.");

        String[] res = new String[4];

        for (int i = 0; i < ip_arr_str.length; i++) {
            res[i] = String.valueOf(Integer.valueOf(ip_arr_str[i]) & Integer.valueOf(mask_arr_str[i]));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : res) {
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

}
