import java.util.ArrayList; 
import java.util.Scanner;
import java.util.InputMismatchException;
public class StudentManagingApp {
    public static void main(String[] args){
        String firstName;
        String secondName;
        String studentClass;
        int age;
        int studentId = -1;
        Scanner scanner = new Scanner(System.in);
        ArrayList <Student> students = new ArrayList<>();
        System.out.println("----welcome to Student Managing App----");
        boolean quit = false;
        
        while (!quit){   
            System.out.println("| 1)Add student");
            System.out.println("| 2)View students list");
            System.out.println("| 3)Delete student");
            System.out.println("| 4)Edit student");
            System.out.println("| 5)Quit");
            System.out.print("pick a number : ");
            int choice = -5;
            
            while ((choice < 0) || (choice > 5)){
                while(true){
                    try{
                        
                        choice = scanner.nextInt();
                        break;
                    }
                    catch(InputMismatchException e){
                        System.out.println("Only integers accepted !");
                        System.out.print("pick a number: ");
                        scanner.nextLine();
                    }
                }
                if ((choice < 0)||(choice > 5)){
                    System.out.print("pick only (1/2/3/4/5): ");
                }
            }
            if (choice == 5){
                quit = true;
            }
            else if (choice == 1){
                scanner.nextLine();
                System.out.print("First name: ");
                firstName = scanner.nextLine();
                System.out.print("Second name: ");
                secondName = scanner.nextLine();
                System.out.print("Class: ");
                studentClass = scanner.nextLine();
                age = -1;
                while ((age <=0)){
                    while (true){
                        try{
                            System.out.print("Age: ");
                            age = scanner.nextInt();
                            break;
                        }
                        catch(InputMismatchException e){
                            System.out.println("Age must be integer !!");
                            scanner.nextLine();

                        }  
                    }
                    if (age <= 0){
                        System.out.println("Incorrect Age");
                    }
                }
                System.out.println("==Student Added Succesfully==");
                Student student = new Student(firstName,secondName,studentClass,age);
                students.add(student);
            }
            else if (choice == 2){
                if (students.isEmpty()){
                    System.out.println("no students available");
                }
                else{
                    for (Student student:students){
                        student.display();
                    }
                
                    System.out.print("would you like to add marks for a student from this list ?(1 for yes / 2 for no): ");
                    int markChoice = -1;
                    while ((markChoice != 1) && (markChoice != 2)){
                        while (true){
                            try{
                                markChoice = scanner.nextInt();
                                break;
                            }
                            catch(InputMismatchException e){
                                System.out.println("only integers accepted !");
                                scanner.nextLine();
                                System.out.print("would you like to add marks for a student from this list ?(1 for yes / 2 for no): ");
                            }
                        }
                        if ((markChoice != 1) && (markChoice != 2)){
                            System.out.print("you can only chooes 1 or 2: ");
                        }
                    }
                    if (markChoice == 1){
                        boolean found = false;
                        while (!found){
                            while (true){
                                System.out.print("enter the student id (Enter 0 to go back to menu): ");
                                try{
                                    studentId = scanner.nextInt();
                                    break;
                                }
                                catch(InputMismatchException e){
                                    System.out.println("ID is made of digits only");
                                    scanner.nextLine();
                                    System.out.print("enter the student id: ");
                                }
                            }
                            if (studentId == 0){
                                break;
                            }
                            int i =0;
                            int id;
                            while ((i<students.size()) && (!found)){
                                id = (students.get(i)).getId();
                                if (id == studentId){
                                    found = true;
                                }
                                i++;
                            }
                            i--;
                            if (found){
                                System.out.println("which subject you want to add a mark to");
                                System.out.println("| 1)Math");
                                System.out.println("| 2)Physics");
                                System.out.println("| 3)French");
                                System.out.println("| 4)English");
                                System.out.print("pick a number : ");
                                int subjectChoice = -5;

                                while ((subjectChoice < 0) || (subjectChoice > 4)){
                                    while(true){
                                        try{

                                            subjectChoice = scanner.nextInt();
                                            break;
                                        }
                                        catch(InputMismatchException e){
                                            System.out.println("Only integers accepted !");
                                            System.out.print("pick a number: ");
                                            scanner.nextLine();
                                        }
                                    }
                                    if ((subjectChoice < 0)||(subjectChoice > 4)){
                                        System.out.print("pick only (1/2/3/4): ");
                                    }
                                }
                                scanner.nextLine();
                                if (subjectChoice == 1){
                                    double mathMark = -1;
                                    System.out.print("enter the math mark: ");
                                    while ((mathMark < 0) || (mathMark >20)){
                                        while (true){
                                            try{
                                                mathMark = scanner.nextDouble();
                                                break;
                                            }
                                            catch(InputMismatchException e){
                                                System.out.println("Only numbers accepted");
                                                scanner.nextLine();
                                                System.out.print("enter the math mark: ");
                                            }
                                            
                                        }
                                        if ((mathMark < 0) || (mathMark > 20)){
                                            System.out.println("Mark must be between 0 and 20");
                                            System.out.print("enter the the math mark: ");
                                        }
                                    }
                                    System.out.println("==Mark Added Succesfully==");
                                    (students.get(i)).addMathMark(mathMark);
                                }   
                                if (subjectChoice == 2){
                                    double physicsMark = -1;
                                    System.out.print("enter the physics mark: ");
                                    while ((physicsMark < 0) || (physicsMark >20)){
                                        while (true){
                                            try{
                                                physicsMark = scanner.nextDouble();
                                                break;
                                            }
                                            catch(InputMismatchException e){
                                                System.out.println("Only numbers accepted");
                                                scanner.nextLine();
                                                System.out.print("enter the physics mark: ");
                                            }
                                        }
                                        if ((physicsMark < 0) || (physicsMark > 20)){
                                            System.out.println("Mark must be between 0 and 20");
                                            System.out.print("enter the the physics mark: ");
                                        }
                                    }
                                    System.out.println("==Mark Added Succesfully==");
                                    (students.get(i)).addPhysicsMark(physicsMark);
                                } 
                                if (subjectChoice == 3){
                                    double frenchMark = -1;
                                    System.out.print("enter the french mark: ");
                                    while ((frenchMark < 0) || (frenchMark >20)){
                                        while (true){
                                            try{
                                                frenchMark = scanner.nextDouble();
                                                break;
                                            }
                                            catch(InputMismatchException e){
                                                System.out.println("Only numbers accepted");
                                                scanner.nextLine();
                                                System.out.print("enter the french mark: ");
                                            }
                                        }
                                        if ((frenchMark < 0) || (frenchMark > 20)){
                                            System.out.println("Mark must be between 0 and 20");
                                            System.out.print("enter the the french mark: ");
                                        }
                                    }
                                    System.out.println("==Mark Added Succesfully==");
                                    (students.get(i)).addFrenchMark(frenchMark);
                                } 
                                if (subjectChoice == 4){
                                    double englishMark = -1;
                                    System.out.print("enter the english mark: ");
                                    while ((englishMark < 0) || (englishMark >20)){
                                        while (true){
                                            try{
                                                englishMark = scanner.nextDouble();
                                                break;
                                            }
                                            catch(InputMismatchException e){
                                                System.out.println("Only numbers accepted");
                                                scanner.nextLine();
                                                System.out.print("enter the english mark: ");
                                            }
                                        }
                                        if ((englishMark < 0) || (englishMark > 20)){
                                            System.out.println("Mark must be between 0 and 20");
                                            System.out.print("enter the the english mark: ");
                                        }
                                    }
                                    System.out.println("==Mark Added Succesfully==");
                                    (students.get(i)).addEnglishMark(englishMark);
                                } 
                            }
                            else{
                                System.out.println("no student available with this id");
                            }
                        }
                    }
                }
            }
            else if (choice == 3){
                if (students.isEmpty()){
                    System.out.println("no students available");
                }
                else{
                    System.out.println("Students List : ");
                    for (Student student:students){
                        student.display();
                    }
                    boolean found = false;
                    while (!found){
                        while (true){
                                System.out.print("enter the student id (Enter 0 to go back to menu): ");
                                try{
                                    studentId = scanner.nextInt();
                                    break;
                                }
                                catch(InputMismatchException e){
                                    System.out.println("ID is made of digits only");
                                    scanner.nextLine();
                                    System.out.print("enter the student id: ");
                                }
                            }
                            if (studentId == 0){
                                break;
                            }
                        int i =0;
                        int id;
                        while ((i<students.size()) && (!found)){
                            id = (students.get(i)).getId();
                            if (id == studentId){
                                found = true;
                            }
                            i++;
                        }
                        i--;
                        if (found){
                            students.remove(i);
                            System.out.println("==Student deleted succesfully Succesfully==");
                        }
                        else{
                            System.out.println("no student available with this id");
                        }
                    }
                }
            }
            else if (choice == 4){
                if (students.isEmpty()){
                    System.out.println("no students available");
                }
                else{
                    System.out.println("Students List : ");
                    for (Student student:students){
                        student.display();
                    }
                    boolean found = false;
                        while (!found){
                            while (true){
                                System.out.print("enter the student id (Enter 0 to go back to menu): ");
                                try{
                                    studentId = scanner.nextInt();
                                    break;
                                }
                                catch(InputMismatchException e){
                                    System.out.println("ID is made of digits only");
                                    scanner.nextLine();
                                    System.out.print("enter the student id: ");
                                }
                            }
                            if (studentId == 0){
                                break;
                            }
                            int i =0;
                            int id;
                            while ((i<students.size()) && (!found)){
                                id = (students.get(i)).getId();
                                if (id == studentId){
                                    found = true;
                                }
                                i++;
                            }
                            i--;
                            if (found){
                                System.out.println("| 1)Edit first name");
                                System.out.println("| 2)Edit second name");
                                System.out.println("| 3)Edit age");
                                System.out.println("| 4)Edit class");
                                System.out.println("| 5)Delete Marks");
                                System.out.println("| 6)Edit Marks");
                                System.out.print("pick a number : ");
                                int editChoice = -5;
                                while ((editChoice < 0) || (editChoice > 6)){
                                    while(true){
                                        try{
                                            editChoice = scanner.nextInt();
                                            break;
                                        }
                                        catch(InputMismatchException e){
                                            System.out.println("Only integers accepted !");
                                            System.out.print("pick a number: ");
                                            scanner.nextLine();
                                        }
                                    }
                                    if ((editChoice < 0)||(editChoice > 6)){
                                        System.out.print("pick only (1/2/3/4/5/6): ");
                                    }
                                }
                                scanner.nextLine();
                                if (editChoice == 1){
                                    System.out.print("Enter the new First name: ");
                                    firstName = scanner.nextLine();
                                    (students.get(i)).setFirstName(firstName);
                                    System.out.println("== First Name Edited Succesfully ==");
                                }
                                if (editChoice == 2){
                                    System.out.print("Enter the new Second name: ");
                                    secondName = scanner.nextLine();
                                    (students.get(i)).setSecondName(secondName);
                                    System.out.println("== Second Name Edited Succesfully ==");
                                }
                                if (editChoice == 4){
                                    System.out.print("Enter the new Class: ");
                                    studentClass = scanner.nextLine();
                                    (students.get(i)).setClass(studentClass);
                                    System.out.println("== Class Edited Succesfully ==");
                                }
                                if (editChoice == 3){
                                    age = -1;
                                    while ((age <=0)){
                                        while (true){
                                            try{
                                                System.out.print("Enter the new age: ");
                                                age = scanner.nextInt();
                                                break;
                                            }
                                            catch(InputMismatchException e){
                                                System.out.println("Age must be integer !!");
                                                scanner.nextLine();
                                            
                                            }  
                                        }
                                        if (age < 0){
                                            System.out.println("Incorrect Age");
                                        }
                                    }
                                }
                                else if (editChoice == 5){
                                    System.out.println("| 1)Delete a math mark");
                                    System.out.println("| 2)Delete a physics mark");
                                    System.out.println("| 3)Delete a french mark");
                                    System.out.println("| 4)Delete an english mark");
                                    System.out.print("pick a number : ");
                                    int deleteChoice = -5;
                                    while ((deleteChoice < 0) || (deleteChoice > 4)){
                                        while(true){
                                            try{
                                                deleteChoice = scanner.nextInt();
                                                break;
                                            }
                                            catch(InputMismatchException e){
                                                System.out.println("Only integers accepted !");
                                                System.out.print("pick a number: ");
                                                scanner.nextLine();
                                            }
                                        }
                                        if ((deleteChoice < 0)||(deleteChoice > 4)){
                                            System.out.print("pick only (1/2/3/4/5/6): ");
                                        }
                                    }
                                    scanner.nextLine();
                                    if (deleteChoice == 1){
                                        double mathMark = -1;
                                        System.out.print("enter the math mark you want to delete: ");
                                        while ((mathMark < 0) || (mathMark >20)){
                                            while (true){
                                                try{
                                                    mathMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the math mark you want to delete: ");
                                                }

                                            }
                                            if ((mathMark < 0) || (mathMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the math mark you want to delete: ");
                                            }
                                        }
                                        System.out.println("==Mark Deleted Succesfully==");
                                        (students.get(i)).deleteMathMark(mathMark);
                                    }
                                    if (deleteChoice == 2){
                                        double physicsMark = -1;
                                        System.out.print("enter the math mark you want to delete: ");
                                        while ((physicsMark < 0) || (physicsMark >20)){
                                            while (true){
                                                try{
                                                    physicsMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the math mark you want to delete: ");
                                                }

                                            }
                                            if ((physicsMark < 0) || (physicsMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the math mark you want to delete: ");
                                            }
                                        }
                                        System.out.println("==Mark Deleted Succesfully==");
                                        (students.get(i)).deletePhysicsMark(physicsMark);
                                    }
                                    if (deleteChoice == 3){
                                        double frenchMark = -1;
                                        System.out.print("enter the math mark you want to delete: ");
                                        while ((frenchMark < 0) || (frenchMark >20)){
                                            while (true){
                                                try{
                                                    frenchMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the math mark you want to delete: ");
                                                }

                                            }
                                            if ((frenchMark < 0) || (frenchMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the math mark you want to delete: ");
                                            }
                                        }
                                        System.out.println("==Mark Deleted Succesfully==");
                                        (students.get(i)).deleteFrenchMark(frenchMark);
                                    }
                                    if (deleteChoice == 4){
                                        double englishMark = -1;
                                        System.out.print("enter the math mark you want to delete: ");
                                        while ((englishMark < 0) || (englishMark >20)){
                                            while (true){
                                                try{
                                                    englishMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the math mark you want to delete: ");
                                                }

                                            }
                                            if ((englishMark < 0) || (englishMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the math mark you want to delete: ");
                                            }
                                        }
                                        System.out.println("==Mark Deleted Succesfully==");
                                        (students.get(i)).deleteEnglishMark(englishMark);
                                    }
                                }
                                else if (editChoice == 6){
                                    System.out.println("| 1)Edit a math mark");
                                    System.out.println("| 2)Edit a physics mark");
                                    System.out.println("| 3)Edit a french mark");
                                    System.out.println("| 4)Edit an english mark");
                                    System.out.print("pick a number : ");
                                    int editEditChoice = -5;
                                    while ((editEditChoice < 0) || (editEditChoice > 4)){
                                        while(true){
                                            try{
                                                editEditChoice = scanner.nextInt();
                                                break;
                                            }
                                            catch(InputMismatchException e){
                                                System.out.println("Only integers accepted !");
                                                System.out.print("pick a number: ");
                                                scanner.nextLine();
                                            }
                                        }
                                        if ((editEditChoice < 0)||(editEditChoice > 4)){
                                            System.out.print("pick only (1/2/3/4): ");
                                        }
                                    }
                                    scanner.nextLine();
                                    if (editEditChoice == 1){
                                        double mathMark = -1;
                                        System.out.print("enter the math mark you want to edit: ");
                                        while ((mathMark < 0) || (mathMark >20)){
                                            while (true){
                                                try{
                                                    mathMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the math mark: ");
                                                }

                                            }
                                            if ((mathMark < 0) || (mathMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the math mark: ");
                                            }
                                        }
                                        double mathNewMark = -1;
                                        System.out.print("enter the math mark you want to set: ");
                                        while ((mathNewMark < 0) || (mathNewMark >20)){
                                            while (true){
                                                try{
                                                    mathNewMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the math mark: ");
                                                }

                                            }
                                            if ((mathNewMark < 0) || (mathNewMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the math mark: ");
                                            }
                                        }
                                        (students.get(i)).EditMathMark(mathMark, mathNewMark);
                                    }
                                    if (editEditChoice == 2){
                                        double physicsMark = -1;
                                        System.out.print("enter the physics mark you want to edit: ");
                                        while ((physicsMark < 0) || (physicsMark >20)){
                                            while (true){
                                                try{
                                                    physicsMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the physics mark: ");
                                                }

                                            }
                                            if ((physicsMark < 0) || (physicsMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the physics mark: ");
                                            }
                                        }
                                        double physicsNewMark = -1;
                                        System.out.print("enter the physics mark you want to set: ");
                                        while ((physicsNewMark < 0) || (physicsNewMark >20)){
                                            while (true){
                                                try{
                                                    physicsNewMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the physics mark: ");
                                                }

                                            }
                                            if ((physicsNewMark < 0) || (physicsNewMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the physics mark: ");
                                            }
                                        }
                                        (students.get(i)).EditPhysicsMark(physicsMark, physicsNewMark);
                                    }
                                    if (editEditChoice == 3){
                                        double frenchMark = -1;
                                        System.out.print("enter the french mark you want to edit: ");
                                        while ((frenchMark < 0) || (frenchMark >20)){
                                            while (true){
                                                try{
                                                    frenchMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the french mark: ");
                                                }

                                            }
                                            if ((frenchMark < 0) || (frenchMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the french mark: ");
                                            }
                                        }
                                        double frenchNewMark = -1;
                                        System.out.print("enter the french mark you want to set: ");
                                        while ((frenchNewMark < 0) || (frenchNewMark >20)){
                                            while (true){
                                                try{
                                                    frenchNewMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the french mark: ");
                                                }

                                            }
                                            if ((frenchNewMark < 0) || (frenchNewMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the math mark: ");
                                            }
                                        }
                                        (students.get(i)).EditFrenchMark(frenchMark, frenchNewMark);
                                    }
                                    if (editEditChoice == 4){
                                        double englishMark = -1;
                                        System.out.print("enter the english mark you want to edit: ");
                                        while ((englishMark < 0) || (englishMark >20)){
                                            while (true){
                                                try{
                                                    englishMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the english mark: ");
                                                }

                                            }
                                            if ((englishMark < 0) || (englishMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the math mark: ");
                                            }
                                        }
                                        double englishNewMark = -1;
                                        System.out.print("enter the math mark you want to set: ");
                                        while ((englishNewMark < 0) || (englishNewMark >20)){
                                            while (true){
                                                try{
                                                    englishNewMark = scanner.nextDouble();
                                                    break;
                                                }
                                                catch(InputMismatchException e){
                                                    System.out.println("Only numbers accepted");
                                                    scanner.nextLine();
                                                    System.out.print("enter the english mark: ");
                                                }

                                            }
                                            if ((englishNewMark < 0) || (englishNewMark > 20)){
                                                System.out.println("Mark must be between 0 and 20");
                                                System.out.print("enter the the english mark: ");
                                            }
                                        }
                                        (students.get(i)).EditEnglishMark(englishMark, englishNewMark);
                                    }
                                }
                            }
                            else{
                                System.out.println("no student available with this id");
                            } 
                    }
                }
            }
        }
        scanner.close();
        
    }
}
