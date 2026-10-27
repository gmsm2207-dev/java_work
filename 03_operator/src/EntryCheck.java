public class EntryCheck{
    static void main(String[] args) {

        int age = 17;
        boolean hasTicket = true;
        boolean isVip = false;

        //입장 조건 : 티켓 있음 AND (나이 18 이상 OR VIP)
        boolean canEnter = hasTicket && (age>=18 || isVip);

        System.out.println("나이           : " + age);
        System.out.println("티켓 보유  : " + hasTicket);
        System.out.println("VIP 여부     : " +  isVip);
        System.out.println("입장 가능  : " + canEnter);
         }
    }

