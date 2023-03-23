package classes;

import java.util.*;

/*
 * You are assigned to put some amount of boxes onto one truck.
 * You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
 * numberOfBoxesi is the number of boxes of type i.
 * numberOfUnitsPerBoxi is the number of units in each box of the type i.
 * You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck.
 * You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.
 *
 * Return the maximum total number of units that can be put on the truck.
 */
public class Solution {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // it would seem that you would just sort the 2D array by numberOfUnitsPerBoxi largest to smallest
        // and then add up numberOfBoxesi until you hit truckSize
        // what's the trick?
        // 1. make a map of (Int, Int)
        int sum = 0;
        Map<Integer,Integer> amounts = new HashMap(); // key = numberOfUnitsPerBoxi, value = numberOfBoxesi
        List<Integer> numberOfUnitsPerBoxi = new ArrayList();
        for(int[] inner: boxTypes) {
            if(!numberOfUnitsPerBoxi.contains(inner[1])) {
                numberOfUnitsPerBoxi.add(inner[1]);
            }
            if(amounts.containsKey(inner[1])) {
                amounts.put(inner[1], amounts.get(inner[1])+inner[0]);
            } else {
                amounts.put(inner[1],inner[0]);
            }
        }
        Collections.sort(numberOfUnitsPerBoxi);
        for(int i=numberOfUnitsPerBoxi.size()-1;i>-1;i--) {
            int numUnits = numberOfUnitsPerBoxi.get(i);
            if(truckSize<1) {
                return sum;
            } else {
                int numBoxes = amounts.get(numUnits);
                if(numBoxes>truckSize) {
                    sum += truckSize*numUnits;
                    truckSize = 0;
                } else {
                    sum += numBoxes*numUnits;
                    truckSize-=numBoxes;
                }
            }
        }
        return sum;
    }
}
