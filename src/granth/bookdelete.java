/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granth;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MOHIT
 */
public class bookdelete extends javax.swing.JInternalFrame {
Connection c=null;
Statement s=null,k=null;
ResultSet rs=null;
    /**
     * Creates new form bookdelete
     */
    public bookdelete() {
        initComponents();
        t5.setEnabled(false);
        t2.setEnabled(false);
        t3.setEnabled(false);
        t4.setEnabled(false);
        t6.setEnabled(false);
        t7.setEnabled(false);
        t2.setEditable(false);
        t3.setEditable(false);t4.setEditable(false);t5.setEditable(false);t6.setEditable(false);t7.setEditable(false);
        
        
        
        
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mohit","root","");
                    }catch(Exception e)
                    {
                        JOptionPane.showMessageDialog(rootPane,e.getMessage());
                    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(602, 426));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 224, 57, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Authors");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 163, -1, -1));
        getContentPane().add(t7, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 265, 80, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 226, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, 492, 10));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Purchase Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 270, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 255));
        jLabel11.setText("BOOKS CONSOLE");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 11, 233, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Pages");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 226, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 318, 525, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Edition");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 226, -1, -1));
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 92, 39, -1));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 123, 231, -1));
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 161, 245, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("(YYYY-MM-DD)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 287, -1, -1));
        getContentPane().add(t6, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 224, 61, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Accession No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 94, -1, -1));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 224, 47, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Book Title");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 125, -1, -1));

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jButton1.setText("VIEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/granth/abstract_colour_background_orange.jpg"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(557, 400));
        jLabel4.setMinimumSize(new java.awt.Dimension(557, 400));
        jLabel4.setPreferredSize(new java.awt.Dimension(557, 400));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String q="delete from books where no='"
                +t1.getText()+"'";
 String p="delete from manage where no='"+t1.getText()+"'";
        try{
            k=c.createStatement();
              k.executeUpdate(p);
             s=c.createStatement();
            int c=JOptionPane.showConfirmDialog(this,"ARE YOU SURE TO DELETE THE RECOED?", "Confirmation Dialog Box", JOptionPane.YES_NO_OPTION);
            if(c==JOptionPane.YES_OPTION)
            {
           
            s.executeUpdate(q);
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
          JOptionPane.showMessageDialog(rootPane,"BOOK DETAILS ARE DELETED");
            
            }   
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(rootPane,e.getMessage());
          
        }      
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     String q="select * from books where no='"+t1.getText()+"'"; 
        try{
            s=c.createStatement();
            rs=s.executeQuery(q);
            rs.next();
            
                
                t2.setText(rs.getString("title"));
                t3.setText(rs.getString("author"));
                t4.setText(rs.getString("page"));
                t5.setText(rs.getString("edition"));
                t6.setText(rs.getString("price"));
                t7.setText(rs.getString("date"));
                
                
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,e.getMessage());

        }
        t5.setEnabled(true);
        t2.setEnabled(true);
        t3.setEnabled(true);
        t4.setEnabled(true);
        t6.setEnabled(true);
        t7.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    // End of variables declaration//GEN-END:variables
}
