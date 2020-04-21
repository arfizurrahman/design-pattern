package com.arfiz.SOLIDDesignPriciple.interfaceSegregationPriciple;

public class MultiFunctionPrinter implements IMultiFunctionDevice {
    private IPrinter printer;
    private IScanner scanner;

    public MultiFunctionPrinter(IPrinter printer, IScanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    public void Print(Document d) {
        printer.Print(d);
    }

    public void Scan(Document d) {
        scanner.Scan(d); // decorator
    }
}
