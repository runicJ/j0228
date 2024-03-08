package 과제;

import java.util.Scanner;

// if문이나 switch~case문이나 while문을 사용
/*두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되, 
이때 5개항씩 그 결과를 출력시켜주시오.(마지막에 남은 값이 있으면 그 합까지도 마지막에 출력할수 있어야함)
여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.*/
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, tot = 0, line = 0, max = 0, min = 0;
		
		System.out.print("두 개의 숫자를 입력하세요? ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			max = a;
			min = b;
		}
		else if(a < b) {
			max = b;
			min = a;
		}
		else System.out.println("두 숫자는 같습니다.");
		
		while (min <= max) {
			tot = tot + min;
			line++;
			
			if (line % 5 == 0) {
				System.out.println(min + " ~ "+max+"의 합은 "+tot+" 입니다.");
				tot = 0;
			}
		}
		min++;
		
		sc.close();
	}
}
