package com.arfiz;

import com.arfiz.mediator.ArticlesDialogBox;
import com.arfiz.observer.Chart;
import com.arfiz.observer.DataSource;
import com.arfiz.observer.SpreadSheet;

public class Main {
    public static void main(String[] args) {
        var dialogBox = new ArticlesDialogBox();
        dialogBox.simulateUserInteraction();
    }
}
