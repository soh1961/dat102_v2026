package oppgave_6;

public interface MengdeADT<T> {
    /**
     * @return antall elementer i mengden
     */
    int antallElementer();

    /**
     * @return true hvis mengden inneholder gitt element, false ellers
     */
    boolean inneholder(T element);

    /**
     * Legger til et element i mengden. NB! Elementet vil kun
     * bli lagt til hvis det ikke finnes i mengden fra før.
     */
    void leggTil(T element);
}
