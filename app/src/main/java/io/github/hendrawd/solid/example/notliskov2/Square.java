package io.github.hendrawd.solid.example.notliskov2;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        mWidth = width;
        mHeight = width;
    }

    @Override
    public void setHeight(int height) {
        mWidth = height;
        mHeight = height;
    }
}