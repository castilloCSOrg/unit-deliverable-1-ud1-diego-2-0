/********************************************
*	AUTHORS: Diego Del Real
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	09/26/24
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
    static int defend = 5;
    static int playerHealth = 25;
    static int slimeHealth = 12;
    static int slimeAttack = 3;
  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
   

    /***** INITIALIZATION SECTION *****/
    

    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/
    System.out.println("            Combat Start!\nPlayer Health           Slime Health");
    System.out.printf("%7d %22d\n", playerHealth, slimeHealth);
    System.out.println("              Turn 1!");
    System.out.println("Player used Attack!");
    System.out.println("Slime's health is now " + Main.attackPlayed() + "!");
    System.out.println("Slime used Attack!");
    System.out.println("Player's Health is now " + Main.slimeAttackPlayed() + "!");


  }
  /***** STATIC METHODS *****/
  public static int attackPlayed()
  {
    return slimeHealth - attack;
  }
  public static int slimeAttackPlayed()
  {
    return playerHealth - slimeAttack;
  }
  
}
