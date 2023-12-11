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
public class sortByKitchenType implements Comparator<Food>{
    @Override
    public int compare(Food f1,Food f2){
        return f1.getKitchenType().compareTo(f2.getKitchenType());
    }
}
