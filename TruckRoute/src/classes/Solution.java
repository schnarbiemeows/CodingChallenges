package classes;

import java.util.LinkedList;
import java.util.List;

/*
 * this solution needs a graph structure with a linked list
 */
public class Solution {

	public List<Point> route(final List<Point> points, final int N) {
		Point root = null;
		for(Point point : points) {
			if(point.getX()==0&&point.getY()==0) root = point;
		}
		List<LinkedList<Point>> routes = new LinkedList<LinkedList<Point>>();
		List<Point> availablePoints = new LinkedList<Point>();
		availablePoints.addAll(points);
		
		List<Point> currentRoute = new LinkedList<Point>();
		//currentRoute.add(root);
		//availablePoints.remove(root);
		assembleRoutes(routes,points,availablePoints,currentRoute,root,N);
		List<LinkedList<Point>> routesCopy = new LinkedList<LinkedList<Point>>();
		routesCopy.addAll(routes);
		double totalRouteDistances = Double.MAX_VALUE;
		int bestIndex = 0;
		int i=0;
		for(LinkedList<Point> route : routesCopy) {
			double totalDistance = 0;
			Point begin = route.removeFirst();
			while(!route.isEmpty()) {
				Point next = route.removeFirst();
				if(next!=null) {
					totalDistance += calculateDistance(root,next);
					begin = next;
				}
			}
			if(totalDistance<totalRouteDistances) bestIndex=i;
			i++;
		}
		return routes.get(bestIndex);
		
	}
	public void assembleRoutes(List<LinkedList<Point>> routes,
			List<Point> points,
			List<Point> availablePoints, 
			List<Point> currentRoute,
			Point currentPoint, 
			int N) {
		if(N < 0) {
			routes.add((LinkedList<Point>) currentRoute);
		} else {
			currentRoute.add(currentPoint);
			List<Point> newapts = new LinkedList<Point>(); 
			newapts.addAll(availablePoints);
			newapts.remove(currentPoint);
			for(Point point : availablePoints) {
				List<Point> newRoute = new LinkedList<Point>();
				newRoute.addAll(currentRoute);
				assembleRoutes(routes,points,newapts,newRoute,point,N-1);
			}
		}
	}
	
	public double calculateDistance(Point pointA, Point pointB) {
		int xdiff = pointA.getX()-pointB.getX();
		int ydiff = pointA.getY()-pointB.getY();
		double distance = Math.sqrt(xdiff*xdiff+ydiff*ydiff);
		return distance;
	}
}