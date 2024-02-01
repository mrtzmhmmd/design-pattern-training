package factory_method.chat_gpt_example.document_example.document;

import factory_method.chat_gpt_example.document_example.document.creator.DocumentCreator;
import factory_method.chat_gpt_example.document_example.document.creator.HTMLDocumentCreator;
import factory_method.chat_gpt_example.document_example.document.creator.PDFDocumentCreator;
import factory_method.chat_gpt_example.document_example.document.creator.WordDocumentCreator;

public class Main {
    public static void main(String[] args) {
        DocumentCreator pdfCreator = new PDFDocumentCreator();
        Document pdfDocument = pdfCreator.createDocument();
        pdfDocument.open();
        pdfDocument.save();
        pdfDocument.close();

        DocumentCreator wordCreator = new WordDocumentCreator();
        Document wordDocument = wordCreator.createDocument();
        wordDocument.open();
        wordDocument.save();
        wordDocument.close();

        DocumentCreator htmlCreator = new HTMLDocumentCreator();
        Document htmlDocument = htmlCreator.createDocument();
        htmlDocument.open();
        htmlDocument.save();
        htmlDocument.close();
    }
}