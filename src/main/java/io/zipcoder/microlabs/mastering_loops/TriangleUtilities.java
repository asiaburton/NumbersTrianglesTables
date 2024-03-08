package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder rows = new StringBuilder();
        for(int i = 1; i < numberOfRows; i++) {
            rows.append(getRow(i) + "\n");
        }
        return rows.toString();

    }

    public static String getRow(int numberOfStars) {
        StringBuilder rows = new StringBuilder();
        for(int i = 0; i < numberOfStars; i++) {
                rows.append("*");
            }
        return rows.toString();

    }

    public static String getSmallTriangle() {
        StringBuilder str = new StringBuilder();
        str.append(getTriangle(5));

        return str.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder str = new StringBuilder();;
        str.append(getTriangle(10));
        return str.toString();
    }
}
