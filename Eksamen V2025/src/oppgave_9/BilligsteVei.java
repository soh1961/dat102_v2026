package oppgave_9;

public class BilligsteVei {
    public static void main(String[] args) {
        int[][] rutenett = {
                {0, 3, 1},
                {1, 5, 1},
                {4, 2, 2}};
        int svar = minsteKostnad(rutenett, 0, 0, 2, 2); // Fra (0,0) til (2,2)
        System.out.println(svar); // Skriver ut svaret, som er 7
    }

    private static int minsteKostnad_oppgave(int[][] kostmatrise,
                                             int fraRad, int fraKol, int tilRad, int tilKol) {
// TODO – Du skal lage denne. Bruk rekursjon.
// Tips : - Hva er basistilfellet, og hva er (minste) kostnad da?
// - Hva er minste kostnad hvis vi går ned fra der vi står?
// - Hva er minste kostnad hvis vi går bort fra der vi står?
// - Hva blir minste kostnad fra her, da?

        return 0;
    }


    private static int minsteKostnad(int[][] kostmatrise, int fraRad, int fraKol, int tilRad, int tilKol) {
        int kostDenne = kostmatrise[fraRad][fraKol];
        // Basistilfelle: Hvis vi er på (tilRad, tilKol), så returnerer vi
        // kostnaden for ruten vi står på.
        if (fraRad == tilRad && fraKol == tilKol) {
            return kostDenne;
        }
        // Kostnad for resten starter stort. Ender opp som den minste fra mulige veier.
        int minKostResten = Integer.MAX_VALUE;
        // Hvis vi kan gå nedover, settes minste foreløpig til kost ved å gå nedover.
        if (fraRad < tilRad) {
            minKostResten = minsteKostnad(kostmatrise, fraRad + 1, fraKol, tilRad, tilKol);
        }
        // Hvis vi kan gå bortover, settes minste til minimum av kost ved å gå bortover
        // og den vi har så langt.
        if (fraKol < tilKol) {
            int bortKost = minsteKostnad(kostmatrise, fraRad, fraKol + 1, tilRad, tilKol);
            minKostResten = Math.min(bortKost, minKostResten);
        }
        return kostDenne + minKostResten;
    }
}

