// Strobogramatic number
import java.util.*;
class Strobo {
	static boolean isStrobo(String num) {
		Map<Character, Character> strobo = new HashMap<>();
		strobo.put('0', '0');
		strobo.put('1','1');
		strobo.put('6', '9');
		strobo.put('8', '8');
		strobo.put('9', '6');
		int n = num.length();
		for (int i = 0, j = n - 1; i <= j; i++, j--) {
			char l = num.charAt(i);
			char r = num.charAt(j);
			char res = strobo.getOrDefault(l, '-');
			if (res == '-') return false;
			if (res != r) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		System.out.println(isStrobo(num));
	}
}
