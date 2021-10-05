package Sekcja16.Lesson.Lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Lambda {

    public static void main(String[] args) {

        Employee mark = new Employee("Mark Twain", 43);
        Employee kornel = new Employee("Kornel W",31);
        Employee jack = new Employee("Jack Daniels",21);
        Employee snow = new Employee("John Snow",65);
        Employee red = new Employee("Red mlem", 21);
        Employee blue = new Employee("Immma Blue", 32);

        List<Employee> employees = new ArrayList<>();
        employees.add(mark);
        employees.add(kornel);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(blue);

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        Random random1 = new Random();
        for (Employee employee : employees){
            if (random1.nextBoolean()){
                System.out.println("First Name: " + getAName(getFirstName, employee));
            } else {
                System.out.println("Last Name: " + getAName(getLastName, employee));
            }
        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(firstName);

        System.out.println(chainedFunction.apply(employees.get(0)));

        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return  name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName,employees.get(0)));

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello World");



        /*Collections.sort(employees, (employee1, employee2) ->
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

        printEmployeesByAge(employees,"Employees over 30: ", employee -> employee.getAge() > 40);
        printEmployeesByAge(employees,"\nEmployees 30 and under: ", employee -> employee.getAge() <=40);
        printEmployeesByAge(employees, "\nEmployees younger than 25", employee -> employee.getAge() <25);

        System.out.println("\n*******************************\n");

        IntPredicate greaterThan15 = i -> i >15;
        IntPredicate lessThan100 = i -> i < 100;

        System.out.println(greaterThan15.test(10));
        int a = 20;
        System.out.println(greaterThan15.test(a + 5));
        System.out.println(greaterThan15.and(lessThan100).test(50));
        System.out.println(greaterThan15.and(lessThan100).test(15));

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.print(randomSupplier.get() + ", ");
        }

        System.out.println("\n*******************************\n");

        employees.forEach(employee -> {
            String lastNAme = employee.getName().substring(employee.getName().indexOf(' ')+1);
            System.out.println("Last name is: " + lastNAme);
        });*/

    }

    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
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
    }
}
