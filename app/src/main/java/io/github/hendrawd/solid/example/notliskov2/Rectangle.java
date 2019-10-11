package io.github.hendrawd.solid.example.notliskov2;

public class Rectangle {
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

    public int getArea() {
        return mWidth * mHeight;
    }
}
