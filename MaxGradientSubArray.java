// Maximum Gradient in a SubArray
import java.util.*;
class MaxGradientSubArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    int pref = 1, suff = 1;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (pref == 0) pref = 1;
      if (suff == 0) suff = 1;
      pref *= a[i];
      suff *= a[n - i - 1];
      max = Math.max(max, Math.max(pref, suff));
    }
    System.out.println(max);
  }
}
