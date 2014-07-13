/*
This program is used as an example of classes and creation of objects
so you can control the game a little more.
I think this is what you are looking for as far as a game.
Let me know what you think.
Be sure to look at the Map and zombie attack classes first!!!!
 */

package zombieattack;

//Main Class

import java.util.Scanner;

public class ZombieAttack {

    //Main Method
    public static void main(String[] args) {
        
        //creates zombieChance object and sets the initial chance a + 0%
        AttackChance zombie = new AttackChance(0);
        
        //creates Map object and starts at 0,0 position
        Map map = new Map(0,0);
        
        //variable for user choices.
        String userAnswer="";
        
        //Scanner lets the user enter data. It is "scanning" for input.
        Scanner scanner = new Scanner(System.in);
        
        
        
        //Now we can start the game!!!

        
        //Loops the input until user enters 0
        //This reads:
        //loop while userAnswer does not equal "0"
        //  ! is does not
        while(!userAnswer.equals("0")) {
            
            //choice menu
            System.out.println("Move your character (up,left,right,down)");
            System.out.println("Type 0 to exit");
            System.out.println("");
            System.out.print("Choice: ");
        
            //gets the user choice
            userAnswer = scanner.nextLine();
            
            
            //if statements for different user choices
            if (userAnswer.equals("up")) {
                //goes "up" on the map
                map.goUp();
                
                //checks for zombies
                zombie.doZombiesAttack();
                
                //Shows new current position.
                System.out.println("Your current position is: (" + map.getX() + "," + map.getY() + ")");
                
            }
            
            if (userAnswer.equals("down")) {
                
                map.goDown();
                zombie.doZombiesAttack();
                System.out.println("Your current position is: (" + map.getX() + "," + map.getY() + ")");
                
            }
            
            if (userAnswer.equals("left")) {
                
                map.goLeft();
                zombie.doZombiesAttack();
                System.out.println("Your current position is: (" + map.getX() + "," + map.getY() + ")");
                
            }
            
            if (userAnswer.equals("right")) {
                
                map.goRight();
                zombie.doZombiesAttack();
                System.out.println("Your current position is: (" + map.getX() + "," + map.getY() + ")");
                
            }
            
            
            //Because we created a map and there is a position,
            //you can check areas on the map for special events.
            //If you go up twice (0,2) you will reach this special area.
            if (map.getX() == 0 && map.getY() == 2) {
                System.out.println("You win a million Dollars");
            }
            
            
            
            
        }
        
        
        
     
        
        
    }
    
}
