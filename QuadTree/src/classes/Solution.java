package classes;

/*
 * 
 */
public class Solution {

	public Node construct(int[][] grid) {
		if(grid.length==1) return new Node(true,true,null,null,null,null);
	    int length = grid.length;
	    int level = -1;
	    while(length>0) {
	    	length/=2;
	    	level++;
	    }
	    Node root = createTree(grid, level, 0, grid.length,0,grid.length);
	    return root;
    }
    
    public Node createTree(int[][] grid, int level, int startY, int endY, int startX, int endX) {
    	if(level==0) {
    		System.out.println("LEAF level : startY="+startY+" endY="+endY+" startX="+startX+" endX="+endX);
    		boolean val = false;
    		if(grid[startY][startX]==1) val=true;
    		Node thisNode = new Node(val,true,null,null,null,null);
    		return thisNode;
    	}
    	else {
    		System.out.println("level="+level+" , coordinates that came in were : "+startY+", "+endY+", "+startX+", "+endX);
    		System.out.println("level="+level+" , 4 subgrids will be : ");
    		System.out.println("y-start="+startY+" , y-end="+endY/2+" , x-start="+startX+" , x-end="+endX/2);
    		System.out.println("y-start="+startY+" , y-end="+endY/2+" , x-start="+endX/2+" , x-end="+endX);
    		System.out.println("y-start="+endY/2+" , y-end="+endY+" , x-start="+startX+" , x-end="+endX/2);
    		System.out.println("y-start="+endY/2+" , y-end="+endY+" , x-start="+endX/2+" , x-end="+endX);
    		Node thisNode = new Node(false,false,createTree(grid,level-1,startY,endY/2,startX,endX/2),
    									createTree(grid,level-1,startY,endY/2,endX/2,endX),
    									createTree(grid,level-1,endY/2,endY,startX,endX/2),
    									createTree(grid,level-1,endY/2,endY,endX/2,endX));
    		if(thisNode.topLeft.val==thisNode.topRight.val==thisNode.bottomLeft.val==thisNode.bottomRight.val) {
    			System.out.println("level : " + level + " it's a leaf!");
    			thisNode.val = thisNode.topLeft.val;
    			thisNode.isLeaf=true;
    			thisNode.topLeft=null;
    			thisNode.topRight=null;
    			thisNode.bottomLeft=null;
    			thisNode.bottomRight=null;
    		}
    		return thisNode;
    	}
    }
}
