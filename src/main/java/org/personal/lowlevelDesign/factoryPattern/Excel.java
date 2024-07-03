package org.personal.lowlevelDesign.factoryPattern;

public class Excel implements Document {
    @Override
    public void open() {
        System.out.println("Excel");
    }
}
