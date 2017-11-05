package org.teachingkidsprogramming.section04mastery;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise move as fast as possible --#3
    Tortoise.setSpeed(10);
    //    createColorPalette (recipe below) --#8.1
    createColorPalette();
    //    drawPentagon (recipe below) --#10.1
    drawPentagon();
  }
  private static void drawPentagon()
  {
    //    ------------- Recipe for drawPentagon --#10.2
    //    Do the following 200 times --#2.1
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      //
      //        The current length of a side is the same as the number of the side you are about to draw ( 1st side = 1 pixel, 2nd side = 2 pixels, etc) --#4.2
      //        Move the tortoise the length of a side --#4.1
      Tortoise.move(i);
      //        Turn the tortoise 1/5th of 360 degrees --#1
      Tortoise.turn(360.0 / 5);
      //        Turn the tortoise 1 more degree --#5
      Tortoise.turn(1);
      //    End Repeat --#2.2
    }
    //    ------------- End of drawPentagon recipe --#10.3
  }
  private static void adjustPen()
  {
    //        adjustPen (recipe below) --#9.1
    //
    //        ------------- Recipe for adjustPen --#9.2
    //        Change the pen color of the line the tortoise draws to the next color on the color wheel --#6
    Tortoise.setPenColor(ColorWheel.getNextColor());
    //        Increase the tortoises pen width by 1 --#15
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1.0);
    //        If the tortoise's pen width is greater than 4, then --#17
    if (Tortoise.getPenWidth() > 4)
    {
      //            Reset the pen width to 1 --#16
      Tortoise.setPenWidth(1);
    }
    //        ------------- End of adjustPen recipe --#9.3 
  }
  private static void createColorPalette()
  {
    //    ------------- Recipe for createColorPalette --#8.2
    //    Add steel blue to the color wheel --#7
    ColorWheel.addColor(PenColors.Blues.SteelBlue);
    //    Add dark orchid to the color wheel --#11
    ColorWheel.addColor(PenColors.Purples.DarkOrchid);
    //    Add dark slate blue to the color wheel --#12
    ColorWheel.addColor(PenColors.Blues.DarkSlateBlue);
    //    Add teal to the color wheel --#13
    ColorWheel.addColor(PenColors.Blues.Teal);
    //    Add indigo to the color wheel --#14
    ColorWheel.addColor(PenColors.Purples.Indigo);
    //    ------------- End of createColorPalette recipe --#8.3
    //
  }
}
