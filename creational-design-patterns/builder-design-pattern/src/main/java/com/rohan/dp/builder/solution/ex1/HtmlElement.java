package com.rohan.dp.builder.solution.ex1;

import java.util.ArrayList;
import java.util.Collections;

public class HtmlElement {
    private final int indentSize = 3;
    private final String newLine = System.lineSeparator();

    // Eg: li, ul etc
    private String name;
    // Value of element
    private String text;
    private ArrayList<HtmlElement> elements = new ArrayList<HtmlElement>();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    /**
     * IGNORE THIS IS NOT A PART OF DESIGN PATTERN SHOWCASE
     *
     * @param indent
     * @return
     */
    private String toStringImpl(int indent) {
        StringBuilder sb = new StringBuilder();
        String indentSpace = createIndent(indent, indentSize);
        sb.append(String.format("%s<%s>%s", indentSpace, name, newLine));

        if (text != null && !text.isEmpty()) {
            sb.append(createIndent(indentSize, indent + 1))
                    .append(text)
                    .append(newLine);
        }

        for (HtmlElement e : elements) {
            sb.append(e.toStringImpl(indent + 1));
        }

        sb.append(String.format("%s</%s>%s", indentSpace, name, newLine));
        return sb.toString();
    }

    private String createIndent(int indent, int indentSize) {
        return String.join("", Collections.nCopies(indent * indentSize, " "));
    }

    @Override
    public String toString() {
        return toStringImpl(0); // Starting at level 0
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addChild(HtmlElement childElement){
        elements.add(childElement);
    }

}
