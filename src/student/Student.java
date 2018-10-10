/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Arrays;

/**
 *
 * @author UP857256
 */

public class Student {

  private String name, id;
  private int [] score = new int[3];

  public Student( String stName, String stID, int stScore[]) {
    name = stName;
    id = stID;
    score = stScore;
  }

   public void setName( String nameIn) {
       name = nameIn;
   }

   public String  getName ( ) {
       return name;
  }


  // Calculates the average score

    public double avScore( ) { 
        double sum = 0;
        for (int i = 0; i < score.length; i++){
            sum += score[i];
        }
        return sum/score.length;
    }



// Displays the student data attributes

    public void printOut( )
    { 
        String newline;
        newline = System.getProperty("line.separator");
        String output = "Name: %s".format(name)
        + newline
        + "ID: %s".format(id)
        + newline
        + "Average Score: %s".format("%.2f", avScore());
        System.out.println(output);

    }
}