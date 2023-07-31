// bend reality to your will

public class ingredients{
    private String name;
    private double price;
    private double calories;

    /**
     * creates an ingredients object given the name, price, and calories
     * @param name name of the ingredient
     * @param price price of the ingredient
     * @param calories calories of the ingredient
     */
    public ingredients(String name, double price, double calories){
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    /**
     * gets the name of the ingredient
     * @return the name of the ingredient
     */
    public String getName(){
        return name;
    }

    /**
     * get the price of the ingredient
     * @return the price of the ingredient
     */
    public double getPrice(){
        return price;
    }

    /**
     * get the calories of the ingredient
     * @return the calories of the ingredient
     */
    public double getCalories(){
        return calories;
    }

    /**
     * set the price of the ingredient
     * @param price amount to set the price to
     */
    public void setPrice(double price){
        this.price = price;
    }


}

