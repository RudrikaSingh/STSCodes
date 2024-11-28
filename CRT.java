/* ip : 2
 5 7
 1 3
op : 31 */
import java.util.Scanner;
class CRT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		int[] r = new int[n];
		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			r[i] = sc.nextInt();
		}
		int x = 1;
		while(true) {
			int c = 0;
			for(int i = 0; i < n; i++) {
				if(x % d[i] == r[i]) c++;
				else break;
			}
			if(c == n) {
				System.out.println(x);
				break;
			}
			x++;
		}
	}
}
