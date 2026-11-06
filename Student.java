import java.util.ArrayList;
public class Student{
    private static int id = 0;
    private int studentId;
    private String firstName;
    private String secondName;
    private String studentClass;
    private int age;
    public Student (String firstName , String secondName , String studentClass , int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.studentClass = studentClass;
        this.age = age;
        id = id + 1;
        this.studentId = id;
    }

    // getters 

    public int getId(){
        return this.studentId;
    }
    public int age(){
        return this.age;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getSecondName(){
        return this.secondName;
    }
    public String getStudentClass(){
        return this.studentClass;
    }

    // setters

    public void setAge(int ageNumber){
        this.age = ageNumber;
    }
    public void setFirstName(String firstNameText){
        this.firstName = firstNameText;
    }
    public void setSecondName(String secondNameText){
        this.secondName = secondNameText;
    }
    public void setClass(String classText){
        this.studentClass = classText;
    }

    // adding marks

    ArrayList<Double> mathMarks = new ArrayList<>();
    public void addMathMark(double mathMark){
        this.mathMarks.add(mathMark);
    }

    ArrayList<Double> physicsMarks = new ArrayList<>();
    public void addPhysicsMark(double physicsMark){
        this.physicsMarks.add(physicsMark);
    }

    ArrayList<Double> frenchMarks = new ArrayList<>();
    public void addFrenchMark(double frenchMark){
        this.frenchMarks.add(frenchMark);
    }

    ArrayList<Double> englishMarks = new ArrayList<>();
    public void addEnglishMark(double englishMark){
        this.englishMarks.add(englishMark);
    }

    // computing average

    public double mathAverage(){
        if (!mathMarks.isEmpty()){
            double average = 0;
            for (Double x:mathMarks){ 
                average = average + x;
            }
            average = average / mathMarks.size();
            return average;
        }
        return 0;
    }    

    public double physicsAverage(){
        if (!physicsMarks.isEmpty()){
            double average = 0;
            for (Double x:physicsMarks){ 
                average = average + x;
            }
            average = average / physicsMarks.size();
            return average;
        }
        return 0;
    }  

    public double frenchAverage(){
        if (!frenchMarks.isEmpty()){
            double average = 0;
            for (Double x:frenchMarks){ 
                average = average + x;
            }
            average = average / frenchMarks.size();
            return average;
        }
        return 0;
    }  

    public double englishAverage(){
        if (!englishMarks.isEmpty()){
            double average = 0;
            for (Double x:englishMarks){ 
                average = average + x;
            }
            average = average / englishMarks.size();
            return average;
        }
        return 0;
    }  

    // computing the whole average

    public double average(){
        if ((mathMarks.isEmpty())&&(englishMarks.isEmpty())&&(frenchMarks.isEmpty())&&(physicsMarks.isEmpty())){
            return -1;
        }
        if ((!mathMarks.isEmpty())&&(!englishMarks.isEmpty())&&(!frenchMarks.isEmpty())&&(!physicsMarks.isEmpty())){
            return (((englishAverage()) + (mathAverage()) + (physicsAverage()) + (frenchAverage())) / 4);
        }
        return -2;
    }

    // displaying the student

    public void display(){
        System.out.println("");
        System.out.println("| Student #"+studentId+": "+firstName+" "+secondName+", "+age+" years old, Class: "+studentClass);
        if (!mathMarks.isEmpty()){
            System.out.printf("Math : ");
            for (Double x:mathMarks){
                System.out.print(x+"    ");

            }
            System.out.print("-->   average : "+mathAverage());
        }
        if (!mathMarks.isEmpty()){
            System.out.printf("Math : ");
            for (Double x:mathMarks){
                System.out.print(x+"    ");

            }
            System.out.print("-->   average : "+mathAverage());
        }
        if (!mathMarks.isEmpty()){
            System.out.printf("Math : ");
            for (Double x:mathMarks){
                System.out.print(x+"    ");

            }
            System.out.print("-->   average : "+mathAverage());
        }
        if (!mathMarks.isEmpty()){
            System.out.printf("Math : ");
            for (Double x:mathMarks){
                System.out.print(x+"    ");

            }
            System.out.print("-->   average : "+mathAverage());
        }
        System.out.println("");
        if ((average() != -1) && (average() != -2)){
            System.out.println("average : "+average());
            if (average()>=10){
                System.out.println("status : passed");
            }
            else if ((average()<10) && (average()>=0)){
                System.out.println("status : not passed");
            }
        }
        else if (average() == -1){
            System.out.println("no marks yet");
        }
        else{
            System.out.println("some objects have no marks yet");
        }
        
        
    }

    // deleting marks


    public void deleteMathMark(double userMark){
        boolean found = false;
            int i =0;
            double mark;
            while ((i<mathMarks.size()) && (!found)){
                mark = (mathMarks.get(i));
                if (mark == userMark){
                    found = true;
                }
                i++;
            }
            i--;
            if (found){
                mathMarks.remove(i);
                System.out.println("==Mark deleted Succesfully==");
            }
            else{
                System.out.println("Mark not found");
            }
    }
    public void deletePhysicsMark(double userMark){
        boolean found = false;
            int i =0;
            double mark;
            while ((i<physicsMarks.size()) && (!found)){
                mark = (physicsMarks.get(i));
                if (mark == userMark){
                    found = true;
                }
                i++;
            }
            i--;
            if (found){
                physicsMarks.remove(i);
                System.out.println("==Mark deleted Succesfully==");
            }
            else{
                System.out.println("Mark not found");
            }
    }
    public void deleteFrenchMark(double userMark){
        boolean found = false;
            int i =0;
            double mark;
            while ((i<frenchMarks.size()) && (!found)){
                mark = (frenchMarks.get(i));
                if (mark == userMark){
                    found = true;
                }
                i++;
            }
            i--;
            if (found){
                frenchMarks.remove(i);
                System.out.println("==Mark deleted Succesfully==");
            }
            else{
                System.out.println("Mark not found");
            }
    }
    public void deleteEnglishMark(double userMark){
        boolean found = false;
            int i =0;
            double mark;
            while ((i<englishMarks.size()) && (!found)){
                mark = (englishMarks.get(i));
                if (mark == userMark){
                    found = true;
                }
                i++;
            }
            i--;
            if (found){
                englishMarks.remove(i);
                System.out.println("==Mark deleted Succesfully==");
            }
            else{
                System.out.println("Mark not found");
            }
    }

    // editing marks

    public void EditMathMark(double markToEdit , double newMark){
        boolean found = false;
            int i =0;
            double mark;
            while ((i<mathMarks.size()) && (!found)){
                mark = (mathMarks.get(i));
                if (mark == markToEdit){
                    found = true;
                }
                i++;
            }
            i--;
            if (found){
                mathMarks.set(i,newMark);
                System.out.println("==Mark Edited Succesfully==");
            }
            else{
                System.out.println("Mark not found");
            }
    }
    public void EditPhysicsMark(double markToEdit , double newMark){
        boolean found = false;
            int i =0;
            double mark;
            while ((i<physicsMarks.size()) && (!found)){
                mark = (physicsMarks.get(i));
                if (mark == markToEdit){
                    found = true;
                }
                i++;
            }
            i--;
            if (found){
                physicsMarks.set(i,newMark);
                System.out.println("==Mark Edited Succesfully==");
            }
            else{
                System.out.println("Mark not found");
            }
    }
    public void EditFrenchMark(double markToEdit , double newMark){
        boolean found = false;
            int i =0;
            double mark;
            while ((i<frenchMarks.size()) && (!found)){
                mark = (frenchMarks.get(i));
                if (mark == markToEdit){
                    found = true;
                }
                i++;
            }
            i--;
            if (found){
                frenchMarks.set(i,newMark);
                System.out.println("==Mark Edited Succesfully==");
            }
            else{
                System.out.println("Mark not found");
            }
    }
    public void EditEnglishMark(double markToEdit , double newMark){
        boolean found = false;
            int i =0;
            double mark;
            while ((i<englishMarks.size()) && (!found)){
                mark = (englishMarks.get(i));
                if (mark == markToEdit){
                    found = true;
                }
                i++;
            }
            i--;
            if (found){
                englishMarks.set(i,newMark);
                System.out.println("==Mark Edited Succesfully==");
            }
            else{
                System.out.println("Mark not found");
            }
    }
    
}