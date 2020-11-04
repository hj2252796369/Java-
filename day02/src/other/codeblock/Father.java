package other.codeblock;

/**
 * @program: day01
 * @ClassName Father
 * @description:
 * @author: huJie
 * @create: 2020-10-14 17:02
 **/
public class Father {
    {
        System.out.println("父类   普通代码块");
    }

    static {
        System.out.println("父类   静态 代码块");
    }

    public Father() {
        System.out.println("父类   无参构造函数");
    }

    public void print() {
        System.out.println("父类  Print。。。。");
    }
}
