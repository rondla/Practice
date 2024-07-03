package org.personal.lowlevelDesign.factoryPattern;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DocumentFactory {
    private static final Map<String, Supplier<Document>> registry = new HashMap<>();

    public static void registerDocument(String type, Supplier<Document> supplier) {
        registry.put(type, supplier);
    }

    public static Document createDocument(String type) {
        Supplier<Document> documentSupplier = registry.get(type);
        if (documentSupplier != null) {
            return documentSupplier.get();
        }
        throw new IllegalArgumentException("Unknown Document Type");
    }
}
