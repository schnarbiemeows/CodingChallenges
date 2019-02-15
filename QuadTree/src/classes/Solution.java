package classes;

/*
 * Ok, 1 incorrect submission, because I forgot that, if the 4 children of a node are not all leaves, then
 * that node cannot be a leaf, so when checking the children values, I needed to include:
 * if thisNode.topLeft.isLeaf==true&&thisNode.topRight.isLeaf==true&&
                           thisNode.bottomLeft.isLeaf==true&&thisNode.bottomRight.isLeaf==true
 * second submission beat 53.35% of submissions, no memory information
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
    		int newEndX = (startX+endX)/2;
            int newEndY = (startY+endY)/2;
            double random = Math.round(100*Math.random());
            System.out.println("node-->"+random+" , level="+level+" , coordinates that came in were : "+startY+", "+endY+", "+startX+", "+endX);
            System.out.println("level="+level+" , 4 subgrids will be : ");
    		System.out.println("y-start="+startY+" , y-end="+newEndY+" , x-start="+startX+" , x-end="+newEndX);
    		System.out.println("y-start="+startY+" , y-end="+newEndY+" , x-start="+newEndX+" , x-end="+endX);
    		System.out.println("y-start="+newEndY+" , y-end="+endY+" , x-start="+startX+" , x-end="+newEndX);
    		System.out.println("y-start="+newEndY+" , y-end="+endY+" , x-start="+newEndX+" , x-end="+endX);
    		Node thisNode = new Node(false,false,createTree(grid,level-1,startY,newEndY,startX,newEndX),
    									createTree(grid,level-1,startY,newEndY,newEndX,endX),
    									createTree(grid,level-1,newEndY,endY,startX,newEndX),
    									createTree(grid,level-1,newEndY,endY,newEndX,endX));
    		System.out.println("for node -->"+random+" results are :"+thisNode.topLeft.val+
    				" "+thisNode.topRight.val+" "+thisNode.bottomLeft.val+" "+thisNode.bottomRight.val);
    		if(
    				thisNode.topLeft.isLeaf==true&&thisNode.topRight.isLeaf==true&&thisNode.bottomLeft.isLeaf==true&&thisNode.bottomRight.isLeaf==true
    				&&(thisNode.topLeft.val==true&&thisNode.topRight.val==true&&thisNode.bottomLeft.val==true&&thisNode.bottomRight.val==true||
                    thisNode.topLeft.val==false&&thisNode.topRight.val==false&&thisNode.bottomLeft.val==false&&thisNode.bottomRight.val==false)) 
    		{
    			System.out.println("for node -->"+random+" level : " + level + " it's a leaf!");
    			thisNode.val = thisNode.topLeft.val;
    			thisNode.isLeaf=true;
    			thisNode.topLeft=null;
    			thisNode.topRight=null;
    			thisNode.bottomLeft=null;
    			thisNode.bottomRight=null;
    		} else {
    			System.out.println("for node -->"+random+" is not a leaf");
    		}
    		return thisNode;
    	}
    }
}
