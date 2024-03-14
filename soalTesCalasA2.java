//time wasted on this code: 23:55
//Author: Muhammad Fiqri
//Github: https://github.com/Muhammad-Fiqri
//Description:

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
        int tableWidth = 61;
        int tableHeight = 7;
        int[] tableColumn = {1,9,18,27,36,61};
        int[] textColLoc = {2,10,19,28,37,62};
        int[] tableRow = {2,4,5,6}; 

        for (int row = 1; row <= tableHeight; row++) {
            for (int col = 1; col <= tableWidth; col++) {
                if (soalTesCalasA2.contains(tableRow,row)) {
                    if (soalTesCalasA2.contains(tableColumn,col)) {
                        System.out.print("|");
                    } else {
                        //print header
                        for (int i = 0; i <= 4; i++) {
                            if (col == textColLoc[i] && row == tableRow[0]) {
                                System.out.print(Nilai[0][i]);
                            } else if (col >= textColLoc[i] + soalTesCalasA2.getStringLengthInArray(Nilai[0], i) && col <= textColLoc[i+1]-1 && row == tableRow[0]) {
                                System.out.print(" ");
                            }
                        }
                    }

                } else {
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
        String[][] Nilai = { {"NAMA","UTS","UAS","TUGAS","NILAI AKHIR"}, {"Atta","60.0","70.0","90.0","70.5"}, {"Marse","80.0","70.0","90.0","77.5"}, {"Rakun", "70.0", "60.0", "90.0", "69.5"}  };
        soalTesCalasA2.renderTable(Nilai);
    }

}