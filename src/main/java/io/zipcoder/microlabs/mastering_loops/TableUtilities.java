package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder str = new StringBuilder();
        str.append(getMultiplicationTable(5));


        return str.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder str = new StringBuilder();
        str.append(getMultiplicationTable(10));


        return str.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder str = new StringBuilder();
        // table size represents rows
        // loop through rows
        for(int i = 0; i < tableSize; i++) {
            // loop through columns
            for(int j = 0; j < tableSize; j++) {
               int product = (i + 1) * (j + 1);
                str.append(String.format("%3d",product) + " |");

            }
           // next line
            str.append("\n");
        }
        return str.toString();
    }
}
