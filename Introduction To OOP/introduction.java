
public class introduction {
    static class Student{   //class is a blueprint of object
        String name;
        int roll;
        float marks;

        public Student() {
            //calling constructor inside a constructor
            this("Default",0,100.0f);
        }
       
        
        Student(String name ,int r ,float m){
            this.name = name;
            this.roll = r;
            this.marks = m; 
        }
        Student (Student other){
            this.name = other.name;
            this.roll = other.roll;
            this.marks = other.marks;
        }
    }
    public static void main(String[] args) {
        Student k = new Student(); //k is a object 
        k.name = "Kunal";
        k.roll = 12;
        k.marks = 90.5f;
        System.out.println("Name: "+k.name);
        System.out.println("Roll: "+k.roll);
        System.out.println("Marks: "+k.marks);
        Student s1 = new Student("Jadu ",20,83.4f);
        System.out.println("Name: "+s1.name);
        System.out.println("Roll: "+s1.roll);
        System.out.println("Marks: "+s1.marks);
        Student s2 = new Student(s1);
        System.out.println("Name: "+s2.name);
        System.out.println("Roll: "+s2.roll);
        System.out.println("Marks: "+s2.marks);
        Student s3 = new Student();
        System.out.println(s3.name);
        System.out.println(s3.roll);
        System.out.println(s3.marks);

    }
}
