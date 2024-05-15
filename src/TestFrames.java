import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrames extends JPanel {


    public JLabel studentIDLabel, nameLabel;
    public JTextField studentIDField, nameField;
    public JTable studentsTable;

    public JScrollPane scrollPane;

    public JButton addButton;

    public DefaultTableModel defaultTableModel;
    public StudentsTableModel studentsTableModel;
    public TestFrames() {
        init();
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        String [] name = {"Course", "Name","Enrollees"};

        defaultTableModel = new DefaultTableModel(name, 0);


//        add(0,0,1,1,c);
//        this.add(studentIDLabel = new JLabel("Student ID:"),c);
//
//        add(1,0,1,1,c);
//        this.add(studentIDField = new JTextField(20),c);
//
//        add(0,1,1,1,c);
//        this.add(nameLabel = new JLabel("Name:"),c);
//
//        add(1,1,1,1,c);
//        this.add(nameField = new JTextField(20),c);
//
        add(0,5,1,1,c);
        this.add(addButton = new JButton("ADD"),c);

        add(0,6,1,2,c);
        this.add(studentsTable = new JTable(defaultTableModel),c);

        scrollPane = new JScrollPane(studentsTable);
        this.add((scrollPane),c);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = studentIDField.getText();
                String name = nameField.getText();
                String [] container ={id, name};

                if(id.isEmpty() || name.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Fill in all fields","ERROR",JOptionPane.ERROR_MESSAGE);

                }else{
                    //String[] container = {id, name};
                    // tableModel.addRow(new Object[]);
                    defaultTableModel.addRow(container);
                    studentIDField.setText("");
                    nameField.setText("");


                }
            }
        });
    }

    private void init(){
//        studentsTableModel  = new StudentsTableModel();
//        studentsTable = new JTable(studentsTableModel);

    }
    public static void add(int gridx, int gridy, int gridheight, int gridwidth, GridBagConstraints c) {
        c.gridx = gridx;
        c.gridy = gridy;
        c.gridheight = gridheight;
        c.gridwidth = gridwidth;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(5,5,5,5);

    }
}

