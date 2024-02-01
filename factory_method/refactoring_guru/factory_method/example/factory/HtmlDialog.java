package factory_method.refactoring_guru.factory_method.example.factory;

import factory_method.refactoring_guru.factory_method.example.buttons.Button;
import factory_method.refactoring_guru.factory_method.example.buttons.impl.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}