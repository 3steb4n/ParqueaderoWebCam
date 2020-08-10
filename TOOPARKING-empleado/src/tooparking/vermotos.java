/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tooparking;

import JPanelWebCam.JPanelWebCam;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Esteban
 */
public class vermotos extends javax.swing.JFrame {

    /**
     * Creates new form vermotos
     */
    public String consulta="";
    public int rpta=0;
    public int cod_veh=0;
    public String no_placa="";
    public vermotos() {
        initComponents();
         panel1.setBackground(new Color(255,251,251));
         jPanel2.setBackground(new Color(255,251,251));
         this.setLocationRelativeTo(null);
         
           if(b_placa.getText().length()==0){
             consulta= "SELECT vehre_placa, vehre_descrip, Fecha_registro, vehre_foto FROM vehiculos_registrados WHERE tipveh_cod='2'";
             ver_veh();
         }
        
        
        
        b_placa.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                
                
                if(b_placa.getText().length()>0){
                    
                    consulta="SELECT vehre_placa, vehre_descrip, Fecha_registro, vehre_foto FROM vehiculos_registrados WHERE tipveh_cod='2' and vehre_placa LIKE '"+b_placa.getText()+'%'+"'";
                    ver_veh();
                    
                }else if(b_placa.getText().length()==0){
                    
                    consulta= "SELECT vehre_placa, vehre_descrip, Fecha_registro, vehre_foto FROM vehiculos_registrados WHERE tipveh_cod='2'";
                    ver_veh();
                }
                
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                 
                  if(b_placa.getText().length()>0){
                    
                   consulta="SELECT vehre_placa, vehre_descrip, Fecha_registro, vehre_foto FROM vehiculos_registrados WHERE tipveh_cod='2' and vehre_placa LIKE '"+b_placa.getText()+'%'+"'";
                    ver_veh();
                    
                }else if(b_placa.getText().length()==0){
                    
                    consulta= "SELECT vehre_placa, vehre_descrip, Fecha_registro, vehre_foto FROM vehiculos_registrados WHERE tipveh_cod='2'";
                    ver_veh();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                 if(b_placa.getText().length()>0){
                    
                    consulta="SELECT vehre_placa, vehre_descrip, Fecha_registro, vehre_foto FROM vehiculos_registrados WHERE tipveh_cod='2' and vehre_placa LIKE '"+b_placa.getText()+'%'+"'";
                    ver_veh(); 
                    
                }else if(b_placa.getText().length()==0){
                    
                    consulta= "SELECT vehre_placa, vehre_descrip, Fecha_registro, vehre_foto FROM vehiculos_registrados WHERE tipveh_cod='2'";
                    ver_veh();
                }
            }
        });
    }
    
    
    
