import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoAppGUI {
    private static List<Task> tasks = new ArrayList<>();
    private static int nextId = 1;

    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("ToDo App");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Task List
        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Input Panel
        JPanel inputPanel = new JPanel();
        JTextField taskField = new JTextField(20);
        JButton addButton = new JButton("Add");
        inputPanel.add(taskField);
        inputPanel.add(addButton);
        frame.add(inputPanel, BorderLayout.NORTH);

        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        JButton doneButton = new JButton("Mark Done");
        JButton deleteButton = new JButton("Delete");
        buttonPanel.add(doneButton);
        buttonPanel.add(deleteButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Add Task
        addButton.addActionListener(e -> {
            String desc = taskField.getText().trim();
            if (!desc.isEmpty()) {
                Task task = new Task(nextId++, desc);
                tasks.add(task);
                listModel.addElement(task.toString());
                taskField.setText("");
            }
        });

        // Mark Task as Done
        doneButton.addActionListener(e -> {
            int index = taskList.getSelectedIndex();
            if (index != -1) {
                Task task = tasks.get(index);
                task.markDone();
                listModel.set(index, task.toString());
            }
        });

        // Delete Task
        deleteButton.addActionListener(e -> {
            int index = taskList.getSelectedIndex();
            if (index != -1) {
                tasks.remove(index);
                listModel.remove(index);
            }
        });

        frame.setVisible(true);
    }
}

// Task Class
class Task {
    private int id;
    private String description;
    private boolean isDone;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.isDone = false;
    }

    public void markDone() {
        isDone = true;
    }

    public String toString() {
        return (isDone ? "[Done] " : "[Todo] ") + description;
    }
}