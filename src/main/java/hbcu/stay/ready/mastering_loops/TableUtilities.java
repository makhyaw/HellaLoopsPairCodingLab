package hbcu.stay.ready.mastering_loops;

public class TableUtilities {
    //method header, returns string, accepts nothing.., basing output on test case
    public static String getSmallMultiplicationTable() {
        // init output str 
        String getSmall = "";
    //loop to insert the numbers for the number of rows that you want
    //example for the first time it loops, the string counts by 1
    //but on the 5th time it counts by 5's..
        for( int i = 1; i <= 5; i++){
            int length = 5;
            getSmall += buildTableRow(i,length)+ "\n";

        }
        return getSmall;
    }



    private static String buildTableRow(int i, int length){
        String rowBuild = "";
        //columns, uses i and lenght, and go up by 1
        for( int x = i; x <= length; i++){
            for( int y = i; y <= length; y++) {
            rowBuild += i*y+"\n";
            }
        }
        return rowBuild;
    } 
    
    public static String getLargeMultiplicationTable() {
        String getLarge = "";
        for( int i = 1; i <= 10; i++){
            int length = 10;
            getLarge += buildTableRow(i,length)+ "\n";
        }

        return getLarge;
    }

    public static String getMultiplicationTable(int tableSize) {
        String getMultiplication = "";
        for( int i = 1; i <= 10; i++){
            int length = 10;
            getMultiplication += buildTableRow(i,length)+ "\n";
        }
        
        return getMultiplication;
    }
}
