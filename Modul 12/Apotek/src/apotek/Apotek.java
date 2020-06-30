/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apotek;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ASUS
 */
public class Apotek extends javax.swing.JFrame {
    

    /**
     * Creates new form Apotek
     */
    private Connection con;
    private Statement stat;
    private ResultSet res;
    
    public Apotek() {
        initComponents();
        konek();
        tampil();
    }
    
 private void konek(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost/apotek", "root", "");
         stat=con.createStatement();
        }
     catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
     }
 }
 
 private void tampil(){
     DefaultTableModel tb= (DefaultTableModel) tabel.getModel();
     
     try{
         res=stat.executeQuery("select id_obat,nama_pasien,no_antriFK, id_pasienFK, nama_obat, jenis_obat,kegunaan FROM obat join pasien ON obat.id_pasienFK=pasien.id_pasien");
         while (res.next())
         {
             tb.addRow(new Object[]{
                 res.getInt("id_obat"),
                 res.getString("nama_pasien"),
                 res.getInt("no_antriFK"),
                 res.getInt("id_pasienFK"),
                 res.getString("nama_obat"),
                 res.getString("jenis_obat"),
                 res.getString("kegunaan")
             });
         }
     }catch (Exception e){
         JOptionPane.showMessageDialog(null, e);
         }
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        idp = new javax.swing.JLabel();
        nao = new javax.swing.JLabel();
        jo = new javax.swing.JLabel();
        ke = new javax.swing.JLabel();
        ido = new javax.swing.JTextField();
        noa = new javax.swing.JTextField();
        ips = new javax.swing.JTextField();
        nmo = new javax.swing.JTextField();
        jeo = new javax.swing.JTextField();
        kgg = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        update = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        npa = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Exotc350 Bd BT", 1, 24)); // NOI18N
        jLabel1.setText("APOTEK CEPAT SEMBUH");

        id.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        id.setText("ID OBAT");

        no.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        no.setText("NO ANTRI");

        idp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        idp.setText("ID PASIEN");

        nao.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nao.setText("Nama Obat");

        jo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jo.setText("Jenis Obat");

        ke.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ke.setText("Kegunaan");

        ido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        noa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        ips.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        nmo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jeo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        kgg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        kgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kggActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id obat", "nama pasien", "no antri", "id pasien", "nama obat", "jenis obat", "kegunaan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        insert.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.setText("Nama Pasien");

        npa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)
                                    .addComponent(jeo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(ke, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)
                                    .addComponent(kgg)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nmo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idp)
                                .addGap(63, 63, 63)
                                .addComponent(ips, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(ido, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(no)
                                            .addComponent(name))
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(npa, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                            .addComponent(noa))))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insert)
                                    .addComponent(delete)
                                    .addComponent(update))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(id))
                    .addComponent(ido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(npa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(no))
                            .addComponent(noa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(idp))
                            .addComponent(ips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(nao))
                    .addComponent(nmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jo))
                            .addComponent(jeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(ke))
                            .addComponent(kgg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete)))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kggActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kggActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/apotek", "root", "");
            String a = "delete from pasien where id_pasien=?";
            PreparedStatement x = con.prepareStatement(a);
            x.setString(1, ips.getText());
            x.executeUpdate();
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/apotek", "root", "");
            String s = "delete from obat where id_obat=?";
            PreparedStatement w = con.prepareStatement(s);
            w.setString(1, ido.getText());
            w.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"data telah di hapus");
            DefaultTableModel tb= (DefaultTableModel) tabel.getModel();
            tb.setRowCount(0);
            tampil();
            ido.setText("");
            npa.setText("");
            noa.setText("");
            ips.setText("");
            nmo.setText("");
            jeo.setText("");
            kgg.setText("");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/apotek", "root", "");
            String a = "update pasien set nama_pasien=? where id_pasien=?";
            PreparedStatement x = con.prepareStatement(a);
            x.setString(1, npa.getText());
            x.setString(2, ips.getText());
            x.executeUpdate();
            String q = "update obat set kegunaan=?,jenis_obat=?,nama_obat=?,id_pasienFK=?,no_antriFK=? where id_obat=?";
            PreparedStatement s = con.prepareStatement(q);
            s.setString(1, kgg.getText());
            s.setString(2, jeo.getText());
            s.setString(3, nmo.getText());
            s.setString(4, ips.getText());
            s.setString(5, noa.getText());
            s.setString(6, ido.getText());
            s.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"data telah di update");
            DefaultTableModel tb= (DefaultTableModel) tabel.getModel();
            tb.setRowCount(0);
            tampil();
            ido.setText("");
            npa.setText("");
            noa.setText("");
            ips.setText("");
            nmo.setText("");
            jeo.setText("");
            kgg.setText("");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
         try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/apotek", "root", "");
             String a = "insert into pasien (id_pasien,nama_pasien) values(?,?)";
            PreparedStatement x = con.prepareStatement(a);
            x.setString(1, ips.getText());
            x.setString(2, npa.getText());
            x.executeUpdate();
            String q = "insert into obat(id_obat,nama_obat,jenis_obat,kegunaan,no_antriFK,id_pasienFK)values(?,?,?,?,?,?)";
            PreparedStatement s = con.prepareStatement(q);
            s.setString(1, ido.getText());
            s.setString(2, nmo.getText());
            s.setString(3, jeo.getText());
            s.setString(4, kgg.getText());
            s.setString(5, noa.getText());
            s.setString(6, ips.getText());
            s.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"data berhasil di tambahkan");
            DefaultTableModel tb= (DefaultTableModel) tabel.getModel();
            tb.setRowCount(0);
            tampil();
            ido.setText("");
            npa.setText("");
            noa.setText("");
            ips.setText("");
            nmo.setText("");
            jeo.setText("");
            kgg.setText("");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_insertActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/apotek", "root", "");
            int i = tabel.getSelectedRow();
            TableModel t = tabel.getModel();
            ido.setText(t.getValueAt(i,0).toString());
            npa.setText(t.getValueAt(i,1).toString());
            noa.setText(t.getValueAt(i,2).toString());
            ips.setText(t.getValueAt(i,3).toString());
            nmo.setText(t.getValueAt(i,4).toString());
            jeo.setText(t.getValueAt(i,5).toString());
            kgg.setText(t.getValueAt(i,6).toString());
            String x = "SELECT nama_pasien FROM pasien WHERE id_pasien="+t.getValueAt(i,3).toString();
            res = stat.executeQuery(x);
            while (res.next()) {
            String a = res.getString("nama_pasien");
            npa.setText(a);}
            }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_tabelMouseClicked

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
            java.util.logging.Logger.getLogger(Apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apotek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel id;
    private javax.swing.JTextField ido;
    private javax.swing.JLabel idp;
    private javax.swing.JButton insert;
    private javax.swing.JTextField ips;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jeo;
    private javax.swing.JLabel jo;
    private javax.swing.JLabel ke;
    private javax.swing.JTextField kgg;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nao;
    private javax.swing.JTextField nmo;
    private javax.swing.JLabel no;
    private javax.swing.JTextField noa;
    private javax.swing.JTextField npa;
    private javax.swing.JTable tabel;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
