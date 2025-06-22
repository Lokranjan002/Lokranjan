package Module2;

class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}

public class EmployeeManagement {
    static Employee[] employees = new Employee[100];
    static int count = 0;

    public static void addEmployee(Employee e) {
        employees[count++] = e;
    }

    public static Employee searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) return employees[i];
        }
        return null;
    }

    public static void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].employeeId + " - " + employees[i].name);
        }
    }

    public static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                count--;
                break;
            }
        }
    }

    public static void main(String[] args) {
        addEmployee(new Employee(1, "Alice", "Manager", 50000));
        addEmployee(new Employee(2, "Bob", "Clerk", 25000));
        traverseEmployees();

        deleteEmployee(1);
        System.out.println("After Deletion:");
        traverseEmployees();
    }
}

