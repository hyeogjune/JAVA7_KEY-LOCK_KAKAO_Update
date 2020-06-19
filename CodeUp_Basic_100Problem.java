import java.util.*;
public class CodeUp_Basic_100Problem {
	
	public static void main(String[] args) {
		
		/*1003 줄바꿔 출력
		System.out.println("Hello\nWorld");
		*/
		/*1005 큰따옴표 포함 출력
		System.out.println("\"Hello\"");
		*/
		/*1006 큰따옴표 포함 타 문자 출력
		System.out.println("\"!@#$%*()\"");
		*/
		/*1007 "C:\Download\hello.cpp" 을 출력
		System.out.println("\"C:\\Download\\hello.cpp\"");
		*/
		/*1008 특수문자를 출력
		System.out.println("\u250C\u252C\u2510\n");
		System.out.print("\u251C\u253C\u2524\n\n");
		System.out.print("\u2514\u2534\u2518\n");
		*/
		/*1010 정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후 변수에 저장되어 있는 값을 그대로 출력해보자.
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.printf("%d", i);
		*/
		/*1011 문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후 변수에 저장되어 있는 문자를 그대로 출력해보자.
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.print(st);
		*/
		/*1012 실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후 저장되어 있는 실수값을 출력해보자.
		Scanner sc = new Scanner(System.in);
		float fl = sc.nextFloat();
		System.out.print(fl);
		*/
		/*1013 정수(int) 2개를 입력받아 그대로 출력해보자.
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println(i+"\n"+j);
		*/
		/*1014 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(b + "\n" + a);
		*/
		/*1015 실수(float) 1개를 입력받아 저장한 후, 저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여 소수점 이하 둘 째 자리까지 출력하시오.
		Scanner sc = new Scanner(System.in);
		float fl = sc.nextFloat();
		System.out.printf("%.2f", fl);
		*/
		/*1017 int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d %d %d", a, a, a);
		*/
		/*1018 어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int minute = sc.nextInt();
		System.out.printf("%d : %d", time, minute);
		*/
		/*1031 10진수를 입력받아 8진수, 16진수로 출력해보자.
		Scanner sc = new Scanner(System.in);
		int demi_to_ox = sc.nextInt();
		System.out.printf("%d, %o %x", demi_to_ox, demi_to_ox, demi_to_ox);
		*/
		/*1037 정수 입력받아 ASCII CODE 출력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char b = (char) a;
		System.out.println(b);
		*/
		/*1041 문자 입력받아 다음 문자 출력
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0);
		System.out.printf("%c", c+1 );
		*/		
		/*1042 정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a/b);
		*/
		/*1044 정수를 1개 입력받아 1만큼 더해 출력해보
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a+1);
		*/
		/*1045 정수 2개 입력받아 자동 계산하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		System.out.printf("%d\n%d\n%d\n%d", a+b, a/b, a*b, a%b, a-b);
		*/
		/*1046 정수 3개 입력받아 합과 평균 출력하기
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat(); 
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		System.out.printf("%.1f %.1f", a+b+c, (a+b+c)/3);
		*/
		/*1047 Shift를 이용해 정수 1개 입력받아 2배 곱해 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d", a<<1); // a에 2^1배 곱해서 출력. 
		*/
		/*1048 한 번에 2의 거듭제곱 배로 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("a에 2^b를 곱하면 : ");
		System.out.printf("%d", a<<b);
		*/
		/*1050 두 정수 입력받아 비교하기1
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		*/
		

	}

}
