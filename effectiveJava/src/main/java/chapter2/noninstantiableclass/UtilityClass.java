/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2.noninstantiableclass;

/**
 *
 * @author Ming
 */
public class UtilityClass {
     private UtilityClass() {
        throw new AssertionError();
    }
    
}
