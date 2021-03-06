package bombey77.xo.model;

import bombey77.xo.model.exceptions.AlreadyOccupiedException;
import bombey77.xo.model.exceptions.InvalidPointException;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Ромашка on 14.08.2016.
 */
public class FieldTest {
    @Test
    public void getSize() throws Exception {
        final Field field = new Field();

        assertEquals(3, field.getSize());
    }

    @Test
    public void setFigure() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;
        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);
    }

    @Test
    public void getFigureWhenFigureIsNotSet() throws Exception {

        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    public void getFigureWhenXIsLessThenZero() throws Exception {

        final Field field = new Field();
        final Point inputPoint = new Point(-1, 0);
        try {
            field.getFigure(inputPoint);
        }catch (final InvalidPointException e) {}
    }

    @Test
    public void getFigureWhenYIsLessThenZero() throws Exception {

        final Field field = new Field();
        final Point inputPoint = new Point(0, -1);
        try {
            field.getFigure(inputPoint);
        }catch (final InvalidPointException e) {}
    }

    @Test
    public void getFigureWhenXIsMoreThenSize() throws Exception {

        final Field field = new Field();
        final Point inputPoint = new Point(field.getSize() + 1, 0);
        try {
            field.getFigure(inputPoint);
        }catch (final InvalidPointException e) {}
    }

    @Test
    public void getFigureWhenYIsMoreThenSize() throws Exception {

        final Field field = new Field();
        final Point inputPoint = new Point(0, field.getSize() + 1);
        try {
            field.getFigure(inputPoint);
        }catch (final InvalidPointException e) {}
    }

    @Test
    public void getFigureWhenXandYIsLessThenZero() throws Exception {

        final Field field = new Field();
        final Point inputPoint = new Point(-1, -1);
        try {
            field.getFigure(inputPoint);
        }catch (final InvalidPointException e) {}
    }

    @Test
    public void getFigureWhenXandYIsMoreThenSize() throws Exception {

        final Field field = new Field();
        final Point inputPoint = new Point(field.getSize() + 1, field.getSize() + 1);
        try {
            field.getFigure(inputPoint);
        }catch (final InvalidPointException e) {}
    }

    @Test
    public void setFigureWhenAlreadyOccupied() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;
        field.setFigure(inputPoint, inputFigure);

        try{
            field.setFigure(inputPoint, inputFigure);
        }catch (final AlreadyOccupiedException e) {}
    }
}