import java.util.Scanner;

class GeneratorMatematyczny{
    void wyswietlTabliczke(int liczba){
        for(int i=1;i<=10;i++){
            System.out.println(liczba+" * "+i+" = "+liczba*i);
        }
    }
}
public class z9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        GeneratorMatematyczny gen = new GeneratorMatematyczny();
        System.out.print("Wpisz liczbę");
        int x = scan.nextInt();
        gen.wyswietlTabliczke(x);
        scan.close();
    }
}
