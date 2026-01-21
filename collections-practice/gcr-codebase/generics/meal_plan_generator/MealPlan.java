package meal_plan_generator;

public interface MealPlan {
    String getDietType();
    int getCalories();
    String getMealDescription();
    boolean isValidForDiet(String diet);
}
