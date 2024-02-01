package factory_method.chat_gpt_example.document_example.document.creator;

import factory_method.chat_gpt_example.document_example.document.Document;
import factory_method.chat_gpt_example.document_example.document.impl.HTMLDocument;

public class HTMLDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new HTMLDocument();
    }
}