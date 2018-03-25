package services;

import model.Food;

public interface FoodService {


    void addFromFile(String fileName);

    void addNewFood(Food food);

    void removeFood(String foodName);

    //и т.д.
}