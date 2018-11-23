
package vistas;

import java.sql.ResultSet;
import bd.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Categoria;

public class Producto extends javax.swing.JFrame {
    
    private boolean encontrado;
    private boolean listo= false;
    
    public Producto(String codigo){
        this();
        txtCodigo.setText(codigo);
        txtCodigoFocusLost(null);
    }
    
    public Producto() {
        initComponents();
        llenarComboCategoria();
    }
    
    public void llenarComboCategoria() {
        String sql = "SELECT * FROM categoria";
        ResultSet rs = Conexion.consultar(sql);
        try {
            cmbCategoria.removeAllItems();
            //cmbCategoria.addItem("Seleccione una");
            while (rs.next()) {
                Categoria c= new Categoria(
                rs.getInt("id"),
                rs.getString("nombre"));
                cmbCategoria.addItem(c);
            }
            cmbCategoria.setSelectedIndex(-1);
            listo=true;
        } catch (SQLException ex) {
            System.out.println("Error al llenar el combo: "+ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lbPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        chkExcento = new javax.swing.JCheckBox();
        cmbCategoria = new javax.swing.JComboBox();
        lbCategoria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbCodigo.setText("Código");

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });

        lbNombre.setText("Nombre");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lbPrecio.setText("Precio");

        chkExcento.setText("Excento");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        lbCategoria.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbNombre)
                                        .addComponent(lbCodigo))
                                    .addComponent(lbPrecio)
                                    .addComponent(lbCategoria))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(chkExcento)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkExcento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCategoria))
                .addGap(46, 46, 46)
                .addComponent(btnGuardar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private int getIndexDeCategoria(int idCategoria){
        for (int i=0;i<cmbCategoria.getItemCount();i++)
        {
            Categoria c=(Categoria)cmbCategoria.getItemAt(i);
            if (c.getId()==idCategoria)
                return i;
        }
        return 0;
    }
    
    
    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        if (!txtCodigo.getText().isEmpty()) {
            String c = "'" + txtCodigo.getText() + "'";
            String sql = "select * from producto where codigo=" + c;
            ResultSet rs = Conexion.consultar(sql);
            if (rs == null) {
                JOptionPane.showMessageDialog(null, "Error de conexión");
            } else {
                try {
                    if (rs.next()) {
                        encontrado = true;
                        txtNombre.setText(rs.getString("nombre"));
                        txtPrecio.setText(rs.getString("precio"));
                        int posicion=getIndexDeCategoria(rs.getInt("idcategoria"));
                        cmbCategoria.setSelectedIndex(rs.getInt("idcategoria"));
                        chkExcento.setSelected(rs.getInt("excento") == 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ERROR");
                    encontrado = false;
                }
            }
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String sql;
        Categoria cat = (Categoria)cmbCategoria.getSelectedItem();
        String categoria = String.valueOf(cat.getId());
        if (encontrado){
            sql = "UPDATE producto SET nombre= '"+txtNombre.getText()+"', "
                    + "precio= '"+txtPrecio.getText()+"', "
                    + "idcategoria=1,"
                    + "excento= "+(chkExcento.isSelected()?"1":"0")
                    + " WHERE codigo= '"+txtCodigo.getText()+"'";
        }
        else{
        sql = "insert into producto "
                + "(codigo,precio,nombre,excento,idcategoria) values ("+
                "'"+txtCodigo.getText()+"',"+
                txtPrecio.getText()+","+
                "'"+txtNombre.getText()+"'"
                + ","+(chkExcento.isSelected()?"1":"0")+","
                + "1)";
        }
        if(Conexion.ejecutar(sql)){
            JOptionPane.showMessageDialog(null, "Se registró exitosamente");
            txtCodigo.setText("");
            txtNombre.setText("");
            txtPrecio.setText("");
            txtCodigo.requestFocus();
            chkExcento.setSelected(false);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
        if(listo)
            JOptionPane.showMessageDialog(null,
                    cmbCategoria.getSelectedItem());
    }//GEN-LAST:event_cmbCategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkExcento;
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
