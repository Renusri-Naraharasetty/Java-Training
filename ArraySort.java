import java.util.*;

public class ArraySort {
    public static void insertSorted(List<Integer> list, int value) {
        int i = 0;
        while (i < list.size() && list.get(i) < value) {
            i++;
        }
        list.add(i, value); 
    }

    public static void main(String[] args) {
        List<Integer> sortedList = new ArrayList<>(Arrays.asList(3,5,7,24,63));
        System.out.println(sortedList);
        insertSorted(sortedList, 53);
        System.out.println(sortedList);  
    }
}
