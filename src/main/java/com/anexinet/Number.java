package com.anexinet;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for arithmetic operations
 */
public class Number {

    /**
     * Method that receives two integer and executes an addition
     * without using an operator
     * @param a int
     * @param b int
     * @return the addition of two integer numbers
     */
    public Integer sum(int a, int b){

        List<Integer> integers = new ArrayList<>();
        integers.add(a);
        integers.add(b);
        Integer result = integers.stream().reduce(0, Integer::sum);
        return result;
    }

    /**
     * Method that search a zero in an array
     * and in case of finding it, fills the x & y plane with the same number.
     */
    public void matrix() {
        int position = 0;
        int[][] arr = {
                {0,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int y = 0; y < arr.length; y++){
            for (int x = 0; x < arr[0].length;x++){
                if(arr[y][x] == 0) {
                    position = x;
                    break;
                }
            }
        }
        for (int y = 0; y < arr.length; y++){
            for (int x = 0; x < arr[0].length;x++){
                if(x == position || y == position)
                    arr[y][x] = 0;
                System.out.print(arr[y][x]);
            }
            System.out.println("\n");
        }
    }

    /**
     * Method that receives an integer and convert in Roman numeral
     * @param number int
     * @throws Exception in case the given number is greater than 3999
     */
    public String getRomanNumeral(int number) throws Exception{

        if (number >= 4000 && number >= 1)
            throw new Exception("The number must be less than 3999");

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] literals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i = 0; i < values.length; i++) {

            while(number >= values[i]) {
                number -= values[i];
                roman.append(literals[i]);
            }
        }
        return roman.toString();

    }

}
