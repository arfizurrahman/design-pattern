package com.codewithmosh;

import com.codewithmosh.observer.StatusBar;
import com.codewithmosh.observer.Stock;
import com.codewithmosh.observer.StockListView;

public class Main {
    public static void main(String[] args) {
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new Stock("stock1", 1000);
        var stock2 = new Stock("stock2", 2000);
        var stock3 = new Stock("stock3", 3000);

        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);
        statusBar.show();
        stockListView.show();

        stock1.setPrice(100);
        statusBar.show();
    }
}
