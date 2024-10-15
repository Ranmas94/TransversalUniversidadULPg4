
package UniversidadULP.Vistas;

import UniversidadULP.AccesoADatos.AlumnoData;
import UniversidadULP.AccesoADatos.InscripcionData;
import UniversidadULP.Entidades.Alumno;
import UniversidadULP.Entidades.Inscripcion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ActualizacionDeNotas extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return true;
        }
    };
    
    private AlumnoData aluData = new AlumnoData();
    private InscripcionData insData = new InscripcionData();

    public ActualizacionDeNotas() {
        initComponents();
        cargarComboBox();
        cabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setTitle("Carga de Notas");

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione un Alumno:");

        cbAlumno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnoActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jbGuardar.setBackground(new java.awt.Color(0, 204, 255));
        jbGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(0, 204, 255));
        jbSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(106, 106, 106)
                .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addGap(42, 42, 42)
                        .addComponent(jbSalir)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(151, 151, 151))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnoActionPerformed
        cargarMatCursadas();
    }//GEN-LAST:event_cbAlumnoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        actualizarNota();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cbAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    //Cabecera de tabla
    private void cabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        tabla.setModel(modelo);
    }
    
     private void cargarComboBox() {
        for (Alumno al : aluData.listarAlumnos()) {
            cbAlumno.addItem(al);
        }
    }
     
      private void cargarMatCursadas() {
        Alumno al = (Alumno) cbAlumno.getSelectedItem();

        if (al == null) {
            return;
        }

        modelo.setRowCount(0);
        for (Inscripcion in : insData.obtenerInscripcionesPorAlumno(al.getIdAlumno())) {
            modelo.addRow(new Object[]{in.getMateria().getIdMateria(),in.getMateria().getNombre(),in.getNota()});
        }
    }
      
     private void actualizarNota() {
         try {
             int row = tabla.getSelectedRow();  // Obtenemos la ubicación exacta del código seleccionado
             int col = tabla.getSelectedColumn();
             if (row == -1 || col == -1) {
                 JOptionPane.showMessageDialog(this, "Debes seleccionar una celda", "ERROR", JOptionPane.ERROR_MESSAGE);
                 return;
             }
        // Obtenemos el valor editado de la celda
        Object valorCelda = tabla.getValueAt(row, col);
        
        // Convertimos el valor a int si es un String (después de la edición)
        int nota;
        if (valorCelda instanceof String) {
            nota = Integer.parseInt((String) valorCelda);
        } else if (valorCelda instanceof Integer) {
            nota = (Integer) valorCelda;
        } else {
            throw new IllegalArgumentException("Tipo de dato no soportado para la nota");
        }

        // Obtenemos el ID de la materia (suponiendo que está en la primera columna y es un número)
        Object valorIdMat = tabla.getValueAt(row, 0);
        int idMat;
        if (valorIdMat instanceof String) {
            idMat = Integer.parseInt((String) valorIdMat);
        } else if (valorIdMat instanceof Integer) {
            idMat = (Integer) valorIdMat;
        } else {
            throw new IllegalArgumentException("Tipo de dato no soportado para idMateria");
        }

        // Obtenemos el alumno seleccionado
        Alumno al = (Alumno) cbAlumno.getSelectedItem();
        
        // Actualizamos la nota
        insData.actualizarNota(al.getIdAlumno(), idMat, nota);
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El valor ingresado no es un número válido", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ArrayIndexOutOfBoundsException | ClassCastException e) {
        JOptionPane.showMessageDialog(this, "Debes seleccionar una celda válida", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
}
}
