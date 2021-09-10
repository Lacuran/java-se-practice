package Sekcja5.Lesson;

public class theWhileandDoWhileStatemend68 {

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int count = 1;
        while (count != 6){
            System.out.println("Count value is" + count);
            count++;
        }
        count = 1;
        while(true){
            if (count == 5){
                break;
            }
            System.out.println("Count is value " + count);
            count++;
        }

        int number = 4;
        int finishNumber = 20;
        count = 0;
        int numberEvenCount = 0;
        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            numberEvenCount +=number;
            count++;
            if (count == 5){
                break;
            }
        }

        System.out.println(numberEvenCount);
        System.out.println("Number found " + count);
    }
}
