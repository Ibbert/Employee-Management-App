/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainView = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        firstnameTextField = new javax.swing.JTextArea();
        lastnameLabel = new javax.swing.JLabel();
        lastnameTextField = new javax.swing.JTextArea();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextArea();
        createButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        tableScrollPane = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        findLabel = new javax.swing.JLabel();
        findTextField = new javax.swing.JTextArea();
        findButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        checkDBbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainView.setPreferredSize(new java.awt.Dimension(800, 500));

        titleLabel.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        titleLabel.setText("Employee Mangement System");

        firstnameLabel.setText("First name:");

        firstnameTextField.setColumns(1);
        firstnameTextField.setRows(5);

        lastnameLabel.setText("Last name:");

        lastnameTextField.setColumns(1);
        lastnameTextField.setRows(5);

        emailLabel.setText("Email:");

        emailTextField.setColumns(1);
        emailTextField.setRows(5);

        createButton.setText("Create");
        createButton.setToolTipText("Submit your input");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.setToolTipText("Update an employee");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteButton.setText("Delete");
        deleteButton.setToolTipText("Delete an employee");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "First name", "Last name", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableScrollPane.setViewportView(employeeTable);

        findLabel.setText("Search for employees by ID:");

        findTextField.setColumns(1);
        findTextField.setRows(5);

        findButton.setText("Find");
        findButton.setToolTipText("Look for employee by their ID");
        findButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.setToolTipText("Clear the text fields for first name, last name and e-mail.");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        checkDBbutton.setText("Check for connection");
        checkDBbutton.setToolTipText("Submit your input");
        checkDBbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDBbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainViewLayout = new javax.swing.GroupLayout(MainView);
        MainView.setLayout(MainViewLayout);
        MainViewLayout.setHorizontalGroup(
            MainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainViewLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(MainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstnameLabel)
                    .addComponent(lastnameLabel)
                    .addComponent(titleLabel)
                    .addComponent(emailLabel)
                    .addComponent(lastnameTextField)
                    .addComponent(emailTextField)
                    .addComponent(firstnameTextField)
                    .addComponent(checkDBbutton)
                    .addGroup(MainViewLayout.createSequentialGroup()
                        .addComponent(createButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(MainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainViewLayout.createSequentialGroup()
                        .addComponent(findTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findButton))
                    .addComponent(findLabel)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        MainViewLayout.setVerticalGroup(
            MainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainViewLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(MainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainViewLayout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(firstnameLabel))
                    .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MainViewLayout.createSequentialGroup()
                        .addComponent(findLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainViewLayout.createSequentialGroup()
                        .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastnameLabel)
                        .addGap(5, 5, 5)
                        .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(MainViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createButton)
                            .addComponent(updateButton)
                            .addComponent(deleteButton)
                            .addComponent(clearButton))
                        .addGap(14, 14, 14)
                        .addComponent(checkDBbutton))
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainView, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainView, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("You pressed the button.");

        // String for firstname, lastname, email and SQL query
        String fn, ln, em, query;

        // Connect to SQL database 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connection = "jdbc:mysql://localhost:3306/employee_db";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(connection, user, password);
            Statement st = con.createStatement();

            if ("".equals(firstnameTextField.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "First name is required", "Error", 
                        JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(lastnameTextField.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Last name is required", "Error", 
                        JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(emailTextField.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email is required", "Error", 
                        JOptionPane.ERROR_MESSAGE);
            } else {
                fn = firstnameTextField.getText();
                ln = lastnameTextField.getText();
                em = emailTextField.getText();
                query = "INSERT INTO user (firstname, lastname, email) "
                        + "VALUES ('" + fn + "', '" + ln + "', '" + em + "')";

                st.executeUpdate(query);
                showMessageDialog(null, "Sucsessfully registered");
                loadData();
                con.close();

                System.out.println("Sucsess!");
                System.out.println(fn + " " + ln + " and " + em + " has been added");
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String ID;
        String fn, ln, em;
        boolean notFound = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connection = "jdbc:MySQL://localhost:3306/employee_db";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(connection, user, pass);
            Statement st = con.createStatement();

            ID = findTextField.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM user WHERE user_id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    notFound = true;
                    fn = firstnameTextField.getText();
                    ln = lastnameTextField.getText();
                    em = emailTextField.getText();
                    String query = "UPDATE user SET firstname='" + fn + "', lastname='" + ln + "', email='" + em + "' WHERE user_id=" + ID;
                    showMessageDialog(null, "User has been updated");
                    st.executeUpdate(query);
                    loadData();
                    con.close();
                }
                if (notFound == false) {
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void findButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Finding");
        String ID;
        boolean notFound = true;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connection = "jdbc:mysql://localhost:3306/employee_db";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(connection, user, password);
            Statement st = con.createStatement();

            ID = findTextField.getText();

            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(new JFrame(), "ID is required", "Error", 
                        JOptionPane.ERROR_MESSAGE);
            } else {
                String query = "SELECT * FROM user WHERE user_id=" + ID;
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    firstnameTextField.setText(rs.getString("firstname"));
                    lastnameTextField.setText(rs.getString("lastname"));
                    emailTextField.setText(rs.getString("email"));
                    notFound = false;
                }
                if (!notFound == false) {
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid ID", "Error", 
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_findButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String ID;
        boolean notFound = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String connection = "jdbc:MySQL://localhost:3306/employee_db";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(connection, user, pass);
            Statement st = con.createStatement();

            ID = findTextField.getText();
            if ("".equals(ID)) {
                JOptionPane.showMessageDialog(new JFrame(), "ID is require", "Dialog",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "SELECT * FROM user WHERE user_id=" + ID;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    notFound = true;
                    String query = "DELETE FROM user WHERE user_id=" + ID;
                    showMessageDialog(null, "User has been deleted");
                    st.executeUpdate(query);
                    loadData();
                    con.close();
                }
                if (notFound == false) {
                    JOptionPane.showMessageDialog(new JFrame(), "invalid ID", "Dialog",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        firstnameTextField.setText("");
        lastnameTextField.setText("");
        emailTextField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void checkDBbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDBbuttonActionPerformed
        // TODO add your handling code here:
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "");
                // Connection successful
                JOptionPane.showMessageDialog(this, "Database is connected to localhost.");
                connection.close();  // Close the connection
                
        } catch (Exception e) {
            // Handle SQL exception
            e.printStackTrace();
        }
    }//GEN-LAST:event_checkDBbuttonActionPerformed

    public void loadData() {
        try {
            System.out.println("Loading...");

            Class.forName("com.mysql.cj.jdbc.Driver");

            String connection = "jdbc:mysql://localhost:3306/employee_db";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(connection, user, password);
            Statement st = con.createStatement();

            DefaultTableModel model = new DefaultTableModel(new String[]{"User", "First name", "Last name", "E-mail"}, 0);

            employeeTable.setModel(model);
            String query = "SELECT * FROM user";
            ResultSet rs = st.executeQuery(query);

            String id, fn, ln, email;
            while (rs.next()) {
                id = rs.getString("user_id");
                fn = rs.getString("firstname");
                ln = rs.getString("lastname");
                email = rs.getString("email");
                model.addRow(new Object[]{id, fn, ln, email});
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                View x = new View();
                x.loadData();
                x.setLocationRelativeTo(null);
                x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainView;
    private javax.swing.JButton checkDBbutton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextArea emailTextField;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton findButton;
    private javax.swing.JLabel findLabel;
    private javax.swing.JTextArea findTextField;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextArea firstnameTextField;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextArea lastnameTextField;
    private javax.swing.JScrollPane tableScrollPane;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
