/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.Builderfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO 在此写上类的相关说明。<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-15上午12:28:58 <br>
 * @see
 * @since 
 */
public class Meal {

	private List<Item> items =  new ArrayList<Item>();
	
	public void addItem(final Item item) {
		items.add(item);
	}
	
	public float getTotalCost() {
		float cost = 0;
		for (Item item : items) {
			cost = cost + item.price();
		}
		return cost;
	}
	
	public void showItems() {
		for (Item item : items) {
			System.out.print("name: " + item.name());
			System.out.print(", packing: " + item.packing().pack());
			System.out.println(", price: " + item.price());
		}
	}
}
