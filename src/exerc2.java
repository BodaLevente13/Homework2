import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Introduceti numarul");
        int n = scan.nextInt() ;
        int s = 0 ;
        for (int i = 1; i<=n; i++){
            s = s + i ;
        }
        System.out.println("Suma tuturor numerelor pana "+n+" este: "+s);
    }
}