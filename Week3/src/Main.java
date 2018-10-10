public class Main {

    public static void main(String[] args)  {
        String myString;
        int [] sScore1 ={40, 60, 50};

        Student stud1 = new Student("Charles Babbage", "1234cb", sScore1); // first object
        String  sName = "Augusta Ada", sID = "0123aa";
        int [] sScore2 ={70, 50, 50};

        Student stud2 = new Student(sName, sID, sScore2);  // second object
        stud1.printOut(); 			 // print out the object information
        stud2.printOut();
        int[] sScore3 = new int[3];

        for (int i=0; i<3; i++) { 	// assign random exam marks between 0 and 100
            sScore3[i]= (int)(Math.random()*100); //Mat.random() returns double between 0 and 1
        }

        Student stud3 = new Student("John Atanasoff", "9876ja", sScore3);  // third object
        stud3.printOut();

        Course cm = new Course("Computing", "CMP06");    // first instance of class Course
        cm.addStudent(stud1);	//add two students to this course
        cm.addStudent(stud2);

        double cmAverage = cm.averageSc();	//calculate the course average score
        int cmNumbers = cm.getNumStud();

        System.out.println("\ncourse name: "+ cm.getName());
        System.out.println("\t average = "+ cmAverage);
        System.out.println("\t stud number = "+ cmNumbers);

        for (int i=0; i<cmNumbers; i++)
            System.out.println("\t " + cm.list[i].getName());
        Course cs = new Course("Computer Science", "CS06");    // second instance of class Course

        cs.addStudent(stud3);				// add a student
        System.out.println("\n course name: "+ cs.getName());
        System.out.println("\t average =  = "+ cs.averageSc());
            System.out.print("\t stud number = "+ cs.getNumStud());

    }

}

