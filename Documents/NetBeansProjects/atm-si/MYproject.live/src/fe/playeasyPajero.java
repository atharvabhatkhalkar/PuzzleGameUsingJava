/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fe;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author PrasadYeole
 */
public class playeasyPajero extends javax.swing.JFrame {
     public static int cnt1;
    
    static int x=cnt1;
    
    /**
     * Creates new form playeasy1
     */
    public playeasyPajero() {
   initComponents(); 
   this.setResizable(false);
   pack();
    }
    
     int cnt=0;
    
        public void check(){
         if(jButton1.getIcon()==ic1 && jButton2.getIcon()==ic2 && jButton3.getIcon()==ic3 && 
   jButton4.getIcon()==ic4 && jButton5.getIcon()==ic5 && jButton6.getIcon()==ic6 &&
   jButton7.getIcon()==ic7 && jButton8.getIcon()==ic8 && jButton9.getIcon()==null ){
           //  win w= new win();
           // w.setVisible(true);
           // this.setVisible(false);
           
           try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MYproject.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           
           jLabel5.setVisible(false);
           jPanel2.setVisible(false);
           jButton10.setVisible(true);
           jButton11.setVisible(true);
           jLabel3.setVisible(true);
           jLabel4.setVisible(true);
           jLabel2.setVisible(false);
            String count=Integer.toString(cnt);
             jLabel3.setText(count);
             
             try {
            // TODO add your handling code here:
             JOptionPane.showMessageDialog(null,"Your Current Score is:"+cnt);
            int z=jj();
            x=cnt1;
            if(x<z){
                kk(x);
                jj();
            }       } catch (Exception ex) {
            //Logger.getLogger(TomJerryHighScores.class.getName()).log(Level.SEVERE, null, ex);
        }
             
             
             
             
             
             
        }
    }
        public void count(){
                
             String count=Integer.toString(cnt);
             jLabel2.setText(count);
        }
        
  //  String dp=System.getProperty("user.dir")+"/puzzle";
    //  String dcp=dp.replaceAll("\\", "/");
        
Icon ic1=new ImageIcon(playeasyPajero.class.getResource("/PajeroPuzzleHard/easycuth00.jpg"));
Icon ic2=new ImageIcon(playeasyPajero.class.getResource("/PajeroPuzzleHard/easycuth01.jpg"));
Icon ic3=new ImageIcon(playeasyPajero.class.getResource("/PajeroPuzzleHard/easycuth02.jpg"));
Icon ic4=new ImageIcon(playeasyPajero.class.getResource("/PajeroPuzzleHard/easycuth10.jpg"));
Icon ic5=new ImageIcon(playeasyPajero.class.getResource("/PajeroPuzzleHard/easycuth11.jpg"));
Icon ic6=new ImageIcon(playeasyPajero.class.getResource("/PajeroPuzzleHard/easycuth12.jpg"));
Icon ic7=new ImageIcon(playeasyPajero.class.getResource("/PajeroPuzzleHard/easycuth20.jpg"));
Icon ic8=new ImageIcon(playeasyPajero.class.getResource("/PajeroPuzzleHard/easycuth21.jpg"));
Icon ic9=new ImageIcon(playeasyPajero.class.getResource("/PajeroPuzzleHard/easycuth22.jpg"));


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jButton13.setText("Back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);
        jButton13.setBounds(650, 80, 90, 40);

        jButton12.setText("Restart");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(650, 30, 90, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Atharva\\Documents\\Projects\\atm-si\\MYproject\\src\\Others\\pajero - Copy - Copy.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(541, 340, 190, 180);

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(790, 170, 100, 40);

        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("HIGH SCORE");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(790, 150, 80, 16);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3));

