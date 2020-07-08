package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
    
        String value = "";
        for (int i = start; i <= stop; i++){
            if(i % 2 == 0){
                 value = value + i;
                 // making the empty string = i
            }
        }
        return value;
    }


    public static String getOddNumbers(int start, int stop) {

        String value = "";
        for (int i = start; i <= stop; i++){
            //The condition here is if the number is odd (i % 2==1)
            if(i % 2 == 1){
                 value = value + i;
            }
        }
        return value;
    }

/* this is our method header. We have a public method named getSquareNumber
 it returns a string, and accepts three arguments being: stop start and step*/
    public static String getSquareNumbers(int start, int stop, int step) {
        //init empty string for return
        String value = "";
        //start our for loop, first value is our start
        //Vocabulary when talking about for loops: Traversing, iterating, looping
        //"We're traversing through the start value to the stop value, exclusively
        // and incrementing by our step value"
        for (int i = start; i < stop; i = step){
         //We don't have a conditional in this function but we do have action
         //For every loop we're going to square the number (i)
            int num =  i * i; 
            value = value + num;
            //value += Math.pow(i, 2);
        }
        return value;
    }
    // expected string of numbers from 0 -> Stop-2, so if stop 11 -> 0123456789
    public static String getRange(int stop) {
        String value ="";
/*starting from zero because our start wasn't stated;
because we don't want to include our stop value we're using "<" and not "<=" 
Basically second parameter tells to for loop if it can keep running the code or not
so the loop is going to arrive at the question " is 11<11 "...that's false so it
won't run code inside the parenthesis the 11 time*/

//turnary operators ++, +=, --, -=, *=; basically shortcuts

        for(int i= 0; i < stop; i++){
           value += i;
           //value = value + i;
        }
        return value;
    }
   
    //same thing as the previous method but now start value is specificed
    public static String getRange(int start, int stop) {
        String value ="";
        for(int i= start; i < stop; i++){
            value += i;
            //value = value + i;
         }

        return value;
    }


    public static String getRange(int start, int stop, int step) {
        String value ="";
        for(int i= start; i < stop; i = step){
            value += i;
            //value = value + i;
         }
        return value;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String value ="";
        for (int i = start; i < stop; i = step){
    
            value += Math.pow(i, exponent);
        }
        return value;
    }
}
