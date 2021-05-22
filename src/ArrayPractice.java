import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int [] arr1= new int[]{2,55,6};
        int [] arr2 =new int[]{2,55,6};
        if(Arrays.equals(arr1,arr2)){
            System.out.println("true");
        }else
        System.out.println("false");

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
