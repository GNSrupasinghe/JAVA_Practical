/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac2;

/**
 *
 * @author NADISHA
 */
public class Prac2 {


    public static void main(String[] args) {
        // Creating an Item object
        Item item = new Item(1, "Health Potion");

        // Getting and setting item properties
        System.out.println("Item Description: " + item.getDescription());
        System.out.println("Item Location: " + item.getLocation());
        item.setDescription("Mana Potion");
        item.setLocation(2);
        System.out.println("Item Description: " + item.getDescription());
        System.out.println("Item Location: " + item.getLocation());

        // Creating a Monster object
        Monster monster = new Monster(3, "Dragon");

        // Getting and setting monster properties (inherited from Item class)
        System.out.println("Monster Description: " + monster.getDescription());
        System.out.println("Monster Location: " + monster.getLocation());
        monster.setDescription("Giant Spider");
        monster.setLocation(4);
        System.out.println("Monster Description: " + monster.getDescription());
        System.out.println("Monster Location: " + monster.getLocation());
    }
}