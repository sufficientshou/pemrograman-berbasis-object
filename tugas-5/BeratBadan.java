import java.util.Scanner;
public class BeratBadan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Berat Badan Anda : ");
        double bb = input.nextDouble();
        System.out.print("Masukan Tinggi Badan Anda : ");
        double tb = input.nextDouble();

        double imt = bb / (tb * tb);
        String kriteria = null;
        if(imt <= 18.4){
            kriteria = "Berat Badan Kurang";
        } else if(imt <= 24.9){
            kriteria = "Berat Badan Ideal";
        } else if(imt <= 29.9){
            kriteria = "Berat Badan Lebih";
        } else if(imt <= 39.9){
            kriteria = "Gemuk";
        } else {
            kriteria = "Sangat Gemuk";
        }

        System.out.println("===========");
        System.out.println("Berat Badan  : " + bb);
        System.out.println("Tinggi Badan : " + tb);
        System.out.println("Hasil IMT    : " + imt);
        System.out.println("Kriteria     : " + kriteria);

    }
}