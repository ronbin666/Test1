/**
 * Copyright 2000-2020 luobin All Rights Reserved.
 */
package runoob.com.design.Builderfactory;

/**
 * TODO �ڴ�д��������˵����<br>
 * @author luobin <br>
 * @version 
 * @time 2017-8-15����12:36:53 <br>
 * @see
 * @since 
 */
public class MealBuilder {

	public Meal prepareVegMeal() {
		final Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		final Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
