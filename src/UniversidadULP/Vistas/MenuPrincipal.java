/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniversidadULP.Vistas;

import static java.time.Clock.system;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemFormAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemFormMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemManejodeInscripciones = new javax.swing.JMenuItem();
        itemNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemAlumnoporMateria = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        itemFormAlumno.setText("Formulario de Alumno");
        itemFormAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFormAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(itemFormAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        itemFormMateria.setText("Formulario de Materia");
        itemFormMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFormMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(itemFormMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administración");

        itemManejodeInscripciones.setText("Manejo de Inscripciones");
        itemManejodeInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemManejodeInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(itemManejodeInscripciones);

        itemNotas.setText("Manipulacion de Notas");
        itemNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNotasActionPerformed(evt);
            }
        });
        jMenu3.add(itemNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        itemAlumnoporMateria.setText("Alumnos por Materia");
        itemAlumnoporMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlumnoporMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(itemAlumnoporMateria);

        jMenuBar1.add(jMenu4);

        itemSalir.setText("Salir");
        itemSalir.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                itemSalirMenuSelected(evt);
            }
        });
        jMenuBar1.add(itemSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemFormAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFormAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumnoView m = new FormularioAlumnoView();
        m.setVisible(true);
        escritorio.add(m);
    }//GEN-LAST:event_itemFormAlumnoActionPerformed

    private void itemFormMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFormMateriaActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        materiaView m = new materiaView();
        m.setVisible(true);
        escritorio.add(m);
    }//GEN-LAST:event_itemFormMateriaActionPerformed

    private void itemManejodeInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemManejodeInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcionView m = new FormularioInscripcionView();
        m.setVisible(true);
        escritorio.add(m);
    }//GEN-LAST:event_itemManejodeInscripcionesActionPerformed

    private void itemNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ActualizacionDeNotas m = new ActualizacionDeNotas();
        m.setVisible(true);
        escritorio.add(m);
    }//GEN-LAST:event_itemNotasActionPerformed

    private void itemAlumnoporMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlumnoporMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaDeAlumnosPorMateria m = new ConsultaDeAlumnosPorMateria();
        m.setVisible(true);
        escritorio.add(m);
    }//GEN-LAST:event_itemAlumnoporMateriaActionPerformed

    private void itemSalirMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_itemSalirMenuSelected
           int respuesta = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
    if (respuesta == JOptionPane.YES_OPTION) {
    System.exit(0);
    }   
    }//GEN-LAST:event_itemSalirMenuSelected

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemAlumnoporMateria;
    private javax.swing.JMenuItem itemFormAlumno;
    private javax.swing.JMenuItem itemFormMateria;
    private javax.swing.JMenuItem itemManejodeInscripciones;
    private javax.swing.JMenuItem itemNotas;
    private javax.swing.JMenu itemSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
