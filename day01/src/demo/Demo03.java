package demo;

public class Demo03 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "ab"+"c";
        String str4 = new String(str2);
        //栈中指向的堆地址是一致的  所以是ture
        System.out.println(str1 == str2);

        //str3线开辟ab、c的空间，拼接之后的结果发现已经有存在空间，将地址指向已开辟的空间地址上
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
    }
}
