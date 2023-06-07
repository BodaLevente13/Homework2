import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        int n = scan.nextInt();
        int counter = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                counter++;
            }
        }

        if (counter > 1) {
            System.out.println("Numarul nu este prim");
        }
        else System.out.println("Numarul este prim");
    }
}