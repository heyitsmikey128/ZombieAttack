/*
This class is used to determine the chance of a zombie attack that increases
everytime the player moves. 
 */

package zombieattack;


public class AttackChance {
    
    //setting variables
    int attackChance;
    
    //default constuctor see map class for explanation
    AttackChance (int chance){
        attackChance = chance;
    }
    
    public int getChance(){
        return attackChance;
    }
    
    
    //tests whether or not zombies are attacking.
    //If zombies don't attack, 
    public void doZombiesAttack() {
        if ((Math.random()*10 + attackChance) > 9) {
            System.out.println("Oh no! Zombies!");
            attackChance = 0;
        }
        else {
            //adds 1 to attack chance. It is the same thing as attackChance = attackChance + 1
            attackChance++;
        }
    }
}

/*
Now we have a simple class than can track wether or not zombies have attack and 
increases the chance of attack everytime its used.
*/
