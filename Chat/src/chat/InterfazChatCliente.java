/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chat;

import java.awt.Color;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;
public class InterfazChatCliente extends JFrame {


        Socket socket = null;
        BufferedReader lector = null;
        PrintWriter escritor = null; 
    
    public InterfazChatCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Thread principal = new Thread(new Runnable(){
            public void run(){
                try{
                     socket = new Socket("localhost",9000);
                     leer();
                     escribir();
                }catch(Exception ex){
                       ex.printStackTrace();
                } 
            }
        });
        principal.start();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor_areachat = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_chat = new javax.swing.JTextArea();
        contenedor_btntxt = new javax.swing.JPanel();
        txt_mensaje = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor_areachat.setBackground(new java.awt.Color(255, 255, 204));

        area_chat.setEditable(false);
        area_chat.setColumns(20);
        area_chat.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        area_chat.setForeground(new java.awt.Color(51, 51, 255));
        area_chat.setRows(5);
        jScrollPane2.setViewportView(area_chat);

        javax.swing.GroupLayout contenedor_areachatLayout = new javax.swing.GroupLayout(contenedor_areachat);
        contenedor_areachat.setLayout(contenedor_areachatLayout);
        contenedor_areachatLayout.setHorizontalGroup(
            contenedor_areachatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        contenedor_areachatLayout.setVerticalGroup(
            contenedor_areachatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_areachatLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(contenedor_areachat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 430, 200));

        contenedor_btntxt.setBackground(new java.awt.Color(204, 255, 255));

        txt_mensaje.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        txt_mensaje.setForeground(new java.awt.Color(51, 51, 255));
        txt_mensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mensajeActionPerformed(evt);
            }
        });

        btn_enviar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btn_enviar.setForeground(new java.awt.Color(0, 102, 204));
        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedor_btntxtLayout = new javax.swing.GroupLayout(contenedor_btntxt);
        contenedor_btntxt.setLayout(contenedor_btntxtLayout);
        contenedor_btntxtLayout.setHorizontalGroup(
            contenedor_btntxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedor_btntxtLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_enviar)
                .addGap(38, 38, 38))
        );
        contenedor_btntxtLayout.setVerticalGroup(
            contenedor_btntxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor_btntxtLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedor_btntxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_mensaje))
                .addGap(7, 7, 7))
        );

        getContentPane().add(contenedor_btntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 430, 50));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Chat Cliente");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descarga.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Examen U4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Arq. Soft. para la Web");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 130, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 2, 8)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Elizabeth Sanchez Lopez (17011264)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 451, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_mensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mensajeActionPerformed

    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_enviarActionPerformed

     public void leer(){
        Thread leer_hilo = new Thread(new Runnable(){
            public void run(){
        
        try{
            lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                while(true){
                    txt_mensaje.getText();//ojito
                    String mensaje_recibido = lector.readLine();
                    area_chat.append("Servidor: "+mensaje_recibido+"\n");
                }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }});
        
        leer_hilo.start();
    }
        public void escribir(){
            Thread escribir_hilo = new Thread(new Runnable(){
               public void run(){        
            try{
                escritor = new PrintWriter(socket.getOutputStream(),true);
                btn_enviar.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){   
                        String enviar_mensaje = txt_mensaje.getText();
                        area_chat.append("Cliente: "+enviar_mensaje+"\n");//ojito
                        escritor.println(enviar_mensaje);
                        txt_mensaje.setText("");
                    }
                });
            }catch(Exception ex){
            ex.printStackTrace();
            }
               } 
            });
            escribir_hilo.start();
        }
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazChatCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_chat;
    private javax.swing.JButton btn_enviar;
    private javax.swing.JPanel contenedor_areachat;
    private javax.swing.JPanel contenedor_btntxt;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_mensaje;
    // End of variables declaration//GEN-END:variables

}
