import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    StudentsPanel studentsPanel;
    CoursePanel coursePanel;
    JTable enrolleesTable;
    EnrolledTableModel enrolledTableModel;
    JButton enrollButton;

    public MainFrame() {
        init();
    }

    private void init() {
//        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT))

        Container container = this.getContentPane();
        studentsPanel = new StudentsPanel();
        coursePanel = new CoursePanel();
        enrolledTableModel = new EnrolledTableModel();
        enrolleesTable = new JTable(enrolledTableModel);

        container.setLayout(new BorderLayout());
        container.add(studentsPanel, BorderLayout.WEST);
        container.add(coursePanel, BorderLayout.EAST);
        container.add(enrolleesTable, BorderLayout.SOUTH);


        setVisible(true);
        setTitle("wawewe");
        setTitle("GUI");
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
