class Mahasiswa{
    void Membaca(){
        System.out.println("Saya membaca");
    }
    void Nyontek(){
        System.out.println("Saya menyontek");
    }
    void Modifikasi(){
        System.out.println("Saya Modifikasi");
    }
}
    
public class Tugas1{
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.Membaca();
        mhs.Nyontek();
        mhs.Modifikasi();
    }
}