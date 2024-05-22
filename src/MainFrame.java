import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    StudentsPanel studentsPanel;
    CoursePanel coursePanel;
    JTable enrolleesTable;
    EnrolledTableModel enrolledTableModel;

    TestFrames testFrames;
    public MainFrame() {
        init();
    }

    private void init() {

        Container container = this.getContentPane();
        studentsPanel = new StudentsPanel();
        coursePanel = new CoursePanel();
        enrolledTableModel = new EnrolledTableModel();
        enrolleesTable = new JTable(enrolledTableModel);
        testFrames = new TestFrames();

        container.setLayout(new BorderLayout());
        container.add(studentsPanel, BorderLayout.WEST);
        container.add(coursePanel, BorderLayout.EAST);
        container.add(enrolleesTable, BorderLayout.SOUTH);
        container.add(testFrames, BorderLayout.SOUTH);


        setVisible(true);
        setTitle("GUI");
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


}
