//time wasted on this code: 1h 4m
//Author: Muhammad Fiqri
//Github: https://github.com/Muhammad-Fiqri
//Description: this code will output a symmetric leg triangle with length determined by the variable triangleLength

public class soalTesCalasA1 {
    public static void main(String[] args) {
        //attribute to initiate the length of the asterix triangle (in the doc is 9)
        int triangleLength = 9;
        //attribute to account the middle part of the triangle to print the first asterix (plus 2 for added one)
        int halfLengthOfTriangle = Math.floorDiv(triangleLength, 2) + 2;

        //iterate throught the height of the triangle (per row)
        for(int i = 1; i <= 5; i++) {
            //iterate throught the width of the triangle (per column)
            for(int j = 1; j <= triangleLength; j++) {
                //check if column right now is a the middle triangle (place to print asterix)
                if(j == halfLengthOfTriangle-i) {
                    //loop for printing asterix every series of row with formula(n+n-1) 1,3,5,7,9
                    for(int k = 1; k <= i+(i-1); k++) {
                        System.out.print("*");
                    }
                }
                //printing the space on the left and right of the asterix
                System.out.print(" ");
            }
            //create new line every row of triangle is printed
            System.out.println("");
        }
    }
  }