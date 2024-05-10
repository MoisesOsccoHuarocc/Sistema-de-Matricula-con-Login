package Presentacion;

import Entidad.RegistroNota;
import Negocio.Escrituratxt;
import Negocio.Lecturatxt;
import Negocio.Logica;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroNotasFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistroNotasFrame
     */
    public RegistroNotasFrame() {
        initComponents();
        disenioTabla();
    }
    DefaultTableModel model;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        spinNota01 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNotas = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbCurso = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        spinNota02 = new javax.swing.JSpinner();
        spinNota03 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        spinNota4 = new javax.swing.JSpinner();

        jLabel1.setText("NOTAS");

        jLabel2.setText("DNI del estudiante");

        jLabel3.setText("Nota 01");

        jLabel4.setText("Nota 02");

        jLabel5.setText("Nota 03");

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        spinNota01.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        tableNotas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableNotas);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/WhatsApp Image 2024-04-27 at 8.25.51 PM (1).jpeg"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/WhatsApp Image 2024-04-27 at 8.25.51 PM.jpeg"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        cbCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematica", "Comunicacion", "Ciencias", "Taller" }));

        jLabel6.setText("Curso");

        spinNota02.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        spinNota02.setMinimumSize(new java.awt.Dimension(76, 22));

        spinNota03.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        spinNota03.setPreferredSize(new java.awt.Dimension(76, 22));

        jLabel7.setText("Examen Final");

        spinNota4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(103, 103, 103))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spinNota01)
                                        .addGap(68, 68, 68)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(spinNota02, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(btnCancelar)
                            .addComponent(txtDni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinNota03, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(spinNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar))))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinNota01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinNota02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinNota03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TODO add your handling code here:
        Logica logica = new Logica();
        if (logica.buscarEstudiantePorDni(txtDni.getText())) {
            Escrituratxt escribir = new Escrituratxt();
            escribir.registrarNota(obtenerDatos());
            disenioTabla();
            limpiarcampos();
        } else {
            JOptionPane.showMessageDialog(null, "El estudiante no se encuentra matriculado.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (txtDni.getText().length() > 7) {
            evt.consume(); // Consume el evento si se alcanzó el límite de caracteres
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        limpiarcampos();
    }//GEN-LAST:event_btnCancelarMouseClicked

    private RegistroNota obtenerDatos() {
        String dni = txtDni.getText();
        String curso = cbCurso.getSelectedItem().toString();
        String nota1 = spinNota01.getValue().toString();
        String nota2 = spinNota02.getValue().toString();
        String nota3 = spinNota03.getValue().toString();
        String nota4 = spinNota4.getValue().toString();
        RegistroNota registroNotas = new RegistroNota(dni, curso, nota1, nota2, nota3, nota4);
        return registroNotas;
    }

    private void disenioTabla() {
        model = new DefaultTableModel(new Object[]{"CURSO", "ESTUDIANTE", "NOTA 01", "NOTA 02", "NOTA 03", "EXAMEN", "PROMEDIO", "ESTADO"}, 0);
        tableNotas.setModel(model);
        cargarDatos();
    }

    private void cargarDatos() {
        Lecturatxt leer = new Lecturatxt();
        List<RegistroNota> listaNotas = leer.leerNotas();
        Logica logica = new Logica();
        for (RegistroNota estudiante : listaNotas) {
            int[] notas = new int[4];
            notas[0] = Integer.parseInt(estudiante.getNota1());
            notas[1] = Integer.parseInt(estudiante.getNota2());
            notas[2] = Integer.parseInt(estudiante.getNota3());
            notas[3] = Integer.parseInt(estudiante.getNota4());
            int promedio = logica.calcularPromedio(notas[0], notas[1], notas[2], notas[3]);
            model.addRow(new Object[]{
                estudiante.getCurso(),
                logica.buscarNombreestudiantePorDni(estudiante.getDni()),
                estudiante.getNota1(),
                estudiante.getNota2(),
                estudiante.getNota3(),
                estudiante.getNota4(),
                String.valueOf(promedio),
                logica.estado(promedio)});
        }

    }

    public void limpiarcampos() {
        txtDni.setText(null);
        spinNota01.setValue(0);
        spinNota02.setValue(0);
        spinNota03.setValue(0);
        spinNota4.setValue(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinNota01;
    private javax.swing.JSpinner spinNota02;
    private javax.swing.JSpinner spinNota03;
    private javax.swing.JSpinner spinNota4;
    private javax.swing.JTable tableNotas;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
