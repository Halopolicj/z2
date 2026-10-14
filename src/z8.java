import java.util.Scanner;

class KalkultorZPamiecia{
    double ostatniWynik;
    void dodaj(double x){
        ostatniWynik +=x;
        System.out.println("wynik: "+ostatniWynik);
    }
    void odejmij(double x){
        ostatniWynik -=x;
        System.out.println("wynik: "+ostatniWynik);
    }
}
public class z8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        KalkultorZPamiecia calc = new KalkultorZPamiecia();
        char ch;
        do {
            System.out.print("dodać (+), odjąć (-), czy przestać (inne znaki)? ");
            ch = scan.next().toCharArray()[0];
            if(ch=='+'){
                System.out.print("Podaj liczbę ");
                double x = scan.nextDouble();
                calc.dodaj(x);
            } else if (ch=='-'){
                System.out.print("Podaj liczbę ");
                double x = scan.nextDouble();
                calc.odejmij(x);
            }
        } while (ch=='+'||ch=='-');
    }
}
