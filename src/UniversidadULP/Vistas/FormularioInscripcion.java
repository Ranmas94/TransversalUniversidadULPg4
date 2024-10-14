
package UniversidadULP.Vistas;

import UniversidadULP.AccesoADatos.AlumnoData;
import UniversidadULP.AccesoADatos.InscripcionData;
import UniversidadULP.AccesoADatos.MateriaData;
import UniversidadULP.Entidades.Alumno;
import UniversidadULP.Entidades.Materia;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lourdes
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel(){
@Override
    public boolean isCellEditable(int f, int c){
        return false;
    }
};
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();
    private InscripcionData insData = new InscripcionData();
    
    public FormularioInscripcion() {
        initComponents();
        cabecera();
        cargarComboBox();
        ButtonGroup group = new ButtonGroup();
        group.add(rbMatCursada);
        group.add(rbMatNoCursada);
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbMatCursada = new javax.swing.JRadioButton();
        rbMatNoCursada = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Formulario de inscripción");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione un alumno: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Listado de materias");

        rbMatCursada.setText("Materias cursadas");
        rbMatCursada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMatCursadaActionPerformed(evt);
            }
        });

        rbMatNoCursada.setText("Materias no cursadas");
        rbMatNoCursada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMatNoCursadaActionPerformed(evt);
            }
        });

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

        jbInscribir.setText("Inscribir");

        jbAnular.setText("Anular inscripción");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(rbMatCursada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbMatNoCursada)))
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jbInscribir)
                .addGap(80, 80, 80)
                .addComponent(jbAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMatCursada)
                    .addComponent(rbMatNoCursada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Formulario de inscripción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMatCursadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMatCursadaActionPerformed
        jbAnular.setEnabled(true);
        jbInscribir.setEnabled(false);
        borrarTabla();
        cargarMatCursadas();
    }//GEN-LAST:event_rbMatCursadaActionPerformed

    private void rbMatNoCursadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMatNoCursadaActionPerformed
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
        borrarTabla();
        cargarMatNoCursadas();
    }//GEN-LAST:event_rbMatNoCursadaActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        borrarTabla();
        anularInscripcion();
        
    }//GEN-LAST:event_jbAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> cbAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton rbMatCursada;
    private javax.swing.JRadioButton rbMatNoCursada;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    //  METODOS
    
 //Cabecera de tabla
    private void cabecera(){
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        tabla.setModel(modelo);
    }
    
     private void borrarTabla() {
        int f = tabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
  private void cargarComboBox(){
      for(Alumno al :aluData.listarAlumnos()){
          cbAlumno.addItem(al);
      }
  }
  
  private void cargarMatCursadas(){
      Alumno al = (Alumno) cbAlumno.getSelectedItem();
      
      if(al == null){
          return;
      }
      
      modelo.setRowCount(0);
      for(Materia mat : insData.obtenerMateriasCursadas(al.getIdAlumno())){
          modelo.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),mat.getAnioMateria()});
      }
  }
  
  private void cargarMatNoCursadas(){
       Alumno al = (Alumno) cbAlumno.getSelectedItem();
      
      if(al == null){
          return;
      }
      
      modelo.setRowCount(0);
      for(Materia mat : insData.obtenerMateriasNoCursadas(al.getIdAlumno())){
          modelo.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),mat.getAnioMateria()});
      }
  }
  
  private void anularInscripcion(){
       try{
        int row = tabla.getSelectedRow(); //Obtenemos la ubicacion exacta del código seleccionado.
        int col = tabla.getSelectedColumn();
        if (col != 0) { //Como todos los códigos se encuentran en la columna 0, si a col se le asigna otro número saldrá un mensaje.
            JOptionPane.showMessageDialog(this, "Debes seleccionar el ID de la materia", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int idMat = (Integer) tabla.getValueAt(row, col);
         Alumno al = (Alumno) cbAlumno.getSelectedItem();
         
         insData.borrarInscripcion(al.getIdAlumno(), idMat);
        
        
        
       }catch(ArrayIndexOutOfBoundsException | ClassCastException e){
            JOptionPane.showMessageDialog(this, "Debes seleccionar el ID de la materia", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
  }
  
  private void inscribir(){
        try{
        int row = tabla.getSelectedRow(); //Obtenemos la ubicacion exacta del código seleccionado.
        int col = tabla.getSelectedColumn();
        if (col != 0) { //Como todos los códigos se encuentran en la columna 0, si a col se le asigna otro número saldrá un mensaje.
            JOptionPane.showMessageDialog(this, "Debes seleccionar el ID de la materia", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
         int idMat = (Integer) tabla.getValueAt(row, col);
         Materia mat = matData.buscarMateria(idMat);
         Alumno al = (Alumno) cbAlumno.getSelectedItem();
        
        
        
        }catch(ArrayIndexOutOfBoundsException | ClassCastException e){
            JOptionPane.showMessageDialog(this, "Debes seleccionar el ID de la materia", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
  }
}
