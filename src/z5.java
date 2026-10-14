import java.util.Scanner;

class ManipulatorTekstu {


    String odwrot="";
    public String odwroc(String tekst){
        for(int i=tekst.length();i>0;i--){
            odwrot += tekst.charAt(i-1);
        }
        System.out.println(odwrot);
        return null;
    }
}
public class z5 {
    public static void main(String[] args) {
        ManipulatorTekstu mani = new ManipulatorTekstu();
        System.out.println("Wpisz tekst");
        Scanner scan = new Scanner(System.in);
        String tekst = scan.nextLine();
        scan.close();
        mani.odwroc(tekst);

    }
}