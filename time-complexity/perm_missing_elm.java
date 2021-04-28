public class perm_missing_elm {
  public static void main(String[] args) {
    int[] arr = {3,2,1,5};
    long arr_sum = 0;
    for (int num : arr) {
      arr_sum += num;
    }
    long arr_max = arr.length + 1;
    long expected_sum = (arr_max * (arr_max + 1) / 2);
    System.out.println(expected_sum - arr_sum);
  }
}
