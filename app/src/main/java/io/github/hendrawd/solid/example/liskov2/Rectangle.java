package io.github.hendrawd.solid.example.liskov2;

public class Rectangle implements IShape {

    int mWidth;
    int mHeight;

    public void setWidth(int width) {
        mWidth = width;
    }

    public void setHeight(int height) {
        mHeight = height;
    }

    public int getWidth() {
        return mWidth;
    }

    public int getHeight() {
        return mHeight;
    }

    @Override
    public int getArea() {
        return mWidth * mHeight;
    }
}
