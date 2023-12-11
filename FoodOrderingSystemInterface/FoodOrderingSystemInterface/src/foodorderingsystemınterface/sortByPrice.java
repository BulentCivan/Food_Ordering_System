/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodorderingsystemınterface;

import java.util.Comparator;

/**
 *
 * @author bulent
 */
public class sortByPrice implements Comparator<Food>{
    @Override
    public int compare(Food f1,Food f2){
        return f1.getUnitPrice()-f2.getUnitPrice();
    }
}
