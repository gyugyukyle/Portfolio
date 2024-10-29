
package enrollment_system;

import java.awt.*;
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.*;
import net.proteanit.sql.*;
public class enrollment extends javax.swing.JFrame {

    Connection bruh=null;
    PreparedStatement skrt=null;
    ResultSet yeet=null;
    private String sexuality;
    private String ip;
    private byte[] title;
    String s;
    
    public enrollment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        textArea1 = new java.awt.TextArea();
        jSeparator1 = new javax.swing.JSeparator();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ENTRY = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        FIRST = new javax.swing.JTextField();
        MIDDLE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ZIP = new javax.swing.JTextField();
        ADDRESS = new javax.swing.JTextField();
        BIRTH = new javax.swing.JTextField();
        GRADE = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        RELIGION = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CONTACT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        LAST = new javax.swing.JTextField();
        SUR = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        ETHNICITY = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        DIALECT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        MAIDEN = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        FATHER = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        GUARDIAN = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        OCU1 = new javax.swing.JTextField();
        OCU2 = new javax.swing.JTextField();
        OCU3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        EDUC1 = new javax.swing.JTextField();
        EDUC2 = new javax.swing.JTextField();
        EDUC3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        NUMBER = new javax.swing.JTextField();
        pic = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        yes = new javax.swing.JCheckBox();
        no = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ctrl = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        strand = new javax.swing.JTextField();
        acad = new javax.swing.JComboBox<>();
        strand1 = new javax.swing.JTextField();
        trk = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enrollment_system/HATDUG.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("I. Fill up the following needed information below.");

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Student ID:");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ID.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Entry Year");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ENTRY.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Grade Level");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("First Name:");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Surname:");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Middle Name:");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FIRST.setBackground(new java.awt.Color(255, 204, 204));

        MIDDLE.setBackground(new java.awt.Color(255, 204, 204));
        MIDDLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIDDLEActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Sexuality:");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Birth Place:");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Birthday:");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Zip Code:");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Address:");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ZIP.setBackground(new java.awt.Color(255, 204, 204));

        ADDRESS.setBackground(new java.awt.Color(255, 204, 204));
        ADDRESS.setText("Please fill this with your complete address");
        ADDRESS.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        BIRTH.setBackground(new java.awt.Color(255, 204, 204));

        GRADE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        GRADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GRADEActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Religion:");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RELIGION.setBackground(new java.awt.Color(255, 204, 204));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Contact Number:");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CONTACT.setBackground(new java.awt.Color(255, 204, 204));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Last School Attended:");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LAST.setBackground(new java.awt.Color(255, 204, 204));

        SUR.setBackground(new java.awt.Color(255, 204, 204));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Ethnicity:");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ETHNICITY.setBackground(new java.awt.Color(255, 204, 204));
        ETHNICITY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ETHNICITYActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Dialect:");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        DIALECT.setBackground(new java.awt.Color(255, 204, 204));

        jLabel6.setText("Family Information");

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Mother's Maiden Name");
        jLabel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        MAIDEN.setBackground(new java.awt.Color(255, 204, 204));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Father's Name");
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FATHER.setBackground(new java.awt.Color(255, 204, 204));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Guardian's Name");
        jLabel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        GUARDIAN.setBackground(new java.awt.Color(255, 204, 204));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Occupation");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Occupation");
        jLabel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Occupation");
        jLabel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        OCU1.setBackground(new java.awt.Color(255, 204, 204));

        OCU2.setBackground(new java.awt.Color(255, 204, 204));
        OCU2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCU2ActionPerformed(evt);
            }
        });

        OCU3.setBackground(new java.awt.Color(255, 204, 204));
        OCU3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCU3ActionPerformed(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Educational background");
        jLabel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Educational background");
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        EDUC1.setBackground(new java.awt.Color(255, 204, 204));

        EDUC2.setBackground(new java.awt.Color(255, 204, 204));

        EDUC3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Contact Number to be used in case of emergency ");
        jLabel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NUMBER.setBackground(new java.awt.Color(255, 204, 204));

        pic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ENROLL NOW!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CANCEL ENROLLMENT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        buttonGroup2.add(yes);
        yes.setText("Yes");
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });

        buttonGroup2.add(no);
        no.setText("No");
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("IP");
        jLabel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextField1.setText("CONTROL NUMBER.");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ctrl.setBackground(new java.awt.Color(255, 204, 204));
        ctrl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctrlActionPerformed(evt);
            }
        });

        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        strand.setBackground(new java.awt.Color(204, 204, 204));
        strand.setText("Strand");
        strand.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        strand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                strandActionPerformed(evt);
            }
        });

        acad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "Academic ", "TVL", " " }));
        acad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acadActionPerformed(evt);
            }
        });

        strand1.setBackground(new java.awt.Color(204, 204, 204));
        strand1.setText("Track");
        strand1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        trk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "STEM", "ICT", "ABM", "GAS", "HUMMS", "AUTO", " " }));
        trk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trkActionPerformed(evt);
            }
        });

        jLabel32.setBackground(new java.awt.Color(204, 204, 204));
        jLabel32.setText("Educational background");
        jLabel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setText("Browse");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel29.setText("Please leave control number blank when enrolling. ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(MAIDEN, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(FATHER, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OCU1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(OCU2))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(GUARDIAN, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(OCU3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EDUC1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(EDUC3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                            .addComponent(EDUC2)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(strand, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(acad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(strand1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(BIRTH, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ETHNICITY, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DIALECT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RELIGION, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FIRST, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(905, 905, 905)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MIDDLE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SUR, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(206, 206, 206)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(GRADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(male)
                                                        .addGap(6, 6, 6)
                                                        .addComponent(female)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel17))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(316, 316, 316)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                                                        .addGap(75, 75, 75))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ENTRY, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LAST, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(13, 13, 13)))))
                        .addContainerGap(67, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ctrl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(569, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jButton5))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(ENTRY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(GRADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17)
                            .addComponent(LAST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(male)
                            .addComponent(female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FIRST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(MIDDLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SUR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(ADDRESS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(ZIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(BIRTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ETHNICITY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(DIALECT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(RELIGION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yes)
                            .addComponent(no)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(CONTACT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(acad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(strand1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(MAIDEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(OCU1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(EDUC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(FATHER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(OCU2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(EDUC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(GUARDIAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel26)
                            .addComponent(OCU3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EDUC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(NUMBER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))))
        );

        jTabbedPane4.addTab("ENROLLMENT FORM", jPanel2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Title 17", "Title 18", "Title 19", "Title 20", "Title 21", "Title 22", "Title 23", "Title 24", "Title 25", "Title 26"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Students data", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1394, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        ip="no";
    }//GEN-LAST:event_noActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        ip="yes";
    }//GEN-LAST:event_yesActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        sexuality="female";
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        sexuality="male";
    }//GEN-LAST:event_maleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(1>0){
            JOptionPane.showMessageDialog(null, "Are you sure with your delete your inserted data?");
        }
         try{
            String sql="DELETE FROM `tab` WHERE(`control num`)=(?)";
            bruh=DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolment?zeroDateTimeBehavior=convertToNull","root","");
            skrt=bruh.prepareStatement(sql);
             
            skrt.setString (1,ctrl.getText());
             
            skrt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deleted Succesfully");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         showtabledata();
    {
    }
    }//GEN-LAST:event_jButton3ActionPerformed
public ImageIcon ResizeImage(String imagePath){
 ImageIcon myImage=null;
 if(imagePath != null){
     myImage = new ImageIcon(imagePath);
 }
 else{
     myImage= new ImageIcon(); 
 }   
 Image img= myImage.getImage();
 Image newImage= img.getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_SMOOTH);
 ImageIcon imahe= new ImageIcon(newImage);
 return imahe;
         }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(1>0){
        JOptionPane.showMessageDialog(null, "Are you sure with your data?");
        }
        try{
            String sql="INSERT INTO `tab` (`id`, `entry`, `grade`, `sexuality`, `last`, `first`, `middle`, `surname`, `address`, `place`, `ethnicity`, `dialect`, `contact`, `maiden`, `father`, `guardian`, `occupation1`, `occupation2`, `occupation3`, `educ1`, `educ2`, `educ3`, `number`, `zip`, `religion`,`Ip`,`Track`,`Strand`,`IMAGE`)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            bruh=DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolment?zeroDateTimeBehavior=convertToNull","root","");
            skrt=bruh.prepareStatement(sql);
            FileInputStream is=null;
            
            skrt.setString (1,ID.getText());
            skrt.setString (2,ENTRY.getText());
            skrt.setString (3,GRADE.getSelectedItem().toString());
            skrt.setString (4,sexuality);
            skrt.setString (5,LAST.getText());

            skrt.setString (6,FIRST.getText());
            skrt.setString (7,MIDDLE.getText());
            skrt.setString (8,SUR.getText());
            skrt.setString (9,ADDRESS.getText());
            skrt.setString (10,BIRTH.getText());

            //skrt.setString (11,DAY.getText());
            skrt.setString (11,ETHNICITY.getText());
            skrt.setString (12,DIALECT.getText());
            skrt.setString (13,CONTACT.getText());
            skrt.setString (14,MAIDEN.getText());
            skrt.setString (15,FATHER.getText());

            skrt.setString (16,GUARDIAN.getText());
            skrt.setString (17,OCU1.getText());
            skrt.setString (18,OCU2.getText());
            skrt.setString (19,OCU3.getText());
            skrt.setString (20,EDUC1.getText());

            skrt.setString (21,EDUC2.getText());
            skrt.setString (22,EDUC3.getText());
            skrt.setString (23,NUMBER.getText());
            skrt.setString (24,ZIP.getText());
            skrt.setString (25,RELIGION.getText());
            
            skrt.setString (26,ip);
            skrt.setString (27,trk.getSelectedItem().toString());
            skrt.setString (28,acad.getSelectedItem().toString());
            skrt.setBinaryStream(6,is);

            
            skrt.executeUpdate();
            JOptionPane.showMessageDialog(null, "You're now enrolled sucessfully!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        showtabledata();{
        
    }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void OCU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCU3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OCU3ActionPerformed

    private void OCU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCU2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OCU2ActionPerformed

    private void ETHNICITYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ETHNICITYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ETHNICITYActionPerformed

    private void GRADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GRADEActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_GRADEActionPerformed

    private void MIDDLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIDDLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MIDDLEActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    showtabledata(); {
        
    }
    
    try{
    bruh=DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolment?zeroDateTimeBehavior=convertToNull","root","");
    String sql="SELECT * FROM `tab` WHERE `control num` = ?";
    skrt=bruh.prepareStatement (sql);
    skrt.setString (1,ctrl.getText());
   
    GRADE.removeAllItems();
    acad.removeAllItems();
    trk.removeAllItems();
   /* GRADE.addItem("GRADE");
    acad.addItem("acad");
    trk.addItem("trk");*/
    
    yeet=skrt.executeQuery();
    
    if(yeet.next()){
        ID.setText(yeet.getString("id"));
        ENTRY.setText(yeet.getString("entry"));
        GRADE.addItem(yeet.getString("grade"));
        LAST.setText(yeet.getString("last"));
        FIRST.setText(yeet.getString("first"));
        MIDDLE.setText(yeet.getString("middle"));
        SUR.setText(yeet.getString("surname"));
        ADDRESS.setText(yeet.getString("address"));
        BIRTH.setText(yeet.getString("place"));
        ETHNICITY.setText(yeet.getString("ethnicity"));
        DIALECT.setText(yeet.getString("dialect"));
        CONTACT.setText(yeet.getString("contact"));
        MAIDEN.setText(yeet.getString("maiden"));
        FATHER.setText(yeet.getString("father"));
        GUARDIAN.setText(yeet.getString("guardian"));
        OCU1.setText(yeet.getString("occupation1"));
        OCU2.setText(yeet.getString("occupation2"));
        OCU3.setText(yeet.getString("occupation3"));
        EDUC1.setText(yeet.getString("educ1"));
        EDUC2.setText(yeet.getString("educ2"));
        EDUC3.setText(yeet.getString("educ3"));
        NUMBER.setText(yeet.getString("number"));
        ZIP.setText(yeet.getString("zip"));
        RELIGION.setText(yeet.getString("religion"));
        trk.addItem(yeet.getString("Track"));
        acad.addItem(yeet.getString("Strand"));
        
        byte[] img = yeet.getBytes("IMAGE");
       
        ImageIcon image= new ImageIcon(img);
        Image im= image.getImage();
        Image myImg=im.getScaledInstance(pic.getWidth(), pic.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon newImage =new ImageIcon(myImg);
        pic.setIcon(newImage);
        
       if(null==yeet.getString("sexuality")){
           male.setSelected(false);
           female.setSelected(false);
       }
       else switch(yeet.getString("sexuality")){
           case "male":
               male.setSelected(true);
           break;
           case "female":
               female.setSelected(true);
           break; 
           default:
               male.setSelected(false);
               female.setSelected(false);
           break;
           
       }
       if (null== yeet.getString("ip")){
           yes.setSelected(false);
           no.setSelected(false);
       }
        else switch(yeet.getString("ip")){
           case "yes":
               yes.setSelected(true);
           break;
           case "no":
               no.setSelected(true);
           break; 
           default:
               yes.setSelected(false);
               no.setSelected(false);
           break;
    }}
    else{
        JOptionPane.showMessageDialog(null, "No results were found.Please try again later.");
    }
  
}   catch (SQLException ex) { 
    JOptionPane.showMessageDialog(null,ex);
    
           
}       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void acadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acadActionPerformed
      
    }//GEN-LAST:event_acadActionPerformed

    private void trkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trkActionPerformed
        
    }//GEN-LAST:event_trkActionPerformed

    private void ctrlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctrlActionPerformed
        
    }//GEN-LAST:event_ctrlActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       showtabledata(); {
        
    }
        if(1>0){
            JOptionPane.showMessageDialog(null, "Are you sure you want to update your data?");
        }    
        try{
             String sql="UPDATE `tab`"+ "SET `id`=?, `entry`=?, `grade`=?, `sexuality`=?, `last`=?, `first`=?, `middle`=?, `surname`=?, `address`=?, `place`=?, `ethnicity`=?, `dialect`=?, `contact`=?, `maiden`=?, `father`=?, `guardian`=?, `occupation1`=?, `occupation2`=?, `occupation3`=?, `educ1`=?, `educ2`=?, `educ3`=?, `number`=?, `zip`=?, `religion`=?,`Ip`=?,`Track`=?,`Strand`=? WHERE `tab`.`control num`=?";
          //  + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            bruh=DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolment?zeroDateTimeBehavior=convertToNull","root","");
            skrt=bruh.prepareStatement(sql);
            
            skrt.setString (1,ID.getText());
            skrt.setString (2,ENTRY.getText());
            skrt.setString (3,GRADE.getSelectedItem().toString());
            skrt.setString (4,sexuality);
            skrt.setString (5,LAST.getText());

            skrt.setString (6,FIRST.getText());
            skrt.setString (7,MIDDLE.getText());
            skrt.setString (8,SUR.getText());
            skrt.setString (9,ADDRESS.getText());
            skrt.setString (10,BIRTH.getText());

            skrt.setString (11,ETHNICITY.getText());
            skrt.setString (12,DIALECT.getText());
            skrt.setString (13,CONTACT.getText());
            skrt.setString (14,MAIDEN.getText());
            skrt.setString (15,FATHER.getText());

            skrt.setString (16,GUARDIAN.getText());
            skrt.setString (17,OCU1.getText());
            skrt.setString (18,OCU2.getText());
            skrt.setString (19,OCU3.getText());
            skrt.setString (20,EDUC1.getText());

            skrt.setString (21,EDUC2.getText());
            skrt.setString (22,EDUC3.getText());
            skrt.setString (23,NUMBER.getText());
            skrt.setString (24,ZIP.getText());
            skrt.setString (25,RELIGION.getText());
            
            skrt.setString (26,ip);
            skrt.setString (27,trk.getSelectedItem().toString());
            skrt.setString (28,acad.getSelectedItem().toString());
            skrt.setString (29,ctrl.getText());
            
            skrt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Your data is now updated!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

     JFileChooser filechooser= new JFileChooser();
     filechooser.setCurrentDirectory(new File(System.getProperty("user.home")));
     FileNameExtensionFilter filter= new FileNameExtensionFilter("*.images","jpg","gif","png");
     filechooser.addChoosableFileFilter(filter);
     int result = filechooser.showSaveDialog(null);
     if(result== JFileChooser.APPROVE_OPTION){
         File selectedFile = filechooser.getSelectedFile();
         String path= selectedFile.getAbsolutePath();
         pic.setIcon(ResizeImage(path));
         s= path;
    }
     else if(result == JFileChooser .CANCEL_OPTION){
        JOptionPane.showMessageDialog(null,"There's no data found."); 
     }
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void strandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_strandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_strandActionPerformed
       private void showtabledata(){
    try {
    bruh=DriverManager.getConnection("jdbc:mysql://localhost:3306/enrolment?zeroDateTimeBehavior=convertToNull","root","");
    String sql="SELECT * FROM tab";
    skrt=bruh.prepareStatement (sql);
    yeet=skrt.executeQuery();
        JTable setModel = jTable1.setModel(DbUtils.resultSetToTableModel(yeet));
    } 
    catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
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
            java.util.logging.Logger.getLogger(enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enrollment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enrollment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADDRESS;
    private javax.swing.JTextField BIRTH;
    private javax.swing.JTextField CONTACT;
    private javax.swing.JTextField DIALECT;
    private javax.swing.JTextField EDUC1;
    private javax.swing.JTextField EDUC2;
    private javax.swing.JTextField EDUC3;
    private javax.swing.JTextField ENTRY;
    private javax.swing.JTextField ETHNICITY;
    private javax.swing.JTextField FATHER;
    private javax.swing.JTextField FIRST;
    private javax.swing.JComboBox<String> GRADE;
    private javax.swing.JTextField GUARDIAN;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField LAST;
    private javax.swing.JTextField MAIDEN;
    private javax.swing.JTextField MIDDLE;
    private javax.swing.JTextField NUMBER;
    private javax.swing.JTextField OCU1;
    private javax.swing.JTextField OCU2;
    private javax.swing.JTextField OCU3;
    private javax.swing.JTextField RELIGION;
    private javax.swing.JTextField SUR;
    private javax.swing.JTextField ZIP;
    private javax.swing.JComboBox<String> acad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JTextField ctrl;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton male;
    private javax.swing.JCheckBox no;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField strand;
    private javax.swing.JTextField strand1;
    private java.awt.TextArea textArea1;
    private javax.swing.JComboBox<String> trk;
    private javax.swing.JCheckBox yes;
    // End of variables declaration//GEN-END:variables
}
