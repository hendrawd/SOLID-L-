package io.github.hendrawd.solid;
import org.junit.Test;

import io.github.hendrawd.solid.example.notliskov2.Rectangle;
import io.github.hendrawd.solid.example.notliskov2.Square;

public class NotLiskov2Test {
    @Test
    public void notLiskov2Test() {
        Rectangle rectangle = getNewRectangle();

        rectangle.setWidth(5);
        rectangle.setHeight(10);
        // user knows that "rectangle" it's a Rectangle.
        // It assumes that he's able to set the width and height as for the base class

        System.out.println(rectangle.getArea());
        // now he's surprised to see that the area is 100 instead of 50.
    }

    private Rectangle getNewRectangle() {
        // it can be an object returned by some factory ...
        return new Square();
    }
}
