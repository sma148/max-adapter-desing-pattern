import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{444,322,999, 34, 2, -1, 3};
        System.out.println("array in input: " + Arrays.toString(numbers));


        Max max = new MaxListAdapter();


        int maxN = max.getMax(numbers); //FIXME


        System.out.println("max: " + maxN);
    }
}
