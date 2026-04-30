package oppgave_8;

public class BS_Tree<T extends Comparable<? super T>> {
    private BinaerTreNode<T> rot;

    public BS_Tree(BinaerTreNode<T> rot) {
        this.rot = rot;
    }

    public boolean inneholder(T element) {
        BinaerTreNode<T> p = this.rot;
        boolean funnet = false;

        while (!funnet && p != null) {
            int sml = element.compareTo(p.element);
            if (sml == 0) {
                funnet = true;
            } else if (sml < 0) {
                p = p.venstre;
            } else {
                p = p.hoyre;
            }
        }

        return funnet;
    }

    public void minkende() {
        visMinkende(rot);
    }

    private void visMinkende(BinaerTreNode<T> t) {
        // b) fyll inn – se nærmere beskrivelse i oppgaven

        // tomt -> basis gjer ingenting

        if (t != null) {
            visMinkende(t.hoyre);
            System.out.println(t.element + " ");
            visMinkende(t.venstre);
        }
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
