package dat102.f24;

public interface MaksHaugADT<T extends Comparable<? super T>> {

    void leggTil(T nyttElement);

    T fjernMaks();

    T finnMaks();

    boolean erTom();

    int getAntall();

    void toem();
}
