import java.util.Scanner;

class ManipulatorTekstu {

    public String odwroc(String teskt){
        System.out.println("Wpisz tekst");
        Scanner scan = new Scanner(System.in);
        String tekst = scan.nextLine();
        scan.close();
        String odwrocone="";
        for(int i=0;i<=tekst.length();i++){
            odwrocone += tekst.charAt(i);

        }
        return odwrocone;
    }
}
public class z5 {
    ManipulatorTekstu mani = new ManipulatorTekstu();
    mani.odwroc("s");
}