/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.builder.hierarchies;

import static chapter2.builder.hierarchies.NyPizza.Size.SMALL;
import static chapter2.builder.hierarchies.Pizza.Topping.HAM;
import static chapter2.builder.hierarchies.Pizza.Topping.ONION;
import static chapter2.builder.hierarchies.Pizza.Topping.SAUSAGE;

/**
 *
 * @author Ming
 */
public class ClassHierarchiesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

    }

}
