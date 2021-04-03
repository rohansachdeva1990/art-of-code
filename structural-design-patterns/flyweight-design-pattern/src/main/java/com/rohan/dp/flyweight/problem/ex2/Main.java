package com.rohan.dp.flyweight.problem.ex2;

/**
 * We’re going to build a spreadsheet application like Excel or Numbers.
 *
 * If you run the code, you’ll see a 3x3 spreadsheet printed
 * on the console. Note that the font of the first cell is different from the font of
 * other cells. So, a user can set various formatting attributes such as font
 * name, font size, bold, etc for each cell individually.
 *
 * The problem with the current implementation is that each cell is storing its
 * font family, font size and bold characteristics. What if many cells share the
 * same formatting attributes? Storing these attributes for every cell would be a
 * waste of memory. While this is not a big deal in a small spreadsheet, it may
 * cause our application to crash if we have a spreadsheet with 100,000+ rows
 * of data.
 *
 * Use the flyweight pattern to solve this problem
 */
public class Main {
    public static void main(String[] args) {
        var sheet = new SpreadSheet();
        sheet.setContent(0, 0, "Hello");
        sheet.setContent(1, 0, "World");
        sheet.setFontFamily(0, 0, "Arial");
        sheet.render();
    }
}
