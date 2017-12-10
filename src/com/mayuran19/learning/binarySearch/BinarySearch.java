package com.mayuran19.learning.binarySearch;

/**
 * Created by smayuran on 11/23/2017.
 */
public class BinarySearch {
    public int binarySearch(int[] sortedArray, int value){
        int low = 0;
        int high = sortedArray.length - 1;
        int i = (high + low) / 2;
        while(value != sortedArray[i] && high != low){
            if(value > sortedArray[i]){
                low = i + 1;
            }else{
                high = i - 1;
            }

            i = (high + low) / 2;
        }
        System.out.println(high + ":" + low);
        if(value == sortedArray[i]){
            return i;
        }else{
            return -1;
        }
    }

    public static void main(String args[]){
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.binarySearch(new int[]{1,2,3,4,5,6}, 6);
        System.out.println(index);
    }
}
