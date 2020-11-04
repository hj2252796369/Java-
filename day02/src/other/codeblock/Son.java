package other.codeblock;

/**
 * @program: day01
 * @ClassName Son
 * @description:
 * @author: huJie
 * @create: 2020-10-14 17:03
 **/
public class Son extends Father{
    {
        System.out.println("子类   普通代码块");
    }

    static {
        System.out.println("子类   静态 代码块");
    }

    public Son() {
        System.out.println("子类  无参构造方法");
    }

    @Override
    public void print() {
        System.out.println("子类  Print...");
    }
}
