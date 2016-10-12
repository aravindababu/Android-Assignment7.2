/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package substring;

/**
 *
 * @author user2
 */
public class SubString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String Sentence = "Fast Food";
        
        //Here i am using indexOf() and contains() method of string class to 
        //find out substring in a string
        //indexOf will return the index within the string character defined in Strings
        //if the index is not found this will return -1
        
        //if index of "Fast" is found in the String "Sentence" i.e if index is found
        if(Sentence.indexOf("Fast") != -1){
            //Programme will print Yes 'Fast Food' contains word 'Fast' 
            System.err.printf("Yes '%s' contains word 'Fast' %n", Sentence);
        }else{
            //Programme will print Sorry String does not contain word "Fast"
            System.err.printf("Sorry %s does not contain word 'Fast' %n" +Sentence);
        }
        //if the String has a word "Food"
        if(Sentence.contains("Food")){
            //Programme will print Great 'Fast Food' contains word 'Food' 
           System.err.printf("Great '%s' contains word 'Food' %n" , Sentence);
       }else{
            //Programme will print Sorry Fast Food does not contains word 'Food' 
           System.err.printf("Sorry %s does not contains word 'Food' %n" , Sentence);
       }
    }
}


    

