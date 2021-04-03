package com.rohan.dp.observer.solution.ex2;

/**
 * We’re building an application for watching the price of various
 * stocks. There are two places in our application where we need to
 * display the stocks:
 * - StatusBar: shows the popular stocks
 * - StockListView: shows the complete list of stocks
 * <p>
 * When the price of a stock changes, the corresponding views
 * (StatusBar and/or StockListView) need to be refreshed to reflect the
 * latest price.
 * <p>
 * Our application currently does not have the ability to communicate
 * the change in stock prices to the corresponding views.
 */
public class Main {
    public static void main(String[] args) {
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new Stock("stock1", 10);
        var stock2 = new Stock("stock2", 20);
        var stock3 = new Stock("stock3", 30);

        // The status bar shows the popular stocks
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        // The stock view list shows all stocks
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        // Causes both statusBar and stockListView to get refreshed
        stock2.setPrice(21);

        // Causes only the stockListView to get refreshed. (statusBar
        // is not watching this stock.)
        stock3.setPrice(9);
    }
}
