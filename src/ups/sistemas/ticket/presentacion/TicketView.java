package ups.sistemas.ticket.presentacion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import ups.sistemas.ticket.negocio.GestionTickets;
import ups.sistemas.ticket.negocio.Ticket;
import ups.sistemas.ticket.negocio.Vehiculo;

/**
 *
 * @author fernandocuscomejia
 */
public class TicketView extends javax.swing.JFrame {

    private GestionTickets gt;
    private int id;

    public TicketView() {
        initComponents();
        txtNumTicket.setEditable(false);
        txtHoraIngreso.setEditable(false);
        txtHoraIngresoC.setEditable(false);
        txtHoraSalidaC.setEditable(false);
        txtMarcaC.setEditable(false);
        txtPlacaC.setEditable(false);
        txtTiempo.setEditable(false);
        txtValor.setEditable(false);
        id = 0;
        nextTicket();
        actualizarHora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumTicket = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHoraIngreso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTicketBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtHoraIngresoC = new javax.swing.JTextField();
        txtHoraSalidaC = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPlacaC = new javax.swing.JTextField();
        txtMarcaC = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTiempo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnCobrar = new javax.swing.JButton();
        btnNuevoC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Ingresar Ticket");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Numero ticket:");

        txtNumTicket.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Hora Ingreso:");

        txtHoraIngreso.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Placa:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Marca:");

