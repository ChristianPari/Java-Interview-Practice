import java.util.Arrays;

public class max_counters {
  public static void main(String[] args) {
    // MY TESTING
      solution(5, new int[] {3,4,4,6,1,4,4});
  }

  static int[] solution(int N, int[] A) {
    // PASSED 100%
    int[] result = new int[N];
    Arrays.fill(result, 0);
    int start_line = 0;
    int current_max = 0;

    for (int num : A) {
      int index = num - 1;

      if (num > N)
        start_line = current_max;

      else if (result[index] < start_line)
        result[index] = start_line + 1;

      else
        result[index] += 1;

      if (num <= N && result[index] > current_max)
        current_max = result[index];
    }

    for (int index = 0; index < result.length; index++) {
      if (result[index] < start_line)
        result[index] = start_line;
    }

    return result;

    // TOO SLOW
//    int[] result = new int[N];
//    Arrays.fill(result, 0);
//    int highest_total = 0;
//
//    for (int index = 0; index < A.length; index++) {
//      if (A[index] <= N) {
//        int result_index = A[index] - 1;
//        result[result_index] += 1;
//        int result_amt = result[result_index];
//        highest_total = Math.max(highest_total, result_amt);
//
//      } else {
//        Arrays.fill(result, highest_total);
//
//      }
//    }
//
//    return result;
  }
}
