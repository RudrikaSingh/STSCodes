// Block Swap Algorithm
import java.util.*;
class BlockSwap {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    int r = sc.nextInt();
    r %= n;
    for (int i = n - r; i < n; i++) { // for backwards i = r and so on
      System.out.print(a[i] + " ");
    }
    for (int i = 0; i < n - r; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
