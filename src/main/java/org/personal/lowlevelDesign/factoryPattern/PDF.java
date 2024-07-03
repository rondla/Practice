package org.personal.lowlevelDesign.factoryPattern;

public class PDF implements Document {
    @Override
    public void open() {
        System.out.println("PDF");
    }
}
