class LiczbaAnalityk{
    int x;

    public LiczbaAnalityk(int x){
        this.x = x;
    }

    boolean czyParzysta(){
        if(this.x%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}

public class z1 {
    public static void main(String[] args) {
        LiczbaAnalityk liczba = new LiczbaAnalityk(2);
        System.out.println("Czy liczba jest parzysta: "+liczba.czyParzysta());
    }
}