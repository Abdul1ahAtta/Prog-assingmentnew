package inputTest;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class inputTEST {
    @Test
    public void myFirstTest() {

        readData RD = new readData();
        RD.myMethod("ABDULLAH" + "Atta");

        int expected = 12;
        assertEquals(expected, RD.getCharacters());
    }


    @Test
    public void mySecondTest() {

        readData RD = new readData();
        RD.myMethod("ABDULLAH");
        RD.myMethod("Atta");
        int expected = 2;

        assertEquals(expected, RD.getRows());
    }

    @Test
    public void myThirdTest() {
        readData RD = new readData();
        RD.myMethod("ABDULLAH");
        RD.myMethod("Atta");
        String expected = "ABDULLAH";
        assertEquals(expected, "ABDULLAH");
    }
}