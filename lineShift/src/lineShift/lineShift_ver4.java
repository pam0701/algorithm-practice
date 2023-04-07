package lineShift;

import java.util.Scanner;

public class lineShift_ver4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 *의 갯수를 입력하세요(n): ");
        int n = scanner.nextInt();

        System.out.print("한 줄에 출력할 갯수를 입력하세요(w): ");
        int w = scanner.nextInt();

        int quotient = n / w; //몫
        int remainder = n % w; //나머지 

        String list = "";
        for (int i = 0; i < w; i++) {
        	list += "*";
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < quotient; i++) {
            System.out.println(list);
        }

        if (remainder > 0) {
            String remainingList = "";
            for (int i = 0; i < remainder; i++) {
            	remainingList += "*";
            }
            System.out.println(remainingList);
        }
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("코드 실행 시간: %dms", endTime - startTime);
        
        scanner.close();
    }
}
