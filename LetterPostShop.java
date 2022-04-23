package MiniProject;

import javax.swing.JOptionPane;

public class LetterPostShop extends javax.swing.JFrame {

    public LetterPostShop() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        btnRun = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        rdoNormal = new javax.swing.JRadioButton();
        rdoRejister = new javax.swing.JRadioButton();
        rdoEMS = new javax.swing.JRadioButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Letter Post Shop Created By Nasreen");

        jLabel1.setFont(new java.awt.Font("TH Chakra Petch", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("ส่งจดหมาย");

        jLabel3.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        jLabel3.setText("ประเภทจดหมาย");

        jLabel4.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        jLabel4.setText("น้ำหนักจดหมาย (g)");

        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWeightKeyTyped(evt);
            }
        });

        btnRun.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        btnRun.setText("คำนวณราคา");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("TH Chakra Petch", 0, 36)); // NOI18N
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        buttonGroup1.add(rdoNormal);
        rdoNormal.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        rdoNormal.setText("ธรรมดา");

        buttonGroup1.add(rdoRejister);
        rdoRejister.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        rdoRejister.setText("ลงทะเบียน");

        buttonGroup1.add(rdoEMS);
        rdoEMS.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        rdoEMS.setText("EMS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnRun))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(44, 44, 44)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(rdoNormal)
                                .addGap(18, 18, 18)
                                .addComponent(rdoRejister)
                                .addGap(18, 18, 18)
                                .addComponent(rdoEMS))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(btnClear)
                        .addGap(54, 54, 54)
                        .addComponent(btnExit)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoNormal)
                        .addComponent(rdoRejister)
                        .addComponent(rdoEMS)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRun, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {                                       
        int baht = 0, result = 0;
        float wei = Float.parseFloat(txtWeight.getText());
        if (rdoNormal.isSelected()) {
            if ((wei > 1000) && (wei <= 2000)) {
                baht = 45;
            } else if ((wei > 500) && (wei <= 1000)) {
                baht = 25;
            } else if ((wei > 250) && (wei <= 500)) {
                baht = 15;
            } else if ((wei > 100) && (wei <= 250)) {
                baht = 9;
            } else if ((wei > 20) && (wei <= 100)) {
                baht = 5;
            } else {
                baht = 3;
            }
            txtResult.setText("" + baht + " บาท");
        } else if (rdoEMS.isSelected()) {
            if ((wei > 1000) && (wei <= 2000)) {
                baht = 77;
            } else if ((wei > 500) && (wei <= 1000)) {
                baht = 62;
            } else if ((wei > 250) && (wei <= 500)) {
                baht = 47;
            } else if ((wei > 100) && (wei <= 250)) {
                baht = 37;
            } else if ((wei > 20) && (wei <= 100)) {
                baht = 32;
            } else {
                baht = 27;
            }
            txtResult.setText("" + baht + " บาท");
        } else if (rdoRejister.isSelected()) {
            if ((wei > 1000) && (wei <= 2000)) {
                baht = 58;
            } else if ((wei > 500) && (wei <= 1000)) {
                baht = 38;
            } else if ((wei > 250) && (wei <= 500)) {
                baht = 28;
            } else if ((wei > 100) && (wei <= 250)) {
                baht = 22;
            } else if ((wei > 20) && (wei <= 100)) {
                baht = 18;
            } else {
                baht = 16;
            }
            txtResult.setText("" + baht + " บาท");
        }
    }                                      

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int option = JOptionPane.showConfirmDialog(rootPane, "คุณแน่ใจหรือไม่?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                       

    private void txtWeightKeyTyped(java.awt.event.KeyEvent evt) {                                   
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }                                  

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtResult.setText("");
        txtWeight.setText("");
        buttonGroup1.clearSelection();
    }                                        

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
            java.util.logging.Logger.getLogger(LetterPostShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LetterPostShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LetterPostShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LetterPostShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LetterPostShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRun;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoEMS;
    private javax.swing.JRadioButton rdoNormal;
    private javax.swing.JRadioButton rdoRejister;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration                   
}
