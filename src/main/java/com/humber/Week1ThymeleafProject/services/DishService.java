package com.humber.Week1ThymeleafProject.services;


import com.humber.Week1ThymeleafProject.models.Dish;
import com.humber.Week1ThymeleafProject.repositories.DishRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DishService {

    public List<Dish> getDishes() {
        return DishRepository.getDishes();
    }

    public void addDish(Dish dish) {
        DishRepository.getDishes().add(dish); // Add dish to the repository
    }
}