/********************************************
*	AUTHORS: Diego Del Real
* COLLABORATORS: Keith Arcega
*	LAST MODIFIED:	10/18/24
********************************************/

/********************************************
*	<Slay The Spire Damage & Block Calculations>
*********************************************
*	PROGRAM DESCRIPTION:
*	Example of a battle between a monster and the player with how much damage is dealt to a monster when an attack card is played and how much block is gained when playing a block card.
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <list of static methods and which teammate made each>
*********************************************/


public class Main 
{
  /***** CONSTANT SECTION *****/
  
    static int attack = 6;
    static int playerHealth = 25;
    static int slimeHealth = 12;
    static int slimeAttack = 3;
    static int turnCount = 0;
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
   

    /***** INITIALIZATION SECTION *****/
    

    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/
    while(playerHealth > 0 && slimeHealth > 0)
    {
      System.out.println("            Combat Start!\nPlayer Health           Slime Health");
      System.out.printf("%7d %22d\n", playerHealth, slimeHealth);
      System.out.println("              Turn " + ++turnCount + "!");
      System.out.println("Player used Attack!");
      System.out.println("Slime's health is now " + Main.attackPlayed() + "!");
      System.out.println("Slime used Attack!");
      System.out.println("Player's Health is now " + Main.slimeAttackPlayed() + "!");
    }
    if(playerHealth > 0)
      System.out.println("\n            Player wins!");
    else
      System.out.println("\n            Slime wins!");
 
  }
  /***** STATIC METHODS *****/
  public static int attackPlayed()
  {
    slimeHealth -= attack;
    return slimeHealth;
  }
  public static int slimeAttackPlayed()
  {
    playerHealth -= slimeAttack;
    return playerHealth;
  }
  
}
