package meal_plan_generator;

public class HighProtein implements MealPlan {
    private String mealName;
    
    public HighProtein(String mealName) {
        this.mealName = mealName;
    }
    public String getDietType() { return "High-Protein"; }
    public int getCalories() { return 450; }
    public String getMealDescription() {
        return mealName + " - " + getCalories() + " cal (High Protein)";
    }
    public boolean isValidForDiet(String diet) {
        return diet.equals("High-Protein");
    }
}

