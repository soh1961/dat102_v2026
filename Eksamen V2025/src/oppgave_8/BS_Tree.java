package oppgave_8;

public class BS_Tree<T extends Comparable<? super T>> {
    private BinaerTreNode<T> rot;

    public BS_Tree(BinaerTreNode<T> rot) {
        this.rot = rot;
    }

    public boolean inneholder(T element) {
        // a) fyll inn – se nærmere beskrivelse i oppgaven
        return true;
    }

    public void minkende() {
        visMinkende(rot);
    }

    private void visMinkende(BinaerTreNode<T> t) {
        // b) fyll inn – se nærmere beskrivelse i oppgaven
    }

    public int toBarn() {
        return toBarn(rot);
    }

    private int toBarn(BinaerTreNode<T> t) {
        // c) fyll inn – se nærmere beskrivelse i oppgaven
        return 0;
    }

    public T nestMinste() {
        // d) fyll inn – se nærmere beskrivelse i oppgaven
        return null;
    }
}
