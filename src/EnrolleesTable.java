import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnrolleesTable extends JPanel {

    JLabel courseLabel, codeLabel;
    JTextField courseField,codeField;
    JButton addButton;
    JTable table;
    JScrollPane scrollPane;
    DefaultTableModel tableModel;


    public EnrolleesTable(){
        init();
    }

    private void init(){

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        String [] nameColumn2 = {"Code","Name","Enrolles"};
        tableModel = new DefaultTableModel(nameColumn2,0 );

        add(0,0,1,1,c);
        this.add(addButton = new JButton("Enroll Now"),c);

        add(0,3,2,1,c);
        this.add(table = new JTable(tableModel),c);

        scrollPane = new JScrollPane(table);
        this.add(scrollPane,c);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = courseField.getText();
                String name = codeField.getText();
                String [] container ={id, name};

                if(id.isEmpty() || name.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Fill in all fields","ERROR",JOptionPane.ERROR_MESSAGE);

                }else{
                    //String[] container = {id, name};
                    // tableModel.addRow(new Object[]);
                    tableModel.addRow(container);
                    courseField.setText("");
                    codeField.setText("");


                }
            }
        });


    }
    private static void add(int gridx, int gridy, int gridWidth, int gridHeight, GridBagConstraints c){

        c.gridx = gridx;
        c.gridy = gridy;
        c.gridwidth = gridWidth;
        c.gridheight = gridHeight;
        c.weightx = 1;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(5, 5, 5, 5);

    }
}