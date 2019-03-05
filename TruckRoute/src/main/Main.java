package main;

import java.util.LinkedList;
import java.util.List;

import classes.Point;
import classes.Solution;

public class Main {

	/*
	 * this is from stack overflow:
	 * https://stackoverflow.com/questions/54848112/how-to-filter-points-that-are-lying-on-the-shortest-path
	 * I have a task: a truck departs from a warehouse located at point (0, 0). A function is given a 
	 * List<Point> points that are waiting for the truck and N value represents a number of points in 
	 * which the truck has to arrive such as N <= points.size(). The truck doesn't have to go round all 
	 * the points, only N of them. Return List<Point> size of N that truck has to visit doing the shortest 
	 * path.
	 * 
	 */
	public static void main(String[] args) {
		List<Point> points = new LinkedList<Point>();
		points.add(new Point(0,2));
		points.add(new Point(0,1));
		points.add(new Point(0,0));
		points.add(new Point(0,-1));
		Solution sol = new Solution();
		List<Point> answer = sol.route(points, 2);
		for(Point point : answer) {
			System.out.println("("+point.getX()+","+point.getY()+")");
		}
	}

}
