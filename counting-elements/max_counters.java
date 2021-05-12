import java.util.Arrays;

public class max_counters {
  public static void main(String[] args) {
    // MY TESTING
      solution(5, new int[] {3,4,4,6,1,4,4});
  }

  static int[] solution(int N, int[] A) {
    int[] result = new int[N];
    Arrays.fill(result, 0);
    int highest_total = 0;

    for (int index = 0; index < A.length; index++) {
      if (A[index] <= N) {
        int result_index = A[index] - 1;
        result[result_index] += 1;
        int result_amt = result[result_index];
        highest_total = Math.max(highest_total, result_amt);

      } else {
        Arrays.fill(result, highest_total);

      }
    }

    return result;
  }
}
