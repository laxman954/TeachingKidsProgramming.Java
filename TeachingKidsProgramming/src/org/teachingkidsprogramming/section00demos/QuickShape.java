package org.teachingkidsprogramming.section00demos;

import java.util.Random;

import org.teachingextensions.logo.Tortoise;

public class QuickShape
{
  public static void main(String[] args) throws Exception
  {
    //  Tip: Use the Tortoise to draw shapes!
    Tortoise.setX(150);
    //  Draw a red square that is 50 pixels per side with a line that's 2 pixels thick -- #1
    //
    Tortoise.setX(425);
    //  Draw a blue hexagon that is 65 pixels per side with a line that's 40 pixels thick -- #2
    //
    Tortoise.setX(250);
    Tortoise.setY(375);
    Random r = new Random();
    int sides = r.nextInt(10) + 1; //  use this to generate a random number of sides
    //  Draw a purple shape that is 50 pixel on each side with a line that's 10 pixels thick -- #3
    //
  }
}
