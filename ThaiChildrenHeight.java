package MiniProject;

import javax.swing.JOptionPane;


public class ThaiChildrenHeight extends javax.swing.JFrame {


    public ThaiChildrenHeight() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdoFemale = new javax.swing.JRadioButton();
        rdoMale = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRun = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thai Children Height Created By Nasreen");

        jLabel1.setFont(new java.awt.Font("TH Chakra Petch", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("วัดความสูงเด็กไทย");

        jLabel2.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        jLabel2.setText("เพศ");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        rdoFemale.setText("หญิง");
        rdoFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFemaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        rdoMale.setText("ชาย");
        rdoMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMaleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        jLabel3.setText("อายุ");

        jLabel4.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        jLabel4.setText("ความสูง");

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });
        txtHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHeightKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        jLabel5.setText("ปี");

        jLabel6.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        jLabel6.setText("เซนติเมตร");

        btnRun.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        btnRun.setText("คำนวณ");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        jLabel7.setText("ผลวัดความสูง");

        txtResult.setEditable(false);
        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        btnClear.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("TH Chakra Petch", 1, 24)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(rdoFemale)
                .addGap(18, 18, 18)
                .addComponent(rdoMale)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRun)
                                .addGap(31, 31, 31)
                                .addComponent(btnClear))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(171, 171, 171)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdoFemale)
                    .addComponent(rdoMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRun)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void rdoFemaleActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void rdoMaleActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {                                
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }                               

    private void txtHeightKeyTyped(java.awt.event.KeyEvent evt) {                                   
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }                                  

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String age = txtAge.getText();
        String height = txtHeight.getText();

        int ages = Integer.valueOf(age);
        int hei = Integer.valueOf(height);
        if (rdoFemale.isSelected()) {
            switch (ages) {
                case 5:
                    if (hei <= 105) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 115 && hei <= 120) {
                        txtResult.setText("สูง");
                    } else if (hei >= 106 && hei <= 114) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 6:
                    if (hei <= 110) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 118 && hei <= 123) {
                        txtResult.setText("สูง");
                    } else if (hei >= 111 && hei <= 117) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 7:
                    if (hei <= 117) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 123 && hei <= 132) {
                        txtResult.setText("สูง");
                    } else if (hei >= 118 && hei <= 122) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 8:
                    if (hei <= 123) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 137 && hei <= 145) {
                        txtResult.setText("สูง");
                    } else if (hei >= 124 && hei <= 136) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 9:
                    if (hei <= 128) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 145 && hei <= 150) {
                        txtResult.setText("สูง");
                    } else if (hei >= 129 && hei <= 144) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 10:
                    if (hei <= 132) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 147 && hei <= 152) {
                        txtResult.setText("สูง");
                    } else if (hei >= 133 && hei <= 146) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 11:
                    if (hei <= 137) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 153 && hei <= 162) {
                        txtResult.setText("สูง");
                    } else if (hei >= 138 && hei <= 152) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 12:
                    if (hei <= 145) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 157 && hei <= 165) {
                        txtResult.setText("สูง");
                    } else if (hei >= 146 && hei <= 156) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 13:
                    if (hei <= 149) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 163 && hei <= 168) {
                        txtResult.setText("สูง");
                    } else if (hei >= 150 && hei <= 162) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 14:
                    if (hei <= 152) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 165 && hei <= 170) {
                        txtResult.setText("สูง");
                    } else if (hei >= 153 && hei <= 164) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 15:
                    if (hei <= 155) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 167 && hei <= 175) {
                        txtResult.setText("สูง");
                    } else if (hei >= 156 && hei <= 166) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 16:
                    if (hei <= 157) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 170 && hei <= 173) {
                        txtResult.setText("สูง");
                    } else if (hei >= 158 && hei <= 169) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 17:
                    if (hei <= 157) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 171 && hei <= 173) {
                        txtResult.setText("สูง");
                    } else if (hei >= 158 && hei <= 170) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 18:
                    if (hei <= 158) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 172 && hei <= 175) {
                        txtResult.setText("สูง");
                    } else if (hei >= 159 && hei <= 171) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 19:
                    if (hei <= 159) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 172 && hei <= 177) {
                        txtResult.setText("สูง");
                    } else if (hei >= 160 && hei <= 171) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 20:
                    if (hei <= 160) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 172 && hei >= 179) {
                        txtResult.setText("สูง");
                    } else if (hei >= 161 && hei <= 171) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(rootPane, "ป้อนอายุใหม่ค่ะ");
                    break;
            }
        } else if (rdoMale.isSelected()) {
            switch (ages) {
                case 5:
                    if (hei <= 105) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 115 && hei <= 120) {
                        txtResult.setText("สูง");
                    } else if (hei >= 106 && hei <= 114) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 6:
                    if (hei <= 112) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 118 && hei <= 125) {
                        txtResult.setText("สูง");
                    } else if (hei >= 113 && hei <= 117) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 7:
                    if (hei <= 117) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 125 && hei <= 132) {
                        txtResult.setText("สูง");
                    } else if (hei >= 118 && hei <= 124) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 8:
                    if (hei <= 122) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 136 && hei <= 145) {
                        txtResult.setText("สูง");
                    } else if (hei >= 123 && hei <= 135) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 9:
                    if (hei <= 126) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 142 && hei <= 152) {
                        txtResult.setText("สูง");
                    } else if (hei >= 127 && hei <= 141) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 10:
                    if (hei <= 132) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 146 && hei <= 158) {
                        txtResult.setText("สูง");
                    } else if (hei >= 134 && hei <= 145) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 11:
                    if (hei <= 136) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 158 && hei <= 163) {
                        txtResult.setText("สูง");
                    } else if (hei >= 137 && hei <= 157) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 12:
                    if (hei <= 142) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 162 && hei <= 168) {
                        txtResult.setText("สูง");
                    } else if (hei >= 143 && hei <= 161) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 13:
                    if (hei <= 146) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 165 && hei <= 170) {
                        txtResult.setText("สูง");
                    } else if (hei >= 147 && hei <= 164) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 14:
                    if (hei <= 150) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 172 && hei <= 175) {
                        txtResult.setText("สูง");
                    } else if (hei >= 151 && hei <= 171) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 15:
                    if (hei <= 157) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 177 && hei <= 185) {
                        txtResult.setText("สูง");
                    } else if (hei >= 158 && hei <= 176) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 16:
                    if (hei <= 160) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 181 && hei <= 187) {
                        txtResult.setText("สูง");
                    } else if (hei >= 161 && hei <= 180) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 17:
                    if (hei <= 160) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 181 && hei <= 187) {
                        txtResult.setText("สูง");
                    } else if (hei >= 161 && hei <= 180) {
                        txtResult.setText("สมส่วน");
                    }
                    if (hei <= 163) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 183 && hei <= 189) {
                        txtResult.setText("สูง");
                    } else if (hei >= 164 && hei <= 182) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 18:
                    if (hei <= 165) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 185 && hei <= 188) {
                        txtResult.setText("สูง");
                    } else if (hei >= 166 && hei <= 184) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 19:

                    if (hei <= 165) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 187 && hei <= 190) {
                        txtResult.setText("สูง");
                    } else if (hei >= 166 && hei <= 186) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                case 20:
                    if (hei <= 165) {
                        txtResult.setText("เตี้ย");
                    } else if (hei >= 188 && hei <= 192) {
                        txtResult.setText("สูง");
                    } else if (hei >= 166 && hei <= 187) {
                        txtResult.setText("สมส่วน");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(rootPane, "ป้อนอายุใหม่ค่ะ");
                    break;
            } 
        }
    }                                      

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        txtAge.setText("");
        txtHeight.setText("");
        txtResult.setText("");
        buttonGroup1.clearSelection();
    }                                        

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int option = JOptionPane.showConfirmDialog(rootPane, "คุณแน่ใจหรือไม่?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }                                       

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ThaiChildrenHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThaiChildrenHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThaiChildrenHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThaiChildrenHeight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThaiChildrenHeight().setVisible(true);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration                   
}
