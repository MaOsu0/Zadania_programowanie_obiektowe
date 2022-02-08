package ZadanieStrykturyKlas;

public class Sedan extends Osobowy {
    private String model;
    private String symbol;

    public Sedan() {
    }

    public Sedan(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int ilośćOsób) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, ilośćOsób);
    }

    public Sedan(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony,
                 int ilośćOsób, String model, String symbol) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony, ilośćOsób);
        this.model = model;
        this.symbol = symbol;
    }

}
