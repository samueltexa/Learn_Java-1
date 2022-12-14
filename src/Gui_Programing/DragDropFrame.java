/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Programing;
import javax.swing.JOptionPane;

/**
 *
 * @author Samuel
 */
public class DragDropFrame extends javax.swing.JFrame {

    /**
     * Creates new form DragDropFrame
     */
    public DragDropFrame() {
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

        lbloopcourseworkmark = new javax.swing.JLabel();
        txtoopcourseworkmark = new javax.swing.JTextField();
        lbloopeaxammark = new javax.swing.JLabel();
        txtoopexammark = new javax.swing.JTextField();
        btncalculate = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        lbloopfinalmark = new javax.swing.JLabel();
        txtoopfinalmark = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Regno System");

        lbloopcourseworkmark.setText("Oop Coursework Mark");

        txtoopcourseworkmark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoopcourseworkmarkActionPerformed(evt);
            }
        });

        lbloopeaxammark.setText("Oop Exam Mark");

        txtoopexammark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoopexammarkActionPerformed(evt);
            }
        });

        btncalculate.setText("Calculate");
        btncalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        lbloopfinalmark.setText("Oop Final Mark");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btncalculate)
                .addGap(75, 75, 75)
                .addComponent(btnexit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(btnclear)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbloopeaxammark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbloopcourseworkmark, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbloopfinalmark, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtoopcourseworkmark)
                    .addComponent(txtoopexammark, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(txtoopfinalmark))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbloopcourseworkmark)
                    .addComponent(txtoopcourseworkmark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbloopeaxammark)
                    .addComponent(txtoopexammark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbloopfinalmark, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtoopfinalmark, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncalculate)
                    .addComponent(btnexit)
                    .addComponent(btnclear))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtoopexammarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoopexammarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoopexammarkActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        txtoopcourseworkmark.setText("");
        txtoopexammark.setText("");
        txtoopcourseworkmark.requestFocus();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btncalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateActionPerformed
        if(txtoopcourseworkmark.getText().length() == 0){
             JOptionPane.showMessageDialog(null, "Enter course work mark out of 40.");
            txtoopcourseworkmark.requestFocus();
            return;
        }
         if(txtoopexammark.getText().length() == 0){
            JOptionPane.showMessageDialog(null, "Enter exam mark out of 60.");
            txtoopexammark.requestFocus();
            return;
        }
        int cw_mark = 0, exam_mark = 0, final_mark = 0;
        boolean flag = false;
        try{
            cw_mark = Integer.parseInt(txtoopcourseworkmark.getText());
            flag = true;
            exam_mark = Integer.parseInt(txtoopexammark.getText());
            final_mark = cw_mark + exam_mark;
            txtoopfinalmark.setText(final_mark +"");
            JOptionPane.showMessageDialog(null, "See your final percentage mark.");
            
        
        }
        catch(NumberFormatException ex){
            if(flag == false){
            JOptionPane.showMessageDialog(null, "Only integers allowed for course work mark, Enter it again.");
            txtoopcourseworkmark.setText("");
            txtoopcourseworkmark.requestFocus();
            return; 
            }
            if(flag == false){
            JOptionPane.showMessageDialog(null, "Only integers allowed for final mark, Enter it again.");
            txtoopfinalmark.setText("");
            txtoopfinalmark.requestFocus();
            return;   
            
        }
        //JOptionPane.showMessageDialog(null, "See your final percentage marks.");
        txtoopcourseworkmark.setText("");
        txtoopexammark.setText("");
        txtoopexammark.requestFocus();
    }//GEN-LAST:event_btncalculateActionPerformed
    }
    
    private void txtoopcourseworkmarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoopcourseworkmarkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoopcourseworkmarkActionPerformed

    /**
     * paramargs the command line arguments
     */
    public void Main(){
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
            java.util.logging.Logger.getLogger(DragDropFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DragDropFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DragDropFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DragDropFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DragDropFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalculate;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel lbloopcourseworkmark;
    private javax.swing.JLabel lbloopeaxammark;
    private javax.swing.JLabel lbloopfinalmark;
    private javax.swing.JTextField txtoopcourseworkmark;
    private javax.swing.JTextField txtoopexammark;
    private javax.swing.JTextField txtoopfinalmark;
    // End of variables declaration//GEN-END:variables
}
