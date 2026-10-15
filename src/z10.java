import java.util.Scanner;

class Biletomat{
    double cenaBiletu = 3.99;
    void kupBilet(double wplaconaKwota){
        if(wplaconaKwota==cenaBiletu){
            System.out.println("Kupiono bilet, brak reszty");
        } else if(wplaconaKwota>cenaBiletu){
            System.out.println("Kupiono bilet, "+String.format("%.2f", (wplaconaKwota-cenaBiletu))+" zł reszty");
        } else if(wplaconaKwota<cenaBiletu){
            System.out.println("Nie kupiono biletu, wpłacono za mało zł");
        }
    }
}
public class z10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Biletomat tick = new Biletomat();
        System.out.print("Cena biletu 3,99zł, ile zapłacisz? ");
        double x = scan.nextDouble();
        tick.kupBilet(x);
    }
}
