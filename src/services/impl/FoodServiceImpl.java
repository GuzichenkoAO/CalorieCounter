package services.impl;

import model.Food;
import services.FoodService;

public class FoodServiceImpl implements FoodService {

    //Это сервис в котором будет вся логика, в частонсти которая считывает данные из файла


    //сюда мы будем складывать всю нашу еду из файла или из коммандной строки(пока массив, как только разберешься
    //с коллекциями то поменям на коллекцию(с ними работать удобнаее))
    private Food[] foods;

    public FoodServiceImpl() {
        this.foods = new Food[50];
    }

    //этот метод должен считать из файла все строки распарсить и перегнать все в тип Food. Мы ему передаем имя файла
    @Override
    public void addFromFile(String fileName) {
    }

    @Override
    public void addNewFood(Food food) {
    }

    @Override
    public void removeFood(String foodName) {
    }
}