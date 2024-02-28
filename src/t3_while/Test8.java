package t3_while;

// -1/2 + 2/3 -3/4 +4/5 -5/6 +6/7 -7/8 +8/9 -9/10=?
public class Test8 {
	public static void main(String[] args) {
		double i = 0.0, tot = 0.0;
		int s = 1;
		
		while(i < 9) {
			i = i + 1;
			s = s * (-1);
				tot = tot + (i/(i+1) * s);
		}
		
		System.out.println("-1/2 + 2/3 - 3/4 + 4/5 - 5/6 + 6/7 - 7/8 + 8/9 - 9/10 =" + tot);
	}
}
