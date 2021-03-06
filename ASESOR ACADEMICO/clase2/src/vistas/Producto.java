/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Categoria;

/**
 *
 * @author asesor
 */
public class Producto extends javax.swing.JFrame {
    
    ArrayList<Integer> idCategoria=new ArrayList();
    private boolean encontrado;
    private boolean listo=false;
    private ListaProductos f;
    /**
     * Creates new form Producto
     */
    public Producto(String codigo,ListaProductos f){
        this(codigo);
        this.f=f;
    }
    public Producto(String codigo){
        this();
        txtCodigo.setText(codigo);
        txtCodigoFocusLost(null);
    }
    
    public void llenarComboCategoria(){
        String sql="select * from categoria order by nombre";
        ResultSet rs=Conexion.consultar(sql);
        try {
            cmbCategoria.removeAllItems();
           // cmbCategoria.addItem("Seleccione");
            while (rs.next()){
                Categoria c=new Categoria(
                        rs.getInt("id"),
                        rs.getString("nombre")
                );
                cmbCategoria.addItem(c);
            }
            cmbCategoria.setSelectedIndex(-1);
            listo=true;
        } catch (SQLException ex) {
            System.out.println("Error al llenar el combo: "+ex.getMessage());
        }
    }
    
    public Producto() {
        initComponents();
        llenarComboCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        cmbCategoria = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Código");

        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });

        jLabel2.setText("Nombre");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel3.setText("Precio");

        jCheckBox1.setText("Excento");

        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        jLabel4.setText("Categoría");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addGap(37, 37, 37)
                .addComponent(btnGuardar)
                .addGap(26, 26, 26))
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
        return -1;
    }
    
    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        // TODO add your handling code here:
        if (!txtCodigo.getText().isEmpty()){
            String c="'"+txtCodigo.getText()+"'";
            String sql="select * from producto where codigo="+c;
            ResultSet rs=Conexion.consultar(sql);
            if (rs==null) 
                JOptionPane.showMessageDialog(null, "Error de conexion");
            else
                try {

                    if (rs.next()){
                        encontrado=true;
                        txtNombre.setText(rs.getString("nombre"));
                        String valores[]=rs.getString("fecha").split("-");
                        JOptionPane.showMessageDialog(null, 
                                "dia: "+valores[2]+
                                " mes: "+valores[1]+
                                " año: "+valores[0]);
                        txtPrecio.setText(rs.getString("precio"));
                        int posicion=getIndexDeCategoria(rs.getInt("idcategoria"));
                        listo=false;
                        cmbCategoria.setSelectedIndex(posicion);
                        listo=true;
                        jCheckBox1.setSelected(rs.getInt("excento")==1);
                    }else{
                        JOptionPane.showMessageDialog(null,"No existe");
                        encontrado=false;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error");
                }
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String sql;
        Categoria cat=(Categoria)cmbCategoria.getSelectedItem();
        String categoria=String.valueOf(cat.getId());
        if (encontrado)
            sql="update producto set "+
                "nombre= '"+txtNombre.getText()+"',"+
                "precio= "+txtPrecio.getText()+","+
                "idcategoria="+categoria+","+
                "excento= "+(jCheckBox1.isSelected()?"1":"0")+
                " where codigo='"+txtCodigo.getText()+"'";
        else
            sql="insert into producto "
                + "(codigo,precio,nombre,excento,idcategoria) "
                + "values ("+
                  "'"+txtCodigo.getText()+"',"+
                      txtPrecio.getText()+"," +
                  "'"+txtNombre.getText()+"',"+
                  (jCheckBox1.isSelected()?"1":"0")+","+
                  categoria+")";
        
        if (Conexion.ejecutar(sql)){
            JOptionPane.showMessageDialog(null, 
                    "Se registro exitosamente");
            txtCodigo.setText("");
            txtNombre.setText("");
            txtPrecio.setText("");
            cmbCategoria.setSelectedIndex(-1);
            jCheckBox1.setSelected(false);
            txtCodigo.requestFocus();
            f.llenarListado();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        // TODO add your handling code here:
        if (listo)
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
    private javax.swing.JComboBox cmbCategoria;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
