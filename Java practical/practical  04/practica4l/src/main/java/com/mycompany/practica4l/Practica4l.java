/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4l;

/**
 *
 * @author NADISHA
 */
public class Practica4l {

    public static void main(String[] args) {
        // Creating Employee objects
        employee mrBogdan = new employee();
        employee msBird = new employee();

        // Setting values for Mr. Bogdan using setters
        mrBogdan.setEmpID(101);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");

        // Setting values for Ms. Bird using setters
        msBird.setEmpID(102);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("HR Manager");

        // Printing the details using getters
        System.out.println("Employee Details for Mr. Bogdan:");
        System.out.println("ID: " + mrBogdan.getEmpID());
        System.out.println("Name: " + mrBogdan.getEmpName());
        System.out.println("Designation: " + mrBogdan.getEmpDesignation());
        System.out.println();

        System.out.println("Employee Details for Ms. Bird:");
        System.out.println("ID: " + msBird.getEmpID());
        System.out.println("Name: " + msBird.getEmpName());
        System.out.println("Designation: " + msBird.getEmpDesignation());
    }
}
 
