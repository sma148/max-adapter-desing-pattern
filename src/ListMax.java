import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListMax {
  
    public int getMaxFromList(List<Integer> numbers) {
        //TODO implement by yourself

// copy the list number into another list
        List<Integer> copyList = new ArrayList<>(numbers);

// getMaxFromList
int maxNumber = Collections.max(copyList);

// return the max



        return maxNumber; //fix me
    }
}