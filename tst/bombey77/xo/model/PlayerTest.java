package bombey77.xo.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    @Test
    public void getName() throws Exception {

        final String inputValue = "Slava";
        final String exceptValue = inputValue;
        final Player player = new Player(inputValue, null);
        final String actualValue = player.getName();

        assertEquals(exceptValue, actualValue);

    }

    @Test
    public void getFigure() throws Exception {

    }

}