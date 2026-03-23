import java.util.Scanner;
public class Harga {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Total Pembelian Anda : ");
        double total = input.nextDouble();

        double diskon = 0;
        if(total < 50000){
            diskon = total * 0.05;
        } else if(total >= 50000){
            diskon = total * 0.2;
        }
        double totAkhir = total - diskon;

        System.out.println("Total belanja anda : " + total);
        System.out.println("Diskon \t\t    : " + diskon);
        System.out.println("Total AKhir \t    : " + totAkhir);
    }

}