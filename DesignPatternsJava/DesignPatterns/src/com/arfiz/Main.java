package com.arfiz;

import com.arfiz.observer.Chart;
import com.arfiz.observer.DataSource;
import com.arfiz.observer.SpreadSheet;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
