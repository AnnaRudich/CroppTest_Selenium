package com.shop;

public enum MenuItems {

    SPECIAL_OFFER("OFERTA SPECJALNA"),
    NEW_ARRIVALS("NOWOŚCI"),
    WOMEN("KOBIETA"),
    MEN("MĘŻCZYZNA"),
    BOOTS("BUTY"),
    COLLECTIONS("KOLEKCJE");

    private String menuNameLocalized;

    MenuItems(String name) {
        this.menuNameLocalized=name;
    }

    public String getMenuNameLocalized() {
        return menuNameLocalized;
    }
}
