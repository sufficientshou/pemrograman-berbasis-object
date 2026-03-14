class BangunRuang {
    double volume() {
        return 0;
    }

    double luasPermukaan() {
        return 0;
    }
}

class Balok extends BangunRuang {
    double p, l, t;

    Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    double volume() {
        return p * l * t;
    }

    double luasPermukaan() {
        return 2 * ((p * l) + (p * t) + (l * t));
    }
}

class Kubus extends BangunRuang {
    double s;

    Kubus(double s) {
        this.s = s;
    }

    double volume() {
        return s * s * s;
    }

    double luasPermukaan() {
        return 6 * s * s;
    }
}

public class BangunRuangMain {
    public static void main(String[] args) {

        BangunRuang balok = new Balok(4, 3, 2);
        BangunRuang kubus = new Kubus(5);

        System.out.println("BALOK");
        System.out.println("Volume : " + balok.volume());
        System.out.println("Luas Permukaan : " + balok.luasPermukaan());

        System.out.println();

        System.out.println("KUBUS");
        System.out.println("Volume : " + kubus.volume());
        System.out.println("Luas Permukaan : " + kubus.luasPermukaan());
    }
}