        txtPlaca.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaKeyReleased(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        btnRegistrar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(btnRegistrar)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevo)
                                    .addComponent(txtMarca))))
                        .addGap(256, 256, 256))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumTicket, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                            .addComponent(txtHoraIngreso))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnNuevo))
                .addGap(60, 60, 60))
        );

        jTabbedPane1.addTab("Ingreso", jPanel1);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("Numero Ticket:");

        txtTicketBuscar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txtTicketBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTicketBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Ticket"));
        jPanel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("Hora");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel8.setText("Ingreso:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Salida:");

        txtHoraIngresoC.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        txtHoraSalidaC.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setText("Placa:");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("Marca:");

        txtPlacaC.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        txtMarcaC.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setText("Tiempo:");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setText("Valor:");

        txtTiempo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        txtValor.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlacaC, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(txtHoraIngresoC)
                            .addComponent(txtTiempo))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11))
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoraSalidaC)
                            .addComponent(txtMarcaC)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtHoraIngresoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtHoraSalidaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txtPlacaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarcaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(txtTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        btnCobrar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        btnNuevoC.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnNuevoC.setText("Nuevo");
        btnNuevoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTicketBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(btnCobrar)
                .addGap(143, 143, 143)
                .addComponent(btnNuevoC)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTicketBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCobrar)
                    .addComponent(btnNuevoC))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Cobrar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyReleased
        // TODO add your handling code here:
        String temp = "";
        int total = txtPlaca.getText().length();
        Vehiculo v = gt.buscarVehiculo(txtPlaca.getText().toUpperCase());
        if (total == 7) {
            if (v.getPlaca() != null || v.getMarca() != null) {
                txtPlaca.setText(v.getPlaca().toUpperCase());
                txtMarca.setText(v.getMarca());
            } else {
                ventanaCrear();
            }
        } else if (total == 8) {
            if (v.getPlaca() != null || v.getMarca() != null) {
                txtPlaca.setText(v.getPlaca().toUpperCase());
                txtMarca.setText(v.getMarca());
            } else {
                ventanaCrear();
            }
        } else if (total > 8) {
            String plc = txtPlaca.getText().toUpperCase();

            for (int i = 0; i < plc.length() - 1; i++) {
                temp = temp.concat(String.valueOf(plc.charAt(i)));
            }
            txtPlaca.setText(temp.toUpperCase());
        }
        actualizarHora();
    }//GEN-LAST:event_txtPlacaKeyReleased

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (!txtPlaca.getText().isEmpty() && !txtMarca.getText().isEmpty()) {
            GestionTickets gt = new GestionTickets();
            Vehiculo vehiculo = gt.buscarIdVehiculo(txtPlaca.getText());
            Ticket t = new Ticket();
            t.setUnVehiculo(vehiculo);
            t.setFecha(new Date().toString());
            Date ahora = new Date();
            SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
            t.setHoraIngreso(formateador.format(ahora));
            t.setEstado(0);
            if (!gt.isOpenTicket(vehiculo.getId())) {
                gt.registrarTicket(t);
                txtPlaca.setText("");
                txtMarca.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ticket Creado");
            } else {
                JOptionPane.showMessageDialog(rootPane, "El Vehiculo esta dentro del parqueadero.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Completa los campos");
            txtPlaca.requestFocus();
        }
        limpiarRegistro();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        GestionTickets gt = new GestionTickets();
        id = Integer.parseInt(txtTicketBuscar.getText());
        Ticket tck = gt.buscarNumeroTicket(Integer.parseInt(txtTicketBuscar.getText()));
        if (tck.getId() == 0) {
            JOptionPane.showMessageDialog(rootPane, "El Ticket consultado no existe.");
        } else {
            if (tck.getEstado() == 0) {
                txtHoraIngresoC.setText(tck.getHoraIngreso());
                horaSalida();
                txtPlacaC.setText(tck.getUnVehiculo().getMarca());
                txtMarcaC.setText(tck.getUnVehiculo().getPlaca());
                int tiempo = gt.calcularTiempo(tck.getHoraIngreso(), txtHoraSalidaC.getText());
                pasarHoras(tiempo);
                double costo = gt.calcularValor(tiempo);
                txtValor.setText(costo + "");
            } else {
                JOptionPane.showMessageDialog(rootPane, "El Ticket consultado ya fue pagado.");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtTicketBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTicketBuscarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTicketBuscarKeyTyped

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        // TODO add your handling code here:
        if (validarCamposPago()) {

            GestionTickets gt = new GestionTickets();
            Ticket t = new Ticket();
            Date ahora = new Date();
            SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
            t.setHoraSalida(formateador.format(ahora));
            t.setEstado(1);
            t.setTiempo(txtTiempo.getText());
            t.setValor(Float.parseFloat(txtValor.getText()));
            t.setId(id);
            boolean isPayed = gt.pagarTicket(t);

            if (isPayed) {
                JOptionPane.showMessageDialog(rootPane, "Pago realizado exitosamente");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Ocurrio un error");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Busca un Ticket");
            txtTicketBuscar.requestFocus();
        }
        limpiarPago();
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnNuevoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCActionPerformed
        // TODO add your handling code here:
        limpiarPago();
    }//GEN-LAST:event_btnNuevoCActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarRegistro();
    }//GEN-LAST:event_btnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(TicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketView().setVisible(true);
                
            }
        });
        
    }

    private void actualizarHora() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        txtHoraIngreso.setText(formateador.format(ahora));
    }

    private void horaSalida() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        txtHoraSalidaC.setText(formateador.format(ahora));
    }

    private void ventanaCrear() {
        VehiculoView vv = new VehiculoView(this, true);
        vv.txtPlaca.setText(txtPlaca.getText().toUpperCase());
        vv.setVisible(true);
    }

    private void nextTicket() {
        gt = new GestionTickets();
        int nextTicket = gt.numeroTicketNext();
        txtNumTicket.setText(nextTicket + "");
    }

    private void pasarHoras(int tiempo) {
        long horasReales = TimeUnit.MINUTES.toHours(tiempo);
        long minutosReales = TimeUnit.MINUTES.toMinutes(tiempo) - TimeUnit.HOURS.toMinutes(TimeUnit.MINUTES.toHours(tiempo));
        txtTiempo.setText(horasReales + ":" + minutosReales);
    }

    private void limpiarPago() {
        txtHoraIngresoC.setText("");
        txtHoraSalidaC.setText("");
        txtPlacaC.setText("");
        txtMarcaC.setText("");
        txtTiempo.setText("");
        txtTicketBuscar.setText("");
        txtValor.setText("");
    }

    private void limpiarRegistro() {
        txtPlaca.setText("");
        txtMarca.setText("");
        actualizarHora();
        nextTicket();
    }

    private boolean validarCamposPago() {
        boolean isValid = false;
        if (txtHoraIngresoC.getText().isEmpty() || txtHoraSalidaC.getText().isEmpty() || txtMarcaC.getText().isEmpty()
                || txtPlacaC.getText().isEmpty() || txtTiempo.getText().isEmpty() || txtValor.getText().isEmpty()) {
            isValid = false;
        } else {
            isValid = true;
        }
        return isValid;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevoC;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtHoraIngreso;
    private javax.swing.JTextField txtHoraIngresoC;
    private javax.swing.JTextField txtHoraSalidaC;
    public static javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarcaC;
    private javax.swing.JTextField txtNumTicket;
    public static javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPlacaC;
    private javax.swing.JTextField txtTicketBuscar;
    private javax.swing.JTextField txtTiempo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
