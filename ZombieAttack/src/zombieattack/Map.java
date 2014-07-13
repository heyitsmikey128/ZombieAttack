/*
Used to control the map locations.
If/Then Statments can be created for specific locations.
 */

package zombieattack;

//Map Class Open
public class Map {
    
    //Varible Declarations. These are the variables that a map object will use.
    int x_position;
    int y_position;
    
    //Default construtor. This is the method you will use to create a map object. 
    //If you look at the main class you will see what I mean.
    Map(int x, int y) {
        //this sets the current position of the "player" to wherever you chose when you create the map
        x_position = x;
        y_position = y;
    }
    
    //Method that returns the current X position of the created object
    //this. means the actual object you a referencing. I can explain more later.
    public int getX(){
        return this.x_position;
    }
    
    //Method that returns the current Y position of the created object
    public int getY(){
        return this.y_position;
    }
    
    //this method goes "left" on the map by subtracting from the x position, just like a graph
    public void goLeft(){
        x_position = x_position - 1;
    }
    
    public void goRight(){
        x_position = x_position + 1;
    }
        
    public void goUp(){
        y_position = y_position + 1;
    }
            
    public void goDown(){
        y_position = y_position -1;
    }

}

//Now we have a class that can hold an adjust a position in a flat plane map. 
//Later we can add things happening in certain parts of the map.
//For now, it will be an empty map.
