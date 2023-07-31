import java.util.ArrayList;

public class Ramen extends ingredients {

    private ArrayList<ingredients> spicyTonkatsu;
    private ArrayList<ingredients> tonkatsu;
    private ArrayList<ingredients> spicyMiso;
    private ArrayList<ingredients> miso;
    private ArrayList<ingredients> spicyShoyu;
    private ArrayList<ingredients> shoyu;

    public Ramen(String name, double price, double calories){
        super(name, price, calories);
        this.spicyTonkatsu = new ArrayList<>();
        this.shoyu = new ArrayList<>();
        this.miso = new ArrayList<>();
        this.tonkatsu = new ArrayList<>();
        this.spicyMiso = new ArrayList<>();
        this.spicyShoyu = new ArrayList<>();
    }

    public ArrayList<ingredients> tonkatsuRamen() {
        ingredients ingredient1 = new ingredients("Tamago", 60, 155);
        ingredients ingredient2 = new ingredients("Noodles", 70, 272);
        ingredients ingredient3 = new ingredients("Pork Chashu", 120, 482);
        ingredients ingredient4 = new ingredients("Green Onion", 50, 3);
        ingredients ingredient5 = new ingredients("Chili Oil", 40, 100);
        ingredients ingredient6 = new ingredients("Tonkatso Broth", 100, 360);
        ingredients ingredient7 = new ingredients("Miso Broth", 80, 60);
        ingredients ingredient8 = new ingredients("Shoyu Broth", 80, 36);

        tonkatsu.add(ingredient1);
        tonkatsu.add(ingredient2);
        tonkatsu.add(ingredient3);
        tonkatsu.add(ingredient6);
        

        return tonkatsu;
    }
    public ArrayList<ingredients> spicyTonkatsuRamen() {
        ingredients ingredient1 = new ingredients("Tamago", 60, 155);
        ingredients ingredient2 = new ingredients("Noodles", 70, 272);
        ingredients ingredient3 = new ingredients("Pork Chashu", 120, 482);
        ingredients ingredient4 = new ingredients("Green Onion", 50, 3);
        ingredients ingredient5 = new ingredients("Chili Oil", 40, 100);
        ingredients ingredient6 = new ingredients("Tonkatso Broth", 100, 360);
        ingredients ingredient7 = new ingredients("Miso Broth", 80, 60);
        ingredients ingredient8 = new ingredients("Shoyu Broth", 80, 36);

        spicyTonkatsu.add(ingredient1);
        spicyTonkatsu.add(ingredient2);
        spicyTonkatsu.add(ingredient3);
        spicyTonkatsu.add(ingredient5);
        spicyTonkatsu.add(ingredient6);

        return spicyTonkatsu;
    }
    public ArrayList<ingredients> misoRamen() {
        ingredients ingredient1 = new ingredients("Tamago", 60, 155);
        ingredients ingredient2 = new ingredients("Noodles", 70, 272);
        ingredients ingredient3 = new ingredients("Pork Chashu", 120, 482);
        ingredients ingredient4 = new ingredients("Green Onion", 50, 3);
        ingredients ingredient5 = new ingredients("Chili Oil", 40, 100);
        ingredients ingredient6 = new ingredients("Tonkatso Broth", 100, 360);
        ingredients ingredient7 = new ingredients("Miso Broth", 80, 60);
        ingredients ingredient8 = new ingredients("Shoyu Broth", 80, 36);

         miso.add(ingredient1);
        miso.add(ingredient2);
        miso.add(ingredient3);
        miso.add(ingredient7);
        return miso;
    }
    public ArrayList<ingredients> spicyMisoRamen() {
        ingredients ingredient1 = new ingredients("Tamago", 60, 155);
        ingredients ingredient2 = new ingredients("Noodles", 70, 272);
        ingredients ingredient3 = new ingredients("Pork Chashu", 120, 482);
        ingredients ingredient4 = new ingredients("Green Onion", 50, 3);
        ingredients ingredient5 = new ingredients("Chili Oil", 40, 100);
        ingredients ingredient6 = new ingredients("Tonkatso Broth", 100, 360);
        ingredients ingredient7 = new ingredients("Miso Broth", 80, 60);
        ingredients ingredient8 = new ingredients("Shoyu Broth", 80, 36);

        spicyMiso.add(ingredient1);
        spicyMiso.add(ingredient2);
        spicyMiso.add(ingredient3);
        spicyMiso.add(ingredient5);
        spicyMiso.add(ingredient7);
        return spicyMiso;
    }
    public ArrayList<ingredients> shoyuRamen() {
        ingredients ingredient1 = new ingredients("Tamago", 60, 155);
        ingredients ingredient2 = new ingredients("Noodles", 70, 272);
        ingredients ingredient3 = new ingredients("Pork Chashu", 120, 482);
        ingredients ingredient4 = new ingredients("Green Onion", 50, 3);
        ingredients ingredient5 = new ingredients("Chili Oil", 40, 100);
        ingredients ingredient6 = new ingredients("Tonkatso Broth", 100, 360);
        ingredients ingredient7 = new ingredients("Miso Broth", 80, 60);
        ingredients ingredient8 = new ingredients("Shoyu Broth", 80, 36);
        
        shoyu.add(ingredient1);
        shoyu.add(ingredient2);
        shoyu.add(ingredient3);
        shoyu.add(ingredient8);
        
        return shoyu;
    }
    public ArrayList<ingredients> spicyShoyuRamen() {
        ingredients ingredient1 = new ingredients("Tamago", 60, 155);
        ingredients ingredient2 = new ingredients("Noodles", 70, 272);
        ingredients ingredient3 = new ingredients("Pork Chashu", 120, 482);
        ingredients ingredient4 = new ingredients("Green Onion", 50, 3);
        ingredients ingredient5 = new ingredients("Chili Oil", 40, 100);
        ingredients ingredient6 = new ingredients("Tonkatso Broth", 100, 360);
        ingredients ingredient7 = new ingredients("Miso Broth", 80, 60);
        ingredients ingredient8 = new ingredients("Shoyu Broth", 80, 36);
        
        spicyShoyu.add(ingredient1);
        spicyShoyu.add(ingredient2);
        spicyShoyu.add(ingredient3);
        spicyShoyu.add(ingredient5);
        spicyShoyu.add(ingredient8);

        return spicyShoyu;
    }
}
