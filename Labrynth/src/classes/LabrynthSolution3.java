package classes;

/**
 * the algorithm:
 * this is a search algorithm problem
 * - search all of the possible paths until you either reach the endpoint, or you run out of paths
 * - we don't want to backtrack, so we need some way of keeping track of all of the points that we have already been to
 * - we also need to figure out the starting point
 * - for each step in a path, if there is something already in it, or if it can be seen by a sentry, it is a dead end
 *
 */
public class LabrynthSolution3 {
    public boolean solution(String[] B) {
        // write your code in Java SE 8
        boolean answer = false;
        int xmax = B[0].length() - 1;
        int ymax = B.length - 1;
        char[][] board = new char[B.length][B[0].length()];
        boolean[][] beento = new boolean[B.length][B[0].length()];
        int asx = 0;
        int asy = 0;
        // initialize these boards
        for (int i = 0; i < B.length; i++) {
            boolean assin = false;
            if (B[i].contains("A")) {
                assin = true;
            }
            board[i] = B[i].toCharArray();
            for (int j = 0; j < xmax; j++) {
                beento[i][j] = false;
                if (assin && board[i][j] == 'A') {
                    asx = j;
                    asy = i;
                }
            }

        }
        answer = gotoCoordinate(asx, asy, xmax, ymax, board, beento);
        return answer;
    }

    public boolean gotoCoordinate(int x, int y, int maxx, int maxy, char[][] board, boolean[][] been) {
        System.out.println("at coordinate : (" + y + " , " + x + ")");
        if(x<0||y<0||x>maxx||y>maxy) {
            System.out.println("coordinate : (" + y + " , " + x + ") is out of bounds");
            return false;
        } else if(been[y][x]==true) {
            System.out.println("I have already been to coordinate (" + y + " , " + x + ")");
            return false;
        } else if(board[y][x]=='X'||board[y][x]=='v'||board[y][x]=='>'||board[y][x]=='<'||board[y][x]=='^') {
            System.out.println("coordinate : (" + y + " , " + x + ") contains something");
            return false;
        } else {
            if(x==maxx&&y==maxy) {
                return true;
            } else {
                been[y][x] = true;
                if(!checkEastWestCoordinate(x,y,maxx,maxy,board) || !checkNorthSouthCoordinate(x,y,maxx,maxy,board)) {
                    System.out.println("coordinate : (" + y + " , " + x + ") can be seen by a sentry");
                    return false;
                }
                return gotoCoordinate(x-1,y,maxx,maxy,board,been) ||
                        gotoCoordinate(x+1,y,maxx,maxy,board,been) ||
                        gotoCoordinate(x,y-1,maxx,maxy,board,been) ||
                        gotoCoordinate(x,y+1,maxx,maxy,board,been);
            }
        }
    }

    public boolean checkEastWestCoordinate(int x, int y, int maxx, int maxy, char[][] board) {
        int tempy = y-1;
        boolean can = true;
        while(tempy>0) {
            if(board[tempy][x] == '^') {
                System.out.println("sentry v can see : (" + y + " , " + x + ")");
                return false;
            }
            tempy--;
        }
        tempy = y+1;
        while(tempy<maxy) {
            if(board[tempy][x] == 'v') {
                System.out.println("sentry ^ can see : (" + y + " , " + x + ")");
                return false;
            }
            tempy++;
        }
        return true;
    }
    public boolean checkNorthSouthCoordinate(int x, int y, int maxx, int maxy, char[][] board) {
        int tempx = x-1;
        boolean can = true;
        while(tempx>0) {
            if(board[y][tempx] == '<') {
                System.out.println("sentry < can see : (" + y + " , " + x + ")");
                return false;
            }
            tempx--;
        }
        tempx = x+1;
        while(tempx<maxx) {
            if(board[y][tempx] == '>') {
                System.out.println("sentry > can see : (" + y + " , " + x + ")");
                return false;
            }
            tempx++;
        }
        return true;
    }
}
