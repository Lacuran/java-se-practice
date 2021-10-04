package Sekcja16.Lesson.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

    public static void main(String[] args) {

        Employee mark = new Employee("Mark Twain", 43);
        Employee kornel = new Employee("Kornel W",31);
        Employee jack = new Employee("Jack Daniels",21);
        Employee snow = new Employee("John Snow",65);
        Employee red = new Employee("Red mlem", 21);
        Employee blue = new Employee("Im Blue", 32);

        List<Employee> employees = new ArrayList<>();
        employees.add(mark);
        employees.add(kornel);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(blue);

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        System.out.println("\n*******************************\n");

        for (Employee employee : employees){
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        }

        System.out.println("\n*******************************\n");

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

        System.out.println("\n*******************************\n");

        printEmployeesByAge(employees,"Employees over 30: ", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees,"\nEmployees 30 and under: ", employee -> employee.getAge() <=30);


        /*for(Employee employee : employees){
            if (employee.getAge() > 30){
                System.out.println(employee.getName());
            }
        }*/

//        String sillyString = doStringStuff(new UpperContact() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },
//                employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        /*UpperContact uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);*/
    }

    public final static String doStringStuff(UpperContact uc, String s1, String s2){
        return uc.upperAndConcat(s1, s2);
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        for (Employee employee: employees) {
            if (ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperContact{
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething(){
        UpperContact uc = ((s1, s2) -> {
            System.out.println("The lambda expression's class is " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        });
        System.out.println("The AnotherClass class's name is " + getClass().getSimpleName());
        return Lambda.doStringStuff(uc,"String1","String2");

//        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
//        return Lambda.doStringStuff(new UpperContact() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class's name is:" + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");
    }
}
