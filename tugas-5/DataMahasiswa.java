import java.util.Scanner;
public class DataMahasiswa{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("-------Input Mahasiswa-------");
        System.out.print("NPM \t\t: ");
        String npm = input.nextLine();
        System.out.print("Nama Mahasiswa \t: ");
        String nama = input.nextLine();
        System.out.print("Nilai Kehadiran : ");
        double nHadir = input.nextDouble();
        System.out.print("Nilai Tugas \t: ");
        double nTugas = input.nextDouble();
        System.out.print("Nilai UTS \t: ");
        double nUTS = input.nextDouble();
        System.out.print("Nilai UAS \t: ");
        double nUAS = input.nextDouble();
        double nAkhir = (0.1 * nHadir) + (0.2 * nTugas) + (0.3 * nUTS) + (0.4 * nUAS);
        char grade = 0;
        String ket = null;
        if(nAkhir <= 45){
            grade = 'E';
            ket = "Kurang Sekali";
        } else if(nAkhir <= 55){
            grade = 'D';
            ket = "Kurang";
        } else if(nAkhir <= 65){
            grade = 'C';
            ket = "Cukup";
        } else if(nAkhir <= 75){
            grade = 'B';
            ket = "Baik";
        } else if(nAkhir <= 100){
            grade = 'A';
            ket = "Istimewa";
        }
        System.out.println("-------Output Mahasiswa-------");
        System.out.println("NPM \t\t: " + npm);
        System.out.println("Nama Mahasiswa \t: "+ nama);
        System.out.println("Nilai Rata-rata : " + nAkhir);
        System.out.println("Grade \t\t: " + grade);
        System.out.println("Keterangan \t: " + ket);
    }
}