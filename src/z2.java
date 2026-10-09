class Pracownik{
    String imie;
    double pensja;

    public Pracownik(String imie, double pensja){
        this.imie = imie;
        this.pensja = pensja;
    }

    public Pracownik(String imie){
        this(imie,3000);
    }
}
public class z2 {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik("Michał",6000);
        System.out.println("Imię pracownika: "+pracownik.imie+ " pensja pracownika: "+pracownik.pensja);
        Pracownik pracownik1 = new Pracownik("Albert");
        System.out.println("Imię pracownika: "+pracownik1.imie+ " pensja pracownika: "+pracownik1.pensja);

    }
}
