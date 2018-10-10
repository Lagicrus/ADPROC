/*
 * The MIT License
 *
 * Copyright 2018 samue.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package student;

/**
 *
 * @author UP857256
 */
public class Course {
    private final String name;
    private final Student[] student_list = new Student[10];
    private int total_count;
    private final String course_code;
    
    
    public Course (String course_name, String code){
        name = course_name;
        course_code = code;
    }
    
    public void add_student(Student student){
        student_list[total_count] = student;
        total_count += 1;
    }
    
    public double average_score(){
        double student_scores = 0;
        System.out.println(student_list[0]);
        
        for (Student student: student_list){
            System.out.println(student.avScore());
            student_scores += student.avScore();
        }
        
        return student_scores/student_list.length;
    }
    
    public int student_amount(){
        return total_count;
    }
    
    public String name(){
        return name;
    }
}
