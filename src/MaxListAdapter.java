
import java.util.ArrayList;
import java.util.List;

public class MaxListAdapter implements Max {
  

    private List<Integer> convertArray2List(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        return list;
    }

    private int[] convertList2Array(List<Integer> numbers) {
        int[] array = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            array[i] = numbers.get(i);
        }
        return array;
    }

    @Override
    public int getMax(int[] numbers) {
       List<Integer> numberList = convertArray2List(numbers);

       ListMax max = new ListMax();
 
       int listMax = max.getMaxFromList(numberList);


        return listMax; //FIXME
    }
}
