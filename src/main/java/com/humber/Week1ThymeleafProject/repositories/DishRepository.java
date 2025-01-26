package com.humber.Week1ThymeleafProject.repositories;


import com.humber.Week1ThymeleafProject.models.Dish;

import java.util.ArrayList;
import java.util.List;

public class DishRepository {

        private static final List<Dish> dishes = new ArrayList<>();
    
        // Static block to populate some initial data
        static {
            dishes.add(Dish.builder().id(1).name("Pasta").category("Main").price(12.99).build());
            dishes.add(Dish.builder().id(2).name("Soup").category("Starter").price(6.99).build());
            dishes.add(Dish.builder().id(3).name("Salad").category("Starter").price(8.99).build());
        }
    
        public static List<Dish> getDishes() {
            return dishes;
        }
    
        // Add a new dish to the list
        public static void addDish(Dish dish) {
            dishes.add(dish);
        }
    }