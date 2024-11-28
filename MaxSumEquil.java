// Maximum Sum Equillibrium
import java.util.*;
class MaxSumEquil {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    int pref = 0, sum = 0;
    for (int i = 0; i < n; i++) sum += a[i];
    for (int i = 0; i < n; i++) {
      pref += a[i];
      if (pref == sum) {
        System.out.println(sum);
        break;
      }
      sum -= a[i];
    }
  }
}
