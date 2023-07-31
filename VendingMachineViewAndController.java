import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VendingMachineViewAndController{
    private JFrame frame;
    private JFrame frame2;
    private JLabel title;
    private JLabel ingredients;
    private JLabel amount;
    private JLabel machineBalance;
    private JLabel numMachineBal;
    private JLabel balance;
    private JLabel numBal;
    private JLabel priceTamago;
    private JLabel calTamago;
    private JLabel pricenoodles;
    private JLabel calnoodles;
    private JLabel pricePork;
    private JLabel calPork;
    private JLabel priceOnion;
    private JLabel calOnion;
    private JLabel priceTonkatsu;
    private JLabel calTonkatsu;
    private JLabel priceMiso;
    private JLabel calMiso;
    private JLabel priceShoyu;
    private JLabel calShoyu;
    private JLabel priceChili;
    private JLabel calChili;
    private JButton ten;
    private JButton fifty;
    private JButton hundred;
    private JButton fiveHundred;
    private JButton tamago;
    private JButton noodles;
    private JButton pork;
    private JButton onion;
    private JButton chili;
    private JButton tonkatsu;
    private JButton miso;
    private JButton shoyu;
    private JTextArea area;
    private JButton buy;
    private JButton getChange;
    private JButton clear;
    private JButton maintenance;
    private JComboBox ingredient;
    private VendingMachine vM;
    private JLabel infoIngredient;
    private ArrayList<ingredients> orderList;
    private JTextField setPrice;
    private JTextField setStock;
    private JTextField replenishBal;
    private JLabel stock;
    private JLabel maintenanceLabel;
    private JButton getBal;
    private JLabel repBal;
    private JLabel balTake;
    private JButton priceGo;
    private JButton stockGo;
    private JButton balGo;

    public VendingMachineViewAndController(VendingMachine vM){
        Border border = BorderFactory.createLineBorder(Color.black,2);
        
        this.orderList = new ArrayList<>();
        this.vM = vM;
        this.frame = new JFrame("Ramen Dispenser");
        this.frame.setSize(500, 800);
        this.frame.setLayout(null);
        this.frame.setVisible(true);

        this.title = new JLabel("RAMEN DISPENSER");
        this.title.setHorizontalAlignment(JLabel.CENTER);
        this.title.setVerticalAlignment(JLabel.TOP);
        this.title.setForeground(Color.BLACK);
        this.title.setFont(new Font("Bebas", Font.BOLD, 25));
        this.title.setBounds(125, 0, 250,50);
        this.frame.add(title);

        this.amount = new JLabel("Amount:");
        this.amount.setHorizontalAlignment(JLabel.LEFT);
        this.amount.setBounds(50, 50, 250,50);
        this.frame.add(amount);

        this.ten = new JButton("10");
        this.ten.setHorizontalAlignment(JLabel.LEFT);
        this.ten.setBounds(150, 50, 60,50);
        this.frame.add(ten);
        this.ten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenActionPerformed(evt);
            }
        });

        this.fifty = new JButton("50");
        this.fifty.setHorizontalAlignment(JLabel.LEFT);
        this.fifty.setBounds(220, 50, 60,50);
        this.frame.add(fifty);
        this.fifty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiftyActionPerformed(evt);
            }
        });

        this.hundred = new JButton("100");
        this.hundred.setHorizontalAlignment(JLabel.LEFT);
        this.hundred.setBounds(290, 50, 60,50);
        this.frame.add(hundred);
        this.hundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hundredActionPerformed(evt);
            }
        });

        this.fiveHundred = new JButton("500");
        this.fiveHundred.setHorizontalAlignment(JLabel.LEFT);
        this.fiveHundred.setBounds(360, 50, 60,50);
        this.frame.add(fiveHundred);
        this.fiveHundred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveHundredActionPerformed(evt);
            }
        });

        this.machineBalance = new JLabel("Machine Balance: ");
        this.machineBalance.setHorizontalAlignment(JLabel.LEFT);
        this.machineBalance.setBounds(50, 100, 250,50);
        this.frame.add(machineBalance);

        String balancez = new Double(vM.getBalance()).toString();
        this.numMachineBal = new JLabel(balancez);
        this.numMachineBal.setHorizontalAlignment(JLabel.LEFT);
        this.numMachineBal.setBounds(175, 100, 250,50);
        this.frame.add(numMachineBal);

        this.balance = new JLabel("Balance: ");
        this.balance.setHorizontalAlignment(JLabel.LEFT);
        this.balance.setBounds(250, 100, 250,50);
        this.frame.add(balance);

        this.numBal = new JLabel("0");
        this.numBal.setHorizontalAlignment(JLabel.LEFT);
        this.numBal.setBounds(325, 100, 250,50);
        this.frame.add(numBal);

        this.ingredients = new JLabel("INGREDIENTS");
        this.ingredients.setFont(new Font("Bebas", Font.BOLD, 15));
        this.ingredients.setBounds(175, 135, 150,50);
        this.frame.add(ingredients);

        this.tamago = new JButton("Tamago");
        this.tamago.setHorizontalAlignment(JLabel.LEFT);
        this.tamago.setBounds(10, 185, 100,35);
        this.frame.add(tamago);
        this.tamago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamagoActionPerformed(evt);
            }
        });

        this.noodles = new JButton("Noodles");
        this.noodles.setHorizontalAlignment(JLabel.LEFT);
        this.noodles.setBounds(120, 185, 100,35);
        this.frame.add(noodles);
        this.noodles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noodlesActionPerformed(evt);
            }
        });

        this.pork = new JButton("Pork Chasu");
        this.pork.setHorizontalAlignment(JLabel.LEFT);
        this.pork.setBounds(230, 185, 100,35);
        this.frame.add(pork);
        this.pork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porkActionPerformed(evt);
            }
        });

        this.onion = new JButton("Green Onion");
        this.onion.setHorizontalAlignment(JLabel.LEFT);
        this.onion.setBounds(340, 185, 100,35);
        this.frame.add(onion);
        this.onion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onionActionPerformed(evt);
            }
        });

        this.priceTamago = new JLabel("PHP 60");
        this.priceTamago.setBounds(20, 225, 100,35);
        this.frame.add(priceTamago);

        this.calTamago = new JLabel("155 CAL");
        this.calTamago.setBounds(20, 250, 100,35);
        this.frame.add(calTamago);

        this.pricenoodles = new JLabel("PHP 70");
        this.pricenoodles.setBounds(130, 225, 100,35);
        this.frame.add(pricenoodles);

        this.calnoodles = new JLabel("272 CAL");
        this.calnoodles.setBounds(130, 250, 100,35);
        this.frame.add(calnoodles);

        this.pricePork = new JLabel("PHP 120");
        this.pricePork.setBounds(240, 225, 100,35);
        this.frame.add(pricePork);

        this.calPork = new JLabel("482 CAL");
        this.calPork.setBounds(240, 250, 100,35);
        this.frame.add(calPork);

        this.priceOnion = new JLabel("PHP 50");
        this.priceOnion.setBounds(350, 225, 100,35);
        this.frame.add(priceOnion);

        this.calOnion = new JLabel("3 CAL");
        this.calOnion.setBounds(350, 250, 100,35);
        this.frame.add(calOnion);

        this.chili = new JButton("Chili Oil");
        this.chili.setHorizontalAlignment(JLabel.LEFT);
        this.chili.setBounds(10, 300, 100,35);
        this.frame.add(chili);
        this.chili.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chiliActionPerformed(evt);
            }
        });

        this.tonkatsu = new JButton("Tonkatsu Broth");
        this.tonkatsu.setHorizontalAlignment(JLabel.LEFT);
        this.tonkatsu.setBounds(120, 300, 100,35);
        this.frame.add(tonkatsu);
        this.tonkatsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tonkatsuActionPerformed(evt);
            }
        });

        this.miso = new JButton("Miso Broth");
        this.miso.setHorizontalAlignment(JLabel.LEFT);
        this.miso.setBounds(230, 300, 100,35);
        this.frame.add(miso);
        this.miso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                misoActionPerformed(evt);
            }
        });

        this.shoyu = new JButton("Shoyu Broth");
        this.shoyu.setHorizontalAlignment(JLabel.LEFT);
        this.shoyu.setBounds(340, 300, 100,35);
        this.frame.add(shoyu);
        this.shoyu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shoyuActionPerformed(evt);
            }
        });

        this.priceChili= new JLabel("PHP 40");
        this.priceChili.setBounds(20, 340, 100,35);
        this.frame.add(priceChili);

        this.calChili = new JLabel("100 CAL");
        this.calChili.setBounds(20, 365, 100,35);
        this.frame.add(calChili);

        this.priceTonkatsu= new JLabel("PHP 100");
        this.priceTonkatsu.setBounds(130, 340, 100,35);
        this.frame.add(priceTonkatsu);

        this.calTonkatsu = new JLabel("360 CAL");
        this.calTonkatsu.setBounds(130, 365, 100,35);
        this.frame.add(calTonkatsu);

        this.priceMiso = new JLabel("PHP 80");
        this.priceMiso.setBounds(240, 340, 100,35);
        this.frame.add(priceMiso);

        this.calMiso = new JLabel("60 CAL");
        this.calMiso.setBounds(240, 365, 100,35);
        this.frame.add(calMiso);

        this.priceShoyu = new JLabel("PHP 80");
        this.priceShoyu.setBounds(350, 340, 100,35);
        this.frame.add(priceShoyu);

        this.calShoyu = new JLabel("36 CAL");
        this.calShoyu.setBounds(350, 365, 100,35);
        this.frame.add(calShoyu);

        this.area = new JTextArea();
        this.area.setBounds(10, 425, 300, 300);
        this.area.setBorder(border);
        this.frame.add(area);

        this.buy = new JButton("Buy&Cook");
        this.buy.setBounds(340, 425, 100, 50);
        this.frame.add(buy);

        this.buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });

        this.getChange = new JButton("Get Change");
        this.getChange.setBounds(340, 500, 100, 50);
        this.frame.add(getChange);

        this.getChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getChangeActionPerformed(evt);
            }
        });

        this.clear = new JButton("Clear");
        this.clear.setBounds(340, 575, 100, 50);
        this.frame.add(clear);

        this.clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        this.maintenance = new JButton("Maintenance");
        this.maintenance.setBounds(340, 650, 100, 50);
        this.frame.add(maintenance);

        this.maintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceActionPerformed(evt);
            }
        });

        this.frame2 = new JFrame("Maintenance");
        this.frame2.setSize(500, 500);
        this.frame2.setLayout(null);  

        this.maintenanceLabel = new JLabel("MAINTENANCE");
        this.maintenanceLabel.setHorizontalAlignment(JLabel.CENTER);
        this.maintenanceLabel.setVerticalAlignment(JLabel.TOP);
        this.maintenanceLabel.setForeground(Color.BLACK);
        this.maintenanceLabel.setFont(new Font("Bebas", Font.BOLD, 25));
        this.maintenanceLabel.setBounds(125, 10, 250,50);
        this.frame2.add(maintenanceLabel);

        this.ingredient = new JComboBox(vM.getArr());
        this.ingredient.setBounds(20, 65, 140, 25);
        this.frame2.add(ingredient);
        this.ingredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingredientActionPerformed(evt);
            }
        });

        //price
        this.infoIngredient = new JLabel("Price: ");
        this.infoIngredient.setBounds(50, 110, 120, 25);
        this.frame2.add(infoIngredient);

        this.setPrice = new JTextField();
        this.setPrice.setBounds(200, 110, 140, 25);
        this.frame2.add(setPrice);

        this.priceGo = new JButton();
        this.priceGo.setBounds(345, 110, 30, 24);
        this.frame2.add(priceGo);
        this.priceGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceGoActionPerformed(evt);
            }
        });

        //stock
        this.stock = new JLabel("Stock: ");
        this.stock.setBounds(50, 150, 120, 25);
        this.frame2.add(stock);

        this.setStock = new JTextField();
        this.setStock.setBounds(200, 150, 140, 25);
        this.frame2.add(setStock);

        this.stockGo = new JButton();
        this.stockGo.setBounds(345, 150, 30, 24);
        this.frame2.add(stockGo);
        this.stockGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockGoActionPerformed(evt);
            }
        });

        //collect balance
        this.getBal = new JButton("Collect Balance");
        this.getBal.setHorizontalAlignment(JLabel.LEFT);
        this.getBal.setBounds(20, 195, 140,25);
        this.frame2.add(getBal);
        this.getBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getBalActionPerformed(evt);
            }
        });

        this.balTake = new JLabel("");
        this.balTake.setBounds(240, 195, 150, 25);
        this.frame2.add(balTake);

        //replenish bal
        this.repBal = new JLabel("Replenish Balance: ");
        this.repBal.setBounds(50, 245, 120, 25);
        this.frame2.add(repBal);

        this.replenishBal = new JTextField();
        this.replenishBal.setBounds(200, 245, 140, 25);
        this.frame2.add(replenishBal);

        this.balGo = new JButton();
        this.balGo.setBounds(345, 245, 30, 24);
        this.frame2.add(balGo);
        this.balGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balGoActionPerformed(evt);
            }
        });

    }

    public void tenActionPerformed(java.awt.event.ActionEvent evt) {   
        if(area.equals("")){                         
            if(this.numBal.equals("0")){
                this.numBal.setText("10");
            }
            else{
                String val = this.numBal.getText();
                String macBal = this.numMachineBal.getText();
                double newBal = Double.valueOf(macBal);
                double value = Double.valueOf(val);
                value += 10;
                newBal += 10;
                val = new Double(value).toString();
                macBal = new Double(newBal).toString();
                this.numBal.setText(val);
                this.numMachineBal.setText(macBal);
            }
            area.setText("Added PHP 10 to Balance");
        }
        else{
            if(this.numBal.equals("0")){
                this.numBal.setText("10");
            }
            else{
                String val = this.numBal.getText();
                String macBal = this.numMachineBal.getText();
                double newBal = Double.valueOf(macBal);
                double value = Double.valueOf(val);
                value += 10;
                newBal += 10;
                val = new Double(value).toString();
                macBal = new Double(newBal).toString();
                this.numBal.setText(val);
                this.numMachineBal.setText(macBal);
            }
            area.append("\nAdded PHP 10 to Balance");
        }
    }   
    
    public void fiftyActionPerformed(java.awt.event.ActionEvent evt) {    
        if(area.equals("")){                                       
            if(this.numBal.equals("0")){
                this.numBal.setText("50");
            }
            else{
                String val = this.numBal.getText();
                String macBal = this.numMachineBal.getText();
                double newBal = Double.valueOf(macBal);
                double value = Double.valueOf(val);
                value += 50;
                newBal += 50;
                val = new Double(value).toString();
                macBal = new Double(newBal).toString();
                this.numMachineBal.setText(macBal);
                this.numBal.setText(val);
            }
            area.setText("Added PHP 50 to Balance");
        }
        else{                                       
            if(this.numBal.equals("0")){
                this.numBal.setText("50");
            }
            else{
                String val = this.numBal.getText();
                String macBal = this.numMachineBal.getText();
                double newBal = Double.valueOf(macBal);
                double value = Double.valueOf(val);
                value += 50;
                newBal += 50;
                val = new Double(value).toString();
                macBal = new Double(newBal).toString();
                this.numMachineBal.setText(macBal);
                this.numBal.setText(val);
            }
            area.append("\nAdded PHP 50 to Balance");
        }
    }           
    
    public void hundredActionPerformed(java.awt.event.ActionEvent evt) {       
        if(area.equals("")){                      
            if(this.numBal.equals("0")){
                this.numBal.setText("100");
            }
            else{
                String val = this.numBal.getText();
                String macBal = this.numMachineBal.getText();
                double newBal = Double.valueOf(macBal);
                double value = Double.valueOf(val);
                value += 100;
                newBal += 100;
                macBal = new Double(newBal).toString();
                this.numMachineBal.setText(macBal);
                val = new Double(value).toString();
                this.numBal.setText(val);
            }
            area.setText("Added PHP 100 to Balance");
        }
        else{
            if(this.numBal.equals("0")){
                this.numBal.setText("100");
            }
            else{
                String val = this.numBal.getText();
                String macBal = this.numMachineBal.getText();
                double newBal = Double.valueOf(macBal);
                double value = Double.valueOf(val);
                value += 100;
                newBal += 100;
                macBal = new Double(newBal).toString();
                this.numMachineBal.setText(macBal);
                val = new Double(value).toString();
                this.numBal.setText(val);
            }
            area.append("\nAdded PHP 100 to Balance");
        }
    }           
    
    public void fiveHundredActionPerformed(java.awt.event.ActionEvent evt) {     
        if(area.equals("")){                             
            if(this.numBal.equals("0")){
                this.numBal.setText("500");
            }
            else{
                String val = this.numBal.getText();
                String macBal = this.numMachineBal.getText();
                double newBal = Double.valueOf(macBal);
                double value = Double.valueOf(val);
                value += 500;
                newBal += 500;
                macBal = new Double(newBal).toString();
                this.numMachineBal.setText(macBal);
                val = new Double(value).toString();
                this.numBal.setText(val);
            }
            area.setText("Added PHP 500 to Balance");
        }    
        else{                             
            if(this.numBal.equals("0")){
                this.numBal.setText("500");
            }
            else{
                String val = this.numBal.getText();
                String macBal = this.numMachineBal.getText();
                double newBal = Double.valueOf(macBal);
                double value = Double.valueOf(val);
                value += 500;
                newBal += 500;
                macBal = new Double(newBal).toString();
                this.numMachineBal.setText(macBal);
                val = new Double(value).toString();
                this.numBal.setText(val);
            }
            area.append("\nAdded PHP 500 to Balance");
        }            
    }   
    
    public void tamagoActionPerformed(java.awt.event.ActionEvent evt) {       
        String val = this.numBal.getText();
        double value = Double.valueOf(val);
        double[] amount = vM.getPriceArr();
        String Price = new Double(amount[0]).toString();
        ingredients tamago = new ingredients("Tamago", 60, 155);
       if(value >= 60){           
        if(area.equals("")){
            area.setText("TAMAGO ADDED! FOR PHP"+Price);
        }
        else{
            area.append("\nTAMAGO ADDED! FOR PHP"+Price);
        }
        orderList.add(tamago); //store in an array
       }
       else{
        area.setText("Insufficient funds");
       }
    }

    public void noodlesActionPerformed(java.awt.event.ActionEvent evt) {       
        String val = this.numBal.getText();
        double value = Double.valueOf(val);
        double[] amount = vM.getPriceArr();
        String Price = new Double(amount[1]).toString();
        ingredients noodles = new ingredients("Noodles", 70, 272);
       if(value >= 70){           
        if(area.equals("")){
            area.setText("NOODLES ADDED! FOR PHP"+Price);
        }
        else{
            area.append("\nNOODLES ADDED! FOR PHP"+Price);
        }
        orderList.add(noodles); //store in an array
       }
       else{
        area.setText("Insufficient funds");
       }
    }

    public void porkActionPerformed(java.awt.event.ActionEvent evt) {       
        String val = this.numBal.getText();
        double value = Double.valueOf(val);
        double[] amount = vM.getPriceArr();
        String Price = new Double(amount[2]).toString();
        ingredients pork = new ingredients("Pork Chashu", 120, 482);
       if(value >= 120){           
        if(area.equals("")){
            area.setText("PORK ADDED! FOR PHP"+Price);
        }
        else{
            area.append("\nPORK ADDED! FOR PHP"+Price);
        }
        orderList.add(pork); //store in an array
       }
       else{
        area.setText("Insufficient funds");
       }
    }

    public void onionActionPerformed(java.awt.event.ActionEvent evt) {       
        String val = this.numBal.getText();
        double value = Double.valueOf(val);
        double[] amount = vM.getPriceArr();
        String Price = new Double(amount[3]).toString();
        ingredients onion = new ingredients("Green Onion", 50, 3);
       if(value >= 50){           
        if(area.equals("")){
            area.setText("ONION ADDED! FOR PHP"+Price);
        }
        else{
            area.append("\nONION ADDED! FOR PHP"+Price);
        }
        orderList.add(onion); //store in an array
       }
       else{
        area.setText("Insufficient funds");
       }
    }

    public void chiliActionPerformed(java.awt.event.ActionEvent evt) {       
        String val = this.numBal.getText();
        double value = Double.valueOf(val);
        double[] amount = vM.getPriceArr();
        String Price = new Double(amount[4]).toString();
        ingredients chili = new ingredients("Chili Oil", 40, 100);
       if(value >= 40){           
        if(area.equals("")){
            area.setText("CHILI ADDED! FOR PHP"+Price);
        }
        else{
            area.append("\nCHILI ADDED! FOR PHP"+Price);
        }
        orderList.add(chili); //store in an array
       }
       else{
        area.setText("Insufficient funds");
       }
    }

    public void tonkatsuActionPerformed(java.awt.event.ActionEvent evt) {       
        String val = this.numBal.getText();
        double value = Double.valueOf(val);
        double[] amount = vM.getPriceArr();
        String Price = new Double(amount[5]).toString();
        ingredients tonkatsu = new ingredients("Tonkatso Broth", 100, 360);

       if(value >= 100){           
        if(area.equals("")){
            area.setText("TONKATSU ADDED! FOR PHP"+Price);
        }
        else{
            area.append("\nTONKATSU ADDED! FOR PHP"+Price);
        }
        orderList.add(tonkatsu); //store in an array
       }
       else{
        area.setText("Insufficient funds");
       }
    }

    public void misoActionPerformed(java.awt.event.ActionEvent evt) {   

        String val = this.numBal.getText();
        double value = Double.valueOf(val);
        double[] amount = vM.getPriceArr();
        String Price = new Double(amount[6]).toString();
        ingredients miso= new ingredients("Miso Broth", 80, 60);
       if(value >= 80){           
        if(area.equals("")){
            area.setText("MISO ADDED! FOR PHP"+Price);
        }
        else{
            area.append("\nMISO ADDED! FOR PHP"+Price);
        }
        orderList.add(miso); //store in an array
       }
       else{
        area.setText("Insufficient funds");
       }
    }

    public void shoyuActionPerformed(java.awt.event.ActionEvent evt) {       
        String val = this.numBal.getText();
        double value = Double.valueOf(val);
        double[] amount = vM.getPriceArr();
        String Price = new Double(amount[7]).toString();
        ingredients shoyu = new ingredients("Shoyu Broth", 80, 36);
       if(value >= 80){           
        if(area.equals("")){
            area.setText("SHOYU ADDED! FOR PHP"+Price);
        }
        else{
            area.append("\nSHOYU ADDED! FOR PHP"+Price);
        }
        orderList.add(shoyu); //store in an array
       }
       else{
        area.setText("Insufficient funds");
       }
    }

    public void maintenanceActionPerformed(java.awt.event.ActionEvent evt) {   
        this.frame2.setVisible(true);  
    }  

    public void sort(String[] Arr){
        
        int size = Arr.length;

        for(int i = 0; i<size-1; i++){
            for(int j = i+1; j<size; j++){
                if((Arr[i].compareTo(Arr[j])>0)){
                    String temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }
        }
    }

    public void buyActionPerformed(java.awt.event.ActionEvent evt) {   
        int i = 0;
        int orderListCount = 0;
        String val = this.numBal.getText();
        double currMoney = Double.valueOf(val);
        double[] amount = new double[8];
        double sum = 0;
        Ramen ramen1 = new Ramen("", 0, 0);
        ArrayList<ingredients> spicyShoyu = ramen1.spicyShoyuRamen();
        ArrayList<ingredients> Shoyu = ramen1.shoyuRamen();
        ArrayList<ingredients> spicyTonkatsu = ramen1.spicyTonkatsuRamen();
        ArrayList<ingredients> Tonkatsu = ramen1.tonkatsuRamen();
        ArrayList<ingredients> spicyMiso = ramen1.spicyMisoRamen();
        ArrayList<ingredients> Miso = ramen1.misoRamen();
        ingredients raz;
        ingredients ramnz;
        String[] ramz = new String[5];
        String[] ramens = new String[5];
        String[] ramend = new String[5];
        String[] ramene = new String[5];
        String[] ramzx = new String[4];
        String[] ramena = new String[4];
        String[] ramenb = new String[4];
        String[] ramenc = new String[4];
        double calories = 0;

        //get total calory count
        for(i=0; i<orderList.size(); i++){
            ingredients ingredient = orderList.get(i);
            calories += ingredient.getCalories();
        }


        for(i=0; i<orderList.size(); i++){
            ingredients ramen = orderList.get(i);
            amount[i] = ramen.getPrice();
        }

        
        //get total price of orders
        for(i=0; i<orderList.size(); i++){
            sum += amount[i];
        }

        for(i=0; i<orderList.size(); i++){
            orderListCount += 1;
        }

        if(sum <= currMoney && sum != 0.0){  
            for(i=0; i<orderList.size(); i++){
                currMoney -= amount[i];
            }

            val = new Double(currMoney).toString();
            this.numBal.setText(val);
            String asum = new Double(sum).toString();

            area.setText("======================================"+ "\n"+"                                   Processing... "+ "\n"+"======================================"+ "\n");

            for(i=0; i<5; i++){
                ingredients spShoyu = spicyShoyu.get(i);
                ingredients spTonkatsu = spicyTonkatsu.get(i);
                ingredients spMiso = spicyMiso.get(i);
            
                ramens[i] = spShoyu.getName();
                ramend[i] = spTonkatsu.getName();
                ramene[i] = spMiso.getName();
            }

            for(i=0; i<4; i++){
                ingredients shoyuR = Shoyu.get(i);
                ingredients tonkatsuR = Tonkatsu.get(i);
                ingredients misoR = Miso.get(i);

                ramena[i] = shoyuR.getName();
                ramenb[i] = tonkatsuR.getName();
                ramenc[i] = misoR.getName();
            }

            if(orderListCount == 4){
                for(i=0; i<4; i++){
                    raz = orderList.get(i);
                    ramzx[i] = raz.getName();
                }
                sort(ramzx);
                sort(ramena);
                sort(ramenb);
                sort(ramenc);
            }
            
            else if(orderListCount == 5){
                for(i=0; i<5; i++){
                    ramnz = orderList.get(i);
                    ramz[i] = ramnz.getName(); 
                }
                sort(ramens);
                sort(ramend);
                sort(ramene);
                sort(ramz);
            }
               
                
            if(orderList.size() == 4){
                if(ramzx[0].equals(ramena[0]) && ramzx[1].equals(ramena[1]) && ramzx[2].equals(ramena[2]) && ramzx[3].equals(ramena[3])){
                        area.append("slicing tamago..\n");
                        area.append("boiling noodles..\n");
                        area.append("heating broth..\n");
                        area.append("frying pork..\n");
                        area.append("placing tamago to cup..\n");
                        area.append("placing noodles to cup..\n");
                        area.append("pouring broth to cup..\n");
                        area.append("adding pork to cup..\n");
                        area.append("adding chili..\n");
                        area.append("Shoyu Ramen is served\n");
                        area.append("TOTAL: PHP " + asum);
                        area.append("\nCalories: " + calories);
                        area.append("\n======================================"+ "\n"+"                                   Purchased! "+ "\n"+"======================================"+ "\n");
                    }
                
                else if(ramzx[0].equals(ramenb[0]) && ramzx[1].equals(ramenb[1]) && ramzx[2].equals(ramenb[2]) && ramzx[3].equals(ramenb[3])){
                        area.append("slicing tamago..\n");
                        area.append("boiling noodles..\n");
                        area.append("heating broth..\n");
                        area.append("frying pork..\n");
                        area.append("placing tamago to cup..\n");
                        area.append("placing noodles to cup..\n");
                        area.append("pouring broth to cup..\n");
                        area.append("adding pork to cup..\n");
                        area.append("Tonkatsu Ramen is served\n");
                        area.append("TOTAL: PHP " + asum);
                        area.append("\nCalories: " + calories);
                        area.append("\n======================================"+ "\n"+"                                   Purchased! "+ "\n"+"======================================"+ "\n");
                    }
                
                else if(ramzx[0].equals(ramenc[0]) && ramzx[1].equals(ramenc[1]) && ramzx[2].equals(ramenc[2]) && ramzx[3].equals(ramenc[3])){
                        area.append("slicing tamago..\n");
                        area.append("boiling noodles..\n");
                        area.append("heating broth..\n");
                        area.append("frying pork..\n");
                        area.append("placing tamago to cup..\n");
                        area.append("placing noodles to cup..\n");
                        area.append("pouring broth to cup..\n");
                        area.append("adding pork to cup..\n");
                        area.append("Miso Ramen is served\n");
                        area.append("TOTAL: PHP " + asum);
                        area.append("\nCalories: " + calories);
                        area.append("\n======================================"+ "\n"+"                                   Purchased! "+ "\n"+"======================================"+ "\n");
                    }
                
            else{
                area.append("Incorrect Ingredients");
            }
        } 
        else if(orderList.size()==5){
            if(ramz[0].equals(ramens[0]) && ramz[1].equals(ramens[1]) && ramz[2].equals(ramens[2]) && ramz[3].equals(ramens[3]) && ramz[4].equals(ramens[4])){
                        area.append("slicing tamago..\n");
                        area.append("boiling noodles..\n");
                        area.append("heating broth..\n");
                        area.append("frying pork..\n");
                        area.append("placing tamago to cup..\n");
                        area.append("placing noodles to cup..\n");
                        area.append("pouring broth to cup..\n");
                        area.append("adding pork to cup..\n");
                        area.append("adding chili..\n");
                        area.append("Spicy Shoyu Ramen is served\n");
                        area.append("TOTAL: PHP " + asum);
                        area.append("\nCalories: " + calories);
                        area.append("\n======================================"+ "\n"+"                                   Purchased! "+ "\n"+"======================================"+ "\n");
                    }
                
                else if(ramz[0].equals(ramend[0]) && ramz[1].equals(ramend[1]) && ramz[2].equals(ramend[2]) && ramz[3].equals(ramend[3]) && ramz[4].equals(ramend[4])){
                        area.append("slicing tamago..\n");
                        area.append("boiling noodles..\n");
                        area.append("heating broth..\n");
                        area.append("frying pork..\n");
                        area.append("placing tamago to cup..\n");
                        area.append("placing noodles to cup..\n");
                        area.append("pouring broth to cup..\n");
                        area.append("adding pork to cup..\n");
                        area.append("adding chili..\n");
                        area.append("Spicy Tonkatsu Ramen is served\n");
                        area.append("TOTAL: PHP " + asum);
                        area.append("\nCalories: " + calories);
                        area.append("\n======================================"+ "\n"+"                                   Purchased! "+ "\n"+"======================================"+ "\n");
                    }
                    
                else if(ramz[0].equals(ramene[0]) && ramz[1].equals(ramene[1]) && ramz[2].equals(ramene[2]) && ramz[3].equals(ramene[3]) && ramz[4].equals(ramene[4])){
                        area.append("slicing tamago..\n");
                        area.append("boiling noodles..\n");
                        area.append("heating broth..\n");
                        area.append("frying pork..\n");
                        area.append("placing tamago to cup..\n");
                        area.append("placing noodles to cup..\n");
                        area.append("pouring broth to cup..\n");
                        area.append("adding pork to cup..\n");
                        area.append("adding chili..\n");
                        area.append("Spicy Miso Ramen is served\n");
                        area.append("TOTAL: PHP " + asum);
                        area.append("\nCalories: " + calories);
                        area.append("\n======================================"+ "\n"+"                                   Purchased! "+ "\n"+"======================================"+ "\n");
                    }
            else{
                area.append("Incorrect Ingredients");
            }
        }
        else{
            for(i=0; i<orderList.size(); i++){
                String[] product = new String[8];
                ingredients item = orderList.get(i);
                product[i] = item.getName();
                amount[i] = item.getPrice();
                area.append("\n" + product[i] + " PHP " + amount[i]);
                area.append("\n======================================"+ "\n"+"                                   Purchased! "+ "\n"+"======================================"+ "\n");
            }
            area.append("\nCalories: " + calories);
        }


            for(i=0; i<orderList.size(); i++){
               orderList.remove(i);
               i--;
            }
            
            

        }
        else if(orderListCount == 0){
            area.setText("Empty cart!");
        }
        else{
            area.setText("Insufficient funds!");

            for(i=0; i<orderList.size(); i++){
               orderList.remove(i);
               i--;
            }
            
        }    
        
    }  

    public void ingredientActionPerformed(java.awt.event.ActionEvent evt) {   

        if(this.ingredient.getSelectedIndex() == 0){
            double[] amount = vM.getPriceArr();
            String Price = new Double(amount[0]).toString();
            this.infoIngredient.setText("Price: PHP " + Price);

            int[] stocker = vM.getQuantityArr();
            String stockss = new Integer(stocker[0]).toString();
            this.stock.setText("Stock: "+stockss);
        }

        if(this.ingredient.getSelectedIndex() == 1){
            double[] amount = vM.getPriceArr();
            String Price = new Double(amount[1]).toString();
            this.infoIngredient.setText("Price: PHP " + Price);

            int[] stocker = vM.getQuantityArr();
            String stockss = new Integer(stocker[1]).toString();
            this.stock.setText("Stock: "+stockss);
        }

        if(this.ingredient.getSelectedIndex() == 2){
            double[] amount = vM.getPriceArr();
            String Price = new Double(amount[0]).toString();
            this.infoIngredient.setText("Price: PHP " + Price);

            int[] stocker = vM.getQuantityArr();
            String stockss = new Integer(stocker[2]).toString();
            this.stock.setText("Stock: "+stockss);
        }

        if(this.ingredient.getSelectedIndex() == 3){
            double[] amount = vM.getPriceArr();
            String Price = new Double(amount[3]).toString();
            this.infoIngredient.setText("Price: PHP " + Price);

            int[] stocker = vM.getQuantityArr();
            String stockss = new Integer(stocker[3]).toString();
            this.stock.setText("Stock: "+stockss);
        }

        if(this.ingredient.getSelectedIndex() == 4){
            double[] amount = vM.getPriceArr();
            String Price = new Double(amount[4]).toString();
            this.infoIngredient.setText("Price: PHP " + Price);

            int[] stocker = vM.getQuantityArr();
            String stockss = new Integer(stocker[4]).toString();
            this.stock.setText("Stock: "+stockss);
        }
            
        if(this.ingredient.getSelectedIndex() == 5){
            double[] amount = vM.getPriceArr();
            String Price = new Double(amount[5]).toString();
            this.infoIngredient.setText("Price: PHP " + Price);

            int[] stocker = vM.getQuantityArr();
            String stockss = new Integer(stocker[5]).toString();
            this.stock.setText("Stock: "+stockss);
        }

        if(this.ingredient.getSelectedIndex() == 6){
            double[] amount = vM.getPriceArr();
            String Price = new Double(amount[6]).toString();
            this.infoIngredient.setText("Price: PHP " + Price);

            int[] stocker = vM.getQuantityArr();
            String stockss = new Integer(stocker[6]).toString();
            this.stock.setText("Stock: "+stockss);
        }

        if(this.ingredient.getSelectedIndex() == 7){
            double[] amount = vM.getPriceArr();
            String Price = new Double(amount[7]).toString();
            this.infoIngredient.setText("Price: PHP " + Price);

            int[] stocker = vM.getQuantityArr();
            String stockss = new Integer(stocker[7]).toString();
            this.stock.setText("Stock: "+ stockss);
        }
    } 

    public void getBalActionPerformed(java.awt.event.ActionEvent evt){
        String bal = numMachineBal.getText();
        this.balTake.setText("PHP "+ bal+ " Collected");
        this.numMachineBal.setText("0");

        vM.setBalance(0);
    }

    public void priceGoActionPerformed(java.awt.event.ActionEvent evt){
        String price = setPrice.getText();
        double dprice = Double.parseDouble(price);
        
        ArrayList<ingredients> ingredientList = vM.getIngredientList();
        
        if(this.ingredient.getSelectedIndex() == 0){
            ingredients ingredient = ingredientList.get(0);
            ingredient.setPrice(dprice);
            this.priceTamago.setText("PHP " + price);
            this.infoIngredient.setText("Price: PHP " + price);
        }
        if(this.ingredient.getSelectedIndex() == 1){
            ingredients ingredient = ingredientList.get(0);
            ingredient.setPrice(dprice);
            this.pricenoodles.setText("PHP " + price);
            this.infoIngredient.setText("Price: PHP " + price);
        }
        if(this.ingredient.getSelectedIndex() == 2){
            ingredients ingredient = ingredientList.get(0);
            ingredient.setPrice(dprice);
            this.pricePork.setText("PHP " + price);
            this.infoIngredient.setText("Price: PHP " + price);
        }
        if(this.ingredient.getSelectedIndex() == 3){
            ingredients ingredient = ingredientList.get(0);
            ingredient.setPrice(dprice);
            this.priceOnion.setText("PHP " + price);
            this.infoIngredient.setText("Price: PHP " + price);
        }
        if(this.ingredient.getSelectedIndex() == 4){
            ingredients ingredient = ingredientList.get(0);
            ingredient.setPrice(dprice);
            this.priceChili.setText("PHP " + price);
            this.infoIngredient.setText("Price: PHP " + price);
        }
        if(this.ingredient.getSelectedIndex() == 5){
            ingredients ingredient = ingredientList.get(0);
            ingredient.setPrice(dprice);
            this.priceTonkatsu.setText("PHP " + price);
            this.infoIngredient.setText("Price: PHP " + price);
        }
        if(this.ingredient.getSelectedIndex() == 6){
            ingredients ingredient = ingredientList.get(0);
            ingredient.setPrice(dprice);
            this.priceMiso.setText("PHP " + price);
            this.infoIngredient.setText("Price: PHP " + price);
        }
        if(this.ingredient.getSelectedIndex() == 7){
            ingredients ingredient = ingredientList.get(0);
            ingredient.setPrice(dprice);
            this.priceShoyu.setText("PHP " + price);
            this.infoIngredient.setText("Price: PHP " + price);
        }
    }

    public void stockGoActionPerformed(java.awt.event.ActionEvent evt){
        String stock = setStock.getText();
        int istock = Integer.parseInt(stock);

        ArrayList<Slot> slotList = vM.getSlotList();

        if(this.ingredient.getSelectedIndex() == 0){
            Slot slot = slotList.get(0);
            slot.setQuantity(istock);
            this.stock.setText("Stock: " + stock);
        }
        if(this.ingredient.getSelectedIndex() == 1){
            Slot slot = slotList.get(1);
            slot.setQuantity(istock);
            this.stock.setText("Stock: " + stock);
        }
        if(this.ingredient.getSelectedIndex() == 2){
            Slot slot = slotList.get(2);
            slot.setQuantity(istock);
            this.stock.setText("Stock: " + stock);
        }
        if(this.ingredient.getSelectedIndex() == 3){
            Slot slot = slotList.get(3);
            slot.setQuantity(istock);
            this.stock.setText("Stock: " + stock);
        }
        if(this.ingredient.getSelectedIndex() == 4){
            Slot slot = slotList.get(4);
            slot.setQuantity(istock);
            this.stock.setText("Stock: " + stock);
        }
        if(this.ingredient.getSelectedIndex() == 5){
            Slot slot = slotList.get(5);
            slot.setQuantity(istock);
            this.stock.setText("Stock: " + stock);
        }
        if(this.ingredient.getSelectedIndex() == 6){
            Slot slot = slotList.get(6);
            slot.setQuantity(istock);
            this.stock.setText("Stock: " + stock);
        }
        if(this.ingredient.getSelectedIndex() == 7){
            Slot slot = slotList.get(7);
            slot.setQuantity(istock);
            this.stock.setText("Stock: " + stock);
        }
    }

    public void balGoActionPerformed(java.awt.event.ActionEvent evt){
        String bal = replenishBal.getText();
        double dbal = Double.parseDouble(bal);

        vM.replenish(dbal);

        String ball = numMachineBal.getText();
        double dball = Double.parseDouble(ball);
        dball += dbal;
        String newball = new Double(dball).toString();
        this.numMachineBal.setText(newball);
    }

    public void clearActionPerformed(java.awt.event.ActionEvent evt) { 
        int i;
        area.setText("");
        for(i=0; i<orderList.size(); i++){
            orderList.remove(i);
            i--;
        }
    }

    public void getChangeActionPerformed(java.awt.event.ActionEvent evt) { 
        String bal = this.numMachineBal.getText();
        String currMoney = this.numBal.getText();
        double newBal = Double.valueOf(bal);
        double newCurr = Double.valueOf(currMoney);

        newBal -= newCurr;

        bal = new Double(newBal).toString();

        this.area.setText("PHP "+this.numBal.getText()+" Returned");
        this.numBal.setText("0");
        this.numMachineBal.setText(bal);
    }

    public ArrayList<ingredients> orders(){
        return orderList;
    }

    public static void main(String[] args) {
        VendingMachine vM = new VendingMachine();
        new VendingMachineViewAndController(vM);
    }
}
