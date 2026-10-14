import java.util.Scanner;

class LicznikLiter {
    int policzSamogloski(String tekst){
        tekst = tekst.toLowerCase();
        int ilosc=0;
        for (int i=0; i<tekst.length();i++) {
            switch (tekst.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u':
                    ilosc++;
            }
        }
        return ilosc;
    }
}
public class z7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String tekst = scan.nextLine();
        scan.close();
        LicznikLiter licz = new LicznikLiter();
        System.out.println(licz.policzSamogloski(tekst)+" samogłosek");
    }
}
