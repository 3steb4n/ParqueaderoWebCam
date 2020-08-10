/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tooparking;

import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.WritableImage;
import javax.lang.model.element.Element;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;

/**
 *
 * @author APRENDIZ
 */
public class Empleado extends javax.swing.JFrame {

    /**
     * Creates new form prueba
     */
    public Empleado() {
        initComponents();
        
  
        
         panel1.setBackground(new Color(255,251,251));
        this.setLocationRelativeTo(null);
        
        
        
        img1.addMouseListener(new MouseListener(){
            @Override
            public void mouseEntered(MouseEvent e) {
                java.awt.Image img=getToolkit().getImage("src/Imagenes/carro.png");
       
        img1.setIcon(new ImageIcon(img));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                   java.awt.Image img=getToolkit().getImage("src/Imagenes/carro-sin.png");
        
        img1.setIcon(new ImageIcon(img));
            }

            @Override
            public void mouseClicked(MouseEvent me) {
               verautos ver= new verautos();
               ver.setVisible(true);
               dispose();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            
            
        });
        
        img2.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
               vermotos mo = new vermotos();
               mo.setVisible(true);
               dispose();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
              
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                
                java.awt.Image img=getToolkit().getImage("src/Imagenes/moto.png");
       
        img2.setIcon(new ImageIcon(img));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                java.awt.Image img=getToolkit().getImage("src/Imagenes/moto-sin.png");
   
        img2.setIcon(new ImageIcon(img));
            }
        
        });
       
        
        img5.addMouseListener(new MouseListener(){

            @Override
            public void mouseClicked(MouseEvent me) {
                tipoveh tip= new tipoveh();
       
                
                dispose();
                tip.setVisible(true);
            }

            @Override
            public void mousePressed(MouseEvent me) {
                
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                java.awt.Image img=getToolkit().getImage("src/Imagenes/tiquete.png");
  
        img5.setIcon(new ImageIcon(img));
            }

            @Override
            public void mouseExited(MouseEvent me) {
                java.awt.Image img=getToolkit().getImage("src/Imagenes/tiquete-sin.png");
     
        img5.setIcon(new ImageIcon(img));
            }
            
        });
        
        img6.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
               dispose();
               verificartique ver = new verificartique();
               ver.setVisible(true);
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
              
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                  java.awt.Image img=getToolkit().getImage("src/Imagenes/tiquete.png");
  
        img6.setIcon(new ImageIcon(img));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                  java.awt.Image img=getToolkit().getImage("src/Imagenes/tiquete-sin.png");
     
        img6.setIcon(new ImageIcon(img));
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

        panel1 = new javax.swing.JPanel();
        img2 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/moto-sin.png"))); // NOI18N
        img2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 240, 210));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carro-sin.png"))); // NOI18N
        img1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 240, 210));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("VERIFICAR TIQUETE DE SALIDA");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Motos Registradas");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, 30));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(877, Short.MAX_VALUE)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("Carros Registrados");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tiquete-sin.png"))); // NOI18N
        img5.setText("jLabel1");
        img5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 240, 210));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setText("GENERAR TIQUETE DE ENTRADA");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, -1, -1));

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tiquete-sin.png"))); // NOI18N
        img6.setText("jLabel1");
        img6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel1.add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 240, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void barra(){
         // File fichero = new File("foto.jpg");
        
 // Por defecto es A4
  Document documento = new Document();
 
  try {
   double x=1000000000;
     double w=2000000000;
        
      int rpta = (int)Math.floor(Math.random()*(w -x)+x);
        
   PdfWriter.getInstance(documento, new FileOutputStream(rpta+".pdf"));
   // Abrimos el documento
   documento.open();
   // Seteamos a la variable el valor que deseamos que tenga el Codigo QR
   String textCodigoQR = ""+rpta;
   // Realizamos una instancia de la clase la cual genera el Codigo QR
   // y seteamos el valor al codigo QR
   BarcodeQRCode codigoBarrasQR = new BarcodeQRCode(textCodigoQR, 0, 0, null);
   // Agregamos la imagen del codigo QR al documento
   
   Calendar fecha = new GregorianCalendar();
   
    int año = fecha.get(Calendar.YEAR);
    int mes = fecha.get(Calendar.MONTH);
    int dia = fecha.get(Calendar.DAY_OF_MONTH);
    int hora = fecha.get(Calendar.HOUR_OF_DAY);
    int minuto = fecha.get(Calendar.MINUTE);
    int segundo = fecha.get(Calendar.SECOND);
    int mess=mes+1;
   
   Image tiket=Image.getInstance("src/Imagenes/tiquete-entrada.png");
   Phrase fechaa=new Phrase(dia+"-"+mess+"-"+año,FontFactory.getFont(FontFactory.HELVETICA,12, Font.NORMAL, BaseColor.BLACK));
   
   Phrase horaa=new Phrase(hora+":"+minuto+":"+segundo);
   

   
   
   Image dd=codigoBarrasQR.getImage();

   tiket.setAlignment(Image.ALIGN_CENTER);
   tiket.setAbsolutePosition(125, 280);
   dd.setAbsolutePosition(285, 430);
   
   
   Paragraph para = new Paragraph();
   Paragraph para2 = new Paragraph();
   para.add("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   para.setAlignment(Paragraph.ALIGN_CENTER);
   para.add(fechaa + "\n\n\n\n" + horaa);

 

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables

    private Object getToolKit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
