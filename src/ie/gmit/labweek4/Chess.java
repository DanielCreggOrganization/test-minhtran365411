package ie.gmit.labweek4;

class Chess {
    public static void main(String[] args) {
    int[][] board = new int[8][8]; 

    // 1 is black tile, 2 is white tile
    for (int i = 0; i < board.length; i++ ) {
        if ((i%2) == 0 ) {
            for(int j = 0; j < board[i].length; j++) {
                if ((j%2) == 0 ) {
                    board[i][j] = 1;
                }  else {
                    board[i][j] = 2;
                }
            }
        } else {
            for(int j = 0; j < board[i].length; j++) {
                if ((j%2) == 0 ) {
                    board[i][j] = 2;
                }  else {
                    board[i][j] = 1;
                }
            }
        }
       
    }

    for (int i = 0; i < board.length; i++ ) {
        for(int j = 0; j < board[i].length; j++) {
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
    }
    
}
}