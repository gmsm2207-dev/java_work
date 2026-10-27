public class AdultCheck
{
    static void main(String[] args) {

        String name  = "이서";
        int      age     = 18;

        String status = (age>=19) ? "성인" : "미성년자";
        System.out.println(name + "(" + age + "세) : " + status);
    }
}
