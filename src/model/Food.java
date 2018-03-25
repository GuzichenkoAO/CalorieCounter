package model;

public class Food {

    //Это класс который представляей данные у него только геттеры и сеттеры, ну иконструктор

    private String foodName;
    private int cal;
    private double protein;
    private double fat;
    private double carbohydrates;

    public Food(String foodName, int cal, double protein, double fat, double carbohydrates) {
        this.foodName = foodName;
        this.cal = cal;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}
