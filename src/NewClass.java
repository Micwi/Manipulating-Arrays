/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.*;
import java.util.*;

/**
 *
 * @author louiejr.
 */
public class NewClass {

    public static void main(String[] args) {
        double customerChange = 8.75;
        StringBuilder display = new StringBuilder();
        while (customerChange > .01) {
            if (customerChange >= 50.0) {
                display.append("Fifty Pounds");
                customerChange -= 50.0;
            } else if (customerChange >= 20.0) {
                display.append("Twenty Pounds");
                customerChange -= 20.0;
            } else if (customerChange >= 10.0) {
                display.append("Ten Pounds");
                customerChange -= 10.0;
            } else if (customerChange >= 5.0) {
                display.append("Five Pounds");
                customerChange -= 5.0;
            } else if (customerChange >= 2.0) {
                display.append("Two Pounds");
                customerChange -= 2.0;
            } else if (customerChange >= 1.0) {
                display.append("One Pound");
                customerChange -= 1.0;
            } else if (customerChange >= .50) {
                display.append("Fifty Pence");
                customerChange -= .50;
            } else if (customerChange >= .20) {
                display.append("Twenty Pence");
                customerChange -= .20;
            } else if (customerChange >= .10) {
                display.append("Ten Pence");
                customerChange -= .10;
            } else if (customerChange <= .05) {
                display.append("Five Pence");
                customerChange -= .05;
            } else if (customerChange >= .02) {
                display.append("Two Pence");
                customerChange -= .02;
            } else if (customerChange >= .01) {
                display.append("One Pence");
                customerChange -= .01;
            } else {

            }
            display.append(", ");
        }

        display.setLength(display.length() - 1);
        display.deleteCharAt(display.length() - 1);
        System.out.print(display.toString());

    }

}
