import java.util.Scanner;

class ManipulatorTekstu {

    String odwrot;
    public String odwroc(String teskt){
        for(int i=teskt.length();i>=0;i--){
            odwrot += teskt.charAt(i);

        }
        return odwrot;
    }
}
public class z5 {
    public static void Main(String[] args) {
        ManipulatorTekstu mani = new ManipulatorTekstu();
        System.out.println("Wpisz tekst");
        Scanner scan = new Scanner(System.in);
        String tekst = scan.nextLine();
        scan.close();
        mani.odwroc(tekst);

    }
}