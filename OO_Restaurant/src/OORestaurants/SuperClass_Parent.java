/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Prachi
 */
public class SuperClass_Parent {
    
    public double FrenchFries;
    public double Burger;
    public double ChilliPotato;
    public double Maggie;
    public double Noddles;
    
    public double HotChocolate;
    public double Coffee;
    public double Lemonade;
    public double IcedTea;
    public double Juice;
    
    public double Snacks;
    public double Drinks;
    public double TotalofSD;
    
    public double AllTotalofSD;
    
    
    public double GetAmount()
    {
        Snacks = FrenchFries + Burger + ChilliPotato + Maggie + Noddles;
        Drinks = HotChocolate + Coffee + Lemonade + IcedTea + Juice;
        TotalofSD = Snacks + Drinks;
        AllTotalofSD = TotalofSD;
        return AllTotalofSD;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","P&P FOODS",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //==================================Price===========================================
    
    public double pFrenchFries = 80;
    public double pBurger = 55;
    public double pChilliPotato = 100;
    public double pMaggie = 70;
    public double pNoddles = 65;
    
    public double pHotChocolate = 75;
    public double pCoffee = 50;
    public double pLemonade = 40;
    public double pIcedTea = 35;
    public double pJuice = 90;
    
    //+========================================================================================
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
    //+========================================================================================
    
}
