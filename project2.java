import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz :");

        double tutar = input.nextDouble();
        double kdvli = tutar*1.18;
        double kdv = kdvli-tutar ;

        System.out.println("KDV'siz fiyat :" + tutar);
        System.out.println("KDV'li fiyat :" + kdvli);
        System.out.println("KDV Tutarı :"+ kdv);



    }
}