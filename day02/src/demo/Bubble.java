package demo;

/**
 * @program: day01
 * @ClassName SwithDemo
 * @description:
 * @author: hujie
 * @create: 2020-10-14 08:53
 **/
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {2,6,4,11,99,54,25,9,36};
        print(arr);
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                     temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        print(arr);
    }

    static void print(int[] arr){
        for (int i : arr) {
            System.out.print(i + "  ");
        }
        System.out.println();
    }
}
