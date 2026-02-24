class Nilai{
    String nim;
    String nama;
    double nilaiAbsen, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

    void Nilai(){
        nim = "2351063110";
        nama = "Fajar Abdilah";
        nilaiAbsen = 100;
        nilaiTugas = 100;
        nilaiUts = 100;
        nilaiUas = 100;
        nilaiAkhir = (nilaiAbsen * 0.10) + (nilaiTugas * 0.20) + (nilaiUts * 0.30) + (nilaiUas * 0.40);
    }

    void CetakNilai(){
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("NilaiAbsen: " + nilaiAbsen);
        System.out.println("NilaiTugas: " + nilaiTugas);
        System.out.println("NilaiUts  : " + nilaiUts);
        System.out.println("NilaiUas  : " + nilaiUas);
        System.out.println("NilaiAkhir: " + nilaiAkhir);
    }
}

public class Tugas2{
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        nilai.Nilai();
        nilai.CetakNilai();
    }
}

