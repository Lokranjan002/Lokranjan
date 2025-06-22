package Module2;

class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }
}

public class TaskManagement {
    Task head = null;

    public void addTask(Task newTask) {
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) current = current.next;
            current.next = newTask;
        }
    }

    public Task searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) return current;
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Task current = head;
        while (current != null) {
            System.out.println(current.taskId + ": " + current.taskName + " (" + current.status + ")");
            current = current.next;
        }
    }

    public void deleteTask(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Task current = head;
        while (current.next != null) {
            if (current.next.taskId == id) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        TaskManagement tm = new TaskManagement();
        tm.addTask(new Task(1, "Design UI", "Pending"));
        tm.addTask(new Task(2, "Develop Backend", "In Progress"));
        tm.traverseTasks();

        tm.deleteTask(1);
        System.out.println("After Deletion:");
        tm.traverseTasks();
    }
}
