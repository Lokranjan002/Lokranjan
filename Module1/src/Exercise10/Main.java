package Exercise10;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Bob");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}

