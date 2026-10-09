import java.util.Scanner;

class Kalendarz{

    boolean czyPrzestepny(int rok){
        if((rok%4==0&&rok%100!=0)||(rok%400==0)){
            return true;
        }else {
            return false;
        }

    }
}
public class z4 {
    public static void main(String[] args) {
        Kalendarz kal = new Kalendarz();
        System.out.println("Podaj rok: ");
        Scanner scan = new Scanner(System.in);
        int rok = scan.nextInt();
        System.out.println("Czy rok jest przestępny: "+kal.czyPrzestepny(rok));
    }
}
