package com.hujie.rukou;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @program: day05
 * @ClassName MainApplicationAgrs
 * @description:
 * @author: huJie
 * @create: 2020-10-20 16:27
 **/
public class MainApplicationAgrs {


    public static void main(String[] args) throws IOException {

        String port = null;

        String argsValue = getArgsValue(args, "server.port");
        if(argsValue != null){
            port = argsValue;
        }else{
            String properValue = getProperValue("server.port");
            if(properValue != null){
                port = properValue;
            }else {
                port = "8080";
            }
        }


        System.out.println("程序端口号为 = " + port);
    }


   static String getArgsValue(String[] args, String key){
       Map<String, String> map = getMap(args);
       if(map == null || map.size() == 0){
           return null;
       }
       return map.get(key);
   }

    static String getProperValue(String key) throws IOException {

        Properties properties = new Properties();
        File file = new File("resource"+ File.separator + "application.properties");
//        InputStream inputStream = new FileInputStream(file);
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties");

        properties.load(inputStream);

        inputStream.close();
        return properties.getProperty(key);
    }


    static Map<String, String> getMap(String[] args){

        Map<String, String> map = new HashMap<String, String>();

        if(args == null || args.length == 0){
            return null;
        }else{
            for (String str: args) {
                if(str.startsWith("--") && str.contains("=")){
                    String key = str.substring(2, str.indexOf("="));
                    String value = str.substring(str.indexOf("=")+1);
                    if(key !=null && value!=null && !key.isEmpty() && !key.trim().isEmpty()&& !value.isEmpty() && !value.trim().isEmpty()) {
                        map.put(key, value);
                    }
                }
            }
        }
        return map;
    }

}
