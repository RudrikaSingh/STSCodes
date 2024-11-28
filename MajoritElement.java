// Majority Element
import java.util.*;
class MajorityElement {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int ele : a) {
      map.put(ele, map.getOrDefault(ele, 0) + 1);
      if (map.get(ele) > n / 2) System.out.println(ele);
    }
  }
}
