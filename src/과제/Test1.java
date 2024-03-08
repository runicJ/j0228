package 과제;

// if문이나 switch~case문이나 while문을 사용
/*1~100까지의 숫자중 2의 배수의 개수와 3의 배수의 개수와 5의 배수의 개수를 구하시오. 
단, 중복되는 배수인 경우는 작은 숫자에 한번만 누적처리하시오.
이때 2의 배수의 합과 3의 배수의 합을 더해서 5의 배수의 합을 뺀 결과도 마지막에 출력하시오.*/
public class Test1 {
	public static void main(String[] args) {
		int i = 0, tot2 = 0, tot3 = 0, tot5 = 0, su2 = 0, su3 = 0, su5 = 0, res;
		
		while(i < 100) {
			i = i + 1;
			if(i % 2 == 0) {
				tot2 = tot2 + i;
				su2 += 1;
			}
			else if(i % 3 == 0) {
				tot3 = tot3 + i;
				su3 += 1;
			}
			else if(i % 5 == 0) {
				tot5 = tot5 + i;
				su5 += 1;
			}
		}
		res = tot2 + tot3 - tot5;
		
		System.out.println("1~100까지 숫자 중 2의 배수는 "+su2+"개, 3의 배수는 "+su3+"개, 5의 배수는 "+su5+"개 입니다.");
		System.out.println("2의 배수 합 + 3의 배수 합 - 5의배수 합, 값은? " + res);
	}
}
