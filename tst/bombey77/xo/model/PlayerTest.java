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

        final Figure inputValue = Figure.X;
        final Figure exceptValue = inputValue;
        final Player player = new Player(null, inputValue);
        final Figure actualFigure = player.getFigure();

        assertEquals(exceptValue, actualFigure);

    }

}