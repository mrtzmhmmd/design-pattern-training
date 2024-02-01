package factory_method.refactoring_guru.factory_method.example.factory;

import factory_method.refactoring_guru.factory_method.example.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}