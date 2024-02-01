package factory_method.refactoring_guru.factory_method.example.buttons.impl;

import factory_method.refactoring_guru.factory_method.example.buttons.Button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}