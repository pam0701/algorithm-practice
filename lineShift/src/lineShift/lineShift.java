/*+를 n개 출력하되 w마다 줄을 바꿔서 출력한다

출력 예시 
n값: 14, w값: 5
 *****
 *****
 *****/

package lineShift;

import java.util.Arrays;
import java.util.Scanner;

public class lineShift {

    public static void main(String[]args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 *의 갯수를 입력하세요(n): ");
        int n = scanner.nextInt();

        // 배열 생성 후 배열 길이만큼 *을 집어넣기  
        char[] arr = new char[n];
        Arrays.fill(arr, '*');

        System.out.print("한 줄에 출력할 갯수를 입력하세요(w): ");
        int w = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        // 순차적으로 배열을 w개씩 꺼내서 출력
        for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i]);
          //즉, i+1을 w로 나눈 나머지가 0이면 조건식이 참이 됨. 
          //i+1이 w의 배수일 때 참이 됨.
          //따라서, 만약 조건식이 참이라면, 새로운 줄을 시작하는 코드를 실행
          if ((i + 1) % w == 0) { //i가 0부터 시작하므로 (i + 1) % w == 0일 때 줄바꿈
            System.out.println();
          }
        }
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println(String.format("코드 실행 시간: %5dms", endTime - startTime));
        
        scanner.close();
    }
}