/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class EmailValidator {
    
    public static boolean isValidEmail(String email) {
        if (!email.contains("@")) {
            return false;
        }
        
        if (!email.contains(".")) {
            return false;
        }
        
        return true;
    }
    
}
