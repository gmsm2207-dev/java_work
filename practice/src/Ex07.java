import java.util.Scanner;

public class Ex07 {
    static void main(String[] args) {
        //1.금액 추가 2.음료선택
        Scanner scanner = new Scanner(System.in);
        int money = 0;
        //무한 반복
        while (true) {
            //메인 메뉴 출력하기
            System.out.println("========================================");
            System.out.println("1.금액 추가 2.음료선택 3.잔액출력 4.잔돈반환(종료)");
            System.out.println("========================================");
            System.out.println("메뉴 번호를 선택하세요.");
            int meun = scanner.nextInt();
            //투입 금액 관리 변수
            int money = 0;
            // 메뉴에 따른 실행을 swtich - case로 먼저 윤곽을 잡는다.
            switch (meun) {
                case 1:
                    System.out.println("금액을 입력하세요.");
                    money = money + scanner.nextInt();
                    System.out.println("현재 잔액은 : " + money + "원입니다.");
                    break;
                case 2:
                    System.out.println("음료 선택");
                    while (true){
                    //1.음료 메뉴가 나온다.
                        System.out.println("메뉴 : 1.커피(1500원) 2.주스(1000원) 3.물(500)");
                    //2.음료 중 1개를 선택한다.
                        System.out.println("번호를 입력하세요.(1~4) : ");
                        int choice = scanner.nextInt();
                        switch (choice){
                            case 1 :
                                //잔액과 음료 가격을 비교 
                                if (money >= 1500) {
                                    //잔돈 넉넉
                                    //1.음료 출력
                                    System.out.println("커피가 나왔습니다.");
                                    //2. 잔액 - 음료수
                                    money = money - 1500;
                                } else {
                                    //모자란 경우
                                    System.out.println("금액이 부족합니다. 다시 선택해 주세요.");
                                }
                                break;
                            case 2 :
                                //잔액과 음료 가격을 비교
                                if (money >= 1000) {
                                    //잔돈 넉넉
                                    //1.음료 출력
                                    System.out.println("주스가 나왔습니다.");
                                    //2. 잔액 - 음료수
                                    money = money - 1000;
                                } else {
                                    //모자란 경우
                                    System.out.println("금액이 부족합니다. 다시 선택해 주세요.");
                                }
                                break;
                            case 3 :
                                System.out.println("물");
                                break;
                            case 4 :
                                System.out.println("음료 선택을 종료 합니다.");

                                    System.out.println("다시 선택하세요.");
                                    default:



                        }

                    //2-1.음료가격과 잔돈을 비교(음료 내주고 잔액-, 돈 모자름 출력)
                    //3.잘 못 선택한 경우 처리
            }
                    break;
                case 3:
                    System.out.println("현재 잔액은 : " + money + "원입니다.");
                    break;
                case 4:
                    System.out.println("잔돈 반환 : " + money);
                    money = 0;
                    return;
                default:
                    System.out.println("다시 선택해 주세요.");
            }
        }
    }
}

