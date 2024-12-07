/********************************************
*	AUTHORS: Diego Del Real
* COLLABORATORS: Keith Arcega
*	LAST MODIFIED:	11/24/24
********************************************/

/********************************************
*	<Slay The Spire Damage Calculations>
*********************************************
*	PROGRAM DESCRIPTION:
*	Example of a battle between a monster and the player with how much damage is dealt to a monster when an attack card is played and how much block is gained when playing a block card.
*********************************************
*	ALGORITHM:
*	<WHILE playerHealth > 0 AND slimeHealth > 0 DO
    PRINT "Combat Start!" and player & slime health labels
    PRINT playerHealth and slimeHealth formatted below health labels
    INCREASE turnCount by 1
    PRINT "Turn [turnCount]!"
    
    PRINT playerName + " used Attack!"
    CALL Main.attackPlayed() to execute player's attack and PRINT updated slime health
    
    PRINT "Slime used Attack!"
    CALL Main.slimeAttackPlayed() to execute slime's attack and PRINT updated player health
END WHILE

IF playerHealth > 0 THEN
    PRINT playerName + " wins!"
ELSE
    PRINT "Slime wins!"
END IF>
*********************************************
*	STATIC METHODS:
* public static double attackPlayed()
* public static double slimeAttackPlayed()
*********************************************/


public class Main 
{
  /***** CONSTANT SECTION *****/
  
    static String playerName = "Ironclad";
    static int attack = 6;
    static double playerHealth = 25;
    static double slimeHealth = 12;
    static double slimeAttack = 3.5;
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
      System.out.println("            Combat Start!\n" + playerName + " Health           Slime Health");
      System.out.printf("%7.1f %22.1f\n", playerHealth, slimeHealth);
      System.out.println("              Turn " + ++turnCount + "!");
      System.out.println(playerName + " used Attack!");
      System.out.println("Slime's health is now " + Main.attackPlayed() + "!");
      System.out.println("Slime used Attack!");
      System.out.println(playerName + "'s Health is now " + Main.slimeAttackPlayed() + "!");
    }
    if(playerHealth > 0)
      System.out.println("\n            " + playerName + " wins!");
    else
      System.out.println("\n            Slime wins!");
 
  }
  /***** STATIC METHODS *****/
  public static double attackPlayed()
  {
    slimeHealth -= attack;
    return slimeHealth;
  }
  public static double slimeAttackPlayed()
  {
    playerHealth -= slimeAttack;
    return playerHealth;
  }
  
}
