package com.humber.Week1ThymeleafProject.controllers;
import com.humber.Week1ThymeleafProject.models.Dish;
import com.humber.Week1ThymeleafProject.services.DishService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DishController {

    @Value("${restaurant.name}")
    private String restaurantName;

    private final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("restaurantName", restaurantName);
        return "home";
    }

    @GetMapping("/menu")
    public String menu(Model model) {
        model.addAttribute("dishes", dishService.getDishes());
        return "menu";
    }

    @GetMapping("/addDish")
    public String addDishForm(Model model) {
        model.addAttribute("dish", new Dish()); // Empty dish for form binding
        return "addDish"; // A new template for adding dishes
    }

    @PostMapping("/addDish")
    public String addDish(@ModelAttribute Dish dish) {
        dishService.addDish(dish); // Add the dish using the service
        return "redirect:/menu"; // Redirect to the menu after adding the dish
    }
}
