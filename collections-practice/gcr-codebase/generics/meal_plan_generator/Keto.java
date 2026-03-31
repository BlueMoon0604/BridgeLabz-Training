package meal_plan_generator;

public class Keto implements MealPlan {
    private String mealName;
    
    public Keto(String mealName) {
        this.mealName = mealName;
    }
    public String getDietType() { return "Keto"; }
    public int getCalories() { return 500; }
    public String getMealDescription() {
        return mealName + " - " + getCalories() + " cal (Keto - High Fat)";
    }
    public boolean isValidForDiet(String diet) {
        return diet.equals("Keto");
    }
}

