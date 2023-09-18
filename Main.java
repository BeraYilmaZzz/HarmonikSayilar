import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double sayı,countsayı = 0 ;
        System.out.print("Sayı giriniz = ");
        sayı = inp.nextInt();
        for(double i = 1;i<=sayı ;i++) {
            countsayı += 1/i;
        }
        System.out.println(countsayı);
    }
}
