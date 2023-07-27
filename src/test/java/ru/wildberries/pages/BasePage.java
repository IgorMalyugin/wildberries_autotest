package ru.wildberries.pages;

public abstract class BasePage {

        public HeaderComponent getHeaderComponent(){
                return new HeaderComponent();
        }
}
