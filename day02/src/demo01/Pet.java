package demo01;

/**
 * @program: day01
 * @ClassName Pet
 * @description:
 * @author: huJie
 * @create: 2020-10-14 15:21
 **/
public class Pet {
    private String name;
     int health;
    protected int age;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAge() {
        return age;
    }

    public void print(){
        System.out.println("Pet Print...");
    }
}
