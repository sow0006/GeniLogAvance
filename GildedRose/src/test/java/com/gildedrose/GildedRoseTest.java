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
	
	//quality = quality + 1
	@Test
	void qualityTest() {
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(50));
	}
	
	
	//Quality = quality - quality
	@Test
	void qualityTestNull() {
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(0));
	}
	
	@Test
	void sellInTest() {
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -6, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn,is(-7));
	}
	
	@Test
	void test_sellIn() {
		Item[] items = new Item[] { new Item("xml", 6, 10) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(5));
	}

	@Test
	void test_quality() {
		Item[] items = new Item[] { new Item("xml", 6, 10) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(9));
	}

	// quality < 50

	@Test
	void test_qualityInferieur() {
		Item[] items = new Item[] { new Item("xml", 5, 50) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(49));
	}

	// quality < 50 et sellIn < 6

	@Test
	void test_SellQuality() {
		Item[] items = new Item[] { new Item("xml", 5, 49) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(4));
		assertThat(app.items[0].quality, is(48));

	}

	//quality > 0 et sellIn < 0

	@Test
	void sellQuality_InfSup() {
		Item[] items = new Item[] { new Item("xml", -5, 48) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(-6));
		assertThat(app.items[0].quality, is(46));

	}
	 
    // sellIn < 0
	@Test
    void sellInfZero(){
        Item[] items = new Item[] {new Item("xml", -5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn,is(-6));
    }
	
	@Test
	void quantitySup() {
		Item[] items = new Item[] {new Item("xml", -5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(48));
	}
	
	@Test
	void quality_test() {
		Item[] items = new Item[] {new Item("xml", 5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(49));
	}
	
	@Test
	void quality_test1() {
		Item[] items = new Item[] {new Item("xml", 0, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(3));
	}
	
	@Test
	void quality_test2() {
		Item[] items = new Item[] {new Item("xml", 0, -5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(-5));
	}
	
	@Test
	void quality_test3() {
		Item[] items = new Item[] {new Item("xml", -7, -5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(-5));
	}
	
	@Test
	void quality_test4() {
		Item[] items = new Item[] {new Item("xml", -1, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(3));
	}

	@Test
	void sellIn_test() {
		Item[] items = new Item[] {new Item("xml", 0, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn,is(-1));
	}
	
	@Test
	void sellIn_test1() {
		Item[] items = new Item[] {new Item("xml", 0, -5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn,is(-1));
	}
	
	@Test
	void sellIn_test2() {
		Item[] items = new Item[] {new Item("xml", -1, -5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn,is(-2));
	}
	
	@Test
	void sellIn_test3() {
		Item[] items = new Item[] {new Item("xml", 7, -50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].sellIn,is(6));
	}	
	
}
