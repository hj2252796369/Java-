package other.codeblock;

import javax.jws.soap.SOAPBinding;

/**
 * @program: day01
 * @ClassName Test
 * @description:
 * @author: huJie
 * @create: 2020-10-14 17:05
 **/
public class Test {
    {
        System.out.println("Test普通  代码块");
    }

    static {
        System.out.println("Test静态  代码块");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.print();


        Son son1 = new Son();
    }
}
