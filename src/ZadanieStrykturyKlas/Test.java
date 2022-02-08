package ZadanieStrykturyKlas;

public class Test {
    public static void main(String[] args) {

        Pojazd czolg = new Gąsienicowe(2111, "diesel", "czarny", 200, 100);
        czolg.uruchomSilnik();
        Pojazd golf1 = new Golf(2019, "elektryczny", "biały", 1200,
                "195/70 R15", 4);
        Pojazd golf2 = new Golf(2012, "benzynowy", "czerwony", 1500,
                "185/70 R16", 5);
        Pojazd golf3 = new Golf(2009, "diesel", "niebieski", 1800,
                "195/80 R17", 5);


    }
}
