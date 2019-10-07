package codeup100;
import java.util.Scanner;
import java.util.StringTokenizer;
public class p1039 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String twonums = scan.nextLine();
		StringTokenizer tk = new StringTokenizer(twonums, " ");
		String[] nums = new String[2];
		int i= 0;
		while(tk.hasMoreTokens()) {
			nums[i] = tk.nextToken();
			i+=1;
		}
		long a = Long.parseLong(nums[0]);
		long b = Long.parseLong(nums[1]);
		System.out.print(a+b);
	}
}

//
//정수 2개를 입력받아 합을 출력해보자.
//단, 입력되는 정수는 -2147483648 ~ +2147483648 이다.
//
//참고
//+ 연산자를 사용하면 된다.
//단, 계산된 결과가 int 형으로 저장할 수 있는 범위를 넘어갈 수 있기 때문에 다른 데이터형을 사용해야 한다.
//
//주의
//int 데이터형은 %d로 입출력하고,
//long long int 데이터형은 %lld로 입출력한다.
//
//
//입력
//2개의 정수가 공백으로 구분되어 입력된다.
//
//
//출력
//두 정수의 합을 출력한다.
//
//
//입력 예시   
//2147483648 2147483648
//
//출력 예시
//4294967296 