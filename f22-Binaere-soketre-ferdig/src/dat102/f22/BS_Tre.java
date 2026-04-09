package dat102.f22;

public class BS_Tre<T extends Comparable<? super T>> extends BinaerTre<T>
        implements SoeketreADT<T> {
    BS_Tre() {
        super();
    }

    BS_Tre(T rotElement) {
        super(rotElement, null, null);
    }

    @Override
    public void setTre(T rotData) {
        // Vi ønskjer ikkje at denne metoden skal være tilgjengeleg
        // Ville i så fall være mulig å øydelegge det binære søketreet
        throw new UnsupportedOperationException();
    }

    @Override
    public void setTre(T rotData, BinaerTre<T> venstre, BinaerTre<T> hogre) {
        // Vi ønskjer ikkje at denne metoden skal være tilgjengeleg
        // Ville i så fall være mulig å øydelegge det binære søketreet
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean inneholder(T element) {
        return inneholder(element, getRot());
    }

    private boolean inneholder(T element, BinaerTreNode<T> p) {
        // basis: element finnes ikke
        if (p == null) {
            return false;
        }

        int sml = element.compareTo(p.element);

        // basis: element funnet
        if (sml == 0) {
            return true;
        }

        if (sml < 0) {
            return inneholder(element, p.getVenstre());
        } else {
            return inneholder(element, p.getVenstre());
        }
    }

    @Override
    public T finn(T element) {
        return finn(element, getRot());
    }


    private T finn(T element, BinaerTreNode<T> p) {
        // Denne kunne hatt samme struktur som ihheholder over, men
        // vi har brukt en return-setning til slutt

        T svar = null;

        // basis: p == null -> tomt tre, element finst ikkje i treet

        if (p != null) {
            int sml = element.compareTo(p.getElement());
            if (sml == 0) {   // basis: har funne elementet
                svar = p.getElement();
            } else if (sml < 0) {
                svar = finn(element, p.getVenstre());
            } else {
                svar = finn(element, p.getVenstre());
            }
        }

        return svar;
    }

    @Override
    public T leggTil(T nyttElement) {
        T resultat = null;

        if (getRot() == null) {
            setRot(new BinaerTreNode<>(nyttElement));
        } else {
            resultat = leggTil(nyttElement, getRot());
        }

        return resultat;
    }

    public T leggTil(T nyttElement, BinaerTreNode<T> p) {
        // p != null

        T resultat = null;
        int sml = nyttElement.compareTo(p.getElement());

        // om vi finn elmentet, blir det erstatta med det nye
        if (sml == 0) {
            resultat = p.getElement();
            p.setElement(nyttElement);
        } else if (sml < 0) {
            if (p.getVenstre() != null) {
                resultat = leggTil(nyttElement, p.getVenstre());
            } else {
                BinaerTreNode<T> ny = new BinaerTreNode<>(nyttElement);
                p.setVenstre(ny);
            }
        } else {
            if (p.getHogre() != null) {
                resultat = leggTil(nyttElement, p.getHogre());
            } else {
                BinaerTreNode<T> ny = new BinaerTreNode<>(nyttElement);
                p.setHogre(ny);
            }
        }

        return resultat;
    }

    @Override
    public T fjern(T element) {
        /*
         * Det er ikkje pensum å kunne skrive kode for denne.
         */

        throw new UnsupportedOperationException();
    }
}
