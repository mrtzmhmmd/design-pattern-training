package factory_method.chat_gpt_example.document_example.document.impl;

import factory_method.chat_gpt_example.document_example.document.Document;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document");
    }

    @Override
    public void close() {
        System.out.println("Closing Word document");
    }
}