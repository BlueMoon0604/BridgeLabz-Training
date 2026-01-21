package meal_plan_generator;

public class VegMeal implements MealPlan {
    private String mealName;
    
    public VegMeal(String mealName) {
        this.mealName = mealName;
    }
    public String getDietType() { return "Vegetarian"; }
    public int getCalories() { return 400; }
    public String getMealDescription() {
        return mealName + " - " + getCalories() + " cal (Vegetarian)";
    }
    public boolean isValidForDiet(String diet) {
        return diet.equals("Vegetarian");
    }
}
