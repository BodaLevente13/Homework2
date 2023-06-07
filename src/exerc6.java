import java.util.Scanner;
public class exerc6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] a ;
        System.out.println("Cate  numere sunt");
        int n = scan.nextInt();
        a = new float[n+1] ;
        float s = 0.00F;
        for (int i = 0; i<n; i++){
            System.out.println("introduceti numerele");
            a[i] = scan.nextFloat() ;
            s = s + a[i] ;
        }
     //   System.out.println(a[]);

        System.out.println("Media aritmetica a numerelor introduse:"+s/n);
    }
}