public class Latihan1 {
    static boolean Prima(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void bilanganPrima() {
        System.out.println("=== Prima & Bukan Prima ===");
        for (int i = 0; i <= 20; i++) {
            if (Prima(i)) {
                System.out.println(i + " = Prima");
            } else {
                System.out.println(i + " = Bukan Prima");
            }
        }
    }

    static void ganjilGenap() {
        System.out.println("\n=== Ganjil & Genap ===");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " = Genap");
            } else {
                System.out.println(i + " = Ganjil");
            }
        }
    }

    static void hurufZA() {
        System.out.println("\n=== Huruf Z - A ===");
        for (char c = 'Z'; c >= 'A'; c--) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    static void anakAyam(int n) {
        System.out.println("\n=== Anak Ayam ===");
        for (int i = n; i > 0; i--) {
            if (i > 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            } else {
                System.out.println("Anak ayam turun 1, mati satu tinggal induknya");
            }
        }
    }

    public static void main(String[] args) {
        bilanganPrima();
        ganjilGenap();
        hurufZA();
        anakAyam(5);
    }
}