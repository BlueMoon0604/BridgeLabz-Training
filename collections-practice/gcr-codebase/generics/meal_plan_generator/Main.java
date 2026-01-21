package meal_plan_generator;

public class Main {
    public static void main(String[] args) {
        MealGenerator<VegMeal> vegGenerator = new MealGenerator<>();
        MealGenerator<Vegan> veganGenerator = new MealGenerator<>();
        MealGenerator<Keto> ketoGenerator = new MealGenerator<>();
        
        vegGenerator.validateAndAddMeal(new VegMeal("Kadai Panneer"), "Vegetarian");
        vegGenerator.validateAndAddMeal(new VegMeal("Dal Makhani"), "Vegetarian");
        vegGenerator.validateAndAddMeal(new Vegan("Vegan Curry"), "Vegetarian"); 
        
        veganGenerator.validateAndAddMeal(new VegMeal("Quinoa Bowl"), "Vegan");
        veganGenerator.validateAndAddMeal(new VegMeal("Lentil Soup"), "Vegan");
        
        ketoGenerator.validateAndAddMeal(new Keto("Avocado Salmon"), "Keto");
        ketoGenerator.validateAndAddMeal(new HighProtein("Chicken Grill"), "Keto"); 
        
        
        System.out.println("Vegetarian Plan:");
        vegGenerator.displayMealPlan();
        
        System.out.println("\nVegan Plan:");
        veganGenerator.displayMealPlan();
        
        System.out.println("\nKeto Plan:");
        ketoGenerator.displayMealPlan();
    }
}

