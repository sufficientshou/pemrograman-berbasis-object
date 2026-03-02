class Matematika {

    int pertambahan(int a, int b){
        return a + b;
    }

    int pengurangan(int a, int b){
        return a - b;
    }

    int perkalian(int a, int b){
        return a * b;
    }

    int pembagian(int a, int b){
        return a / b;
    }
}

public class MatematikaBeraksi{
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        System.out.println("Pertambahan : 20 + 10 = " + mtk.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5 = " + mtk.pengurangan(10, 5));
        System.out.println("Perkalian : 10 * 3 = " + mtk.perkalian(10, 3));
        System.out.println("Pembagian : 20 / 2 = " + mtk.pembagian(20, 2));

    }
}


