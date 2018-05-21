/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.generics.favorgenericmethods;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ming
 */
public class FavorGenericMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> guys = new HashSet<>(Arrays.asList("Tom", "Dick", "Harry"));
        Set<String> stooges = new HashSet<>(Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = unionRawType(guys, stooges);
        System.out.println(aflCio);
        Set<String> aflCio2 = unionTypeParameter(guys, stooges);
        System.out.println(aflCio2);
        
        Set<Integer>  integers =  new HashSet<>(Arrays.asList(1, 3, 5));
        Set<Double>   doubles  =  new HashSet<>(Arrays.asList(2.0, 4.0, 6.0));
        Set<Number>   numbers  =  unionBoundedWildcardType(integers, doubles);
        System.out.println(numbers);
    }

    // Uses raw types - unacceptable! 
    public static Set unionRawType(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // Generic method-input parameters are type parameter
    // Limitation of  unionGenricMethod is that types of all three set (both 
    // input parameters and the return value) have to be exactly the same
    public static <E> Set<E> unionTypeParameter(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
    
    //Bounded Wildcard Type to allow different input parameters -Set<Integer> Set<Double>
    public static <E> Set<E> unionBoundedWildcardType(Set<? extends E> s1, Set<? extends E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

}
