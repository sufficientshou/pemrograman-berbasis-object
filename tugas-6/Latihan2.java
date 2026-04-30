public class Latihan2 {
    public static void latihan(int n) {
        System.out.print("\t");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        latihan(4);
    }
}