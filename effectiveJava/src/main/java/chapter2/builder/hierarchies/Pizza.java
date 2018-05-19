/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.builder.hierarchies;

import com.google.gson.annotations.SerializedName;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author Ming
 */
public abstract class Pizza {

    public enum Topping {
      @SerializedName("LazyHAM")  HAM, MUSHROOM, ONION, PEPPER,   
      @SerializedName("LazySAUSAGE")SAUSAGE
    }
    
    final Set<Topping> toppings;
      
    Pizza(Builder<?> builder) {

        toppings = builder.toppings.clone(); // See Item  50

    }

    abstract static class Builder<T extends Builder<T>> {

        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
      
        public T addTopping(Topping topping) {

            toppings.add(Objects.requireNonNull(topping));

            return self();

        }

        abstract Pizza build();

        // Subclasses must override this method to return "this"
        protected abstract T self();

    }

    

}
