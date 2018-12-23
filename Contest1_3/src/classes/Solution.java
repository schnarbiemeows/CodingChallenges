package classes;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/*
	 * quite a crappy solution O(n^4), but not knowledgeable enough at this point
	 * but this one seems to work; it passes all 4 examples, and some other
	 * initial tests that I did
	 */
	public double minAreaFreeRect(int[][] points) {
        System.out.println(points.length);
        double minArea = Double.MAX_VALUE;
        List<int[][]> allPossiblePoints = new ArrayList<int[][]>();
        for(int i=0;i<points.length-3;i++) {
        	for(int j=i+1;j<points.length-2;j++) {
        		for(int k=j+1;k<points.length-1;k++) {
        			for(int w=k+1;w<points.length;w++) {
        				int[][] combo = new int[4][2];
        				combo[0][0] = points[i][0];
        				combo[0][1] = points[i][1];
        				combo[1][0] = points[j][0];
        				combo[1][1] = points[j][1];
        				combo[2][0] = points[k][0];
        				combo[2][1] = points[k][1];
        				combo[3][0] = points[w][0];
        				combo[3][1] = points[w][1];
        				allPossiblePoints.add(combo);
        			}
        		}
        	}
        }
        for(int[][] item : allPossiblePoints) {
        	int[] pointA = item[0];
        	int[] pointB = item[1];
        	int[] pointC = item[2];
        	int[] pointD = item[3];
        	int[] fulcrum1 = pointA;
        	int[] fulcrum2 = pointB;
        	int[] other1 = pointC;
        	int[] other2 = pointD;
        	double oppositeLength1 = 0.0;
        	double oppositeLength2 = 0.0;
        	double otherLength = 0.0;
        	// we need to find the two points farthest apart
        	double lengthAB = findLength(pointA,pointB);
        	double lengthAC = findLength(pointA,pointC);
        	double lengthAD = findLength(pointA,pointD);
        	double lengthBC = findLength(pointB,pointC);
        	double lengthBD = findLength(pointB,pointD);
        	double lengthCD = findLength(pointC,pointD);
        	double doubleMaxLength = Math.max(Math.max(Math.max(Math.max(Math.max(lengthAB,lengthAC),lengthAD),lengthBC),lengthBD),lengthCD);
        	if(lengthAB==doubleMaxLength) {
        		fulcrum1 = pointA;
        		fulcrum2 = pointB;
        		other1 = pointC;
        		other2 = pointD;
        		oppositeLength1 = lengthAC;
        		oppositeLength2 = lengthBD;
        		otherLength = lengthBC;
        	}
        	else if(lengthAC==doubleMaxLength) {
        		fulcrum1 = pointA;
        		fulcrum2 = pointC;
        		other1 = pointB;
        		other2 = pointD;
        		oppositeLength1 = lengthAB;
        		oppositeLength2 = lengthCD;
        		otherLength = lengthBC;
        	}
        	else if(lengthAD==doubleMaxLength) {
        		fulcrum1 = pointA;
        		fulcrum2 = pointD;
        		other1 = pointB;
        		other2 = pointC;
        		oppositeLength1 = lengthAB;
        		oppositeLength2 = lengthCD;
        		otherLength = lengthBD;
        	}
        	else if(lengthBC==doubleMaxLength) {
        		fulcrum1 = pointB;
        		fulcrum2 = pointC;
        		other1 = pointA;
        		other2 = pointD;
        		oppositeLength1 = lengthAB;
        		oppositeLength2 = lengthCD;
        		otherLength = lengthBC;
        	}
        	else if(lengthBD==doubleMaxLength) {
        		fulcrum1 = pointB;
        		fulcrum2 = pointD;
        		other1 = pointA;
        		other2 = pointC;
        		oppositeLength1 = lengthAB;
        		oppositeLength2 = lengthCD;
        		otherLength = lengthBC;
        	}
        	else { // lengthCD
        		fulcrum1 = pointC;
        		fulcrum2 = pointD;
        		other1 = pointA;
        		other2 = pointB;
        		oppositeLength1 = lengthAC;
        		oppositeLength2 = lengthBD;
        		otherLength = lengthBC;
        	}
        	boolean fulcrum1is90 = is90degrees(fulcrum1,other1,other2);
        	boolean fulcrum2is90 = is90degrees(fulcrum2,other1,other2);
        	if(fulcrum1is90&&fulcrum2is90&&oppositeLength1==oppositeLength2) {
        		minArea = Math.min(minArea, oppositeLength1*otherLength);
        	}
        }
        if(minArea==Double.MAX_VALUE) minArea = 0.0;
        return minArea;
    }
	
	private double findLength(int[] pointA, int[] pointB) {
		return Math.round(Math.sqrt((pointB[0]-pointA[0])*(pointB[0]-pointA[0])+
				(pointB[1]-pointA[1])*(pointB[1]-pointA[1]))*100000)/100000.0;
	}
	
	private double findSlope(int[] pointA, int[] pointB) {
		// always finding the slope from point A to point B
		if(pointB[1]==pointA[1]) return 0.0;
		if(pointB[0]==pointA[0]) {
			if(pointB[1]>pointA[1]) return Double.POSITIVE_INFINITY;
			else return Double.NEGATIVE_INFINITY;
		}
		double xDiff = pointB[0]-pointA[0];
		double yDiff = pointB[1]-pointA[1];
		return yDiff/xDiff;
	}
	
	private boolean is90degrees(int[] pointA, int[] pointB, int[] pointC) {
		// pointA is always the common point of the two angles
		double slopeAB = findSlope(pointA,pointB);
		double slopeAC = findSlope(pointA,pointC);
		if(slopeAB==Double.POSITIVE_INFINITY||slopeAB==Double.NEGATIVE_INFINITY) {
			if(slopeAC==0.0) return true; else return false;
		}
		if(slopeAC==Double.POSITIVE_INFINITY||slopeAC==Double.NEGATIVE_INFINITY) {
			if(slopeAB==0.0) return true; else return false;
		}
		if(slopeAB==-1.0/slopeAC) return true; else return false;
	}
}
