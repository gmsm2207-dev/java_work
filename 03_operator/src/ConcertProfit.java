public class ConcertProfit {
    static void main(String[] args) {

        int ticketPrice = 99000;
        int totalSeat = 15000;
        int soldSeat = 14750;
        int unsoldSeat = totalSeat - soldSeat;

        long totalRevenue = (long) ticketPrice * soldSeat;
        int soldRate = soldSeat * 100 / totalSeat;

        System.out.println("====================");
        System.out.println("IVE 콘서트 수익 현황");
        System.out.println("티켓 가격    : " + ticketPrice + "원");
        System.out.println("판매 좌석    : " + soldSeat + "석");
        System.out.println("미판매 좌석: " + unsoldSeat + "석");
        System.out.println("총 수익        : "+ totalRevenue + "원");
        System.out.println("판매율         : "+ soldRate + "%");
        System.out.println("====================");
    }
}
