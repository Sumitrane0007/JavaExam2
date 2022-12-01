public class Student implements Cloneable{
    //attribute of student class
    String name;
    int id;

    Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    void display()
    {
        System.out.println(name + id);
    }

    public static void main (String args[])
    throws CloneNotSupportedException
    {
        Student s1 = new Student("Ashish ", 121);    //create an instance of student
        //clone student s1 and assign to s2
        Student s2 = (Student)s1.clone();

        s1.display();
        s2.display();
    }
}
