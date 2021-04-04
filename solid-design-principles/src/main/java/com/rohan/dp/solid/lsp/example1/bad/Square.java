package com.rohan.dp.solid.lsp.example1.bad;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(int size) {
        this.setHeight(size);
        this.setWidth(size);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Violated LSP
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // Violated LSP
    }
}
