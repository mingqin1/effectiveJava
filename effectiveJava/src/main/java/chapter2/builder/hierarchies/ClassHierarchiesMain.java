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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author Ming
 */
public class ClassHierarchiesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        
        String json = gson.toJson(pizza);
	System.out.println(json);
        
        NyPizza pizza2=gson.fromJson(json, NyPizza.class);
        
       

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
        
        json = gson.toJson(calzone);
	System.out.println(json);
    }

}
