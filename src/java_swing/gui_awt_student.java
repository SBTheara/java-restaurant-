package java_swing;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class gui_awt_student extends Frame implements ActionListener,MouseListener{
    Label label;
    JLabel lbImage;
    TextField txtName,txtID,txtYear,txtClass,txtDatabase,txtJava,txtPHP,txtAddress,txtPhone,txtImage;
    JCheckBox chA,chM,chE;
    JRadioButton rdoMale,rdoFemale;
    Button btnImage,btnSave,btnUpdate,btnDelete,btnSort,btnExit;
    JComboBox cboUniversity = new JComboBox();
    JComboBox cboDepartment= new JComboBox();
    ButtonGroup btngroup = new ButtonGroup();
    ButtonGroup btnE= new ButtonGroup();
    JTable table;
    DefaultTableModel model;
   public void design_txt(TextField obj){
        obj.setFont(new Font("Calibri", Font.PLAIN, 16));
        obj.setForeground(new Color(0,0,205));
        obj.setBackground(new Color(224,224,224));
    }
    public void design_rdo(JRadioButton obj){
        obj.setFont(new Font("Calibri",Font.PLAIN ,16));
        obj.setBackground(new Color(255,160,122));
        obj.setForeground(new Color(0,0,205));
    }
    public gui_awt_student(){
        label = new Label("Student DashBoard");
        label.setBounds(600, 30, 500, 50);
        label.setFont(new Font("Calibri",Font.BOLD ,20));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        txtID = new  TextField();
        txtID.setBounds(150, 90, 200, 30);
        design_txt(txtID);
        add(txtID);
        
        label = new Label("ID");
        label.setBounds(20, 90, 70, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        label = new Label("Name");
        label.setBounds(20, 140, 70, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        txtName = new TextField();
        txtName.setBounds(150, 140, 200, 30);
        design_txt(txtName);
        add(txtName);
        
        label = new Label("Gender");
        label.setBounds(20, 190, 70, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        rdoMale = new JRadioButton();
        rdoMale.setText("Male");
        rdoMale.setBounds(150, 198, 70, 20);
        rdoMale.setFont(new Font("Calibri",Font.PLAIN ,16));
        rdoMale.setBackground(new Color(255,160,122));
        rdoMale.setForeground(new Color(0,0,205));
        add(rdoMale);
        btngroup.add(rdoMale);
        
        rdoFemale = new JRadioButton();
        rdoFemale.setText("Female");
        rdoFemale.setBounds(250, 198, 90, 20);
        rdoFemale.setFont(new Font("Calibri",Font.PLAIN ,16));
        rdoFemale.setBackground(new Color(255,160,122));
        rdoFemale.setForeground(new Color(0,0,205));
        add(rdoFemale);
        btngroup.add(rdoFemale);
        
        label = new Label("University");
        label.setBounds(20, 240, 92, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        String university[]={"RUPP","ITC","SETEC","NORTON","BELTIE","KIT"};
        cboUniversity = new JComboBox(university);
        cboUniversity.setBounds(150, 240, 70, 30);
        cboUniversity.setFont(new Font("Calibri",Font.PLAIN ,16));
        cboUniversity.setForeground(new Color(0,0,205));
        cboUniversity.setFocusable(false);
        cboUniversity.setEditable(true);
        add(cboUniversity);
        
        label = new Label("Year");
        label.setBounds(740, 140, 92, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205)); 
        add(label);
        
        txtYear= new TextField();
        txtYear.setBounds(840, 140, 200, 30);
        design_txt(txtYear);
        add(txtYear);
        
        label = new Label("Department");
        label.setBounds(20, 290, 120, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        String department[]={"CS","ITE","HISTORY","BIOLOGYCAL"};
        cboDepartment= new JComboBox(department);
        cboDepartment.setBounds(150, 290, 100, 30);
        cboDepartment.setFont(new Font("Calibri", Font.PLAIN, 16));
        cboDepartment.setFocusable(false);
        cboDepartment.setEditable(true);
        add(cboDepartment);
        
        label = new Label("Class");
        label.setBounds(740, 190, 92, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205)); 
        add(label);
        
        txtClass = new TextField();
        txtClass.setBounds(840, 190, 200, 30);
        design_txt(txtClass);
        add(txtClass);
        
        label = new Label("Time");
        label.setBounds(740, 270, 92, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,18));
        label.setForeground(new Color(0,0,205)); 
        add(label);
        
        chM = new JCheckBox("Morning");
        chM.setBounds(840, 240, 92, 30);
        chM.setBackground(new Color(255,160,122));
        chM.setFont(new Font("Calibri", Font.BOLD, 16));
        chM.setForeground(new Color(0,0,205));
        add(chM);
        btnE.add(chM);
        
        chA = new JCheckBox("Afternoon");
        chA.setBounds(840, 270, 150, 30);
        chA.setBackground(new Color(255,160,122));
        chA.setFont(new Font("Calibri", Font.BOLD, 16));
        chA.setForeground(new Color(0,0,205));
        add(chA);
        btnE.add(chA);
        
        chE = new JCheckBox("Evening");
        chE.setBounds(840, 300, 92, 30);
        chE.setBackground(new Color(255,160,122));
        chE.setFont(new Font("Calibri", Font.BOLD, 16));
        chE.setForeground(new Color(0,0,205));
        add(chE);
        btnE.add(chE);
        
        
        label = new Label("Database");
        label.setBounds(390, 190, 92, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205)); 
        add(label);
        
        txtDatabase = new TextField();
        txtDatabase.setBounds(490, 190, 200, 30);
        design_txt(txtDatabase);
        add(txtDatabase);
        
        label = new Label("Java");
        label.setBounds(390, 90, 70, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        txtJava = new TextField();
        txtJava.setBounds(490, 90, 200, 30);
        design_txt(txtJava);
        add(txtJava);
        
        label = new Label("PHP");
        label.setBounds(390, 140, 70, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        txtPHP = new TextField();
        txtPHP.setBounds(490, 140, 200, 30);
        design_txt(txtPHP);
        add(txtPHP);
        
        label = new Label("Address");
        label.setBounds(740, 90, 90, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        txtAddress = new TextField();
        txtAddress.setBounds(840, 90, 200, 30);
        design_txt(txtAddress);
        add(txtAddress);
        
        label = new Label("Phone");
        label.setBounds(390, 240, 100, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        txtPhone = new TextField();
        txtPhone.setBounds(490, 240, 200, 30);
        design_txt(txtPhone);
        add(txtPhone);
        
        
        label = new Label("Image");
        label.setBounds(390, 290, 100, 30);
        label.setFont(new Font("Calibri",Font.BOLD ,16));
        label.setForeground(new Color(0,0,205));
        add(label);
        
        txtImage = new TextField();
        txtImage.setBounds(490, 290, 200, 30);
        design_txt(txtImage);
        add(txtImage);
        
        lbImage = new JLabel();
        lbImage.setBounds(1150, 90, 170, 170);
        lbImage.setBorder(BorderFactory.createLineBorder(Color.decode("#090A0C")));
        add(lbImage);
        
        btnImage = new Button("Image");
        btnImage.setBounds(1150, 290, 170, 30);
        btnImage.setFont(new Font("Calibri",Font.BOLD ,16));
        btnImage.setForeground(new Color(0,0,205));
        add(btnImage);
        
        String head[]={"StuID","Name","Gender","University"
        ,"Department","Year","Class","Time",
        "Java","PHP","Database","Total","Average","Address","Phone","Image"};
        
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(head);
        table.setModel(model);
        JScrollPane js = new JScrollPane(table);
        js.setBounds(20, 350, 1325, 300);

        add(js);
        
        btnSave = new Button("Save");
        btnSave.setBounds(20, 680, 170, 30);
        btnSave.setFont(new Font("Calibri",Font.BOLD ,16));
        btnSave.setForeground(new Color(0,0,205));
        btnSave.setBackground(Color.red);
        add(btnSave);
        
        btnUpdate = new Button("Update");
        btnUpdate.setBounds(310, 680, 170, 30);
        btnUpdate.setFont(new Font("Calibri",Font.BOLD ,16));
        btnUpdate.setForeground(new Color(0,0,205));
        btnUpdate.setBackground(Color.ORANGE);
        add(btnUpdate);
        
        btnDelete = new Button("Delete");
        btnDelete.setBounds(600, 680, 170, 30);
        btnDelete.setFont(new Font("Calibri",Font.BOLD ,16));
        btnDelete.setForeground(new Color(0,0,205));
        btnDelete.setBackground(Color.GREEN);
        add(btnDelete);
        
        btnSort = new Button("Sort");
        btnSort.setBounds(890, 680, 170, 30);
        btnSort.setFont(new Font("Calibri",Font.BOLD ,16));
        btnSort.setForeground(new Color(0,0,205));
        btnSort.setBackground(Color.orange);
        add(btnSort);
        
        btnExit = new Button("Exit");
        btnExit.setBounds(1175, 680, 170, 30);
        btnExit.setFont(new Font("Calibri",Font.BOLD ,16));
        btnExit.setForeground(new Color(0,0,205));
        btnExit.setBackground(Color.red);
        add(btnExit);
        
        btnSave.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnImage.addActionListener(this);
        btnSort.addActionListener(this);
        btnExit.addActionListener(this);
        
        
        addWindowListener (new WindowAdapter() {    
            @Override
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });
        setLayout(null);
        setSize(1366,768);
        setLocationRelativeTo(this);
        setBackground(new Color(255,160,122));
        setVisible(true);
    }
    public static void main(String[] args) {
        new gui_awt_student();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSave){
            int id=Integer.parseInt(txtID.getText());
            String name=txtName.getText();
            String gender;
            if(rdoMale.isSelected()==true){
                gender="Male";
            }
            else 
            {
                gender="Female";
            }
            String university=cboUniversity.getSelectedItem().toString();
            String department=cboDepartment.getSelectedItem().toString();
            float java=Float.parseFloat(txtJava.getText());
            float php=Float.parseFloat(txtPHP.getText());
            float db=Float.parseFloat(txtDatabase.getText());
            String phone=txtPhone.getText();
            String address=txtAddress.getText();
            int year=Integer.parseInt(txtYear.getText());
            String image=txtImage.getText();
            String classes=txtClass.getText();
            String time;
            if(chM.isSelected()==true){
                time="Morning";
            }
            else if(chE.isSelected()==true)
            {
                time="Evening";
            }
            else{
                time="Afternoon";
            }
            
            float total=java+php+db; 
            float avg=total/3;
            
            model.setRowCount(0);
            Student_List.list.add(new Student_List(id, name, gender, university, department, java, php, db, total,avg,phone, image, address, year, classes, time));
            for (int i=0;i<Student_List.list.size();i++){
                Object row[]={
                    Student_List.list.get(i).getId(),
                    Student_List.list.get(i).getName(),
                    Student_List.list.get(i).getGender(),
                    Student_List.list.get(i).getUniversity(),
                    Student_List.list.get(i).getDepartment(),
                    Student_List.list.get(i).getYear(),
                    Student_List.list.get(i).getClasses(),
                    Student_List.list.get(i).getTime(),
                    Student_List.list.get(i).getJava(),
                    Student_List.list.get(i).getPhp(),
                    Student_List.list.get(i).getDb(),
                    Student_List.list.get(i).getTotal(),
                    Student_List.list.get(i).getAvg(),
                    Student_List.list.get(i).getAddress(),
                    Student_List.list.get(i).getPhone(),
                    Student_List.list.get(i).getImage()      
                };
                model.addRow(row);  
            }
  
        }    
        else if(e.getSource()==btnUpdate){
            
        }
        else if(e.getSource()==btnDelete){
            
        }
        else if(e.getSource()==btnSort){
               
        }
        else if(e.getSource()==btnImage){
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            String filename = f.getAbsolutePath();
            txtImage.setText(filename);
            Image getAbsolutePath=null;
            ImageIcon icon = new ImageIcon(filename);
            Image image = icon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
            lbImage.setIcon(icon);
        }
        else if(e.getSource()==btnExit){
            System.exit(0);
        }
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
