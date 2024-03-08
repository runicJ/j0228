package 과제;

import java.util.Scanner;

/*2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되, 
한줄에 5개씩 출력하는 프로그램을 만드시오.*/
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = 0, line = 0;
		
		System.out.print("2자리 숫자를 입력하세요? ");
		su = sc.nextInt();
		
		if(su >= 10 && su < 99) {
			while(su > 0) {
				System.out.print(su + " ");
				line++;
				if (line % 5 == 0) System.out.println();
				su--;
			}
		}
		else {
			System.out.println("2자리 숫자를 입력하세요!");
		}
		sc.close();
	}
}
