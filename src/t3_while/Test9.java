package t3_while;

// 1~100까지의 홀수합/짝수합
public class Test9 {
	public static void main(String[] args) {
		int odd = 0, even = 0, i = 0;
		
		while(i < 100) {
			i = i + 1;
			odd = odd + 1;
			i = i + 1;
			even = even + 1;
		}
		
		System.out.println("1 ~ 100까지의 짝수 합은? " + even);
		System.out.println("1 ~ 100까지의 홀수 합은? " + even);
	}
}
