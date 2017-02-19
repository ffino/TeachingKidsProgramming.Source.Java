package org.teachingkidsprogramming.section03ifs;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up in a dream.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'wake up' or 'explore' the dream?");
    if ("wake up".equalsIgnoreCase(action))
    {
      //          wakeUp (recipe below) --#2.1
      tellMoreStory("You wake up and have a boring day. The end.");
      //          ------------- Recipe for wakeUp --#2.2
      //              Tell the user "You wake up and have a boring day. The end." --#1
      //          ------------- End of wakeUp recipe --#2.3
    }
    else if ("explore".equalsIgnoreCase(action))
    {
      //      approachOoze (recipe below) --#4.1
      //      ------------- Recipe for approachOoze --#4.2
      //         Tell the user "You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket." --#3
      tellMoreStory("You approach a glowing, green bucket of ooze. Worried that you will get in trouble, you pick up the bucket.");
      //         Ask the user "Do you want to pour the ooze into the 'backyard' or 'toilet'?" --#7
      String pourTo = askAQuestion("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
      //         If they answer "toilet" --#8.1
      if ("toilet".equalsIgnoreCase(pourTo))
      {
      //            pourIntoToilet (recipe below) --#12.1
      //            ------------- Recipe for pourIntoToilet --#12.2
      //               Tell the user "As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste." --#10
        tellMoreStory("As you pour the ooze into the toilet it backs up, gurgles, and explodes, covering you in radioactive waste.");
      //               Ask the user "Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?" --#11
        pourTo = askAQuestion("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
      //               If they answer "yes" --#13.1
        if ("yes".equalsIgnoreCase(pourTo))
        {
      //                    Tell the user "Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!" --#14
          tellMoreStory("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
        }
      //               Otherwise, if they answer "heck yes" --#13.2
        else if ("heck yes".equalsIgnoreCase(pourTo))
        {
      //                    Tell the user "Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!" --#15
          tellMoreStory("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
        }
      //               Otherwise, if they answer anything else --#13.3
        else
        {
      //                    endStory --#16
          endStory();
        }
      //            ------------- End of pourIntoToilet recipe --#12.3

      }
      //         Otherwise, if they answer "backyard" --#8.2
      else if ("backyard".equalsIgnoreCase(pourTo))
      { 
      //            pourIntoBackyard (recipe below) --#19.1
      //            ------------- Recipe for pourIntoBackyard --#19.2
      //                Tell the user "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water." --#17
        tellMoreStory("As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
      //                Ask the user "As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?" --#18
        action = askAQuestion("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
      //                If they answer "faint" --#20.1
            if ("faint".equalsIgnoreCase(action))
            {
      //                        Tell the user "You made a delicious soup! Yum! The end." --#21
              tellMoreStory("You made a delicious soup! Yum! The end.");
            }
      //                Otherwise, if they answer "scream" --#20.2
            else if ("scream".equalsIgnoreCase(action))
            {
      //                    startStory --#22
              startStory();
            }
      //                Otherwise, if they answer anything else --#20.3
            else
            {
      //                    endStory --#23
              endStory();
            }
      //         ------------- End of pourIntoBackyard recipe --#19.3
      }
      //         Otherwise, if they answer anything else --#8.3
      else
      {
      //            endStory --#9
        endStory();
      //      ------------- End of approachOoze recipe --#4.3
      }
    }
    else
    {
      //      endStory (recipe below) --#6.1
      endStory();
 
    }
  }
  private static void endStory()
  {
    //      ------------- Recipe for endStory --#6.2
    //         Tell the user "You don't know how to read directions. You can't play this game. The end." --#
    tellMoreStory("You don't know how to read directions. You can't play this game. The end.");
    //      ------------- End of endStory recipe --#6.3    
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Grays.Black;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
