package io.github.hendrawd.solid.example.liskov2;

public class Square implements IShape {

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getArea() {
        return size * size;
    }
}