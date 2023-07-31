import java.util.ArrayList;

public class VendingMachine{
    //array of ingredients
    private ArrayList<ingredients> ingredientList;
    //array of slots
    private ArrayList<Slot> slotList;
    //storage array of ingredients bought
    private String[] item;
    //storage array of ingredients price
    private double[] amount;
    //balance of vending machine
    private double balance; 
    //change of user 
    private double change;
    //storage array of ingredients quantity
    private int[] stock;
   
    /**
     * creates a VendingMachine object given no parameters
     */
    public VendingMachine(){
        this.ingredientList = new ArrayList<>();
        this.slotList = new ArrayList<>();
        this.item = new String[8];
        this.amount = new double[8];
        this.balance = 2000.0;
        this.change = 0.0;
        this.initIngredients(); 
        this.stock = new int[8];
    }

    /**
     * create ingredients and Slot objects and added to respective array lists (ingredientList, slotList)
     */
    private void initIngredients(){
        ingredients ingredient1 = new ingredients("Tamago", 60, 155);
        ingredients ingredient2 = new ingredients("Noodles", 70, 272);
        ingredients ingredient3 = new ingredients("Pork Chashu", 120, 482);
        ingredients ingredient4 = new ingredients("Green Onion", 50, 3);
        ingredients ingredient5 = new ingredients("Chili Oil", 40, 100);
        ingredients ingredient6 = new ingredients("Tonkatso Broth", 100, 360);
        ingredients ingredient7 = new ingredients("Miso Broth", 80, 60);
        ingredients ingredient8 = new ingredients("Shoyu Broth", 80, 36);

        Slot slot1 = new Slot(ingredient1, 15);
        Slot slot2 = new Slot(ingredient2, 20);
        Slot slot3 = new Slot(ingredient3, 10);
        Slot slot4 = new Slot(ingredient1, 15);
        Slot slot5 = new Slot(ingredient2, 20);
        Slot slot6 = new Slot(ingredient3, 10);
        Slot slot7 = new Slot(ingredient1, 15);
        Slot slot8 = new Slot(ingredient2, 20);

        addIngredients(ingredient1); 
        addIngredients(ingredient2); 
        addIngredients(ingredient3);
        addIngredients(ingredient4);
        addIngredients(ingredient5);
        addIngredients(ingredient6);
        addIngredients(ingredient7);
        addIngredients(ingredient8);

        addSlots(slot1);
        addSlots(slot2);
        addSlots(slot3);
        addSlots(slot4);
        addSlots(slot5);
        addSlots(slot6);
        addSlots(slot7);
        addSlots(slot8);
    }

    /**
     * stores the ingredients name into a string item array and returns the array
     * @return item name array
     */
    public String[] getArr(){
        int i = 0;
        
        for(i=0; i<8; i++){
            ingredients ingredient = ingredientList.get(i);
            item[i] = ingredient.getName();
        }

       return item;
    }

    /**
     * stores the ingredients price into a double amount array and returns the array
     * @return amount price array
     */
    public double[] getPriceArr(){
        int i = 0;
        
        for(i=0; i<8; i++){
            ingredients ingredient = ingredientList.get(i);
            amount[i] = ingredient.getPrice();
        }

       return amount;
    }

    /**
     * stores the slots quantity into a int stock array and returns the array
     * @return stock quantity array
     */
    public int[] getQuantityArr(){
        int i = 0;

        for(i=0; i<8; i++){
            Slot slot = slotList.get(i);
            stock[i] = slot.getQuantity();
        }

        return stock;
    }
    
    /**
     * returns the array list ingredientList
     * @return ingredientList containing the ingredients of ingredients type
     */
    public ArrayList<ingredients> getIngredientList() {
        return ingredientList;
    }
    
    /**
     * returns the array list slotList
     * @return slotList containing the slots of Slot type
     */
    public ArrayList<Slot> getSlotList() {
        return slotList;
    }

    /**
     * add ingredients object to array list ingredientList
     * @param ingredient object to be added to array list
     */
    public void addIngredients(ingredients ingredient){ 
        ingredientList.add(ingredient);
    }

    /**
     * add Slot object to array list slotList
     * @param slot object to add to array list
     */
    public void addSlots(Slot slot){
        slotList.add(slot);
    }

    /**
     * sets the balance of the machine
     * @param change amount to set the balance of the machine
     */
    public void setBalance(double change){
        balance = change;
    }
    
    /**
     * returns the change amount when user makes a purchase
     * @return change amount
     */
    public double getChange(){
        return change;
    }

    /**
     * sets the price of the specified ingredients object
     * @param option basis of the index in the ingredientList array list
     * @param price amount to set the price
     */
    public void setPrice(int index, double price){
        ingredients ingredient = ingredientList.get(index);
        ingredient.setPrice(price); 
    }

    /**
     * return the balance of VendingMachine object
     * @return balance amount
     */
    public double getBalance(){
        return balance;
    }

    /**
     * add amount to the balance of the machine
     * @param change amount to add to the balance
     */
    public void replenish(double change){
        balance += change;
    }
    
}