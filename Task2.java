package HomeTask2;



import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
 
 public static void main(String[] args) {
     List<Integer> list = new ArrayList<>();
     list.add(3);
     list.add(3);
     list.add(5);
     list.add(5);
     list.add(2);
     Collections.sort(list, Collections.reverseOrder());
     System.out.println(list);
     Set<Integer> set = new LinkedHashSet<>(list);
     System.out.println(set);
 }
}
