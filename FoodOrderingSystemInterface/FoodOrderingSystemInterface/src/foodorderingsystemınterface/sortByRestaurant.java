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
public class sortByRestaurant implements Comparator<Food>{
    @Override
    public int compare(Food f1,Food f2){
        return f1.getName().compareTo(f2.getName());
    }
}
