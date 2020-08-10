/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tooparking.usuario;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.GregorianCalendar;
import tooparking.usuario.conexion;
import tooparking.usuario.usuario;
/**
 *
 * @author Esteban
 */
public class pagar extends javax.swing.JFrame {

    /**
     * Creates new form pagar
     */
    public pagar() {
        initComponents();
        bg.add(bt1);
        bg.add(bt2);
        
        
        
          panel1.setBackground(new Color(255,251,251));
          this.setLocationRelativeTo(null);
        
           Image img=getToolkit().getImage("src/Imagenes/visa.png");
        img=img.getScaledInstance(vs.getWidth(),vs.getHeight(), Image.SCALE_DEFAULT);
        vs.setIcon(new ImageIcon(img));
        
        Image img2=getToolkit().getImage("src/Imagenes/mastercard.png");
        img2=img2.getScaledInstance(vs.getWidth(),vs.getHeight(), Image.SCALE_DEFAULT);
        ms.setIcon(new ImageIcon(img2));
        
        cj1.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
               if(cj1.getText().length()==4){
                   cj2.requestFocus();
                   
                 
                        e.consume();
               
                  
                   
               }
            }

            @Override
            public void keyPressed(KeyEvent e) {
               
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
            
        });
        
        cj2.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                 if(cj2.getText().length()==4){
                   cj3.requestFocus();
                   e.consume();
                   
            }
            }
            @Override
            public void keyPressed(KeyEvent e) {
               
            }

            @Override
            public void keyReleased(KeyEvent e) {
              
            }
            
            
            
        });
        
        cj3.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                 if(cj3.getText().length()==4){
                   cj4.requestFocus();
                   
                 
                        e.consume();
                   
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
        
            }

            @Override
            public void keyReleased(KeyEvent e) {
             
            }
            
            
        });
        
        cj4.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                
                   
                   if(cj4.getText().length()==4){
                        e.consume();
                   }
                   
               
            }

            @Override
            public void keyPressed(KeyEvent e) {
              
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            
            
        });
        
        cj6.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
                if(cj6.getText().length()==4){
                    ke.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
               
            }
        });
        
        
        cj7.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
               if(cj7.getText().length()==2){
                   ke.consume();
               }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
               
            }
        });
        
        cj8.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
                if(cj8.getText().length()==2){
                    ke.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent ke) {
               
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
            
        });
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        cj5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cj1 = new javax.swing.JTextField();
        cj2 = new javax.swing.JTextField();
        cj3 = new javax.swing.JTextField();
        cj4 = new javax.swing.JTextField();
        ms = new javax.swing.JLabel();
        vs = new javax.swing.JLabel();
        bt2 = new javax.swing.JRadioButton();
        bt1 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        gg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cj8 = new javax.swing.JTextField();
        cj6 = new javax.swing.JTextField();
        cj7 = new javax.swing.JTextField();
        too = new javax.swing.JLabel();
        jijox = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cj5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        panel1.add(cj5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("CVV");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        cj1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cj1.setText("3625");
        panel1.add(cj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, -1));

        cj2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cj2.setText("8957");
        cj2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cj2ActionPerformed(evt);
            }
        });
        panel1.add(cj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 70, -1));

        cj3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cj3.setText("4521");
        panel1.add(cj3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 70, -1));

        cj4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        cj4.setText("6987");
        panel1.add(cj4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 70, -1));

        ms.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.add(ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 110, 50));

        vs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel1.add(vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 50));

        bt2.setBackground(new java.awt.Color(255, 251, 251));
        bt2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        bt2.setForeground(new java.awt.Color(0, 153, 153));
        bt2.setText("Visa");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        panel1.add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        bt1.setBackground(new java.awt.Color(255, 251, 251));
        bt1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 153, 153));
        bt1.setText("Mastercard");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        panel1.add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Metodo de Pago");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Fecha de Vencimiento");
        panel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Numero de Tarjeta de Credito");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 260, 60));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RETIRAR VEHICULO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 260, 60));

        gg.setBackground(new java.awt.Color(0, 153, 153));
        gg.setForeground(new java.awt.Color(0, 153, 153));
        gg.setText("0");
        panel1.add(gg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel1.setText("(año-mes-dia)");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        cj8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        panel1.add(cj8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 40, -1));

        cj6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        panel1.add(cj6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 80, -1));

        cj7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        panel1.add(cj7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 40, -1));

        too.setBackground(new java.awt.Color(255, 255, 255));
        too.setForeground(new java.awt.Color(255, 251, 251));
        too.setText("qqq");
        panel1.add(too, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jijox.setForeground(new java.awt.Color(255, 251, 251));
        jijox.setText("jLabel2");
        panel1.add(jijox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 70));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 580));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 380, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        usuario u = new usuario();
        u.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
       gg.setText("1");
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        gg.setText("2");
    }//GEN-LAST:event_bt1ActionPerformed

    public double saldo=0;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int anio=(cj6.getText().isEmpty())? 0: Integer.parseInt(cj6.getText());
        int mess=(cj7.getText().isEmpty())? 0: Integer.parseInt(cj7.getText());
        int ddia=(cj8.getText().isEmpty())? 0: Integer.parseInt(cj8.getText());
        
        
        
        
       String ggg = gg.getText();
        
        if(ggg=="0"||cj1.getText().isEmpty()||cj2.getText().isEmpty()||cj3.getText().isEmpty()||cj4.getText().isEmpty()||cj5.getText().isEmpty()||cj6.getText().isEmpty()||cj7.getText().isEmpty()||cj8.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Error, uno de los campos esta vacio", "ERROR", JOptionPane.ERROR_MESSAGE);
           
       }else if (anio>2999 || mess>12 || ddia>31){
           
           JOptionPane.showMessageDialog(null,"Error, fecha no valida", "ERROR", JOptionPane.ERROR_MESSAGE);
           
       }else{
            verificar_datos();
            
            if(saldo==0){
                JOptionPane.showMessageDialog(null,"Error, tarjeta no valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }else if(saldo>0){
                
                if(saldo2<0){
                    JOptionPane.showMessageDialog(null,"Error, saldo insuficiente", "ERROR", JOptionPane.ERROR_MESSAGE);
                    
                }else if(saldo2>0){
                    
                    actualizar_saldo();
                    tiquete_salida();
                    guardata_tiksa();
                }
                
                
                 
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cj2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cj2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cj2ActionPerformed
public void guardata_tiksa(){
    
    String consulta="INSERT INTO ticket_salida VALUES (?,?,?)";
    
    try{
        
        String codi=String.valueOf(rpta);
        Double totall=Double.parseDouble(too.getText());
        
        PreparedStatement ps = cn.prepareStatement(consulta);
        
        ps.setString(1, codi);
        ps.setString(2, jijox.getText());
        ps.setDouble(3, totall);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Tiquete generado" + "\n\n"+"Gracias por su visita!");
        usuario u = new usuario();
        u.setVisible(true);
        this.dispose();
        
        
    }catch(Exception ex){
        
        System.out.println(ex.getMessage());
    }
    
}
    
    public int rpta=0;
    public void tiquete_salida(){
          Document documento = new Document();
 
  try {
   double x=1000000000;
     double w=2000000000;
        
      rpta = (int)Math.floor(Math.random()*(w -x)+x);
        
     PdfWriter pdfw = PdfWriter.getInstance(documento, new FileOutputStream("src/Tiquetes_salida/"+"SALIDA - "+cj1.getText()+"-"+rpta+".pdf"));
   // Abrimos el documento
   documento.open();
   // Seteamos a la variable el valor que deseamos que tenga el Codigo QR
  BarcodeEAN codeEAN = new BarcodeEAN();
   //Seteo el tipo de codigo
   codeEAN.setCodeType(Barcode.EAN13);
   //Setep el codigo
   codeEAN.setCode(rpta+"198");
   //Paso el codigo a imagen
  com.itextpdf.text.Image dd=codeEAN.createImageWithBarcode( pdfw.getDirectContent(), BaseColor.BLACK, BaseColor.RED);
   
   Calendar fecha = new GregorianCalendar();
   
   
   
   com.itextpdf.text.Image tiket=com.itextpdf.text.Image.getInstance("src/Imagenes/tiquete-salida.png");
   

   Phrase totall=new Phrase("TOTAL PAGADO: " + "$" +too.getText(),FontFactory.getFont(FontFactory.HELVETICA,20, Font.NORMAL, BaseColor.BLACK));

             
  

   
   tiket.setAlignment(com.itextpdf.text.Image.ALIGN_CENTER);
   dd.setAlignment(com.itextpdf.text.Image.ALIGN_CENTER);
   tiket.setAbsolutePosition(125, 280);
   dd.scaleAbsolute(160,75);
   dd.setAbsolutePosition(205,515);
   tiket.scaleAbsolute(330, 489);
   
   
   Paragraph para = new Paragraph();
   para.add("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   para.setAlignment(Paragraph.ALIGN_CENTER);
   para.add(totall);

 

  documento.add(para);
  documento.add(tiket);
  documento.add(dd);
  
  
   
   // Cerramos el documento
   documento.close();
  } catch (DocumentException ex) {
   // Atrapamos excepciones concernientes al documentoo.
  } catch (java.io.IOException ex) {
   // Atrapamos excepciones concernientes al I/O.
  }
    }
    public void actualizar_saldo(){
        String numero=cj1.getText()+"-"+cj2.getText()+"-"+cj3.getText()+"-"+cj4.getText();
        String consulta="UPDATE Tarjetas SET Tarjeta_saldo=? WHERE Tarjeta_numero='"+numero+"'"; 
        
        
        try{
          
            PreparedStatement ps = cn.prepareStatement(consulta);
            ps.setDouble(1, saldo2);
            ps.executeUpdate();
          
            
            
            
        }catch(Exception ex){
            
            System.out.println(ex.getMessage());
        }
        
        
    }
    
    public double saldo2=0;
    public void verificar_datos(){
        
        saldo2=0;
        double valor=Double.parseDouble(too.getText());
        saldo=0;
        
        int tipo=Integer.parseInt(gg.getText());
        
        String fecha=cj6.getText()+"-"+cj7.getText()+"-"+cj8.getText();
        String numero=cj1.getText()+"-"+cj2.getText()+"-"+cj3.getText()+"-"+cj4.getText();
        String consulta="SELECT tarjeta_saldo FROM tarjetas WHERE Tarjeta_numero='"+numero+"' and Tarjeta_FechaVec='"+fecha+"' and Tarjeta_codigo='"+cj5.getText()+"' and Marctar_cod='"+tipo+"'";
        
        try{
            
            Statement st =cn.createStatement();
            ResultSet rs =st.executeQuery(consulta);
            
            
            while(rs.next()){
                
                saldo=rs.getDouble(1);
            }
            saldo2=saldo-valor;
            System.out.println(""+saldo2);
            
        }catch(Exception ex){
            
            
            
            System.out.println(ex.getMessage());
        }
        
        
    }
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
            java.util.logging.Logger.getLogger(pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JRadioButton bt1;
    private javax.swing.JRadioButton bt2;
    private javax.swing.JTextField cj1;
    private javax.swing.JTextField cj2;
    private javax.swing.JTextField cj3;
    private javax.swing.JTextField cj4;
    private javax.swing.JTextField cj5;
    private javax.swing.JTextField cj6;
    private javax.swing.JTextField cj7;
    private javax.swing.JTextField cj8;
    private javax.swing.JLabel gg;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public volatile javax.swing.JLabel jijox;
    private javax.swing.JLabel ms;
    private javax.swing.JPanel panel1;
    public static volatile javax.swing.JLabel too;
    private javax.swing.JLabel vs;
    // End of variables declaration//GEN-END:variables
conexion cc= new conexion();
Connection cn =cc.conexion2();

}