        jButton1.setIcon(ic2);
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setPreferredSize(new java.awt.Dimension(173, 173));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setIcon(ic4);
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setPreferredSize(new java.awt.Dimension(173, 173));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setIcon(ic6);
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.setPreferredSize(new java.awt.Dimension(173, 173));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setIcon(ic7);
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.setPreferredSize(new java.awt.Dimension(173, 173));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setIcon(ic1);
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.setPreferredSize(new java.awt.Dimension(173, 173));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setIcon(ic3);
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.setPreferredSize(new java.awt.Dimension(173, 173));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setIcon(ic5);
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.setPreferredSize(new java.awt.Dimension(173, 173));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 204));
        jButton8.setIcon(null);
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.setPreferredSize(new java.awt.Dimension(173, 173));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.setIcon(ic8);
        jButton9.setPreferredSize(new java.awt.Dimension(173, 173));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(12, 13, 523, 514);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 100)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("0");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(600, 210, 230, 150);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setVisible(false);
        jLabel3.setText(" 000");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 270, 510, 210);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setVisible(false);
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("CONGRACT'S YOU WIN YOUR SCORE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 130, 550, 60);

        jButton10.setBackground(new java.awt.Color(51, 255, 255));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton10.setText("QUIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(750, 20, 110, 120);

        jButton11.setBackground(new java.awt.Color(51, 255, 255));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton11.setText("MENU");
        jButton11.setVisible(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(750, 370, 120, 130);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("YOUR MOVES COUNT");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(580, 190, 200, 14);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sidebg1.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 900, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(918, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                   
                       
        if(jButton2.getIcon()==null){
           Icon temp = jButton5.getIcon();
           jButton2.setIcon(temp);
           jButton5.setIcon(null);
        }
        else  if(jButton4.getIcon()==null){
           Icon temp = jButton5.getIcon();
           jButton4.setIcon(temp);
           jButton5.setIcon(null);
        }
        else  if(jButton6.getIcon()==null){
           Icon temp = jButton5.getIcon();
           jButton6.setIcon(temp);
           jButton5.setIcon(null);
        }
        else  if(jButton8.getIcon()==null){
           Icon temp = jButton5.getIcon();
           jButton8.setIcon(temp);
           jButton5.setIcon(null);
        }
            count();
            check(); 
            cnt++;  try {
            sound s = new sound();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playeasy1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                   
        if(jButton2.getIcon()==null){
           Icon temp = jButton1.getIcon();
           jButton2.setIcon(temp);
           jButton1.setIcon(null);
        }
        else  if(jButton4.getIcon()==null){
           Icon temp = jButton1.getIcon();
           jButton4.setIcon(temp);
           jButton1.setIcon(null);
        }
          count();    check(); cnt++;  try {
            sound s = new sound();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playeasy1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                     
        if(jButton1.getIcon()==null){
           Icon temp = jButton2.getIcon();
           jButton1.setIcon(temp);
           jButton2.setIcon(null);
        }
        else  if(jButton3.getIcon()==null){
           Icon temp = jButton2.getIcon();
           jButton3.setIcon(temp);
           jButton2.setIcon(null);
        }
        else  if(jButton5.getIcon()==null){
           Icon temp = jButton2.getIcon();
           jButton5.setIcon(temp);
           jButton2.setIcon(null);
        }
          count();    check();  cnt++;  try {
            sound s = new sound();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playeasy1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                    
        if(jButton2.getIcon()==null){
           Icon temp = jButton3.getIcon();
           jButton2.setIcon(temp);
           jButton3.setIcon(null);
        }
        else  if(jButton6.getIcon()==null){
           Icon temp = jButton3.getIcon();
           jButton6.setIcon(temp);
           jButton3.setIcon(null);
        }
          count();    check();   cnt++;  try {
            sound s = new sound();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playeasy1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                    
        if(jButton1.getIcon()==null){
           Icon temp = jButton4.getIcon();
           jButton1.setIcon(temp);
           jButton4.setIcon(null);
        }
        else  if(jButton5.getIcon()==null){
           Icon temp = jButton4.getIcon();
           jButton5.setIcon(temp);
           jButton4.setIcon(null);
        }
        else  if(jButton7.getIcon()==null){
           Icon temp = jButton4.getIcon();
           jButton7.setIcon(temp);
           jButton4.setIcon(null);
        }
          count();    check(); cnt++;  try {
            sound s = new sound();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playeasy1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                    
        if(jButton9.getIcon()==null){
           Icon temp = jButton6.getIcon();
           jButton9.setIcon(temp);
           jButton6.setIcon(null);
        }
        else  if(jButton3.getIcon()==null){
           Icon temp = jButton6.getIcon();
           jButton3.setIcon(temp);
           jButton6.setIcon(null);
        }
        else  if(jButton5.getIcon()==null){
           Icon temp = jButton6.getIcon();
           jButton5.setIcon(temp);
           jButton6.setIcon(null);
        }
          count();    check();   cnt++;  try {
            sound s = new sound();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playeasy1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
                     
        if(jButton4.getIcon()==null){
           Icon temp = jButton7.getIcon();
           jButton4.setIcon(temp);
           jButton7.setIcon(null);
        }
        else  if(jButton8.getIcon()==null){
           Icon temp = jButton7.getIcon();
           jButton8.setIcon(temp);
           jButton7.setIcon(null);
        }
           count();    check();  cnt++;  try {
            sound s = new sound();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playeasy1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
                      
        if(jButton5.getIcon()==null){
           Icon temp = jButton8.getIcon();
           jButton5.setIcon(temp);
           jButton8.setIcon(null);
        }
        else  if(jButton7.getIcon()==null){
           Icon temp = jButton8.getIcon();
           jButton7.setIcon(temp);
           jButton8.setIcon(null);
        }
        else  if(jButton9.getIcon()==null){
           Icon temp = jButton8.getIcon();
           jButton9.setIcon(temp);
           jButton8.setIcon(null);
        }
        count();    check();  cnt++;  try {
            sound s = new sound();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playeasy1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
                      
        if(jButton6.getIcon()==null){
           Icon temp = jButton9.getIcon();
           jButton6.setIcon(temp);
           jButton9.setIcon(null);
        }
        else  if(jButton8.getIcon()==null){
           Icon temp = jButton9.getIcon();
           jButton8.setIcon(temp);
           jButton9.setIcon(null);
        }
        count();    check();    cnt++;  try {
            sound s = new sound();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(playeasy1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(new java.awt.Color(255, 255, 2));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        try {
            Thread.sleep(3*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MYproject.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        MYproject mp = new MYproject();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        cnt=0;
        String count=Integer.toString(cnt);
             jLabel2.setText(count);
        
        jButton1.setIcon(ic1);
        jButton2.setIcon(ic2);
        jButton3.setIcon(ic9);
        jButton4.setIcon(ic6);
        jButton5.setIcon(ic3);
        jButton6.setIcon(ic4);
        jButton7.setIcon(ic7);
        jButton8.setIcon(ic5);
        jButton9.setIcon(null);
        
                     
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
         setVisible(false);
        optiopics mp=new optiopics();
        mp.setVisible(true);
        
    }//GEN-LAST:event_jButton13ActionPerformed

     public void kk(int cnt1) throws Exception{
    int x=cnt1;
    Connection con=DBconnect.getConnection();
    Statement st=con.createStatement();
        int rs=st.executeUpdate("update  pajero_high set easy="+x);
        JOptionPane.showMessageDialog(null,"Congratulations You beat the high score");
    //rs.next();
  //  x=rs.getInt(1);
    //rs.close();
    st.close();
    con.close();
   }
    public int jj() throws Exception
{
    int x;
    Connection con=DBconnect.getConnection();
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select * from  pajero_high");
    rs.next();
    x=rs.getInt(1);
    jTextField1.setText(rs.getString(1));
    rs.close();
    st.close();
    con.close();
    return x;
}
    
    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        x=cnt1;
        
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(playeasyPajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playeasyPajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playeasyPajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playeasyPajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playeasyPajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
