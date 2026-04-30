package oppgave_6;

public class LenketMengde<T> implements MengdeADT<T> {
    private Node<T> forste = null;
    private int antall = 0;

    @Override
    public int antallElementer() {
        return antall;
    }

    @Override
    public boolean inneholder(T element) {
        // fyll inn
        return false;
    }

    @Override
    public void leggTil(T element) {
        // fyll inn
    }
}
