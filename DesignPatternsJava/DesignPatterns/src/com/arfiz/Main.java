package com.arfiz;

import com.arfiz.strategy.BlackAndWhiteFilter;
import com.arfiz.strategy.ImageStorage;
import com.arfiz.strategy.JpegCompressor;
import com.arfiz.strategy.PngCompressor;
import com.arfiz.template.GenerateReportTask;
import com.arfiz.template.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        var task = new GenerateReportTask();
        task.execute();
    }
}
