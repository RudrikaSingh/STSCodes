// Weighted substrings
// input: abccddde 6  1 3 12 5 9 10
// output: y y y y n n
import java.util.*;
class WS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		List<Integer> l = new ArrayList<>();
		l.add(s.charAt(0) - 'a' + 1);
		for (int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i - 1)) l.add(s.charAt(i) - 'a' + 1 + l.get(i - 1));
			else l.add(s.charAt(i) - 'a' + 1);
		}
		for (int i = 0; i < n; i++) {
			if(l.contains(a[i])) System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
