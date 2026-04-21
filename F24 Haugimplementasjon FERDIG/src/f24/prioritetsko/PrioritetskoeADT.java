package f24.prioritetsko;

public interface PrioritetskoeADT<T extends Comparable<? super T>> {
    void leggTil(T nyttElement);

    T fjern();

    T peek();

    boolean erTom();

    int antall();

    void toem();
}
