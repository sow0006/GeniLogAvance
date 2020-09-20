package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class GildedRoseTest {

	
//	@Test
//	void foo() {
//		Item[] items = new Item[] { new Item("foo", 0, 0) };
//		GildedRose app = new GildedRose(items);
//		app.updateQuality();
//		assertThat(app.items[0].name, is("foo"));
//	}
	
	//quality = quality + 1
	@Test
	void qualityTest() {
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50,app.items[0].quality);
	}
	
	
	//Quality = quality - quality
	@Test
	void qualityTestNull() {
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -10, 49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0,app.items[0].quality);
	}
	
	@Test
	void sellInTest() {
		Item[] items = new Item[] {new Item("Backstage passes to a TAFKAL80ETC concert", -6, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-7,app.items[0].sellIn);
	}
	
//	@Test
//	void test_sellIn() {
//		Item[] items = new Item[] { new Item("xml", 6, 10) };
//		GildedRose app = new GildedRose(items);
//		app.updateQuality();
//		assertThat(app.items[0].sellIn, is(5));
//	}
//
//	@Test
//	void test_quality() {
//		Item[] items = new Item[] { new Item("xml", 6, 10) };
//		GildedRose app = new GildedRose(items);
//		app.updateQuality();
//		assertThat(app.items[0].quality, is(9));
//	}
//
//	// quality < 50
//
//	@Test
//	void test_qualityInferieur() {
//		Item[] items = new Item[] { new Item("xml", 5, 50) };
//		GildedRose app = new GildedRose(items);
//		app.updateQuality();
//		assertThat(app.items[0].quality, is(49));
//	}
//
//	// quality < 50 et sellIn < 6
//
//	@Test
//	void test_SellQuality() {
//		Item[] items = new Item[] { new Item("xml", 5, 49) };
//		GildedRose app = new GildedRose(items);
//		app.updateQuality();
//		assertThat(app.items[0].sellIn, is(4));
//		assertThat(app.items[0].quality, is(48));
//
//	}

	// quality > 0 et sellIn < 0

//	@Test
//	void sellQuality_InfSup() {
//		Item[] items = new Item[] { new Item("xml", -5, 48) };
//		GildedRose app = new GildedRose(items);
//		app.updateQuality();
//		assertThat(app.items[0].sellIn, is(-6));
//		assertThat(app.items[0].quality, is(46));
//
//	}
	 
    // sellIn < 0
	@Test
    void sellInfZero(){
        Item[] items = new Item[] {new Item("xml", -5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-6,app.items[0].sellIn);
    }
	
	@Test
	void quantitySup() {
		Item[] items = new Item[] {new Item("xml", -5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(48,app.items[0].quality);
	}
	
	@Test
	void quality_test() {
		Item[] items = new Item[] {new Item("xml", 5, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(49,app.items[0].quality);
	}
	
	@Test
	void quality_test1() {
		Item[] items = new Item[] {new Item("xml", 0, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3,app.items[0].quality);
	}
	
	@Test
	void quality_test2() {
		Item[] items = new Item[] {new Item("xml", 0, -5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-5,app.items[0].quality);
	}
	
	@Test
	void quality_test3() {
		Item[] items = new Item[] {new Item("xml", -7, -5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-5,app.items[0].quality);
	}
	
	@Test
	void quality_test4() {
		Item[] items = new Item[] {new Item("xml", -1, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3,app.items[0].quality);
	}

	@Test
	void sellIn_test() {
		Item[] items = new Item[] {new Item("xml", 0, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1,app.items[0].sellIn);
	}
	
	@Test
	void sellIn_test1() {
		Item[] items = new Item[] {new Item("xml", 0, -5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-1,app.items[0].sellIn);
	}
	
	@Test
	void sellIn_test2() {
		Item[] items = new Item[] {new Item("xml", -1, -5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(-2,app.items[0].sellIn);
	}
	
	@Test
	void sellIn_test3() {
		Item[] items = new Item[] {new Item("xml", 7, -50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(6,app.items[0].sellIn);
	}	
	
}
