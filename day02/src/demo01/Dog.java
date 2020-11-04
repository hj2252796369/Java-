package demo01;

/**
 * @program: day01
 * @ClassName Dog
 * @description:
 * @author: huJie
 * @create: 2020-10-14 15:23
 **/
public class Dog extends Pet{
    private String strain;

    public String getStrain() {
        return strain;
    }

    /**
     *  作用域必须大于父类的该方法作用域
     */
    @Override
    public void print() {
        super.print();
        System.out.println("Dog Print......");
    }

    public void print(String name){
        System.out.println("Dog " + name + " Print....");
    }
}
