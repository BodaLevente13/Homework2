import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Introduceti numarul");
        int n = scan.nextInt() ;
        int s = 1 ;
        System.out.println("Introduceti puterea");
        int p = scan.nextInt() ;
        for (int i = 1; i<=p; i++){
            s = s * n ;
        }
        System.out.println(n+" la puterea "+p+" este: "+s);
    }
}