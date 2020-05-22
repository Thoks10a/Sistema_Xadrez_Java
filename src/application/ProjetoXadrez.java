
package application;

import BoardGame.Board;
import ProjetoXadrez.ChessMatch;



public class ProjetoXadrez {


    public static void main(String[] args) {
        
       ChessMatch chessMatch = new ChessMatch();
       UI.printBoard(chessMatch.getPieces());
    }
    
}
