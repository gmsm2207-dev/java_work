import cafe.Cafe;

import java.awt.*;

public class Main {
    static void main(String[] args) {
        System.out.println("=====" + "자바카페" + "=====");
        // STEP 3. 손님 정보를 알맞은 자료형으로 저장
        String name = "김자바";
        int age = 20;
        boolean isMember = true;
        String grade = "S";
        int money = 20000;
        int stamp = 8;
        int friendCount = 0;
        System.out.println("이름 : " + name +" / 나이 : " + age
        + " / 회원 : " + isMember + " / 등급 : " + grade);

        //STEP4 주문번호 받기, 현재번호 200
        //번호를 받고 기계의 번호1증가
        //손님의 주문번호와 다음 주문번호를 출력
        // 짝수면 픽업대"A"  ,홀수면 "픽업대"B"
        int orderNumber = 200;
        int nextOrderNumber = orderNumber + 1;
        System.out.println("내 주문번호: " + orderNumber
                + " , 다음 주문번호: " + nextOrderNumber );
        String pickup = orderNumber % 2 == 0 ? "픽업대 A" : "픽업대 B";
        System.out.println("안내 : " + pickup + "에서 받아가세요");

        //STEP5. 주문하기 아메리카노(4500)2잔과 케이크(6800) 1개를 주문
        //주문 수와 판매 잔 수를 늘리고 , 주문 금액을 계산하세요

        int coffee = 4500;
        int coffeeCount = 2;
        int cake = 6800;
        int cakeCount = 1;
        System.out.println("주문금액 : " + ((coffee*coffeeCount) + (cake*cakeCount)));

        int price = 15800;

        //STEP6 할인과 결제 회원이면 할인율만큼 할인 , 아니면 노할인
        //원 단위 미만은 버리고 결제 금액을 지갑에서 빼고 ,
        // 남은 돈을 거스름돈으로 출력
        double saleRate = 0.1;
        int discount = (int) (price * saleRate);
        int payment = isMember ? price - discount : price;
        System.out.println(payment);


    }






    }
}
