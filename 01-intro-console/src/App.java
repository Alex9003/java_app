public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int age = 20;
        double height = 1.73;
        boolean isAvtive = true;
        char grade = 'A';
        String name = "Jon";
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if(isAvtive) {
            System.out.println("Умова виконана");
        } else {
            System.out.println("Помилка");
        }
        int score = 70;
        if(score >= 90) {
            System.out.println("Grade: A");
        } else if(score >= 80) {
            System.out.println("Grade: B");
        } else if(score >= 70) {
            System.out.println("Grade: C");
        } else if(score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
