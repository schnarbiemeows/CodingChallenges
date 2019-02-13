package classes;

/*
 * 812
 * 
 */
public class Solution {

	public double largestTriangleArea(int[][] points) {
        double largestArea = 0;
        for(int pointA=0;pointA<points.length-2;pointA++) {
        	for(int pointB=pointA+1;pointB<points.length-1;pointB++) {
        		for(int pointC=pointB+1;pointC<points.length;pointC++) {
        			largestArea=Math.max(getArea(points[pointA],points[pointB],points[pointC]),largestArea);
        		}
        	}
        }
        return largestArea;
    }
    
    public double getArea(int[] pointA, int[] pointB, int[] pointC) {
    	double sideAB = getLength(pointA,pointB); // side C
    	double sideAC = getLength(pointA,pointC); // side B
    	double sideBC = getLength(pointB,pointC); // side A
    	double angleA = Math.acos((sideAC*sideAC+sideAB*sideAB-sideBC*sideBC)/(2*sideAC*sideAB));
    	if(Double.isNaN(angleA)) return 0;
    	double height = sideAC*Math.sin(angleA);
    	double area = 0.5*height*sideAB;
    	return area;
    }
    
    public double getLength(int[] pointA, int[] pointB) {
    	return Math.sqrt((pointA[0]-pointB[0])*(pointA[0]-pointB[0])+(pointA[1]-pointB[1])*(pointA[1]-pointB[1]));
    }
}
