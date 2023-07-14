package bink.main;

import javax.swing.JOptionPane;

public class TaskList {

    Task tasks[] = new Task[10];
    static int size = 0;

    public void addTask(Task task) {
        tasks[size] = task;
        size++;

    }

    public boolean removeTask(int id) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getId() == id) {
                for (int x = i; x < size - 1; x++) {
                    tasks[x].setDate(tasks[x + 1].getDate());
                    tasks[x].setDesciption(tasks[x + 1].getDesciption());

                }
                size--;

                return true;
            }

        }
        return false;

    }

    public boolean markTaskASCompleted(int id) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getId() == id) {
                tasks[i].setIsCompleted(true);
                return true;
            }

        }
        return false;

    }

    public void listTask() {
        String str = "********************************************************************************************************************************************************************************************************\n*** id     \t\t\t\t\t\t\t\t\t\t\t\t\t\t                                          descirption                          \t\t\t\t\t\t\t\t\t\t\t\t\t       day                                is completed ***\n";
        for (int i = 0; i < size; i++) {
            str = str + tasks[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, str);

    }

    public boolean EditTask(int id, String description, Date date) {
        boolean ch = false;
        for (int i = 0; i < size; i++) {
            if (tasks[i].getId() == id) {
                tasks[i].setDesciption(description);
                tasks[i].setDate(date);
                ch = true;
            }

        }
        return ch;

    }

    public void sortTask() {

        Task swap = new Task();
        for (int i = 0; i < size - 1; i++) {
            for (int x = i + 1; x < size; x++) {
                if (tasks[i].getDate().getYear() > tasks[x].getDate().getYear()) {

                    swap = tasks[i];
                    tasks[i] = tasks[x];
                    tasks[x] = swap;
                    int id = tasks[i].getId();
                    tasks[i].setId(tasks[x].getId());
                    tasks[x].setId(id);

                } else if (tasks[i].getDate().getMonth() > tasks[x].getDate().getMonth()) {

                    swap = tasks[i];
                    tasks[i] = tasks[x];
                    tasks[x] = swap;
                    int id = tasks[i].getId();
                    tasks[i].setId(tasks[x].getId());
                    tasks[x].setId(id);
                } else if (tasks[i].getDate().getDay() > tasks[x].getDate().getDay()) {

                    swap = tasks[i];
                    tasks[i] = tasks[x];
                    tasks[x] = swap;
                    int id = tasks[i].getId();
                    tasks[i].setId(tasks[x].getId());
                    tasks[x].setId(id);
                }

            }
        }

    }

}
