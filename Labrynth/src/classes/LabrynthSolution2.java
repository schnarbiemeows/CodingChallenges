package classes;

public class LabrynthSolution2 {
    public boolean solution(String[] B) {
        // write your code in Java SE 8
        boolean answer = false;
        int xmax = B[0].length()-1;
        int ymax = B.length-1;
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
                if (assin&&board[i][j]=='A') {
                    asx = j;
                    asy = i;
                    beento[i][j] = true;
                }
            }

        }
        if(!checkInitialCoordinate(xmax, ymax, xmax, ymax, board, beento)) {
            return false;
        }
        if(!checkInitialCoordinate(asx, asy, xmax, ymax, board, beento)) {
            return false;
        }
        answer = gotoCoordinate(asx, asy, xmax, ymax, board, beento);
        return answer;
    }
        public boolean checkInitialCoordinate(int x, int y, int maxx, int maxy, char[][] board, boolean[][] been) {
            return checkEastWestCoordinate(x,y,maxx,maxy,board)&&checkNorthSouthCoordinate(x,y,maxx,maxy,board);
        }
        /*
         "X.....>",
         "..v..X.",
         ".>..X..",
         "A......"
         */
        public boolean gotoCoordinate(int x, int y, int maxx, int maxy, char[][] board, boolean[][] been) {
            System.out.println("at coordinate : (" + y + " , " + x + ")");
            been[y][x] = true;
            boolean nowhereTogo = true;
            if(x==maxx&&y==maxy) {
                return true;
            }
            else {
                if(y<maxy) {
                    if(been[y+1][x]!=true&&checkNorthSouthCoordinate(x,y+1,maxx,maxy,board)) {
                        nowhereTogo	= false;
                         gotoCoordinate(x,y+1,maxx,maxy,board,been);
                    } else {
                        System.out.println("can't go there");
                    }
                }
                if(y>0) {
                    if(been[y-1][x]!=true&&checkNorthSouthCoordinate(x,y-1,maxx,maxy,board)) {
                        nowhereTogo	= false;
                        gotoCoordinate(x,y-1,maxx,maxy,board,been);
                    } else {
                        System.out.println("can't go there");
                    }
                }
                if(x<maxx) {
                    if(been[y][x+1]!=true&&checkEastWestCoordinate(x+1,y,maxx,maxy,board)) {
                        nowhereTogo	= false;
                        gotoCoordinate(x+1,y,maxx,maxy,board,been);
                    } else {
                        System.out.println("can't go there");
                    }
                }
                if(x>0) {
                    if(been[y][x-1]!=true&&checkEastWestCoordinate(x-1,y,maxx,maxy,board)) {
                        nowhereTogo	= false;
                        gotoCoordinate(x-1,y,maxx,maxy,board,been);
                    } else {
                        System.out.println("can't go there");
                    }
                }

            }
            return nowhereTogo;
        }
        /*
         "X.....>",
         "..v..X.",
         ".>..X..",
         "A......"
         */
        public boolean checkEastWestCoordinate(int x, int y, int maxx, int maxy, char[][] board) {
            System.out.println("checking coordinate : (" + y + " , " + x + ")");
            if(board[y][x]=='X'||board[y][x]=='v'||board[y][x]=='>'||board[y][x]=='<'||board[y][x]=='^') {
                System.out.println("something at coordinate : (" + y + " , " + x + ")");
                return false;
            }
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
        /*
         "X.....>",
         "..v..X.",
         ".>..X..",
         "A......"
         */
        public boolean checkNorthSouthCoordinate(int x, int y, int maxx, int maxy, char[][] board) {
            System.out.println("checking coordinate : (" + y + " , " + x + ")");
            if(board[y][x]=='X'||board[y][x]=='v'||board[y][x]=='>'||board[y][x]=='<'||board[y][x]=='^') {
                System.out.println("something at coordinate : (" + y + " , " + x + ")");
                return false;
            }
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
