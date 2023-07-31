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
    
    public String[] getArr(){
        int i = 0;
        
        for(i=0; i<8; i++){
            ingredients ingredient = ingredientList.get(i);
            item[i] = ingredient.getName();
        }

       return item;
    }

    public double[] getPriceArr(){
        int i = 0;
        
        for(i=0; i<8; i++){
            ingredients ingredient = ingredientList.get(i);
            amount[i] = ingredient.getPrice();
        }

       return amount;
    }

    public int[] getQuantityArr(){
        int i = 0;

        for(i=0; i<8; i++){
            Slot slot = slotList.get(i);
            stock[i] = slot.getQuantity();
        }

        return stock;
    }

    public ArrayList<ingredients> getIngredientList() {
        return ingredientList;
    }

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
     * displays the quantity of the ingredient with its corresponding price and calories content
     */
    public void displayIngredients(){
        System.out.println("Available Ingredients: ");
        int i;

        //display all ingredients
        System.out.println("    QTY " + "  ITEM  " + "      PRICE "+ "      CALORIES");
        for(i=0; i < ingredientList.size(); i++){
            ingredients ingredient = ingredientList.get(i); //ingredientList[i]
            Slot slot = slotList.get(i);
            System.out.println((i+1) + ". " + "(" + slot.getQuantity() + ")   " + ingredient.getName() + "       " + ingredient.getPrice() + "       " + ingredient.getCalories());
        }
    }

    /**
     * For purchasing of Ingredients in slots
     * @param option index of ingredientList
     * @param money amount of money placed in the vending machine
     * @param count for number of runs for purchasing (to know how many items is bought)
     */

    public void purchaseIngredients(double money, int count){
        int index = 0;
        change = money;
        
        if (index >= 0 && index < slotList.size()){ 
            Slot slot = slotList.get(index); 
            ingredients ingredient = ingredientList.get(index); 

            if(slot.getQuantity() > 0){

                double price = ingredient.getPrice();

                if(money >= price){

                    change = money - price;

                    if (change <= balance){
                        System.out.println("======================"+ "\n");
                        System.out.println("      Processing... "+ "\n");
                        System.out.println("======================"+ "\n");
                        slot.setQuantity(slot.getQuantity() - 1);
                        item[count] = ingredient.getName();
                        amount[count] = ingredient.getPrice();
                        
                        System.out.println("======================"+ "\n");
                        System.out.println("   Purchased"+" " +ingredient.getName()+ "!"+"\n");
                        System.out.println("======================"+ "\n");
                    }
                    else {
                        System.out.println("======================================================="+ "\n");
                        System.out.println("Sorry, the vending machine does not have enough change."+"\n");
                        System.out.println("======================================================="+ "\n");
                    }
                }
                else{
                    System.out.println("======================"+ "\n");
                    System.out.println("  Insufficient funds. "+ "\n");
                    System.out.println("======================"+ "\n");
                }
            }
            else{
                System.out.println("======================"+ "\n");
                System.out.println("   Out of stock for"+" " +ingredient.getName()+"\n");
                System.out.println("======================"+ "\n");
            }
        }
        else {
            System.out.println("======================"+ "\n");
            System.out.println("   Invalid Option!"+"\n");
            System.out.println("======================"+ "\n");
        }

        
    }

    public void buy(double money){

    }

    /**
     * sets the quantity of the ingredient in the slot
     * @param option basis of the index in the slotList array list for the proper slot
     * @param quantity amount 
     */
    public void restock(int option, int quantity){
        int index = option - 1;
        Slot slot = slotList.get(index); //set which index to have the right ingredient

        slot.setQuantity(slot.getQuantity() + quantity);
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
    public void setPrice(int option, double price){
        int index = option - 1;
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
     * String array for storing purchased ingredients
     * @return
     */
    public String[] items(){ 
        return item;
    }

    /**
     * double array for storing price of each item
     * @return
     */
    public double[] amounts(){ 
        return amount;
    }

    /**
     * add amount to the balance of the machine
     * @param change amount to add to the balance
     */
    public void replenish(double change){
        balance += change;
    }

    /**
     * prints
     * @param item
     * @param amount
     * @param change
     * @param count
     */
    public void printReceipt(String[] item, double[] amount, double change, int count){

        double total = 0;

        System.out.println("=========RECEIPT=========");
        System.out.println("PURCHASED:");
        System.out.println("ITEM    " + "   PRICE");
        for(int i = 0; i<count; i++){
        System.out.println(item[i] +"   PHP "+ amount[i]);
        total += amount[i];
        }
        System.out.println("-------------------------");
        System.out.println("TOTAL: PHP " + total);
        System.out.println("CHANGE: PHP " + change);
        System.out.println("=========================");
    }
    
}
