import processing.core.PApplet;
import java.lang.Math;

public class Sketch extends PApplet {

  /**
   * State global variables
   */
  public float circleX = 0;
  public float circleY;
  public float speedX = 1;
  public int r = 176;
  public int g = 165;
  public int b = 9;
  public int counter = 1;

  public void settings() {
    // put size call here
    size(400, 400);
  }

  public void setup() {
    // set initial background
    background(210, 255, 173);
  }

  public void draw() {
    // day cycle
    if (counter % 2 == 1){
      // clear frames
      background(20, 136, 199);

      //sunset
      if (circleX >= 200){
        g--;
        background(r, g, b);
      }

      //draw current frame based on state
      stroke(252, 186, 3);
      fill(252, 186, 3);
      ellipse(circleX, circleY, 50, 50);

      //grass
      stroke(23, 184, 2);
      fill(23, 184, 2);
      rect(0, 250, 400, 200);

      // modify state
      circleX = circleX +speedX;

      // Determine circleY variable
      float speedX2 = circleX - 100;
      double brackets = speedX2 - 100;
      double power = Math.pow(brackets, 2);
      double doubleSpeedY = 0.01 * power;
      circleY = (float)doubleSpeedY;

      if(circleY > height + 75){
        counter++;
        circleX = 0;
      }
    }

    else{
      r = 176;
      g = 165;
      b = 9;
      background (19, 20, 19);

      // draw current frame based on state
      stroke(199, 212, 199);
      fill(199, 212, 199);
      ellipse(circleX, circleY, 50, 50);

      //stars
      stroke(199, 212, 199);
      fill(199, 212, 199);
      ellipse(random(width), random(height), 2, 2);

      //grass 
      stroke(3, 61, 3);
      fill(3, 61, 3);
      rect(0, 250, 400, 200);      

      //modify state
      circleX = circleX + speedX;

      //determine circleY variable
      float speedX2 = circleX - 100;
      double brackets = speedX2 - 100;
      double power = Math.pow(brackets, 2);
      double doubleSpeedY = 0.01 * power;
      circleY = (float)doubleSpeedY;

      if (circleY > height +75){
        counter ++;
        circleX = 0;
      }

    }
  }
}