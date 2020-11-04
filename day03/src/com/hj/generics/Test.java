package com.hj.generics;

/**
 * @program: day01
 * @ClassName Test
 * @description:
 * @author: huJie
 * @create: 2020-10-15 16:05
 **/
public class Test {
    public static void main(String[] args) {
        Result<User> result = new Result<>();
        result.setCode(200);
        result.setMsg("success");
        result.setData(new User("admin", "123456"));


        ResultObject<User> result1 = new ResultObject<>();
        result1.setCode(200);
        result1.setMsg("success");
        result1.setData(new User("admin", "123456"));

        User user = result.getData();
        User user1 = (User) result1.getData();



//        //data存放的是User
//        Product product = result.getData();
//        Product product1 = (Product)result1.getData();




    }
}
