package t3_while;

// 1~100까지의 홀수합/짝수합(Switching 기법을 활용하기)
public class Test10 {
	public static void main(String[] args) {
		int i = 0, odd = 0, even = 0, sw = 0;
		
		while(i < 100) {
			i = i + 1;
			if(sw == 0) {
				odd = odd + i;
				sw = 1;
			}
			else {
				even = even + i;
				sw = 0;
			}
		}
		
		System.out.println("1 ~ 100까지의 홀수합은? " + odd);
		System.out.println("1 ~ 100까지의 짝수합은? " + even);
	}
}