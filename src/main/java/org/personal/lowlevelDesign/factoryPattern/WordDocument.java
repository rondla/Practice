package org.personal.lowlevelDesign.factoryPattern;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.print("Word \n");
    }
}
