package org.teachingkidsprogramming.section06modelviewcontroller;

import java.awt.Color;
import java.awt.Cursor;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.teachingextensions.logo.Tortoise;

//  This deepdive is in progress!
//@Ignore
public class DeepDive06ModelViewController
{
  //  How to do deep dive:
  //  Step 1: Select the method name (doesABear on line 20) Press the Run Button
  //            PC: Ctrl+F11 
  //            Mac: Command+fn+F11
  //  Step 2: Read the name of the method that failed
  //  Step 3: Fill in the blank (___) to make it pass
  //  Step 4: Consider at least one thing you just learned
  //  Step 5: Advance to the next method
  //  Do not change anything except the blank (___)
  //
  @Test
  public void stringsCanBeArrays() throws Exception
  {
    String[] words = {"happy ", ___};
    Assert.assertEquals("happy baby", words);
  }
  @Test
  public void numbersCanBeStrings() throws Exception
  {
    int numberOfBabies = ____;
    String words = "" + numberOfBabies + " happy babies";
    Assert.assertEquals("10 happy babies", words);
  }
  @Test
  public void trashtalkingFlorida() throws Exception
  {
    String compareThis = "is to";
    String analogy = "Florida " + ___ + " America as appendix " + ___ + " body";
    Assert.assertEquals("Florida is to America as appendix is to body", analogy);
  }
  @Test
  public void sardinesFlyCoach() throws Exception
  {
    String fishReference = "The sardines were";
    String airplaneStress = "the coach section of a 747.";
    String analogy = fishReference + " packed as tight as " + airplaneStress;
    Assert.assertEquals("The sardines were packed as tight as the coach section of a 747.", ___);
  }
  @Test
  public void sanityProblems() throws Exception
  {
    String selfDeprecation = "The nerds who made this were";
    String anAppleADay = "the doctors who complimented their mental stability.";
    String analogy = selfDeprecation + " as sarcastic as " + anAppleADay;
    Assert.assertEquals(___, analogy);
  }
  @Test
  public void skydivingFrenchKings() throws Exception
  {
    String compareThis = ___;
    String analogy = "Skydiving " + compareThis + " sensible as Louis XVI " + compareThis + " leadership";
    Assert.assertEquals("Skydiving is to sensible as Louis XVI is to leadership", analogy);
  }
  @Test
  public void infiniteB() throws Exception
  {
    String infinite = "B";
    String analogy = "The " + ___ + " in " + ___ + "eno�t " + ___ + ". Mandelbrot stands for " + ___ + "eno�t "
        + ___ + ". Mandelbrot.";
    Assert.assertEquals("The B in Beno�t B. Mandelbrot stands for Beno�t B. Mandelbrot.", analogy);
  }
  @Test
  public void expectTheResult() throws Exception
  {
    numbers.put(12, "dozen");
    numbers.put(144, "gross");
    numbers.put(20, "score");
    String aSomething = "A " + numbers.get(12) + ", a " + numbers.get(144) + ", and a " + numbers.get(20);
    String aCalculation = aSomething
        + " plus three times the square root of four, divided by seven, plus five times eleven";
    String aResult = aCalculation + " is nine squared and not a bit more";
    Assert.assertEquals("A dozen, a gross, and a score plus three times the square root of four,"
        + " divided by seven, plus five times eleven is nine squared and not a bit more", ___);
  }
  @Test
  public void lookUp() throws Exception
  {
    //    (12 + 144 + 20 + 3 x 4^1/2) / 7  +  5 x 11  =  9� + 0
    numbers.put(12, "dozen");
    numbers.put(144, "gross");
    numbers.put(20, "score");
    String aSomething = "A " + numbers.get(____) + ", a " + numbers.get(____) + ", and a " + numbers.get(____);
    String aCalculation = aSomething
        + " plus three times the square root of four, divided by seven, plus five times eleven";
    String aResult = aCalculation + " is nine squared and not a bit more";
    Assert.assertEquals("A dozen, a gross, and a score plus three times the square root of four,"
        + " divided by seven, plus five times eleven is nine squared and not a bit more", aResult);
  }
  @Test
  public void inYourOwnWords() throws Exception
  {
    numbers.put(12, ___);
    numbers.put(144, ___);
    numbers.put(20, ___);
    String aSomething = "A " + numbers.get(12) + ", a " + numbers.get(144) + ", and a " + numbers.get(20);
    String aCalculation = aSomething
        + " plus three times the square root of four, divided by seven, plus five times eleven";
    String aResult = aCalculation + " is nine squared and not a bit more";
    Assert.assertEquals("A dozen, a gross, and a score plus three times the square root of four,"
        + " divided by seven, plus five times eleven is nine squared and not a bit more", aResult);
  }
  /**
   * Ignore the following, It's needed to run the homework
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   */
  public boolean                  _____   = false;
  public boolean                  ______  = true;
  public String                   ___     = "You need to fill in the blank ___";
  public HashMap<Integer, String> numbers = new HashMap<Integer, String>();
  public int                      ____    = 0;
  public Color                    _______;
  public String ___()
  {
    return ___;
  }
  private Cursor getCursor()
  {
    Cursor cursor = Tortoise.getBackgroundWindow().getCursor();
    return cursor;
  }
}