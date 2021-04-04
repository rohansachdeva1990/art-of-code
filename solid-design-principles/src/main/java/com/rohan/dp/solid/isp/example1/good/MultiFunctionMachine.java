package com.rohan.dp.solid.isp.example1.good;

/**
 * We can use Decorator to delagate some stuff here
 *
 * We already have impl for printer and scanner. Lets just delegate
 * the responsibility
 */
public class MultiFunctionMachine implements MultiFunctionDevice {
    private Printer printer;
    private Scanner scanner;

    public MultiFunctionMachine(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void print(Document d) {
        printer.print(d);
    }

    @Override
    public void scan(Document d) {
        scanner.scan(d);
    }
}
