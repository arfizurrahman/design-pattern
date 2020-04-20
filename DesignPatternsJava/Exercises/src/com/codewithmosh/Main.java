package com.codewithmosh;

import com.codewithmosh.mediator.SignUpDialogBox;
import com.codewithmosh.observer.StatusBar;
import com.codewithmosh.observer.Stock;
import com.codewithmosh.observer.StockListView;

public class Main {
    public static void main(String[] args) {
        var dialog = new SignUpDialogBox();
        dialog.simulateFormFillUp();
    }
}
