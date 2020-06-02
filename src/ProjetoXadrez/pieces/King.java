
package ProjetoXadrez.pieces;

import BoardGame.Board;
import ProjetoXadrez.ChessPiece;
import ProjetoXadrez.Color;


public class King extends ChessPiece {
    
    public King(Color color, Board board) {
        super(color, board);
    }
    @Override
    
    public String toString(){
        return"K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
