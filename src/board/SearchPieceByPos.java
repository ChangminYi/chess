package board;

import piece.Bishop;
import piece.GamePiece;
import piece.King;
import piece.Knight;
import piece.Pawn;
import piece.Position;
import piece.Queen;
import piece.Rook;


public class SearchPieceByPos {
	static Pawn searchPawn(Position pos, ChessBoard board) {
	  for(int i = 0; i < 4; i++) {
	    for(int j = 0; j < 8; j++) {
	      if(board.pawn[i][j].getPosition().getX() == pos.getX() && board.pawn[i][j].getPosition().getY() == pos.getY()) {
	        //System.out.println("found pawn");
	        return board.pawn[i][j];
	      }
	    }
	  }
	  return null;
	}
	static Bishop searchBishop(Position pos, ChessBoard board) {
	  for(int i = 0; i < 4; i++) {
	    for(int j = 0; j < 2; j++) {
	      if(board.bishop[i][j].getPosition().getX() == pos.getX() && board.bishop[i][j].getPosition().getY() == pos.getY()) {
          //System.out.println("found bishop");
	        return board.bishop[i][j];
	      }
	    }
	  }
	  return null;
	}	
	static Knight searchKnight(Position pos, ChessBoard board) {
	  for(int i = 0; i < 4; i++) {
	    for(int j = 0; j < 2; j++) {
	      if(board.knight[i][j].getPosition().getX() == pos.getX() && board.knight[i][j].getPosition().getY() == pos.getY()) {
          //System.out.println("found knight");
	        return board.knight[i][j];
	      }
	    }
	  }
	  return null;
	}
	static Rook searchRook(Position pos, ChessBoard board) {
	  for(int i = 0; i < 4; i++) {
	    for(int j = 0; j < 2; j++) {
	      if(board.rook[i][j].getPosition().getX() == pos.getX() && board.rook[i][j].getPosition().getY() == pos.getY()) {
	        //System.out.println("found rook");
	        return board.rook[i][j];
	      }
	    }
	  }
	  return null;
	}	
	static Queen searchQueen(Position pos, ChessBoard board) {
	  for(int i = 0; i < 4; i++) {
	    if(board.queen[i].getPosition().getX() == pos.getX() && board.queen[i].getPosition().getY() == pos.getY()) {
        //System.out.println("found queen");
	      return board.queen[i];
	    }
	  }
	  return null;
	}
	static King searchKing(Position pos, ChessBoard board) {
	  for(int i = 0; i < 4; i++) {
	    if(board.king[i].getPosition().getX() == pos.getX() && board.king[i].getPosition().getY() == pos.getY()) {
        System.out.println("found king");
	      return board.king[i];
	    }
	  }
	  return null;
	}
	
	
	public static GamePiece searchPiece(Position pos, ChessBoard Board) {
	  if(Board.cBoard[pos.getX()][pos.getY()].isOnPiece()) {
	      
	    switch(Board.cBoard[pos.getX()][pos.getY()].getOccupyPiece()) {
	    case PAWN:
        System.out.println("found pawn");
	      return searchPawn(pos, Board);
      case BISHOP:
        System.out.println("found bishop");
	      return searchBishop(pos, Board);
	    case KNIGHT:
        System.out.println("found knight");
	      return searchKnight(pos, Board);
	    case ROOK:
        System.out.println("found rook");
	      return searchRook(pos, Board);
	    case QUEEN:
        System.out.println("found queen");
	      return searchQueen(pos, Board);
	    case KING:
        System.out.println("found king");
	      return searchKing(pos, Board);
	    default:
	      System.out.println("SearchPieceByPos.searchPiece() method error");
	    }
	  }
	  System.out.println("error");
	  return null;
	}
	

}