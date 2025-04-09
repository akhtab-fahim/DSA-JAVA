
public class Student implements Comparable<Student>{
    int roll;
    float marks;
    
    
    public Student(int r,float m){
        this.roll = r;
        this.marks = m;
    }
    public int compareTo(Student other){
        int diff = (int)(this.marks - other.marks);
        return diff>=0 ? 1 : -1;
    }
    public static void main(String[] args) {
        Student s1 = new Student(10, 88.5f);
        Student s2 = new Student(12, 97.5f);

        System.out.println(s1.compareTo(s2));
    }
}
