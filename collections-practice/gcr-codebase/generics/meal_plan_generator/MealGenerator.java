package meal_plan_generator;

import java.util.ArrayList;
import java.util.List;

public class MealGenerator<T extends MealPlan> {
    private List<T> mealPlans;
    
    public MealGenerator() {
        this.mealPlans = new ArrayList<>();
    }
    public <U extends MealPlan> boolean validateAndAddMeal(U meal, String dietType) {
        if (meal.isValidForDiet(dietType)) {
            mealPlans.add((T) meal); 
            return true;
        }
        return false;
    }
    public void displayMealPlan() {
        System.out.println("\n=== Your Personalized Meal Plan ===");
        for (T meal : mealPlans) {
            System.out.println(meal.getMealDescription());
        }
        System.out.println("Total Calories: " + getTotalCalories());
    }
    private int getTotalCalories() {
        int total = 0;
        for (T meal : mealPlans) {
            total += meal.getCalories();
        }
        return total;
    }
}
