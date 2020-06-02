
package ProjetoXadrez;

import BoardGame.Board;
import BoardGame.Piece;


public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    
}
