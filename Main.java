package bink.main;

import javax.swing.JOptionPane;

public class Main {

    static TaskList obj = new TaskList();
    static int id = 1;

    public static void main(String[] args) {
        for (;;) {
            run();
        }
    }

    public static void run() {

        switch (Integer.parseInt(JOptionPane.showInputDialog("1.Add a new task\n2.Remove an existing task\n3.Edit a task\n4.Mark a task as completed\n5.list all tasks\n6.Sort tasks by date\n7.Exit"))) {
            case 1:
                Addtask();
                break;
            case 2:
                Remove();
                break;
            case 3:
                Edit();
                break;

            case 4:
                Mark_a_task_as_completed();
                break;
            case 5:
                obj.listTask();
                break;
            case 6:
                obj.sortTask();
                JOptionPane.showMessageDialog(null, "تم الترتيب بنجاح");

                break;
            case 7:
                JOptionPane.showMessageDialog(null, "اعداد الطالب محمد حمدي ابو سعادة\n\n\n\nتحت اشراف المعيد امير العرعير ", "خروج", -1);
                System.exit(0);
                break;
            default:

        }
    }

    public static void Addtask() {

        String description = JOptionPane.showInputDialog("Enter a description");
        int day = Integer.parseInt(JOptionPane.showInputDialog("Enter a day"));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter a month"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year"));
        Date date = new Date(day, month, year);
        Task task = new Task(id, description, date);
        obj.addTask(task);
        id++;

    }

    public static void Remove() {

        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter a id"));
        if (obj.removeTask(id)) {
            JOptionPane.showMessageDialog(null, "تم حدف المهمة بنجاح");
        } else {
            JOptionPane.showMessageDialog(null, "للاسف لا يتوفر مهمة بهدا ");
        }
    }

    public static void Mark_a_task_as_completed() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter a id"));
        if (obj.markTaskASCompleted(id)) {
            JOptionPane.showMessageDialog(null, "تم اكمال هده المهمة بنجاح");
        } else {
            JOptionPane.showMessageDialog(null, "لم يتم العثور علي هده المهمة ");
        }
    }

    public static void Edit() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter a id"));
        String description = JOptionPane.showInputDialog("Enter a description");
        int day = Integer.parseInt(JOptionPane.showInputDialog("Enter a day"));
        int month = Integer.parseInt(JOptionPane.showInputDialog("Enter a month"));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year"));
        Date date = new Date(day, month, year);

        if (obj.EditTask(id, description, date)) {
            JOptionPane.showMessageDialog(null, "تم التحديث بنجاح ");
        } else {
            JOptionPane.showMessageDialog(null, "ناسف لم يتم العثور على مهمة بهدا المعرف ");
        }

    }

}
