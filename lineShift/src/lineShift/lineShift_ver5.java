package lineShift;

import java.util.Scanner;

public class lineShift_ver5 {

    private static final String PROMPT_N = "출력할 *의 갯수를 입력하세요(n): ";
    private static final String PROMPT_W = "한 줄에 출력할 갯수를 입력하세요(w): ";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(PROMPT_N);
        int n = scanner.nextInt();

        System.out.print(PROMPT_W);
        int w = scanner.nextInt();

        int quotient = n / w; //몫
        int remainder = n % w; //나머지 

        StringBuilder listBuilder = new StringBuilder();
        for (int i = 0; i < w; i++) {
            listBuilder.append("*");
        }
        String list = listBuilder.toString();
        
        long startTime = System.currentTimeMillis();
        StringBuilder outputBuilder = new StringBuilder();
        for (int i = 0; i < quotient; i++) {
            outputBuilder.append(list).append(System.lineSeparator());
        }

        if (remainder > 0) {
            StringBuilder remainingListBuilder = new StringBuilder();
            for (int i = 0; i < remainder; i++) {
                remainingListBuilder.append("*");
            }
            String remainingList = remainingListBuilder.toString();
            outputBuilder.append(remainingList).append(System.lineSeparator());
        }
        long endTime = System.currentTimeMillis();

        System.out.println();
        System.out.print(outputBuilder.toString());
        System.out.printf("코드 실행 시간: %dms", endTime - startTime);

        scanner.close();
    }
}
