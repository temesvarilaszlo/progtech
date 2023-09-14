package student;

import java.util.*;
import console.Console;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        
        String s = Console.readLine("Type 1 to add another, type anything else to stop: ");
        System.out.println(s);
        while (s == "1")
        {
            String name = Console.readLine("Name: ");
            String nationality = Console.readLine("Nationality: ");
            double average = Double.parseDouble(Console.readLine("Average: "));
            
            Student student = new Student(name, nationality, average);
            students.add(student);
            
            s = Console.readLine("Type 1 to add another, type anything else to stop: ");
        }
        for (Student stu : students)
        {
            System.out.println(stu);
        }
        
        Student min = students.stream().min((a,b) -> Double.compare(a.getAverage(), b.getAverage())).get();
        System.out.println(min);
        
        List<Student> students1 = students.stream().filter(e -> e.getAverage() >= 4.0).collect(Collectors.toList());
    }
    
}
