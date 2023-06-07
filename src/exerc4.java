import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println("Introduceti numarul");
        int n = scan.nextInt() ;
        int invn = 0 ;
        while (n>0) {
            invn = invn+(n%10) ;
            if(n/10>0) {invn = invn*10;}
            n = n/10 ;
        }

        System.out.println(invn);
    }
}