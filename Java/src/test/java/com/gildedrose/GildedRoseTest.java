package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void conjured() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 3, 3) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertTrue(1 == app.items[0].quality);
        app.updateQuality();
        assertTrue(0 == app.items[0].quality);
    }

}
