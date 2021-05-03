import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class odd_occurrences_in_array {
  public static void main(String[] args) {
    int[] A = {9,3,9,3,7,9,3,7,9};

    // TOO SLOW
//    List<Integer> A_List = new ArrayList<>(A.length);
//    for (int n : A) {
//      A_List.add(n);
//    }
//    while (true) {
//      int current = A_List.remove(0);
//        int index = A_List.indexOf(current);
//        if (index == -1) {
////          return current;
//          System.out.println(current);
//          break;
//        }
//        else
//          A_List.remove(index);
//    }
  }
}
