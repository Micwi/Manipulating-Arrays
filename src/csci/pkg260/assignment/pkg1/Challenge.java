/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci.pkg260.assignment.pkg1;

/**
 *
 * @author louiejr.
 */
public class Challenge extends CSCI260Assignment1 {

    public void z() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array:");
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("Log of 5: ");
        for (int x : numbers) {
            System.out.print(Math.log(x) / Math.log(5) + ", ");
        }

    }
}
