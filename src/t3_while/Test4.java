package t3_while;

// 1~100까지의 합 10항씩의 합을 출력하시오.
/*
   1 ~ 10 : 55
   1 ~ 20 : 210
   1 ~ 30 : 465
   1 ~ 40 : 820
   1 ~ 50 : 1275
   1 ~ 60 : __ 
   1 ~ 70 : __ 
   1 ~ 80 : __ 
   1 ~ 90 : __ 
   1 ~ 100 : 5050 
 */
public class Test4 {
	public static void main(String[] args) {
		int i = 0, tot = 0;
		
		while(i < 100) {
			i = i + 1;
			tot = tot + i;
			if((i % 10) == 0) 
				System.out.println("1 ~ "+i+" 합은 "+tot+" 입니다.");
		}
	}
}

