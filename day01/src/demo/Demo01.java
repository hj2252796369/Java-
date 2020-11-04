package demo;

public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;

        System.out.println("a >> b = "+ (a >> b));
        System.out.println("a << b = "+ (a << b));
        System.out.println("a & b = "+ (a & b));
        System.out.println("a | b = "+ (a | b));
        System.out.println("a ^ b = "+ (a ^ b));
        System.out.println("~ b = "+ ( ~ b));  //0101
    }
}
