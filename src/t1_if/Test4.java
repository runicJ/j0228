package t1_if;

import java.util.Scanner;

// 점수를 입력받아 학점을 구하시오.
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int su = 0;
		char gr;
		
		System.out.print("점수를 입력하세요? ");
		su = sc.nextInt();
		
		if(su >= 90) gr = 'A';
		else if(su >= 80) gr = 'B';
		else if(su >= 70) gr = 'C';
		else if(su >= 60) gr = 'D';
		else gr = 'F';
		
		System.out.println("점수 "+su+" 는 "+gr+" 학점입니다.");
		
		sc.close();
	}
}
