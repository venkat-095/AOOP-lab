package todo;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.addTask("Buy groceries");
        toDoList.addTask("Finish homework");
        toDoList.addTask("Clean the house");
        toDoList.displayTasks();
        toDoList.updateTask(1, "Complete homework");
        toDoList.removeTask(0);
        toDoList.displayTasks();
    }
}
