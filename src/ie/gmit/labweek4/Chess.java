package ie.gmit.labweek4;

class Chess {
    public static void main(String[] args) {
    char[][] board = { {'a','b','c'},
                       {'a','b','c'},
                       {'a','b','c'} };
    
    char x = board[2][2];

    System.out.println(x);

    board[1][2] = 'd';
    System.out.println(board[1][2]);

    for (int i = 0; i < board.length; i++ ) {
        for(int j = 0; j < board[i].length; j++) {
            System.out.println(board[i][j]);
        }
    }
}
}