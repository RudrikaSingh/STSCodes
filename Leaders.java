// Leaders in an array
import java.util.*;
class Leaders {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    int max = Integer.MIN_VALUE;
    int b[] = new int[n];
    int c = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (max < a[i]) {
        max = a[i];
        b[c] = max;
        c++;
      }
    }
    for (int i = c - 1; i >= 0; i--) {
      System.out.print(b[i] + " ");
    }
  }
}
