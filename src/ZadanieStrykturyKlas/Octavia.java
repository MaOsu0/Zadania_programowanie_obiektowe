package ZadanieStrykturyKlas;

public final class Octavia extends Skoda {
    // Po dodaniu słowa final, nie można stworzyć nowej klasy dziedziczącej po Octavia. Może dlatego aby nie można było
    //zmieniać stanu klasy, naspisywać metod, zmiennych itd.
    public Octavia() {
    }

    public Octavia(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, ilośćOsób);
    }
}
