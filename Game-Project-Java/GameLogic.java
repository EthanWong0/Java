import java.awt.*;
import javax.swing.*;

public class GameLogic {    
  BackGround bk;// create Background object
  Bomb[] bombList = new Bomb[15];
  String text1 =""; 
	String text2 ="";
	String text3 ="";
	int score = 0; 
   int lives = 3;
  public GameLogic() {
    // instantiates bomb & background objects
    bk = new BackGround();

	//Creating bombList
	
	  for(int i=0; i < 15; i++){
        Bomb bomb = new Bomb(randInt(0,Game.width), 0,0,randInt(1,5));
        bombList[i] = bomb;
      }
  }
  
  public void gameLoop(){
    bk.drawBk();
	 for(int i=0; i < bombList.length; i++){        
		
		if(bombList[i].visible = true){
			bombList[i].move();
		}
		
		//incrementing score and resetting variables for bomb
		if(bombList[i].collidedWithMouse()){
		  score += 50;
		  bombList[i].visible = false;
		  bombList[i].y = 0;
		  bombList[i].x = randInt(0,Game.width);
		  bombList[i].dy = randInt(1,5);
		}else{
			bombList[i].visible = true;
		}
		//Subtracting lives if bomb reaches bottom of the screen and resetting variables
		if(bombList[i].y > Game.height){
		  lives -= 1;
		  bombList[i].x = randInt(0,Game.width);
		  bombList[i].dy = randInt(1,5);
      }     
	  //Displaying total score and lives in top left corner
	  text1 = "Score: " + score;
      Game.canvas.drawString(text1, 20, 20);
	  
	  text2 = "Lives: " + lives;
      Game.canvas.drawString(text2, 20, 30);
	  
	  //Ending game if lives are equal to 0
	  if(lives <= 0){
      text3 = "Game Over";
      Game.canvas.drawString(text3, Game.width/2, Game.height/2);
	  for(int x=0; x < bombList.length; x++){
		bombList[x].visible = false;
	  }
	  break;
	}
	 }
  }


  // random #
  int randInt(int lower, int upper){
    int range = upper - lower + 1;
    return (int)(Math.random()*range) + lower;
  }


}
