package f24.prioritetsko;

import f24.haug.MaksHaug;
import f24.haug.MaksHaugADT;

public class Prioritetskoe<T extends Comparable<? super T>> implements PrioritetskoeADT<T> {
    private MaksHaugADT<T> h = new MaksHaug<>(50);

        @Override
    public void leggTil(T nyttElement) {
        h.leggTil(nyttElement);
    }

    @Override
    public T fjern() {
        return h.fjernMaks();
    }

    @Override
    public T peek() {
        return h.finnMaks();
    }

    @Override
    public boolean erTom() {
        return h.erTom();
    }

    @Override
    public int antall() {
        return h.getAntall();
    }

    @Override
    public void toem() {
        h.toem();
    }
}
