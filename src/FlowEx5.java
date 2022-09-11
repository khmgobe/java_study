package src;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = '0';
        System.out.print("점수를 입력해주세요.");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score에 저장
        System.out.printf("당신의 점수는 %d입니다.%n", score);

        /* score가 90점보다 같거나 크면 A학점 90점 이상 중에서도 98점 이상 A+
        90점 이상 94점 미만은 A-, score가 80점보다 같거나 크면 B
        나머지는 전부 다 C
         */

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            }
        } else if (score < 94) {
            opt = '-';
        }
        else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score >= 84) {
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);


    }
}
