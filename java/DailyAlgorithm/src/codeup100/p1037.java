package codeup100;
import java.util.Scanner;
public class p1037 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print((char)num);
	}
}


//10진 정수 1개를 입력받아 아스키 문자로 출력해보자.
//단, 0 ~ 255 범위의 정수만 입력된다.
//
//
//입력
//10진 정수 1개(0 ~ 255 범위)가 입력된다.
//
//
//출력
//아스키코드 값을 문자로 출력한다.
//
//
//입력 예시   
//65
//
//출력 예시
//A