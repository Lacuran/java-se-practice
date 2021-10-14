package HackerRank.Day12;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{

    private int[] testScores;

    public Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    public int[] getTestScores() {
        return testScores;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }

    public char calculate(int[] testScores){
        int sum = 0;
        int average = 0;
        for (int x : testScores) {
            sum += x;
        }
        average = sum/testScores.length;

        return average >= 90 && average <= 100 ? 'O'
                : average >= 80 && average < 90 ? 'E'
                : average >= 70 && average < 80 ? 'A'
                : average >= 55 && average < 70 ? 'P'
                : average >= 40 && average < 55 ? 'D'
                : 'T';


    }

    public static void main(String[] args) {

        int[] testScores = new int[] {40,30};
        Student student = new Student("Mlem", "Mlem",234523,testScores);

        System.out.println(student.calculate(testScores));
    }
}
