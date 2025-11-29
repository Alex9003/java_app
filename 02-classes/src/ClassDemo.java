public class ClassDemo {
    public static void main(String[] args){
        System.out.println("==== Make object ====");

        int sc = Student.getStudentCount();
        System.out.println("Student count: " + sc);

        Student s1 = new Student();
        s1.nickName = "wrong name";
        s1.setName("Jon");
        s1.setAge((short)19);

        Student s2 = new Student();
        s2.setName("Alice");
        s2.setAge((short)17);

        s1.introduce();
        s2.introduce();

        String strNumber = "234";

        System.out.println("1 Age: " + s1.getAge());
        System.out.println("2 Name: " + s2.getName());

    }
}


class Student{
    private String name;
    private short age;
    
    private static int studentCount = 0;
    public String nickName;
    public Student(){
        studentCount++;
    }
    public Student(String name, short age){
        this.name=name;
        this.age = age;
        studentCount++;
    }
    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Invalid name");
        }
    }
    public String getName(){
        return this.name;
    }
    public void setAge(short age){
        if(age > 0){
            this.age = age;
        }
    }
    public short getAge(){
        return this.age;
    }
    public void introduce(){
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
    public static int getStudentCount(){
        return studentCount;
    }
}