package Department;

public class Department {


    public static void main(String[] args) {

        Student student1 = new Student("David", 16, 'M', 101, "Economy");
        System.out.println(student1);
        student1.study();
        student1.think();
        student1.breath();
        student1.setProgram("Software Engineer");
        System.out.println(student1);

        // student1.setAge(26); if I assign any value upper than 25 the intellij gives me a complire message
        // "You're unable to get any programs from this department."
        System.out.println(student1);

        System.out.println("-------------------------------------------------------------------------------");

        Employee employee1 = new Employee("Jack", 16, 'M', "Tester", 155000, 10);
        System.out.println(employee1);

        // employee1.setAge(15);   if I assign any value less than 16 the intellij gives me a complire message
        // "You're unable to work at any company."

        employee1.work();
        employee1.think();
        employee1.breath();
        
        
        
        /* 
        
        Student{name='David', age=16, gender=M, studentId=101, program=Economy}
        David studies Economy.
        David is thinking.
        David takes a breath outside of the department.
        Student{name='David', age=16, gender=M, studentId=101, program=Software Engineer}
        Student{name='David', age=16, gender=M, studentId=101, program=Software Engineer}
        -------------------------------------------------------------------------------
        Employee{name='Jack', age=16, gender=M, jobTitle=Tester, salary= $155000.0, personalId=10}
        Tester Jack is working.
        Jack is thinking.
        Jack takes a deep breath outside of office. 

        Process finished with exit code 0
        
        */
        
      


    }


}






