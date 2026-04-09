package dat102.f22;

public class BinaerTreNode<T>{
    T element;
    BinaerTreNode<T> venstre;
    BinaerTreNode<T>  hogre;

    BinaerTreNode(T el) {
        element = el;
        venstre = null;
        hogre   = null;
    }

    // Flere konstruktører og objektmetoder

    public T getElement() {
        return element;
    }

    public BinaerTreNode<T> getVenstre() {
        return venstre;
    }

    public void setVenstre(BinaerTreNode<T> venstre) {
        this.venstre = venstre;
    }

    public BinaerTreNode<T> getHogre() {
        return hogre;
    }

    public void setHogre(BinaerTreNode<T> hogre) {
        this.hogre = hogre;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public boolean harVenstreBarn() {
        return venstre != null;
    }

    public boolean harHogreBarn() {
        return hogre != null;
    }

    public boolean erLoev() {
        return (venstre == null) && (hogre == null);
    }
}
