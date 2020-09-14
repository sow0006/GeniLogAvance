package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].name, is("foo"));
    }

    @Test
    void test_sellIn(){
        Item[] items = new Item[] { new Item("xml", 6, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(5));
    }

    void test_quality(){
        Item[] items = new Item[] { new Item("xml", 6, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(10));
    }

    // quality < 50
    @Test
    void test_qualityInferieur(){
        Item[] items = new Item[] { new Item("xml", 5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(49));
    }

    // quality  < 50 et sellIn  < 6
    @Test
    void test_SellQuality(){
        Item[] items = new Item[] {new Item("xml", 5, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn, is(4));
        assertThat(app.items[0].quality, is(48));

    }

}
