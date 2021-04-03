package com.rohan.dp.builder.solution.ex1;

public class HtmlBuilder {
    private String rootName;
    private HtmlElement root = new HtmlElement();

    public HtmlBuilder(String rootName) {
        this.rootName = rootName;
        root.setName(rootName);
    }

    /*public void addChild(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.addChild(e);
    }*/


    public HtmlBuilder addChild(String childName, String childText) {
        HtmlElement e = new HtmlElement(childName, childText);
        root.addChild(e);
        return this;
    }

    public void clear() {
        root = new HtmlElement();
        root.setName(rootName);
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
