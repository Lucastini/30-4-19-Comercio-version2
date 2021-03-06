/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import negocio.Articulo;
import negocio.Comercio;

/**
 *
 * @author Mosqueteros
 */
public class VentanaNuevoArticulo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaNuevoArticulo
     */
    public VentanaNuevoArticulo(VentanaPrincipal vp, Comercio com) {
        initComponents();
        ventPrincipal=vp;
        comercio=com;
    }
    
    private void limpiarPantalla(){
        txtDescripcion.setText("");
        txtCosto.setText("");
        txtPorcGanancia.setText("");
        grupoImportado.clearSelection();
        txtDescripcion.requestFocus();
    }
    
    private void soloNumeros(KeyEvent e,JTextField comp){
        char c=e.getKeyChar();
        if(!Character.isDigit(c)&&c!=KeyEvent.VK_BACK_SPACE&&c!='.'||(c=='.'&&comp.getText().trim().contains("."))){
            e.consume();
            getToolkit().beep();
            javax.swing.JOptionPane.showMessageDialog(null, "Debe ingresar un valor numerico mayor a cero");
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

        grupoImportado = new javax.swing.ButtonGroup();
        lblDescripcion = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        lblPorcGanancia = new javax.swing.JLabel();
        lblImportado = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        opcImportSi = new javax.swing.JRadioButton();
        opcImporNo = new javax.swing.JRadioButton();
        txtDescripcion = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtPorcGanancia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nuevo Articulo");

        lblDescripcion.setText("Descripcion");

        lblCosto.setText("Costo");

        lblPorcGanancia.setText("% Ganancia");

        lblImportado.setText("Importado:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        grupoImportado.add(opcImportSi);
        opcImportSi.setText("Si");

        grupoImportado.add(opcImporNo);
        opcImporNo.setText("No");

        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        txtPorcGanancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcGananciaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImportado)
                        .addGap(18, 18, 18)
                        .addComponent(opcImportSi)
                        .addGap(27, 27, 27)
                        .addComponent(opcImporNo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescripcion)
                            .addComponent(lblCosto)
                            .addComponent(lblPorcGanancia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPorcGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCosto)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorcGanancia)
                    .addComponent(txtPorcGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImportado)
                    .addComponent(opcImportSi)
                    .addComponent(opcImporNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(btnSalir)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        ventPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        boolean errorD=false, errorCos=false, errorPor=false, errorI=false;
        String desc=txtDescripcion.getText().trim().toUpperCase();
        if(desc.isEmpty()){
            errorD=true;
            javax.swing.JOptionPane.showMessageDialog(null, "Debe ingresar una descripcion");
        }
        else
            for(Articulo iter:comercio.getListaArticulos())
                if(iter.getDescripcion().equals(desc)){
                    errorD=true;
                    javax.swing.JOptionPane.showMessageDialog(null, "Ya existe in articulo con la misma descripcion, debe ingresar una diferente");
                }
        
        String cost=txtCosto.getText().trim();
        double cos = 0;
        if(cost.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null, "Debe ingresar un valor para el costo");
            errorCos=true;}
        else
            cos=Double.parseDouble(cost);
        
        String porc=txtPorcGanancia.getText().trim();
        double por = 0;
        if(porc.isEmpty()){
            errorPor=true;
            javax.swing.JOptionPane.showMessageDialog(null, "Debe ingresar un valor para el porcentaje de ganancia");    }
        else
            por=Double.parseDouble(porc);
            
        boolean imp=opcImportSi.isSelected();
        if(!imp&&!opcImporNo.isSelected()){
            errorI=true;
            javax.swing.JOptionPane.showMessageDialog(null, "Debe seleccionar su es importado o no");
        }
        
        if(!errorD&&!errorI&&!errorPor&&!errorCos){
            Articulo a=new Articulo(desc, cos, por, imp);
            comercio.addArticulo(a);
            limpiarPantalla();
            javax.swing.JOptionPane.showMessageDialog(null, "El articulo se agrego correctamente");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        soloNumeros(evt, txtCosto);
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtPorcGananciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcGananciaKeyTyped
        soloNumeros(evt, txtPorcGanancia);
    }//GEN-LAST:event_txtPorcGananciaKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarPantalla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionKeyTyped

   
    
    VentanaPrincipal ventPrincipal;
    Comercio comercio;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup grupoImportado;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblImportado;
    private javax.swing.JLabel lblPorcGanancia;
    private javax.swing.JRadioButton opcImporNo;
    private javax.swing.JRadioButton opcImportSi;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPorcGanancia;
    // End of variables declaration//GEN-END:variables
}
