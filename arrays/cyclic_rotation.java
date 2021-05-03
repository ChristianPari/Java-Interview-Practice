import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cyclic_rotation {
  public static void main(String[] args) {
    int[] A = {3,8,9,7,6};
    int K = 3;
    if (A.length == 0) {
      System.out.println(A);
//      return A;
    }
    List<Integer> A_List = new ArrayList<>(A.length);
    for (int n : A) {
      A_List.add(n);
    }
    int length = A_List.size() - 1;
    int count = 0;
    while (count < K) {
      int removed = A_List.remove(length);
      A_List.add(0, removed);
      count++;
    }
//    A = A_List.stream().mapToInt(i->i).toArray();
//    return A;
    System.out.println(A);
  }
}
