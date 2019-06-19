/**
 * Represents a coin with two sides that can be flipped.
 */

public class Coin
{
   private final int HEADS = 0;
   private final int TAILS = 1;

   private int face;

   /**
   * sets up the coin by flipping it initially.
   */
   public Coin()
   {
      flip();
   }

   /**
    * Flips the coin by randomly choosing a face value.
    */
   public void flip()
   {
      face = (int) (Math.random() * 2);
   }

   /**
    * @return true if the current face of the coin is heads.
    */
   public boolean isHeads()
   {
      return(face == HEADS);
   }

   /**
    * @return the current face of the coin as a string.
    */
   public String toString()
   {
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
}
