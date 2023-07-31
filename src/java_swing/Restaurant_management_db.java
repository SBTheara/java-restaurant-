package java_swing;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Connection;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
public class Restaurant_management_db extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    double total;
    String sql;
    //Connection
    Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3325/project_java_2-3","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
            //JOptionPane.showMessageDialog(this, e);
        }
        return con;
    }
    public Restaurant_management_db() {
        initComponents();
    }
    DecimalFormat df= new DecimalFormat("#,###,###,#00.00");
    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel60 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jSpinner12 = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        bgRoom = new javax.swing.ButtonGroup();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDrink = new javax.swing.JButton();
        btnFood = new javax.swing.JButton();
        btnCallBooking = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        menu = new javax.swing.JPanel();
        Homescreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        food = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        js1 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        js2 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        js4 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        js3 = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        js8 = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        js7 = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        js6 = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        js5 = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbfood = new javax.swing.JTable();
        btnRemoveFood = new com.k33ptoo.components.KButton();
        btnBuyFood = new com.k33ptoo.components.KButton();
        btnResetFood = new com.k33ptoo.components.KButton();
        drink = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jsd1 = new javax.swing.JSpinner();
        jsd2 = new javax.swing.JSpinner();
        jsd3 = new javax.swing.JSpinner();
        jsd4 = new javax.swing.JSpinner();
        jsd5 = new javax.swing.JSpinner();
        jsd6 = new javax.swing.JSpinner();
        jsd7 = new javax.swing.JSpinner();
        jsd8 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdrink = new javax.swing.JTable();
        btnBuyDrink = new com.k33ptoo.components.KButton();
        btnRemoveDrink = new com.k33ptoo.components.KButton();
        btnResetDrink = new com.k33ptoo.components.KButton();
        payment = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        txtPayment = new javax.swing.JTextField();
        txtCashRecieve = new javax.swing.JTextField();
        txtCashReturn = new javax.swing.JTextField();
        cbDiscount = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbPayment = new javax.swing.JTable();
        btnPrint = new com.k33ptoo.components.KButton();
        callbooking = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        rbNormal = new javax.swing.JRadioButton();
        rbVIP = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCallbooking = new javax.swing.JTable();
        btnRemove = new com.k33ptoo.components.KButton();
        btnUpdate = new com.k33ptoo.components.KButton();
        btnSave = new com.k33ptoo.components.KButton();
        txtID = new javax.swing.JTextField();

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Price : 2.5 $");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel66.setText("Amount : ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1088, 646));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pngwing.com(1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        btnDrink.setBackground(new java.awt.Color(255, 204, 153));
        btnDrink.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDrink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/drink.png"))); // NOI18N
        btnDrink.setText("Drink Order");
        btnDrink.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkActionPerformed(evt);
            }
        });

        btnFood.setBackground(new java.awt.Color(255, 204, 153));
        btnFood.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bibimbap.png"))); // NOI18N
        btnFood.setText("Food Order");
        btnFood.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodActionPerformed(evt);
            }
        });

        btnCallBooking.setBackground(new java.awt.Color(255, 204, 153));
        btnCallBooking.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCallBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/booking.png"))); // NOI18N
        btnCallBooking.setText("Call Booking");
        btnCallBooking.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCallBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallBookingActionPerformed(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(255, 204, 153));
        btnPayment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money.png"))); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDrink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCallBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFood, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnFood)
                .addGap(17, 17, 17)
                .addComponent(btnDrink)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPayment)
                .addGap(11, 11, 11)
                .addComponent(btnCallBooking)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.setBackground(new java.awt.Color(255, 204, 102));
        menu.setLayout(new java.awt.CardLayout());

        Homescreen.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to my app");

        javax.swing.GroupLayout HomescreenLayout = new javax.swing.GroupLayout(Homescreen);
        Homescreen.setLayout(HomescreenLayout);
        HomescreenLayout.setHorizontalGroup(
            HomescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomescreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomescreenLayout.setVerticalGroup(
            HomescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomescreenLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addGap(322, 322, 322))
        );

        menu.add(Homescreen, "card2");

        food.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Egg Fried Rice");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Theara\\Downloads\\Telegram Desktop\\2.png")); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Price : 3.5 $");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Amount : ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Amount : ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Price : 4.5 $");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Theara\\Downloads\\Telegram Desktop\\3.png")); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Salad");

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Theara\\Downloads\\Telegram Desktop\\5.png")); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Price : 3.5 $");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Amount : ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Soup");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Amount : ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Price : 4.5 $");

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Theara\\Downloads\\Telegram Desktop\\4.png")); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Seafood Fried Rice");

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Theara\\Downloads\\Telegram Desktop\\9.png")); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Price : 2.5 $");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Amount : ");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Fried Squid");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Amount : ");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Price : 2.5 $");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Noodles");

        jLabel29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Theara\\Downloads\\Telegram Desktop\\8.png")); // NOI18N

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("Amount : ");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setText("Price : 5.5 $");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setText("Tom yam");

        jLabel33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Theara\\Downloads\\Telegram Desktop\\7.png")); // NOI18N

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setText("Amount : ");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setText("Price : 5 $");

        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Theara\\Downloads\\Telegram Desktop\\6.png")); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setText("Shu shi");

        tbfood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items", "Qty", "Price", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tbfood);

        btnRemoveFood.setText("Remove");
        btnRemoveFood.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRemoveFood.setkEndColor(new java.awt.Color(255, 0, 0));
        btnRemoveFood.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        btnRemoveFood.setkStartColor(new java.awt.Color(204, 0, 0));
        btnRemoveFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveFoodActionPerformed(evt);
            }
        });

        btnBuyFood.setText("Buy");
        btnBuyFood.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuyFood.setkEndColor(new java.awt.Color(0, 0, 204));
        btnBuyFood.setkHoverEndColor(new java.awt.Color(0, 0, 153));
        btnBuyFood.setkStartColor(new java.awt.Color(0, 0, 153));
        btnBuyFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyFoodActionPerformed(evt);
            }
        });

        btnResetFood.setText("Reset");
        btnResetFood.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnResetFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout foodLayout = new javax.swing.GroupLayout(food);
        food.setLayout(foodLayout);
        foodLayout.setHorizontalGroup(
            foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(foodLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(549, 549, 549))
                    .addGroup(foodLayout.createSequentialGroup()
                        .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(foodLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(js1)
                                        .addGap(6, 6, 6))
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(69, 69, 69))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(52, 52, 52))))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(js5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, foodLayout.createSequentialGroup()
                                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(81, 81, 81))
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, foodLayout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(101, 101, 101)))
                                .addGap(6, 6, 6)))
                        .addGap(85, 85, 85)
                        .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodLayout.createSequentialGroup()
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(js2))
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(69, 69, 69))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(110, 110, 110)))
                                .addGap(85, 85, 85)
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(js3)
                                        .addGap(6, 6, 6))
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(69, 69, 69))
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(21, 21, 21))))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(69, 69, 69)))
                                .addGap(85, 85, 85)
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(69, 69, 69))
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(91, 91, 91))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodLayout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(js6)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(js7)))
                        .addGap(85, 85, 85)
                        .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(js4)
                                .addGap(6, 6, 6))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(69, 69, 69))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(113, 113, 113))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(71, 71, 71))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(69, 69, 69))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(js8)
                                .addGap(6, 6, 6)))))
                .addGap(40, 40, 40))
            .addGroup(foodLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuyFood, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveFood, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnResetFood, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        foodLayout.setVerticalGroup(
            foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(foodLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)
                        .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(js2)))
                    .addGroup(foodLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(js4)))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(js3)))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(foodLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(js1))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodLayout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(js6)
                                .addComponent(js5))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(foodLayout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(js8)
                                .addComponent(js7))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(foodLayout.createSequentialGroup()
                        .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(foodLayout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(40, 40, 40)))
                .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(foodLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(foodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuyFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnResetFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(97, 97, 97))
                    .addGroup(foodLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(60, 60, 60))))
        );

        menu.add(food, "card3");

        drink.setBackground(new java.awt.Color(255, 204, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/06.png"))); // NOI18N

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1a.png"))); // NOI18N

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/03.png"))); // NOI18N

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/05.png"))); // NOI18N

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/08.png"))); // NOI18N

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/09.png"))); // NOI18N

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Brown Sugar");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setText("Green tea");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Cappucino");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setText("Sting");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setText("white coffee");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setText("Ice Cream");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setText("Taro");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Coconut milk");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setText("Price : 2.5 $");

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setText("Price : 2 $");

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setText("Price : 0.5 $");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Price : 2.5 $");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Price : 2.5 $");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("Price : 2.5 $");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel59.setText("Price : 2.5 $");

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("Price : 2 $");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setText("Amount : ");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setText("Amount : ");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setText("Amount : ");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setText("Amount : ");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setText("Amount : ");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel68.setText("Amount : ");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setText("Amount : ");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setText("Amount : ");

        tbdrink.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Items", "Qty", "Price", "Amount"
            }
        ));
        jScrollPane2.setViewportView(tbdrink);

        btnBuyDrink.setText("Buy");
        btnBuyDrink.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuyDrink.setkEndColor(new java.awt.Color(0, 0, 204));
        btnBuyDrink.setkHoverEndColor(new java.awt.Color(0, 0, 153));
        btnBuyDrink.setkStartColor(new java.awt.Color(0, 0, 153));
        btnBuyDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyDrinkActionPerformed(evt);
            }
        });

        btnRemoveDrink.setText("Remove");
        btnRemoveDrink.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRemoveDrink.setkEndColor(new java.awt.Color(255, 0, 0));
        btnRemoveDrink.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        btnRemoveDrink.setkStartColor(new java.awt.Color(204, 0, 0));
        btnRemoveDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDrinkActionPerformed(evt);
            }
        });

        btnResetDrink.setText("Reset");
        btnResetDrink.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnResetDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetDrinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout drinkLayout = new javax.swing.GroupLayout(drink);
        drink.setLayout(drinkLayout);
        drinkLayout.setHorizontalGroup(
            drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinkLayout.createSequentialGroup()
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel45)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel46)
                        .addGap(164, 164, 164)
                        .addComponent(jLabel47)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel48))
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel63)
                        .addGap(12, 12, 12)
                        .addComponent(jsd1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel62)
                        .addGap(12, 12, 12)
                        .addComponent(jsd2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel64)
                        .addGap(6, 6, 6)
                        .addComponent(jsd3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel65)
                        .addGap(13, 13, 13)
                        .addComponent(jsd4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel67)
                        .addGap(15, 15, 15)
                        .addComponent(jsd5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel68)
                        .addGap(12, 12, 12)
                        .addComponent(jsd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel69)
                        .addGap(12, 12, 12)
                        .addComponent(jsd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel70)
                        .addGap(25, 25, 25)
                        .addComponent(jsd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuyDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnRemoveDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(btnResetDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
        );
        drinkLayout.setVerticalGroup(
            drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinkLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48))
                .addGap(12, 12, 12)
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(6, 6, 6)
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel56)
                    .addComponent(jLabel55))
                .addGap(6, 6, 6)
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addComponent(jsd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(jsd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(jsd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(jsd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))))
                .addGap(10, 10, 10)
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41))
                .addGap(9, 9, 9)
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel61))))
                .addGap(6, 6, 6)
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(jsd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(jsd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67)
                            .addComponent(jsd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70)
                            .addComponent(jsd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(drinkLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(drinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuyDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemoveDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResetDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        menu.add(drink, "card4");

        payment.setBackground(new java.awt.Color(255, 255, 255));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/call booking.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Discount % : ");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setText("Sub Total : ");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setText("Payment : ");

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel74.setText("Discount $ :");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel75.setText("Cash Recieve : ");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel76.setText("Cash Return : ");

        txtSubtotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 102, 102)));

        txtDiscount.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 102, 102)));

        txtPayment.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 102, 102)));

        txtCashRecieve.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 102, 102)));
        txtCashRecieve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCashRecieveKeyReleased(evt);
            }
        });

        txtCashReturn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 102, 102)));

        cbDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%" }));
        cbDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiscountActionPerformed(evt);
            }
        });

        tbPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Qty", "Price", "Amount"
            }
        ));
        tbPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPaymentMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbPayment);

        btnPrint.setText("Payment");
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrint.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnPrint.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paymentLayout = new javax.swing.GroupLayout(payment);
        payment.setLayout(paymentLayout);
        paymentLayout.setHorizontalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentLayout.createSequentialGroup()
                                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                        .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSubtotal)
                                    .addComponent(cbDiscount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiscount)
                                    .addComponent(txtPayment)
                                    .addComponent(txtCashRecieve)
                                    .addComponent(txtCashReturn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(paymentLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        paymentLayout.setVerticalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentLayout.createSequentialGroup()
                .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paymentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, paymentLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel72)
                            .addComponent(txtSubtotal))
                        .addGap(18, 18, 18)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel74)
                            .addComponent(txtDiscount))
                        .addGap(18, 18, 18)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel75)
                            .addComponent(txtCashRecieve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(txtCashReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addContainerGap())
        );

        menu.add(payment, "card5");

        callbooking.setBackground(new java.awt.Color(255, 255, 255));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/booking.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Name");

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel78.setText("Date");

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel79.setText("Phone");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setText("Room");

        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 204, 255)));

        txtPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 204, 255)));

        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 204, 255)));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel81.setText("Price");

        rbNormal.setBackground(new java.awt.Color(255, 255, 255));
        bgRoom.add(rbNormal);
        rbNormal.setText("Normal");

        rbVIP.setBackground(new java.awt.Color(255, 255, 255));
        bgRoom.add(rbVIP);
        rbVIP.setText("VIP");

        tbCallbooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Phone", "Date", "Room", "Price"
            }
        ));
        tbCallbooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCallbookingMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbCallbooking);
        if (tbCallbooking.getColumnModel().getColumnCount() > 0) {
            tbCallbooking.getColumnModel().getColumn(0).setMinWidth(0);
            tbCallbooking.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbCallbooking.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        btnRemove.setText("Remove");
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRemove.setkEndColor(new java.awt.Color(0, 0, 204));
        btnRemove.setkHoverEndColor(new java.awt.Color(0, 0, 153));
        btnRemove.setkStartColor(new java.awt.Color(0, 0, 153));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setkEndColor(new java.awt.Color(255, 0, 0));
        btnUpdate.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        btnUpdate.setkStartColor(new java.awt.Color(204, 0, 0));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout callbookingLayout = new javax.swing.GroupLayout(callbooking);
        callbooking.setLayout(callbookingLayout);
        callbookingLayout.setHorizontalGroup(
            callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(callbookingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(callbookingLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(callbookingLayout.createSequentialGroup()
                            .addComponent(jLabel79)
                            .addGap(18, 18, 18)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(callbookingLayout.createSequentialGroup()
                            .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(callbookingLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(callbookingLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(callbookingLayout.createSequentialGroup()
                                            .addComponent(rbNormal)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbVIP))
                                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, callbookingLayout.createSequentialGroup()
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        callbookingLayout.setVerticalGroup(
            callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(callbookingLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(callbookingLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(callbookingLayout.createSequentialGroup()
                        .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel78))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(rbNormal)
                    .addComponent(rbVIP))
                .addGap(18, 18, 18)
                .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(callbookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, callbookingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        menu.add(callbooking, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1104, 654);
    }// </editor-fold>//GEN-END:initComponents

    public void Product_food(String item, int qty, float price){
        double total=Double.parseDouble(df.format(qty*price));
        try {
            ps=(PreparedStatement) connection().prepareStatement("INSERT INTO `tbfood`(`name`, `qty`, `price`, `total`) VALUES (?,?,?,?)");
            ps.setString(1, item);
            ps.setInt(2, qty);
            ps.setFloat(3, price);
            ps.setDouble(4, total);
            ps.executeUpdate();            
        } catch (SQLException ex) {
            Logger.getLogger(Login_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void Product_Drink(String item, int qty, float price){
        double total=Double.parseDouble(df.format(qty*price));
        try {
            ps=(PreparedStatement) connection().prepareStatement("INSERT INTO `tbDrink`(`name`, `qty`, `price`, `total`) VALUES (?,?,?,?)");
            ps.setString(1, item);
            ps.setInt(2, qty);
            ps.setFloat(3, price);
            ps.setDouble(4, total);
            ps.executeUpdate();            
        } catch (SQLException ex) {
            Logger.getLogger(Login_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void GetFood(){
        DefaultTableModel mode1=(DefaultTableModel) tbfood.getModel();
        DefaultTableModel mode=(DefaultTableModel) tbPayment.getModel();
        try { 
            ps=(PreparedStatement) connection().prepareStatement("Select * From tbFood");
            r=ps.executeQuery();
            while(r.next()){
                Object row[]={
                    r.getString(1),
                    r.getInt(2),
                    r.getFloat(3),
                    r.getDouble(4)
                };
                ListProduct.list.add(new ListProduct(r.getString(1),r.getInt(2),r.getFloat(3),r.getDouble(4)));
                total +=r.getDouble(4);
                txtSubtotal.setText(String.valueOf(total));
                mode1.addRow(row);
                mode.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void GetDrink(){
        DefaultTableModel mode2=(DefaultTableModel) tbdrink.getModel();
        DefaultTableModel model=(DefaultTableModel) tbPayment.getModel();
        try { 
            ps=(PreparedStatement) connection().prepareStatement("Select * From tbDrink");
            r=ps.executeQuery();
            while(r.next()){
                Object row[]={
                    r.getString(1),
                    r.getInt(2),
                    r.getFloat(3),
                    r.getDouble(4)
                };
                ListProduct.list.add(new ListProduct(r.getString(1),r.getInt(2),r.getFloat(3),r.getDouble(4)));
                total +=r.getDouble(4);
                txtSubtotal.setText(String.valueOf(total));
                mode2.addRow(row);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void GetBooking(){
        DefaultTableModel mode=(DefaultTableModel) tbCallbooking.getModel();
        try {
            ps=(PreparedStatement) connection().prepareStatement("Select * From tbbooking");
            r=ps.executeQuery();
            while(r.next()){
                Object row[]={
                    r.getInt(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getFloat(6)
                };
                mode.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoodActionPerformed
        menu.removeAll();
        menu.add(food);
        menu.repaint();
        menu.revalidate();
    }//GEN-LAST:event_btnFoodActionPerformed

    private void btnDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkActionPerformed
        menu.removeAll();
        menu.add(drink);
        menu.repaint();
        menu.revalidate();
    }//GEN-LAST:event_btnDrinkActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        menu.removeAll();
        menu.add(payment);
        menu.repaint();
        menu.revalidate();
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnCallBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallBookingActionPerformed
        menu.removeAll();
        menu.add(callbooking);
        menu.repaint();
        menu.revalidate();
    }//GEN-LAST:event_btnCallBookingActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        menu.removeAll();
        menu.add(Homescreen);
        menu.repaint();
        menu.revalidate();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnRemoveFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveFoodActionPerformed
        DefaultTableModel mode1= (DefaultTableModel) tbfood.getModel();
        int row=tbfood.getSelectedRow();
        String name=tbfood.getValueAt(row, 0).toString();
        try {
            ps=(PreparedStatement) connection().prepareStatement("Delete from tbFood Where name=?");
            ps.setString(1, name);
            ps.executeUpdate();
            mode1.setRowCount(0);
            GetFood();
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveFoodActionPerformed

    private void btnRemoveDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDrinkActionPerformed
        DefaultTableModel mode1= (DefaultTableModel) tbdrink.getModel();
        int row=tbdrink.getSelectedRow();
        String name=tbdrink.getValueAt(row, 0).toString();
        try {
            ps=(PreparedStatement) connection().prepareStatement("Delete from tbDrink Where name=?");
            ps.setString(1, name);
            ps.executeUpdate();
            mode1.setRowCount(0);
            GetDrink();
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveDrinkActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int id=Integer.parseInt(txtID.getText());
        String name=txtName.getText();
        String phone=txtPhone.getText();
        String date=sdf.format(txtDate.getDate());
        String room=(rbNormal.isSelected()==true)?"Normal":"VIP";
        float price = Float.parseFloat(txtPrice.getText());
        try {
            ps=(PreparedStatement) connection().prepareStatement("UPDATE `tbbooking` SET `Name`=?,`Phone`=?,`Date_time`=?,`Room`=?,`Price`=? WHERE Id=?");
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, date);
            ps.setString(4, room);
            ps.setFloat(5, price);
            ps.setInt(6, id);
            ps.executeUpdate();
            DefaultTableModel mode=(DefaultTableModel) tbCallbooking.getModel();
            mode.setRowCount(0);
            GetBooking();
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String name=txtName.getText();
        String phone=txtPhone.getText();
        String date=sdf.format(txtDate.getDate());
        String room=(rbNormal.isSelected()==true)?"Normal":"VIP";
        float price = Float.parseFloat(txtPrice.getText());
        try {
            ps=(PreparedStatement) connection().prepareStatement("INSERT INTO `tbbooking`(`Name`, `Phone`, `Date_time`, `Room`, `Price`) VALUES (?,?,?,?,?)");
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, date);
            ps.setString(4, room);
            ps.setFloat(5, price);
            ps.executeUpdate();
            DefaultTableModel mode=(DefaultTableModel) tbCallbooking.getModel();
            mode.setRowCount(0);
            GetBooking();
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBuyFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyFoodActionPerformed
        DefaultTableModel mode1= (DefaultTableModel) tbfood.getModel();
        try {
            int qty1=(int) js1.getValue();
            if(qty1>0){
                Product_food("EGG Fried Rice", qty1, 3.5f);
            }
            
            int qty2=(int) js2.getValue();
            if(qty2>0){
                Product_food("Salad", qty2, 4.5f);
            }
            
            int qty3=(int) js3.getValue();
            if(qty3>0){
                Product_food("Seafood Fried Rice", qty3, 4.5f);
            }
            
            int qty4=(int) js4.getValue();
            if(qty4>0){
                Product_food("Soup", qty4, 3.5f);
            }
            
            int qty5=(int) js5.getValue();
            if(qty5>0){
                Product_food("Shu Shi", qty5, 5f);
            }
            
            int qty6=(int) js6.getValue();
            if(qty6>0){
                Product_food("Tom Yam", qty6, 5.5f);
            }
            
            int qty7=(int) js7.getValue();
            if(qty7>0){
                Product_food("Noodles", qty7, 2.5f);
            }
            
            int qty8=(int) js8.getValue();
            if(qty8>0){
                Product_food("Fried Squid", qty8, 2.5f);
            }
            mode1.setRowCount(0);
            GetFood();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        } 
    }//GEN-LAST:event_btnBuyFoodActionPerformed

    private void btnResetFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetFoodActionPerformed
        DefaultTableModel mode1= (DefaultTableModel) tbfood.getModel();
        try {
            ps=(PreparedStatement) connection().prepareStatement("Delete from tbFood");
            ps.executeUpdate();
            mode1.setRowCount(0);
            GetFood();
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_btnResetFoodActionPerformed

    private void btnBuyDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyDrinkActionPerformed
        DefaultTableModel mode2= (DefaultTableModel) tbdrink.getModel();
        try {
            int qty1=(int) jsd1.getValue();
            if(qty1>0){
                Product_Drink("Brown Sugar", qty1, 2.5f);
            }
            
            int qty2=(int) jsd2.getValue();
            if(qty2>0){
                Product_Drink("Green Tea", qty2, 2f);
            }
            
            int qty3=(int) jsd3.getValue();
            if(qty3>0){
                Product_Drink("Cappucino", qty3, 2.5f);
            }
            
            int qty4=(int) jsd4.getValue();
            if(qty4>0){
                Product_Drink("Sting", qty4, 0.5f);
            }
            
            int qty5=(int) jsd5.getValue();
            if(qty5>0){
                Product_Drink("White Coffe", qty5, 2.5f);
            }
            
            int qty6=(int) jsd6.getValue();
            if(qty6>0){
                Product_Drink("Taro", qty6, 2.5f);
            }
            
            int qty7=(int) jsd7.getValue();
            if(qty7>0){
                Product_Drink("Ice Cream", qty7, 3.5f);
            }
            
            int qty8=(int) jsd8.getValue();
            if(qty8>0){
                Product_Drink("Coconut Milk", qty8, 2.5f);
            }
            mode2.setRowCount(0);
            GetDrink();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        }
    }//GEN-LAST:event_btnBuyDrinkActionPerformed

    private void btnResetDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetDrinkActionPerformed
        DefaultTableModel mode1= (DefaultTableModel) tbdrink.getModel();
        try {
            ps=(PreparedStatement) connection().prepareStatement("Delete from tbDrink");
            ps.executeUpdate();
            mode1.setRowCount(0);
            GetDrink();
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnResetDrinkActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        GetFood();
        GetDrink();
        GetBooking();
    }//GEN-LAST:event_formWindowOpened
    private Collection data(){
        ArrayList<ListProduct> list=new ArrayList<>();
        for(ListProduct temp:ListProduct.list){
            String Name=temp.getName();
            int Qty=temp.getQty();
            float Price=temp.getPrice();
            double Amount=temp.getAmount();
            ListProduct pro=new ListProduct(Name,Qty,Price,Amount);
            list.add(pro);
        }
        return list;
    }
    private void txtCashRecieveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashRecieveKeyReleased
        double pay=0;
        double cash_recieve=Double.parseDouble(txtCashRecieve.getText());
        double payment= Double.parseDouble(txtPayment.getText());
        pay=cash_recieve-payment;
        txtCashReturn.setText(String.valueOf(df.format(pay)));
    }//GEN-LAST:event_txtCashRecieveKeyReleased

    private void tbCallbookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCallbookingMouseClicked
        DefaultTableModel model=(DefaultTableModel) tbCallbooking.getModel();
        int row=tbCallbooking.getSelectedRow();
        txtID.setText(model.getValueAt(row, 0).toString());
        txtName.setText(model.getValueAt(row, 1).toString());
        txtPhone.setText(model.getValueAt(row, 2).toString());
        try {
            java.util.Date obj=sdf.parse(model.getValueAt(row, 3).toString());
            txtDate.setDate(obj);  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        String room=model.getValueAt(row, 4).toString();
        if(room.equalsIgnoreCase("Normal")){
            rbNormal.setSelected(true);
        }
        else{
            rbVIP.setSelected(true);
        }
        txtPrice.setText(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_tbCallbookingMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DefaultTableModel model=(DefaultTableModel) tbCallbooking.getModel();
        int id=Integer.parseInt(txtID.getText());
        try {
            ps=(PreparedStatement) connection().prepareStatement("Delete from tbbooking where Id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            model.setRowCount(0);
            GetBooking();
        } catch (SQLException ex) {
            Logger.getLogger(Restaurant_management_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
            
            float totals=Float.parseFloat(txtSubtotal.getText());
            String sdis=cbDiscount.getSelectedItem().toString();
            sdis=sdis.substring(0,sdis.length()-2);
            float dis=Float.parseFloat(sdis);
            float ds=Float.parseFloat(txtDiscount.getText());
            float pay=Float.parseFloat(txtPayment.getText());
            float c_r=Float.parseFloat(txtCashRecieve.getText());
            float c_re=Float.parseFloat(txtCashReturn.getText());
            
            JasperReport jp = JasperCompileManager.compileReport("src/Report/report_pro.jrxml");
            HashMap pr = new HashMap();
            pr.put("sub_total",totals);
            pr.put("dis_1",dis);
            pr.put("dis_2",ds);
            pr.put("payment",pay);
            pr.put("cash_recieve",c_r);
            pr.put("cash_return",c_re);
            
            
            JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(data());
            JasperPrint price = JasperFillManager.fillReport(jp, pr,jcd);
            JasperViewer.viewReport(price,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void tbPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPaymentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbPaymentMouseClicked

    private void cbDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiscountActionPerformed
        DecimalFormat df=new DecimalFormat("#,###0.00");
        int op=cbDiscount.getSelectedIndex();
        int discount=0;
        switch(op)
        {
            case 0:
            {
                discount=0;
            }break;
            case 1:
            {
                discount=10;
            }break;
            case 2:
            {
                discount=20;
            }break;
            case 3:
            {
                discount=30;
            }break;
            case 4:
            {
                discount=40;
            }break;
            case 5:
            {
                discount=50;
            }break;
        }
        double pay=total-(total*discount)/100;
        txtPayment.setText(String.valueOf(df.format(pay)));
        double dis_money=(total*discount)/100;
        txtDiscount.setText(String.valueOf(df.format(dis_money)));
    }//GEN-LAST:event_cbDiscountActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restaurant_management_db().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Homescreen;
    private javax.swing.ButtonGroup bgRoom;
    private com.k33ptoo.components.KButton btnBuyDrink;
    private com.k33ptoo.components.KButton btnBuyFood;
    private javax.swing.JButton btnCallBooking;
    private javax.swing.JButton btnDrink;
    private javax.swing.JButton btnFood;
    private javax.swing.JButton btnPayment;
    private com.k33ptoo.components.KButton btnPrint;
    private com.k33ptoo.components.KButton btnRemove;
    private com.k33ptoo.components.KButton btnRemoveDrink;
    private com.k33ptoo.components.KButton btnRemoveFood;
    private com.k33ptoo.components.KButton btnResetDrink;
    private com.k33ptoo.components.KButton btnResetFood;
    private com.k33ptoo.components.KButton btnSave;
    private com.k33ptoo.components.KButton btnUpdate;
    private javax.swing.JPanel callbooking;
    private javax.swing.JComboBox<String> cbDiscount;
    private javax.swing.JPanel drink;
    private javax.swing.JPanel food;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JSpinner js1;
    private javax.swing.JSpinner js2;
    private javax.swing.JSpinner js3;
    private javax.swing.JSpinner js4;
    private javax.swing.JSpinner js5;
    private javax.swing.JSpinner js6;
    private javax.swing.JSpinner js7;
    private javax.swing.JSpinner js8;
    private javax.swing.JSpinner jsd1;
    private javax.swing.JSpinner jsd2;
    private javax.swing.JSpinner jsd3;
    private javax.swing.JSpinner jsd4;
    private javax.swing.JSpinner jsd5;
    private javax.swing.JSpinner jsd6;
    private javax.swing.JSpinner jsd7;
    private javax.swing.JSpinner jsd8;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel payment;
    private javax.swing.JRadioButton rbNormal;
    private javax.swing.JRadioButton rbVIP;
    private javax.swing.JTable tbCallbooking;
    private javax.swing.JTable tbPayment;
    private javax.swing.JTable tbdrink;
    private javax.swing.JTable tbfood;
    private javax.swing.JTextField txtCashRecieve;
    private javax.swing.JTextField txtCashReturn;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPayment;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSubtotal;
    // End of variables declaration//GEN-END:variables
}