public int yy=20;
public int hh=450;
public int actualizar=0;    


    public void ver_veh(){
       
    yy=20;
    hh=450;
    
    panel1.removeAll();
        
        
        
        
        int re =0;
          try{
        
      Statement ss= cn.createStatement();
      ResultSet rs=ss.executeQuery(consulta);
      
      while(rs.next()){
           Blob blob2=rs.getBlob(4);
        String no_placa=rs.getString(1);
        
      
          
           
        JPanel p = new JPanel();
        JTextField l1 = new JTextField();
        JButton jb1 = new JButton();
        JButton jb2 = new JButton();
        JButton jb3 = new JButton();
        JTextArea l2 = new JTextArea ();
        Label l3 = new Label();
        JLabel l7 = new JLabel();
        JLabel l8 = new JLabel();
        Label placa = new Label();
        JPanelWebCam web_cam = new JPanelWebCam();
        l8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        jb1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
            }
        });
        
        jb2.addMouseListener(new MouseListener() {
             @Override
             public void mouseClicked(MouseEvent e) {
                 
                 System.out.println(no_placa);
                 
                 Document documento = new Document();
 
  try {
   double x=1000000000;
     double w=2000000000;
        
      rpta = (int)Math.floor(Math.random()*(w -x)+x);
        
   PdfWriter.getInstance(documento, new FileOutputStream("src/Tiquetes/"+no_placa+"-"+rpta+".pdf"));
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
   
   com.itextpdf.text.Image tiket=com.itextpdf.text.Image.getInstance("src/Imagenes/Sin título-4.png");
   Phrase fechaa=new Phrase(dia+"-"+mess+"-"+año,FontFactory.getFont(FontFactory.HELVETICA,12, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK));
   
   Phrase horaa=new Phrase(hora+":"+minuto+":"+segundo);
   

   
   
   com.itextpdf.text.Image dd=codigoBarrasQR.getImage();

             
  
  
   
   tiket.setAlignment(com.itextpdf.text.Image.ALIGN_CENTER);
   dd.setAlignment(com.itextpdf.text.Image.ALIGN_CENTER);
   tiket.setAbsolutePosition(125, 280);
   dd.scaleAbsolute(120,120);
   dd.setAbsolutePosition(240,515);
   tiket.scaleAbsolute(348, 489);
   
   
   Paragraph para = new Paragraph();
   Paragraph para2 = new Paragraph();
   para.add("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   para.setAlignment(Paragraph.ALIGN_CENTER);
   para.add(fechaa);  
   para.add("\n\n\n\n");        
   para.add(horaa);

 

  documento.add(para);
  documento.add(tiket);
  documento.add(dd);
   

  
  
  
   try{
            
            
            String consulta="SELECT vehre_cod FROM vehiculos_registrados WHERE vehre_placa='"+no_placa+"'";
            
            Statement st =cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            
            while(rs.next()){
                
                cod_veh=rs.getInt(1);
                
            }
            
            
        }catch(Exception ex){
            
            
            System.out.println(ex.getMessage());
        }   

   
      
        System.out.println(no_placa);
        
        Calendar fecha_2 = new GregorianCalendar();

    int hora_2 = fecha_2.get(Calendar.HOUR_OF_DAY);
    int minuto_2 = fecha_2.get(Calendar.MINUTE);
        
        try{
            
            String consulta="INSERT INTO ticket_entrada (ticken_cod, vehre_cod, ticken_horas, ticken_minutos) VALUES (?,?,?,?)";
            
            PreparedStatement ps =cn.prepareStatement(consulta);
            
            ps.setString(1,""+rpta);
            ps.setInt(2, + cod_veh);
            ps.setInt(3, hora);
            ps.setInt(4, minuto);
            ps.executeUpdate();
            
            
            
            
        }catch(Exception ex){
            
            
            System.out.println(ex.getMessage());
            
            
        }
   
   // Cerramos el documento
   documento.close();
  } catch (DocumentException ex) {
   // Atrapamos excepciones concernientes al documentoo.
  } catch (java.io.IOException ex) {
   // Atrapamos excepciones concernientes al I/O.
  }
    JOptionPane.showMessageDialog(null, "Tiquete generado!.");
             }

             @Override
             public void mousePressed(MouseEvent e) {
                
             }

             @Override
             public void mouseReleased(MouseEvent e) {
                 
             }

             @Override
             public void mouseEntered(MouseEvent e) {
             
             }

             @Override
             public void mouseExited(MouseEvent e) {
             
             }
         });
        
        jb1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
             
     
               
         System.out.println(actualizar+"");
               
             
                   
                   
                   if(l1.getText().isEmpty()||l2.getText().isEmpty()){
                       JOptionPane.showMessageDialog(null,"Uno de los campos esta vacio. Intentelo denuevo.");
                   }else{
                     
                       
                         if(actualizar>=1){
                        actualizar=0;
                   jb1.setText("Actualizar Datos");
                   l2.setEditable(false);
                   l1.setEditable(false);
                   web_cam.setVisible(false);
                   l1.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
                     
                       try{
                           
                            byte[] imagen ;
                           
                          
        
                                  if(web_cam.getBytes().length<=1){
                                      
                             
                               imagen = blob2.getBytes(1,(int)blob2.length());
                       

            
                                              }else{
                                      
                                      imagen=web_cam.getBytes();
                                  }
                           
                           String actualizar_datos="UPDATE vehiculos_registrados SET Vehre_placa=?, Vehre_descrip=?, Vehre_foto=? WHERE Vehre_placa='"+no_placa+"'";
                           PreparedStatement ps = cn.prepareStatement(actualizar_datos);
                           ps.setString(1, l1.getText());
                           ps.setString(2, l2.getText());
                           ps.setBytes(3, imagen);
                           ps.executeUpdate();
                           System.out.println("SI");
                           ver_veh();
                         
                           
                       }catch(Exception ex){
                           System.out.println(ex.getMessage());
                       }
                   
                   
                   }else if (actualizar==0){
                   
                   
                   actualizar+=1;
                   
               l2.setEditable(true);
               l1.setEditable(true);
               l1.setBorder(BorderFactory.createLineBorder(Color.black));
               jb1.setText("Guardar cambios");
               
               
               
               l7.addMouseListener(new MouseListener() {
                       @Override
                       public void mouseClicked(MouseEvent e) {
                            
                       }

                       @Override
                       public void mousePressed(MouseEvent e) {
                         
                       }

                       @Override
                       public void mouseReleased(MouseEvent e) {
                          
                       }

                       @Override
                       public void mouseEntered(MouseEvent e) {
                           
                           
                           if(actualizar==0){
                               
                               l8.setVisible(false);
                           }else{
                            l8.setVisible(true);
                            l8.setBounds(413,80, 280, 230);
                            java.awt.Image img=getToolkit().getImage("src/Imagenes/actualizar_imagen.png");
   
                         l8.setIcon(new ImageIcon(img));
                         
                         System.out.println("gfgf");
                         
                         l8.addMouseListener(new MouseListener() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                     web_cam.setVisible(true);
                                 web_cam.setBounds(413,80, 280, 230);
                                }

                                @Override
                                public void mousePressed(MouseEvent e) {
                                  
                                }

                                @Override
                                public void mouseReleased(MouseEvent e) {
                                   
                                }

                                @Override
                                public void mouseEntered(MouseEvent e) {
                                   
                                }

                                @Override
                                public void mouseExited(MouseEvent e) {
                                   
                                }
                            });
                               
                           
                       }
                       }
                       @Override
                       public void mouseExited(MouseEvent e) {
                          
                           l8.setVisible(false);
                       }
                   });
               
               
                   
               }
               
                   }
             
             
            }

            @Override
            public void mousePressed(MouseEvent e) {
              
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
             
            }
        });
      
        
        jb3.addMouseListener(new MouseListener() {
               @Override
               public void mouseClicked(MouseEvent e) {
             
                   try{
                       
                       String consulta_eliminar="DELETE FROM vehiculos_registrados WHERE Vehre_placa='"+no_placa+"'";
                       
                       PreparedStatement ps = cn.prepareStatement(consulta_eliminar);
                       
                       ps.executeUpdate();
                       ver_veh();
                       
                   }catch(Exception ex){
                       
                       
                       JOptionPane.showMessageDialog(null,"No se puede eliminar este vehiculo");
                   }
               }

               @Override
               public void mousePressed(MouseEvent e) {
                 
               }

               @Override
               public void mouseReleased(MouseEvent e) {
                  
               }

               @Override
               public void mouseEntered(MouseEvent e) {
                 
               }

               @Override
               public void mouseExited(MouseEvent e) {
                   
               }
           });
          
      
        
        
        p.setBackground(Color.WHITE);
        p.setSize(750, 330);
        p.setLocation(30, yy);
        panel1.setPreferredSize(new Dimension(400,hh));
        
        placa.setForeground(Color.BLACK);    
        placa.setText("Placa || ");
        placa.setFont(new Font("Century Gothic",Font.PLAIN,30));
        placa.setBounds(408,20,300,50);
        
        l1.setForeground(Color.black);
        l1.setText(rs.getString(1));
        l1.setFont(new Font("Century Gothic",Font.PLAIN,30));
        l1.setBounds(520, 20 ,140, 50); //ancho, alto, tamaño-ancho,tamaño-alto
        l1.setEditable(false);
        l1.setBorder(javax.swing.BorderFactory.createEmptyBorder()); 
       
        jb1.setBounds(10,8,130,30);
        jb1.setText("Actualizar Datos");
        jb1.setBackground(new Color(0,153,153));
        jb1.setForeground(Color.WHITE);
        
        jb2.setBounds(150,8,130,30);
        jb2.setText("Generar Tiquete");
        jb2.setBackground(new Color(0,153,153));
        jb2.setForeground(Color.WHITE);
        
        jb3.setBounds(290,8,100,30);
        jb3.setText("Eliminar");
        jb3.setBackground(new Color(0,153,153));
        jb3.setForeground(Color.WHITE);
        
        l2.setForeground(Color.black);
        l2.setText(rs.getString(2));
        l2.setBackground(new Color(255,251,251));
        l2.setFont(new Font("Century Gothic",Font.PLAIN,13));
        l2.setBounds(10, 110, 350, 150);
        l2.setEditable(false);
        l2.setBorder(BorderFactory.createLineBorder(Color.black));
        
        
        l3.setForeground(Color.black);
        l3.setText("Fecha: "+ rs.getString(3));
        l3.setFont(new Font("Century Gothic",Font.PLAIN,25));
        l3.setBounds(10, 70, 280, 40);
        
        p.setBorder(BorderFactory.createLineBorder(Color.black));
     
        
        l7.setBounds(413,80, 280, 230);
         
        Blob blob=rs.getBlob(4);
        byte [] data = blob.getBytes(1,(int)blob.length());
        BufferedImage img = null;

        img=ImageIO.read(new ByteArrayInputStream(data));

        ImageIcon icono= new ImageIcon(img);
        Icon iconoo= new ImageIcon(icono.getImage().getScaledInstance(l7.getWidth(), l7.getHeight(), Image.SCALE_DEFAULT));
        l7.setIcon(iconoo);
       
        
       
        yy+=350;
        hh+=400;
        p.add(web_cam);
        p.add(l8);
        p.add(l1);
        p.add(jb1);
        p.add(jb2);
        p.add(jb3);
        p.add(l2);
        p.add(l3);
        p.add(l7);       
        p.add(placa);
        
        
        p.setLayout(null);
        panel1.add(p);
        panel1.updateUI();   
        
        re+=1;
        
        
      }
      
        
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
          resu.setText("Resultados: " + re);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        b_placa = new javax.swing.JTextField();
        resultados1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panel1 = new javax.swing.JPanel();
        resu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 11, -1, 50));

        b_placa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel3.add(b_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 160, 50));

        resultados1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        resultados1.setForeground(new java.awt.Color(255, 255, 255));
        resultados1.setText("BUSQUEDA");
        jPanel3.add(resultados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1232, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(panel1);

        resu.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        resu.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resu)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(resu)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 890, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 766, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Empleado l = new Empleado();
        l.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(vermotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vermotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vermotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vermotos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vermotos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField b_placa;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel1;
    private javax.swing.JLabel resu;
    private javax.swing.JLabel resultados1;
    // End of variables declaration//GEN-END:variables
conexion cc = new conexion();
Connection cn = cc.conexion2();
}
