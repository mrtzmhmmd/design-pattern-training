package factory_method.chat_gpt_example.document_example.document.creator;

import factory_method.chat_gpt_example.document_example.document.Document;
import factory_method.chat_gpt_example.document_example.document.impl.PDFDocument;

public class PDFDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}