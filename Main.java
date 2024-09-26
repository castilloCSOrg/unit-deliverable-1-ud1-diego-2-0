/********************************************
*	AUTHORS: Diego Del Real
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	09/26/24
********************************************/

/********************************************
*	<Slay The Spire Damage & Block Calculations>
*********************************************
*	PROGRAM DESCRIPTION:
*	Program to calculate how much damage is dealt to a monster when an attack card is played and how much block is gained when playing a block card.
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

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    int attack, defend, playerHealth, playerTotalHP, slimeHealth, slimeAttack;

    /***** INITIALIZATION SECTION *****/
    attack = 6;
    defend = 5;
    playerHealth = 25;
    slimeHealth = 12;
    slimeAttack = 3;

    /***** INTRO SECTION *****/

    /***** PROCESSING SECTION *****/

    /***** OUTPUT SECTION *****/
    System.out.println("            Combat Start!\nPlayer Health           Slime Health");
    System.out.printf("%7d %22d\n", playerHealth, slimeHealth);
  }
  /***** STATIC METHODS *****/
  public static void attackPlayed()
  {

  }
  
}
