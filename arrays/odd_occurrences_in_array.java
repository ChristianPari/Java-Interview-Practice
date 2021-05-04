import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class odd_occurrences_in_array {
  public static void main(String[] args) {
    int[] A = {9,3,9,3,7,9,3,7,9};

    // hashset allows for faster processing by only accessing by object
      // and not by indexing
    HashSet<Integer> A_List = new HashSet<>();
    for (int num : A) {
      if (A_List.contains(num)) {
        A_List.remove(num);
      } else {
        A_List.add(num);
      }
    }

    System.out.println(A_List.iterator().next());
//    return A_List.iterator().next();

    // TOO SLOW DUE TO ARRAY LIST CONTAINS() METHOD
    // to store each number that is being matched to a pair
//    List<Integer> A_List = new ArrayList<>();
//    // iterate through the array (A) and check if it already contains the number
//    for (int num : A) {
//      if (A_List.contains(num)) { // does contain
//        int indexOf = A_List.indexOf(num);
//        A_List.remove(indexOf); // remove it from the list
//      } else { // doesnt contain
//        A_List.add(num); // add to list
//      }
//      // this process will add each first number in a pair and then remove that
//        // number once the pair is found, until there is only the non pair left
//    }

//    System.out.println(A_List.get(0)); // only unpaired number
//    return A_List.get(0);

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
