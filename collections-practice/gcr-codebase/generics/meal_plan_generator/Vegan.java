package meal_plan_generator;

public class Vegan implements MealPlan {
    private String mealName;
    
    public Vegan(String mealName) {
        this.mealName = mealName;
    }
    public String getDietType() { return "Vegan"; }
    public int getCalories() { return 350; }
    public String getMealDescription() {
        return mealName + " - " + getCalories() + " cal (Vegan)";
    }
    public boolean isValidForDiet(String diet) {
        return diet.equals("Vegan");
    }
}
