package org.teachingkidsprogramming.section03ifs;

import java.awt.Toolkit;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    //    Choose a random number between 1 and 100 --#4.1 (fake!) & --#13
    int answer = NumberUtils.getRandomInt(1, 100);
    //    Do the following 8 times --#9.1
        for (int i = 0; i < 8; i++){
    //         Ask the user for a guess --#1
          int guess = MessageBox.askForNumericalInput("Can you guess a number between 1 and 100?");
    //         If the guess is correct --#4
          if (guess < 1 || guess > 100){
            MessageBox.showMessage("You cheat me!");
            System.exit(0);
          }
          if (guess == answer){
    //               Play a bell --#2
            Toolkit.getDefaultToolkit().beep();
    //               Tell the user that they won the game  --#3
            MessageBox.showMessage("YOU WON!");
    //               and exit --#10
            System.exit(0);
          }
    //         Otherwise, if the guess is too high --#6
          else if(guess > answer){
    //               Tell the end user that it is too high --#5
            MessageBox.showMessage("Try a lower number");
          }
    //         Otherwise, if the guess is too low --#8
          else{
    //               Tell the end user that it is too low --#7
            MessageBox.showMessage("Try an higher number");
          }
    //    End Repeat --#9.2
        }
    //    After 8 incorrect guesses tell the user they've lost --#11
  }
}
