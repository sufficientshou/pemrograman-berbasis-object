class KonversiSuhu {

    double celciusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    double celciusToReamur(double c) {
        return c * 4/5;
    }
}

class KonversiSuhu2 extends KonversiSuhu {

    double fahrenheitToReamur(double f) {
        return (f - 32) * 4/9;
    }
}

public class DemoKonversiSuhu {

    public static void main(String[] args) {

        KonversiSuhu2 suhu = new KonversiSuhu2();

        double nilai = 100;

        System.out.println("Celcius ke Fahrenheit : " + suhu.celciusToFahrenheit(nilai));
        System.out.println("Celcius ke Reamur     : " + suhu.celciusToReamur(nilai));
        System.out.println("Fahrenheit ke Reamur  : " + suhu.fahrenheitToReamur(212));
    }
}