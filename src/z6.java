import java.util.Scanner;

class Stoper {
    Stoper(int sekundy){}

    int i=0;
    int odliczaj(int sekundy){
        while (sekundy>=0){
            System.out.print(sekundy+", ");
            sekundy--;
            i++;
            if(i==15){
                System.out.println("");
                i=0;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

        }
        return sekundy;
    }
}
public class z6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sekundy = scan.nextInt();
        Stoper stoper = new Stoper(sekundy);
        stoper.odliczaj(sekundy);
    }
}
