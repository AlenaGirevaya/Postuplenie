import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" ");
            System.out.println("Меню:");
            System.out.println("1. Создать задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Посмотреть все задачи");
            System.out.println("4. Выход");
            System.out.println(" ");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Введите имя задачи ");
                    String name = scanner.nextLine();

                    System.out.print("Введите описание задачи ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(name, description);
                    taskManager.addTask(newTask);
                    break;

                case 2:
                    System.out.print("Введите имя задачи, которою вы хотите удалить ");
                    String removeTask = scanner.nextLine();
                    taskManager.removeTask(removeTask);
                    break;

                case 3:
                    System.out.println("Список задач:");
                    taskManager.viewTasks();
                    break;

                case 4:
                    break;
            }
        } while (choice != 4);
    }
}
