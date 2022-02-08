package ZadanieStrykturyKlas;

public class Gąsienicowe extends Pojazd {
    private int moc;

    public Gąsienicowe() {
    }

    public Gąsienicowe(int rokProdukcji, String rodzajSilnika, String kolor, int masa, int moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.moc = moc;
    }

    @Override
    public final void uruchomSilnik() {
        // Nie można dziedzyczyć metod finalnych.
        System.out.println("Jest to pojazd gąsienicowy");;
    }
}
