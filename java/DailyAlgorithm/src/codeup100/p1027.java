package codeup100;
import java.util.Scanner;
import java.util.StringTokenizer;
public class p1027 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputTime = scan.nextLine();
		StringTokenizer tk = new StringTokenizer(inputTime, ".");
		String[] times = new String[3];
		int i=0;
		while(tk.hasMoreTokens()) {
			times[i] = tk.nextToken();
			i+=1;
		}
		System.out.print(times[2]+"-"+times[1]+"-"+times[0]);
	}

}
//년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.
//
//년월일(yyyy.mm.dd)를 입력받아,
//
//일월년(dd-mm-yyyy)로 출력해보자.
//
//(단, 한 자리 일/월은 0을 붙여 두자리로, 년도도 0을 붙여 네자리로 출력한다.) 
//
//
//참고
//출력하는 자리수를 지정하기 위해 %4d와 같은 형식을 사용할 수 있는데,
//빈칸을 0으로 출력하기 위해서는 %04d와 같은 형식을 사용하면 된다.
//
//예시
//printf("%02d-%02d-%04d", d, m, y);
//
//입력
//년월일이 '.'(닷)으로 구분되어 입력된다.
//
//
//출력
//년월일을
//
//일월년으로 바꾸어 '-'(대쉬, 마이너스)로 구분해 출력한다.
//
//
//입력 예시   
//2014.07.15
//
//출력 예시
//15-07-2014 