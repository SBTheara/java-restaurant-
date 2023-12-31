/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_swing;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Theara
 */
public class Drink extends javax.swing.JFrame {
DecimalFormat df=new DecimalFormat("##########0.00");
    public Drink() {
        initComponents();
    }
    public void Itemproduct(){
        DefaultTableModel mode = (DefaultTableModel) tbDrink.getModel();
        double tax = 5;
        double subtotal= 0;
        for(int i=0;i<tbDrink.getRowCount();i++){
            String sprice=tbDrink.getValueAt(i, 2).toString();
            double price=Double.parseDouble(sprice);
            subtotal+=price;
        }
        txtSubTotal.setText(String.valueOf(df.format(subtotal)));
        double stax=subtotal/100*tax;
        txtTax.setText(String.valueOf(df.format(stax)));
        double stotal=subtotal+stax;
        txtTotal.setText(String.valueOf(df.format(stotal)));
        
    }
    public void DataItem(String name, String Qty, double price){
        DefaultTableModel mode= (DefaultTableModel) tbDrink.getModel();
        Object row[]={name,Qty,price};
        mode.addRow(row);
    }
    public void ChangeToDollar(){
        double cash=Double.parseDouble(txtCash.getText());
        double total=Double.parseDouble(txtTotal.getText());
        double change=cash-total;
        
        txtChange.setText(String.valueOf(change));
    }
    public void ChangeToKhmer(){
        double cash=Double.parseDouble(txtCash.getText());
        double total=Double.parseDouble(txtTotal.getText());
        double change=cash-total;
        txtChange.setText(String.valueOf(change));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDrink = new javax.swing.JTable();
        btnCoca = new javax.swing.JButton();
        btnChampion = new javax.swing.JButton();
        btnRedSting = new javax.swing.JButton();
        btnRedBull = new javax.swing.JButton();
        btnCarabao = new javax.swing.JButton();
        btnYellowSting = new javax.swing.JButton();
        btnFanta = new javax.swing.JButton();
        btnSprite = new javax.swing.JButton();
        btnBaccus = new javax.swing.JButton();
        btnVital = new javax.swing.JButton();
        btnYeos = new javax.swing.JButton();
        btnIze = new javax.swing.JButton();
        btnMilk = new javax.swing.JButton();
        btnWork = new javax.swing.JButton();
        btnMirinda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtTax = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        txtChange = new javax.swing.JTextField();
        txtCash = new javax.swing.JTextField();
        cbPayment = new javax.swing.JComboBox<>();
        btnReset = new com.k33ptoo.components.KButton();
        btnPrint = new com.k33ptoo.components.KButton();
        btnPayment = new com.k33ptoo.components.KButton();
        btnRemove = new com.k33ptoo.components.KButton();
        btnExit = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 54, 30, 30));

        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 54, 30, 30));

        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 54, 30, 30));

        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 102, 30, 30));

        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 102, 30, 30));

        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 102, 30, 30));

        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 150, 30, 30));

        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 150, 30, 30));

        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 150, 30, 30));

        btnC.setText("C");
        btnC.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 198, 30, 30));

        btndot.setText(".");
        btndot.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        getContentPane().add(btndot, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 198, 30, 30));

        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 51)));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 198, 30, 30));

        tbDrink.setBackground(new java.awt.Color(204, 204, 255));
        tbDrink.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Qty", "Price"
            }
        ));
        jScrollPane1.setViewportView(tbDrink);
        if (tbDrink.getColumnModel().getColumnCount() > 0) {
            tbDrink.getColumnModel().getColumn(0).setResizable(false);
            tbDrink.getColumnModel().getColumn(0).setPreferredWidth(140);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 30, 340, 388));

        btnCoca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pngegg(1).png"))); // NOI18N
        btnCoca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnCoca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCoca, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 30, 83, 83));

        btnChampion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/champion.png"))); // NOI18N
        btnChampion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnChampion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChampionActionPerformed(evt);
            }
        });
        getContentPane().add(btnChampion, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 30, 83, 83));

        btnRedSting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sting 2.png"))); // NOI18N
        btnRedSting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnRedSting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedStingActionPerformed(evt);
            }
        });
        getContentPane().add(btnRedSting, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 30, 83, 83));

        btnRedBull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/redbyjj.png"))); // NOI18N
        btnRedBull.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnRedBull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedBullActionPerformed(evt);
            }
        });
        getContentPane().add(btnRedBull, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 30, 83, 83));

        btnCarabao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Carabao-250ml-Can-1-1.png"))); // NOI18N
        btnCarabao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnCarabao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarabaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarabao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1128, 30, 83, 83));

        btnYellowSting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sting-yellow.png"))); // NOI18N
        btnYellowSting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnYellowSting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYellowStingActionPerformed(evt);
            }
        });
        getContentPane().add(btnYellowSting, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 179, 83, 83));

        btnFanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pngwing.com.png"))); // NOI18N
        btnFanta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnFanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFantaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 179, 83, 83));

        btnSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pngfind.com-sprite-can-png-6568242.png"))); // NOI18N
        btnSprite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpriteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSprite, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 179, 83, 83));

        btnBaccus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/baccus.png"))); // NOI18N
        btnBaccus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnBaccus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaccusActionPerformed(evt);
            }
        });
        getContentPane().add(btnBaccus, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 179, 83, 83));

        btnVital.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/vital.png"))); // NOI18N
        btnVital.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVitalActionPerformed(evt);
            }
        });
        getContentPane().add(btnVital, new org.netbeans.lib.awtextra.AbsoluteConstraints(1128, 179, 83, 83));

        btnYeos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/yeos.png"))); // NOI18N
        btnYeos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnYeos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYeosActionPerformed(evt);
            }
        });
        getContentPane().add(btnYeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1015, 335, 83, 83));

        btnIze.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ize.png"))); // NOI18N
        btnIze.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnIze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzeActionPerformed(evt);
            }
        });
        getContentPane().add(btnIze, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 335, 83, 83));

        btnMilk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mated mile.PNG"))); // NOI18N
        btnMilk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnMilk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMilkActionPerformed(evt);
            }
        });
        getContentPane().add(btnMilk, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 335, 83, 83));

        btnWork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/work.png"))); // NOI18N
        btnWork.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWorkActionPerformed(evt);
            }
        });
        getContentPane().add(btnWork, new org.netbeans.lib.awtextra.AbsoluteConstraints(902, 335, 83, 83));

        btnMirinda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mirinda.png"))); // NOI18N
        btnMirinda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0), 2));
        btnMirinda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMirindaActionPerformed(evt);
            }
        });
        getContentPane().add(btnMirinda, new org.netbeans.lib.awtextra.AbsoluteConstraints(1128, 335, 83, 83));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sub Total");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 459, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tax");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 499, 63, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 539, 63, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Change");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 59, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cash");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 59, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Payment");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 459, -1, -1));

        txtSubTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubTotalActionPerformed(evt);
            }
        });
        getContentPane().add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 459, 157, -1));
        getContentPane().add(txtTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 499, 157, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 539, 157, -1));
        getContentPane().add(txtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 550, 157, -1));

        txtCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashActionPerformed(evt);
            }
        });
        getContentPane().add(txtCash, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 510, 157, -1));

        cbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "RIEL", " " }));
        cbPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPaymentActionPerformed(evt);
            }
        });
        getContentPane().add(cbPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 459, 157, -1));

        btnReset.setText("Reset");
        btnReset.setkEndColor(new java.awt.Color(0, 0, 204));
        btnReset.setkHoverEndColor(new java.awt.Color(0, 0, 204));
        btnReset.setkStartColor(new java.awt.Color(0, 0, 204));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 459, 124, 32));

        btnPrint.setText("Print");
        btnPrint.setkEndColor(new java.awt.Color(0, 0, 204));
        btnPrint.setkHoverEndColor(new java.awt.Color(0, 0, 204));
        btnPrint.setkStartColor(new java.awt.Color(0, 0, 204));
        getContentPane().add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 509, 124, 32));

        btnPayment.setText("Payment");
        btnPayment.setkEndColor(new java.awt.Color(0, 0, 204));
        btnPayment.setkHoverEndColor(new java.awt.Color(0, 0, 204));
        btnPayment.setkHoverForeGround(new java.awt.Color(0, 0, 204));
        btnPayment.setkStartColor(new java.awt.Color(0, 0, 204));
        getContentPane().add(btnPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 459, 124, 32));

        btnRemove.setText("Remove");
        btnRemove.setkEndColor(new java.awt.Color(0, 0, 204));
        btnRemove.setkHoverEndColor(new java.awt.Color(0, 0, 204));
        btnRemove.setkStartColor(new java.awt.Color(0, 0, 255));
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 509, 124, 32));

        btnExit.setText("Exit");
        btnExit.setkEndColor(new java.awt.Color(255, 0, 0));
        btnExit.setkHoverEndColor(new java.awt.Color(255, 0, 0));
        btnExit.setkStartColor(new java.awt.Color(255, 0, 0));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 559, 286, 32));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocaActionPerformed
        double price = 0.7;
        DataItem("Coca-Cola","1",price);
        Itemproduct(); 
    }//GEN-LAST:event_btnCocaActionPerformed

    private void btnChampionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChampionActionPerformed
        double price = 0.8;
        DataItem("Champion","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnChampionActionPerformed

    private void btnRedStingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedStingActionPerformed
        double price = 0.8;
        DataItem("Red Sting","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnRedStingActionPerformed

    private void btnRedBullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedBullActionPerformed
        double price = 0.8;
        DataItem("Red bull","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnRedBullActionPerformed

    private void btnCarabaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarabaoActionPerformed
        double price = 0.85;
        DataItem("Carabao","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnCarabaoActionPerformed

    private void btnFantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFantaActionPerformed
        double price = 0.75;
        DataItem("Fanta","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnFantaActionPerformed

    private void btnSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpriteActionPerformed
        double price = 0.75;
        DataItem("Sprite","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnSpriteActionPerformed

    private void btnBaccusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaccusActionPerformed
        double price = 0.75;
        DataItem("Baccus","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnBaccusActionPerformed

    private void btnYellowStingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYellowStingActionPerformed
        double price = 0.75;
        DataItem("Yellow Sting","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnYellowStingActionPerformed

    private void btnVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVitalActionPerformed
        double price = 0.25;
        DataItem("Vital","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnVitalActionPerformed

    private void btnIzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzeActionPerformed
        double price = 0.5;
        DataItem("Ize","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnIzeActionPerformed

    private void btnMilkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMilkActionPerformed
        double price = 0.75;
        DataItem("Milk","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnMilkActionPerformed

    private void btnWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWorkActionPerformed
        double price = 0.5;
        DataItem("Work","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnWorkActionPerformed

    private void btnYeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYeosActionPerformed
        double price = 0.5;
        DataItem("Yeos","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnYeosActionPerformed

    private void btnMirindaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMirindaActionPerformed
        double price = 0.75;
        DataItem("Mirinda","1",price);
        Itemproduct();
    }//GEN-LAST:event_btnMirindaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        DefaultTableModel mode=(DefaultTableModel)tbDrink.getModel();
        mode.setRowCount(0);
        txtSubTotal.setText("");
        txtTax.setText("");
        txtTotal.setText("");
        txtCash.setText("");
        txtChange.setText("");
        cbPayment.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int result= JOptionPane.showConfirmDialog(rootPane, "Do yo want to exit","Attention",JOptionPane.YES_NO_OPTION);
        if(result==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtSubTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubTotalActionPerformed

    private void txtCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashActionPerformed
        
    }//GEN-LAST:event_txtCashActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String number=txtCash.getText();
        if(number==""){
            txtCash.setText("1");
        }else{
            number=txtCash.getText()+"1";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String number=txtCash.getText();
        if(number==""){
            txtCash.setText("2");
        }else{
            number=txtCash.getText()+"2";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String number=txtCash.getText();
        if(number==""){
            txtCash.setText("3");
        }else{
            number=txtCash.getText()+"3";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String number=txtCash.getText();
        if(number==""){
            txtCash.setText("4");
        }else{
            number=txtCash.getText()+"4";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        String number=txtCash.getText();
        if(number==""){
            txtCash.setText("5");
        }else{
            number=txtCash.getText()+"5";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String number=txtCash.getText();
        if(number==""){
            txtCash.setText("6");
        }else{
            number=txtCash.getText()+"6";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String number=txtCash.getText();
        if(number==""){
            txtCash.setText("7");
        }else{
            number=txtCash.getText()+"7";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        String number=txtCash.getText();
        if(number==""){
            txtCash.setText("8");
        }else{
            number=txtCash.getText()+"8";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        String number=txtCash.getText();
        if(number==""){
            txtCash.setText("9");
        }else{
            number=txtCash.getText()+"9";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String number=txtCash.getText();
        if(number.equalsIgnoreCase("")){
            txtCash.setText("");
        }else{
            number=txtCash.getText()+"0";
            txtCash.setText(number);
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        if(!txtCash.getText().contains(".")){
            txtCash.setText(txtCash.getText()+".");
        }
    }//GEN-LAST:event_btndotActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtCash.setText("");        
    }//GEN-LAST:event_btnCActionPerformed

    private void cbPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPaymentActionPerformed
        if(cbPayment.getSelectedIndex()==0){
            ChangeToDollar();
        }
        else
        {
            ChangeToKhmer();
        }
    }//GEN-LAST:event_cbPaymentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Drink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drink().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBaccus;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCarabao;
    private javax.swing.JButton btnChampion;
    private javax.swing.JButton btnCoca;
    private com.k33ptoo.components.KButton btnExit;
    private javax.swing.JButton btnFanta;
    private javax.swing.JButton btnIze;
    private javax.swing.JButton btnMilk;
    private javax.swing.JButton btnMirinda;
    private com.k33ptoo.components.KButton btnPayment;
    private com.k33ptoo.components.KButton btnPrint;
    private javax.swing.JButton btnRedBull;
    private javax.swing.JButton btnRedSting;
    private com.k33ptoo.components.KButton btnRemove;
    private com.k33ptoo.components.KButton btnReset;
    private javax.swing.JButton btnSprite;
    private javax.swing.JButton btnVital;
    private javax.swing.JButton btnWork;
    private javax.swing.JButton btnYellowSting;
    private javax.swing.JButton btnYeos;
    private javax.swing.JButton btndot;
    private javax.swing.JComboBox<String> cbPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDrink;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
