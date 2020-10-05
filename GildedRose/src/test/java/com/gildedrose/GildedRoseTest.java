package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

	@Test
	void foo() {
		Item[] items = new Item[] {new Item("foo", 0, 0)};
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
		assertThat(app.items[0].quality, is(50));
	}

	//Quality = quality - quality
	@Test
	void qualityTestNull() {
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -10, 49)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(0));
	}
	
	@Test
	void sellInTest() {
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -6, 50)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(-7));
	}
	
	@Test
	void testSellIn() {
		Item[] items = new Item[] {new Item("Elixir of the Mongoose", 6, 10)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(5));
	}

	@Test
	void testQuality() {
		Item[] items = new Item[] {new Item("xml", 6, 10) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(9));
	}

	// quality < 50
	@Test
	void testQualityInferieur() {
		Item[] items = new Item[] { new Item("Elixir of the Mongoose", 5, 50) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(49));
	}

	// quality < 50 et sellIn < 6
	@Test
	void testSellQuality() {
		Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 5, 49) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(5));
		assertThat(app.items[0].quality, is(49));

	}

	//quality > 0 et sellIn < 0
	@Test
	void sellQualityInfSup() {
		Item[] items = new Item[] {new Item("Aged Brie", -5, 48)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(-6));
		assertThat(app.items[0].quality, is(50));
	}
	 
    // sellIn < 0
	@Test
    void sellInfZero(){
		Item[] items = new Item[] {new Item("Aged Brie", -5, 50)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(-6));
	}
	
	@Test
	void quantitySup() {
		Item[] items = new Item[] {new Item("xml", -5, 50)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(48));
	}
	
	@Test
	void qualityTests() {
		Item[] items = new Item[] {new Item("xml", 5, 50)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(49));
	}
	
	@Test
	void qualityTest1() {
		Item[] items = new Item[] {new Item("Aged Brie", 0, 5)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(7));
	}
	
	@Test
	void qualityTest2() {
		Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", 0, -5)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(-5));
	}
	
	@Test
	void qualityTest3() {
		Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", -7, -5)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(-5));
	}
	
	@Test
	void qualityTest4() {
		Item[] items = new Item[] {new Item("Sulfuras, Hand of Ragnaros", -1, 5)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].quality, is(5));
	}

	@Test
	void sellInTestt() {
		Item[] items = new Item[] {new Item("xml", 0, 5)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(-1));
	}
	
	@Test
	void sellInTest1() {
		Item[] items = new Item[] {new Item("xml", 0, -5)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(-1));
	}
	
	@Test
	void sellInTest2() {
		Item[] items = new Item[] {new Item("xml", -1, -5)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(-2));
	}
	
	@Test
	void sellInTest3() {
		Item[] items = new Item[] {new Item("Aged Brie", 7, -50)};
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		assertThat(app.items[0].sellIn, is(6));
	}	

	
}
