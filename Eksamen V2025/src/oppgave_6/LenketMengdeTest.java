package oppgave_6;

public class LenketMengdeTest {
    @Test
    void testAltPaaEnGang(){
        MengdeADT<String> m = new LenketMengde<>();

        assertEquals(0, m.antallElementer());
        assertFalse(m.inneholder("Arne"));

        m.leggTil("Arne");

        assertEquals(1, m.antallElementer());
        assertTrue(m.inneholder("Arne"));
        assertFalse(m.inneholder("Lars"));


        m.leggTil("Arne");

        assertEquals(1, m.antallElementer());
        assertTrue(m.inneholder("Arne"));

        //...
    }
}
