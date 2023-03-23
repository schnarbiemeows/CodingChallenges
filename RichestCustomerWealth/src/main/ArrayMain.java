package main;

public class ArrayMain {

    /**
     * so below is an int[2][3][4]
     * rows(Y axis) = 2
     * columns[x axis] = 3
     * depth(z axis) = 4
     * so int[][] = the last 2, so int[3][4] on line 38
     * @param args
     */
    public static void main(String[] args) {
        int[][][] threeDarray = {
                    {
                            {
                                1,2,3,4
                            },
                            {
                                5,6,7,8
                            },
                            {
                                9,10,11,12
                            }
                    },
                    {
                            {
                                13,14,15,16
                            },
                            {
                                17,18,19,20
                            },
                            {
                                21,22,23,24
                            }
                    }
                };
        for(int[][] row : threeDarray) {
            System.out.println(row);
            for(int[] columns : row) {
                System.out.println(columns);
                for(int depth : columns) {
                    System.out.println(depth);
                }
            }
        }
    }
}
