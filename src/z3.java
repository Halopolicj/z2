import java.util.Scanner;
class Osoba{
    String imie;
    int wiek;
    public Osoba(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }
    public void powitanie(){
        System.out.println("Witaj "+this.imie+"!\nMasz "+this.wiek+" lat.cw");
    }

}
public class z3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String imie = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int wiek = scanner.nextInt();

        Osoba osoba = new Osoba(imie,wiek);
        osoba.powitanie();
    }
}
