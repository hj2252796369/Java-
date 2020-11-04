package demo;

/**
 * @program: day01
 * @ClassName Demo05
 * @description:
 * @author: huJie
 * @create: 2020-10-23 10:10
 **/
public class Demo05 {
    public static void main(String[] args) {
//
//
        String a = "a";
        String b = "b";
        String c = "c";
        System.out.println("c  hasCode   "+c.hashCode() );

        c = a + "" + b + "" + c;

        System.out.println("a  hasCode  "+a.hashCode());
        System.out.println("b  hasCode  "+b.hashCode());
        System.out.println("c  hasCode   "+c.hashCode() );
//

//        String d = "a" + "b";  //ab
//        String f = "ab";
//        System.out.println(d == f);
//
//        String g = "a";
//        String h = g+"";
//        String i = "a" + "";
//        String j = "c";
//        System.out.println(g == h);
//        System.out.println(g == i);
//        System.out.println(g == (i+j));

    }
}
