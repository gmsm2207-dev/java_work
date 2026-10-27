 package Ex;

 import java.util.Scanner;

 //현재 시간과 분이 주어지고, 요리 시간(c)이 분으로 주어지면
//요리 완료 시간을 출력(24시간제) - 0 < 시간 < =1000
    public class t {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("현재 시간 입력 : ");
        int h = scanner.nextInt();
        System.out.println("현재 분 입력 : ");
        int m = scanner.nextInt();
        System.out.println("요리 시간(분) :");
        int c = scanner.nextInt();
        //현재 시각 + 입력 받은 시간을 분을 더한다.
        int total = h * 60 + c; // 시간*60+분+요리분
        //다시 시각으로 변환한다.
        //1. 시간 변환
        int resultHour = (total / 60) % 24; // 0~23시 추출
        //2. 분 추출
        int resultMinute = total % 60; //분만 남음
        System.out.println(resultHour + " " + resultMinute);

    }
}

