package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {
    /*The first two functions work together to build a triangle 
    - first we get the num rows, then the number of stars */

    //spits out a string with the number of stars we input
    // ex: getTriangle(20) -> "********************" (20 star string)

    public static String getTriangle(int numberOfRows) {
        //init empty output string
       String empty = "";
        //Loop the number of times we want, starting at 1 to be inclusive.
        for( int i = 1; i < numberOfRows; i++){
            //adds row full of stars to output str and adds new line
            empty += getRow(i) + "\n";
        }
        //return output string
        return empty;
    }
    
    //getRow(20) -> "********************"
    public static String getRow(int numberOfStars) {
        //init empty 
        String empty = "";
        //Loop the number of times we want, starting at 1 and using "<=" to be inclusive.
            //Start  | Condition for loop to run | Step
        for(int i = 1; i <= numberOfStars; i++){
            //add star to output str
            empty += "*";
        }
        //return string
        return empty;
    }
    // test case says 4 rows, if your  get triangle method works
    // you should be able to return getTriangle(4)
    public static String getSmallTriangle() {
        return getTriangle(5);
    }
    // test case says 9 rows, if your  get triangle method works
    // you should be able to return getTriangle(9)
    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}