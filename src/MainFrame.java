import javax.swing.*;

public class MainFrame extends JFrame {
    StudentsPanel studentsPanel;
    CoursePanel coursePanel;
    JTable enrolleesTable;
    EnrolledTableModel enrolledTableModel;
    JButton enrollButton;
    TestFrames testFrames;

    public MainFrame() {
        init();
    }

    private void init() {
//        this.add(studentsPanel = new StudentsPanel());
        coursePanel = new CoursePanel();
        enrolledTableModel = new EnrolledTableModel();
        enrolleesTable = new JTable(enrolledTableModel);
        this.add(testFrames = new TestFrames());




        setVisible(true);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
