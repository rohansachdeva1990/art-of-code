package com.rohan.dp.cor.problem.ex2;

/**
 * As part of building an accounting application, we need to allow the user to
 * import their data in a variety of formats such as:
 * - Excel spreadsheets (Windows)
 * - Number spreadsheets (Mac)
 * - QuickBook workbooks (special accounting software)
 * In the future, we may need to support other data formats.
 *
 * Problems:-
 *
 *
 *
 *
 */
public class DataReader {
    public void read(String fileName) {
        if (fileName.endsWith(".xls")) {
            System.out.println("Reading data from an Excel spreadsheet.");
        }
        else if (fileName.endsWith(".numbers")) {
            System.out.println("Reading data from a Numbers spreadsheet.");
        }
        else if (fileName.endsWith(".qbw")) {
            System.out.println("Reading data from a QuickBooks file.");
        }
        else
            throw new UnsupportedOperationException("File format not supported.");
    }
}
