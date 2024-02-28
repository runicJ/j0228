package t3_while;

// 1+1+2+1+2+3+1+2+3+4+1+2+3+4+5+~~~~~~+1+2+3+4+5+6+7+8+9+10 = ?
public class Test6 {
	public static void main(String[] args) {
		int i = 0, tot = 0, hap = 0;
		
		while(i < 10) {
			i = i + 1;
			tot = tot + i;
			hap = hap + tot;
		}
		
		System.out.println("1+1+2+1+2+3+1+2+3+4+1+2+3+4+5+~~~~~~+1+2+3+4+5+6+7+8+9+10 = " + hap);
	}
}

