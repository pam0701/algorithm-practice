package lineShift;

import java.util.Scanner;

public class lineShift_ver3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 *의 갯수를 입력하세요(n): ");
        int n = scanner.nextInt();

        System.out.print("한 줄에 출력할 갯수를 입력하세요(w): ");
        int w = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i += w) {
            for (int j = i; j < i + w && j < n; j++) { // j가 n보다 크거나 같으면
                System.out.print("*");
            }
            System.out.println();
        }
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("코드 실행 시간: %dms", endTime - startTime);

        scanner.close();
    }
}
