
package UniversidadULP.Vistas;

import UniversidadULP.AccesoADatos.MateriaData;
import UniversidadULP.Entidades.Materia;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lourdes
 */
public class materiaView extends javax.swing.JInternalFrame {
private MateriaData matData = new MateriaData();
    private Materia matActual = null;
    /**
     * Creates new form materiaView
     */
    public materiaView() {
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

        contenedor = new javax.swing.JPanel();
        tfAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        cbEstado = new javax.swing.JCheckBox();
        tfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setBackground(new java.awt.Color(0, 153, 204));
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfAnio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contenedor.add(tfAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 112, -1));

        jLabel5.setBackground(new java.awt.Color(204, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nombre:");
        contenedor.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        tfNombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contenedor.add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 180, -1));

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Año:");
        contenedor.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jbGuardar.setBackground(new java.awt.Color(51, 204, 255));
        jbGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        contenedor.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jbSalir.setBackground(new java.awt.Color(51, 204, 255));
        jbSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        contenedor.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Materia");
        contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Estado:");
        contenedor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jbNuevo.setBackground(new java.awt.Color(51, 204, 255));
        jbNuevo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        contenedor.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jbEliminar.setBackground(new java.awt.Color(51, 204, 255));
        jbEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        contenedor.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        cbEstado.setBackground(new java.awt.Color(255, 255, 255));
        cbEstado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbEstado.setForeground(new java.awt.Color(255, 255, 255));
        contenedor.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        tfCodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contenedor.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 180, -1));

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Código:");
        contenedor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jbBuscar.setBackground(new java.awt.Color(51, 204, 255));
        jbBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        contenedor.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        try{
            int id = Integer.parseInt(tfCodigo.getText());
            matActual = matData.buscarMateria(id);
            if(matActual!=null){
                tfNombre.setText(matActual.getNombre());
                tfAnio.setText(Integer.toString(matActual.getAnioMateria()));
                cbEstado.setSelected(matActual.isActivo());
            }else{
                JOptionPane.showMessageDialog(this, "Materia no encontrada");
            }

        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(this, "Usted debe ingresar un número." + ex);
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        if(validarCamposVacios(contenedor)){
            JOptionPane.showConfirmDialog(this, "Debe llenar todos los datos.");
            return;
        }
        try{
            String nombre = tfNombre.getText();
            Integer anio = Integer.valueOf(tfAnio.getText());
            boolean estado = cbEstado.isSelected();

            if(matActual==null){
                matActual = new Materia(nombre,anio,estado);
                matData.guardarMateria(matActual);
                
            }else{
                matActual.setNombre(nombre);
                matActual.setAnioMateria(anio);
                matActual.setActivo(estado);
                matData.modificarMateria(matActual);
            }

        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(this, "Usted debe ingresar datos válidos." + ex);
        }
        

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos(contenedor);
        matActual = null;
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        try{
            int id = Integer.parseInt(tfCodigo.getText());
            matData.borrarMateria(id);
            JOptionPane.showMessageDialog(this, "borrado exitoso");

        }catch(NumberFormatException ex){
            JOptionPane.showConfirmDialog(this, "Usted debe ingresar un número." + ex);
        }
        limpiarCampos(contenedor);
    }//GEN-LAST:event_jbEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbEstado;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField tfAnio;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField t = (JTextField) c;
                t.setText("");
            }
            if(c instanceof JCheckBox){
                JCheckBox t = (JCheckBox) c;
                t.setSelected(false);
            }

        }
    }
    
    private boolean validarCamposVacios(JPanel jpanel) {
        for (Component c : jpanel.getComponents()) {
            if (c instanceof JTextField) {
                JTextField t = (JTextField) c;
                if (t.getText().trim().isEmpty()) {
                    return true; //devuelve true si hay algun campo vacio
                }
            }

        }
        return false; //devuelve false todos los campos estan llenos
    }
}


