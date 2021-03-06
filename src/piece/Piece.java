package piece;

import java.awt.image.BufferedImage;
import piece.GamePiece.*;

/**
 * A abstract class for basic Piece
 * 
 * @see GamePiece
 * @see BufferedImage
 * @see ArrayList
 * @author SongJeongWoo
 * @since 2018-05-26
 */

public abstract class Piece {
  public abstract BufferedImage getSprite();
  public abstract PieceType getPieceType();
  public abstract Color getColor();
  public abstract boolean isAlive();
  public abstract Position getPosition();
  public abstract GamePiece move(Position goal);
  public abstract Position[] getCanMoves();
  public abstract Position[] getCanMovesForKing();
}
