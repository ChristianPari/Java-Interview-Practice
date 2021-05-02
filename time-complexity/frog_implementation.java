public class frog_implementation {
  public static void main(String[] args) {
    int x = 10;
    int y = 85;
    int d = 30;
    // below passed w/ O(1)
    y -= x;
    int jumps = y / d + (y % d != 0 ? 1 : 0);
    System.out.println(jumps);
    // TOO LONG
//    int jumps = 0;
//    while (true) {
//      if (x < y) {
//        x += d;
//        jumps++;
//      } else {
//        System.out.println(jumps);
//        break;
//      }
    }
}
