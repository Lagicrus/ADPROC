/*   Main.java   */ 

package student; 

/**  @author JordanoI

 */

public class Main { 

    /** Creates a new instance of Main */

    public Main() {

    }    

    /**   @param args the command line arguments       */

    public static void main(String[] args)  {

        String myString;

        int [] sScore1 ={40, 55, 30};

        // first object

        Student stud1 = new Student("Charles Babbage", "1234cb", sScore1);

        String sName = "Augusta Ada",  sID = "0123aa";

        int [] sScore2 ={88, 99, 85};

        // second object

        Student stud2 = new Student(sName, sID, sScore2);  

        stud1.printOut( );  // print out the objects information

        stud2.printOut( );

        int[] sScore3 = new int[3];

	// assign random exam marks between 0 and 100

        for (int i=0; i<3; i++) {

            sScore3[i]= (int)(Math.random()*100);  // Mat.random() returns double between 0 and 1

        }

	// third object

        Student stud3 = new Student("John Atanasoff", "9876ja", sScore3);        

        stud3.printOut();

        // find out the maximum average score

        double maxAveScore = stud1.avScore();  // assume the first one is with the max score

        int k=1;

        if (maxAveScore < stud2.avScore()) { // compare  the second’s score

            maxAveScore = stud2.avScore();

            k=2;

        }

        if (maxAveScore < stud3.avScore()) { // compare the third’s score

            maxAveScore = stud3.avScore();

            k=3;

        }

// this could be done much easier if an array (or an array list) of objects is used?!

        System.out.print("\n The best student: ");

        switch (k){		// ‘k’ shows who is the best student 

            case 1: stud1.printOut();

            break;

            case 2: stud2.printOut();

            break;

            case 3: stud3.printOut();

            break;

            default: break;

        }
        Course cm = new Course("Computing", "CMP06");    // first instance of class Course

        cm.add_student(stud1);	//add two students to this course

        cm.add_student(stud2);

        double cmAverage = cm.average_score();	//calculate the course average score

        int cmNumbers = cm.student_amount();

        System.out.println("\ncourse name: "+ cm.name());      

        System.out.println("\t average = "+ cmAverage);

        System.out.println("\t stud number = "+ cmNumbers);

//        for (int i=0; i<cmNumbers; i++)

  //          System.out.println("\t " + cm.student_list[i].getName());  

        Course cs = new Course("Computer Science", "CS06");    // second instance of class Course

        cs.add_student(stud3);				// add a student  

        System.out.println("\n course name: "+ cs.name());

        System.out.println("\t average =  = "+ cs.average_score());

        System.out.print("\t stud number = "+ cs.student_amount());   

    }

}