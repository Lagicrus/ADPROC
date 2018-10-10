public class Student {
    private String name;
    private String id;
    private int [] score = new int[3];


    public Student() {      }

    // Constructor, initialises the class instance variables and performs validity check

    public Student( String stName, String stID, int stScore[]) {
        name = stName;
        id = stID;
        score = stScore;
    }

    public void setName( String new_name) {
        name = new_name;
    }

    public void setID( String student_ID) {
        id = student_ID;
    }

    public void setScore( int student_Sc[]) {
        for (int i=0; i<3; i++)
            score[i]=student_Sc[i];
    }

    public String  getName()  {
        return name;
    }

    public String getID()  {
        return id;
    }

    public int[] getScore() {
        return score;
    }


    public double avScore() {
        double total=0.0;
        for (int i=0; i<score.length; i++)

            total += score[i];

        return (total/score.length);

    }

    public void printOut() {
        System.out.println("\n Student attributes: ");
        System.out.println("\t name : "+name+ "\n\t id : " + id);

        for (int i=0; i< score.length; i++)
            System.out.print("\tscore ["+ i+"] = "+score[i]);
        System.out.println("\n\t average score = "+avScore());

    }

}

