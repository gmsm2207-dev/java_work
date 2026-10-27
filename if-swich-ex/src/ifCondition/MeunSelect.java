package ifCondition;

import java.util.Scanner;

public class MeunSelect {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //메뉴 금액 설정
        System.out.println("금액을 입력하세요");
        int money = scanner.nextInt();
        if(money >= 1500){
            System.out.println("커피 , 주스, 물 모두 구매 가능합니다.");
        } else if (money>= 1000) {
            System.out.println("주스 , 물 구매 가능합니다.");
        } else if (money >= 500) {
            System.out.println("물만 구매 구매 가능합니다.");
        }else{
            System.out.println("잔액이 부족합니다.");
        }
    }
}
