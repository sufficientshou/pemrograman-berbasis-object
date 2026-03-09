class Matematika {

    int pertambahan(int a, int b) {
        return a + b;
    }

    int pengurangan(int a, int b) {
        return a - b;
    }

    int perkalian(int a, int b) {
        return a * b;
    }

    int pembagian(int a, int b) {
        return a / b;
    }
}

class Matematika2 extends Matematika {

    int modulus(int a, int b) {
        return a % b;
    }
}

public class MatematikaMain {

    public static void main(String[] args) {

        Matematika2 mtk = new Matematika2();

        System.out.println("Pertambahan : 20 + 10 = " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan : 20 - 10 = " + mtk.pengurangan(20, 10));
        System.out.println("Perkalian   : 20 * 10 = " + mtk.perkalian(20, 10));
        System.out.println("Pembagian   : 20 / 10 = " + mtk.pembagian(20, 10));
        System.out.println("Modulus     : 20 % 10 = " + mtk.modulus(20, 10));
    }
}