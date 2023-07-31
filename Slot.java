public class Slot{
    private int quantity;
    private ingredients ingredient;

    /**
     * creates a Slot object given an ingredient and quantity
     * @param ingredient ingredient object
     * @param quantity quantity of the ingredient
     */
    public Slot(ingredients ingredient, int quantity){
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    /**
     * set quantity of ingredient in the slot.
     * @param quantity given amount to set the quantity to
     */
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    /**
     * get ingredient in the slot
     * @return ingredient in the slot
     */
    public ingredients getIngredient(){
        return ingredient;
    }

    /**
     * get the quantity of ingredient in the slot
     * @return quantity of the ingredient in the slot
     */
    public int getQuantity(){
        return quantity;
    }
}