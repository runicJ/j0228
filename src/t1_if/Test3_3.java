package t1_if;

import java.util.Scanner;

// 3과목의 점수를 입력받는다. 이때 3과목의 평균 점수가 60점 이상이고, 각 과목당 40점 이상이면 '합격', 그렇지 않으면 '불합격'
public class Test3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jum1, jum2, jum3, avg;
		String str = "";
		
		System.out.print("첫번째 과목의 점수는? "); jum1 = sc.nextInt();
		System.out.print("두번째 과목의 점수는? "); jum2 = sc.nextInt();
		System.out.print("세번째 과목의 점수는? "); jum3 = sc.nextInt();
		
		avg = (jum1 + jum2 + jum3) / 3;
		
		if(avg < 60 || jum1 < 40 || jum2 < 40 || jum3 < 40) {
			str = "불합격";  //시간복잡도 고려 첫번째 조건 만족하면 바로
		}
		else {
			str = "합격";
		}
		System.out.println("당신은 "+str+" 입니다.");
		
		sc.close();
	}
}
