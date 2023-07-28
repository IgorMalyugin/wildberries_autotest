package ru.wildberries.pages;

import ru.wildberries.components.HeaderComponent;

public abstract class BasePage {

    public HeaderComponent getHeaderComponent() {
        return new HeaderComponent();
    }
}
