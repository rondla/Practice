package org.personal.lowlevelDesign.factoryPattern;

public class Main {

    public static void main(String[] args) {

        DocumentFactory.registerDocument("Word", WordDocument::new);
        DocumentFactory.registerDocument("PDF", PDF::new);
        DocumentFactory.registerDocument("EXCEL", Excel::new);

        Document doc1 = DocumentFactory.createDocument("Word");
        doc1.open();
        Document doc2 = DocumentFactory.createDocument("PDF");
        doc2.open();
        Document doc3 = DocumentFactory.createDocument("EXCEL");
        doc3.open();


    }
}
