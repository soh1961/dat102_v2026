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
        Node<T> p = forste;
        while (p != null) {
            if (element.equals(p.data)){
                return true;
            } else {
                p = p.neste;
            }
        }

        return false;
    }

    @Override
    public void leggTil(T element) {
        if (!inneholder(element)) {
            Node<T> ny = new Node<>(element);
            ny.neste = forste;
            forste = ny;
            antall++;
        }
    }
}
