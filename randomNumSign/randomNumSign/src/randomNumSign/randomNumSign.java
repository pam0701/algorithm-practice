package randomNumSign;

import java.util.Scanner;

public class randomNumSign {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);

			System.out.print("숫자를 입력하세요: ");
			num = sc.nextInt();

		for(int i = 0; i < num; i++) {
			System.out.print((i%2 == 0) ? "+" : "-");
		}
	}
}
