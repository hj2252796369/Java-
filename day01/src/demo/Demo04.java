package demo;

public class Demo04 {
    public static void main(String[] args) {
        Integer integer1 = 100;
        Integer integer2 = 100;
        System.out.println(integer1 == integer2);

        Integer integer3 = 128;
        Integer integer4 = 128;
        System.out.println(integer3 == integer4);


        Integer.valueOf(1);
        Integer integer5 = new Integer(1);
        Integer integer6 = new Integer(1);
        System.out.println(integer5 == integer6);
    }
}
