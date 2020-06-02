
package ProjetoXadrez.pieces;

import BoardGame.Board;
import ProjetoXadrez.ChessPiece;
import ProjetoXadrez.Color;


public class Rook extends ChessPiece {
    
    public Rook(Color color, Board board) {
        super(color, board);
    }
     @Override
     public String toString(){
         return "R";
     }
         @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
