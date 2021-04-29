public class tape_equilibrium {
  public static void main(String[] args) {
    int[] arr = {3,1,2,4,3};
    int left_sum = arr[0];
    int right_sum = 0;
    for (int num : arr) right_sum += num;
    int diff = Math.abs(left_sum - right_sum);
    for (int index = 1; index < arr.length - 1; index++) {
      left_sum += arr[index];
      right_sum -= arr[index];
      int temp_diff = Math.abs(left_sum - right_sum);
      if (diff > temp_diff) diff = temp_diff;
    }
    System.out.println(diff);
  }
}
