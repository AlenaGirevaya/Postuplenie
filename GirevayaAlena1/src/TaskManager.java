
public class TaskManager {
    private Task[] taskList;
    private int size;

    public TaskManager() {
        this.taskList = new Task[10];
        this.size = 0;
    }

    public void addTask(Task task) {
        if (size < taskList.length) {
            taskList[size] = task;
            size++;
        } else {
            System.out.println("Список задач заполнен. Не удается добавить больше задач.");
        }
    }

    public void removeTask(String taskName) {
        for (int i = 0; i < size; i++) {
            if (taskList[i].getName().equals(taskName)) {
                for (int j = i; j < size - 1; j++) {
                    taskList[j] = taskList[j + 1];
                }
                size--;
                break;
            }
        }
    }

    public void viewTasks() {
        for (int i = 0; i < size; i++) {
            System.out.println(taskList[i]);
        }
    }
}
