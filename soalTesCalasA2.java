//time spend on this code: 3h 39m
//Author: Muhammad Fiqri
//Github: https://github.com/Muhammad-Fiqri/Calas-Labsi
//Description: this code is made to render a table of array data in the CLI where the text location, width, height, and column are declared before hand

public class soalTesCalasA2 {
    //this method return the length of a string inside an array
    public static int getStringLengthInArray(String[] stringArray, int index) {
        if (stringArray == null || index < 0 || index >= stringArray.length) {
          // Handle invalid cases
          return -1; // Indicate an error
        }
       
        String targetString = stringArray[index];
        return targetString.length();
       }

    //this method return true if array has the value in the argument
    public static boolean contains(int[] arr, int value) {
        if (arr == null) {
          // Handle null array case
          return false;
        }
      
        for (int num : arr) {
          if (num == value) {
            return true;
          }
        }
        return false;
    }

    //this method is to render the CLI Table UI
    public static void renderTable(String[][] Nilai) {
        //define the width of the table by one unit of char
        int tableWidth = 61;
        //define the height of the table by one unit of char
        int tableHeight = 7;
        //define the location of every column
        int[] tableColumn = {1,9,18,27,36,61};
        //define the location of the text column index to be written on each row
        int[] textColLoc = {3,12,21,29,44,62};
        //define the row that can be written with text
        int[] tableRow = {2,4,5,6}; 

        for (int row = 1; row <= tableHeight; row++) {
            for (int col = 1; col <= tableWidth; col++) {

                //print the writeablerow
                if (soalTesCalasA2.contains(tableRow,row)) {

                    //print the column border
                    if (soalTesCalasA2.contains(tableColumn,col)) {
                        System.out.print("|");
                    } else {
                        
                        //print the text in the writeable cell
                        for (int cellRow = 0 ; cellRow <= 3; cellRow++) {
                            for (int cellCol = 0; cellCol <= 4; cellCol++) {

                                //check if in writeable row
                                if (row == tableRow[cellRow]) {
                                    //print data if col index is in text location and in the writeable row
                                    if (col == textColLoc[cellCol] && row == tableRow[cellRow]) {
                                        System.out.print(Nilai[cellRow][cellCol]);
                                    } else if (col > tableColumn[cellCol] && col < tableColumn[cellCol+1] && row == tableRow[cellRow]) {
                                        //print space if col index is not in text location and not in cell border of left and right
                                        if (col < textColLoc[cellCol] || col >= textColLoc[cellCol] + soalTesCalasA2.getStringLengthInArray(Nilai[cellRow], cellCol)) {
                                            System.out.print(" ");
                                        }
                                    }
                                }
                            }
                        }

                        /*
                        //print header
                        for (int i = 0; i <= 4; i++) {
                            if (col == textColLoc[i] && row == tableRow[0]) {
                                System.out.print(Nilai[0][i]);
                            } else if (col >= textColLoc[i] + soalTesCalasA2.getStringLengthInArray(Nilai[0], i) && col <= textColLoc[i+1]-1 && row == tableRow[0]) {
                                System.out.print(" ");
                            }
                        }
                        //print body 
                        for (int i = 0; i <= 4; i++) {
                            if (col == textColLoc[i] && row == tableRow[1]) {
                                System.out.print(Nilai[1][i]);
                            } else if (col >= textColLoc[i] + soalTesCalasA2.getStringLengthInArray(Nilai[1], i) && col <= textColLoc[i+1]-1 && row == tableRow[1]) {
                                System.out.print(" ");
                            }
                        }
                        */
                    }

                } else {
                    //print the border row
                    if (col == 1 || col == tableWidth || col % 9 == 0 && col <= 36) {
                        System.out.print("+");
                    } else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //define the raw data to be written in table, the header is the first array
        String[][] Nilai = { {"NAMA","UTS","UAS","TUGAS","NILAI AKHIR"}, {"Atta","60.0","70.0","90.0","70.5"}, {"Marse","80.0","70.0","90.0","77.5"}, {"Rakun", "70.0", "60.0", "90.0", "69.5"}  };
        
        //render the table
        soalTesCalasA2.renderTable(Nilai);
    }

}
