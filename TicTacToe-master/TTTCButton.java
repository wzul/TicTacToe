import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
public class TTTCButton extends JFrame implements ActionListener {
   private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11;
   private JTextField txtField, txtField2;
   private JLabel lbl, lblkeputusan, lblFirstName, lblSecondName, lbl11,txtArea, petunjuk1, petunjuk2, petunjuk3;
   private boolean dhJawab[] = new boolean[9];
   private String jawapan[] = new String[9];
   private boolean statusGiliran = true, sapaMulaDulu =true; //true == player 1 false == player 2 //true p1 mula dulu. false p2 mula dulu
   private static String namaPlayer1="a", namaPlayer12="a";
   private static String namaPlayer2="a";
   private static String simbol1;
   private static String simbol2;
   private saveScore simpan = new saveScore();
   
   public TTTCButton(int first){
      super("Play TicTacToe. Masuk Nama");
      Container pane = getContentPane();
      pane.setLayout(null);
      btn10 = new JButton("Enter");
      btn10.setLayout(null);
      btn10.setLocation(140, 220);
      btn10.setSize(new Dimension(100,25));
      btn10.addActionListener(this);
      txtField = new JTextField(10);
      txtField.setLayout(null);
      txtField.setLocation(140, 97);
      txtField.addActionListener(this);
      txtField.setSize(new Dimension(240, 20));
      txtField2 = new JTextField(10);
      txtField2.setLayout(null);
      txtField2.setLocation(140, 147);
      txtField2.setSize(new Dimension(240, 20));
      lblFirstName = new JLabel("Player 1 Name: ");
      lblFirstName.setLayout(null);
      lblFirstName.setSize(new Dimension(1000, 10));
      lblFirstName.setLocation(30, 100);
      lblSecondName = new JLabel("Player 2 Name: ");
      lblSecondName.setLayout(null);
      lblSecondName.setSize(new Dimension(1000, 10));
      lblSecondName.setLocation(30, 150);
      pane.add(btn10);
      pane.add(txtField);
      pane.add(txtField2);
      pane.add(lblSecondName);
      pane.add(lblFirstName);
      setSize(500,350);
      setVisible(true);
   }
   public TTTCButton(){
      super("Play TicTacToe. Wan, Razi, Syahirah, Farhana");
      simbol1 = namaPlayer1.substring(0, 1);
      if (simbol1.equalsIgnoreCase(namaPlayer2.substring(0,1)))      
         simbol2 = namaPlayer2.substring(0, 1) + "'";
      else
         simbol2 = namaPlayer2.substring(0, 1);
      for (int i=0; i<9;i++){
         jawapan[i] = "";
         dhJawab[i] = true;
      }
      Container pane = getContentPane();
      pane.setLayout(null);
      btn1 = new JButton(jawapan[0]);
      btn2 = new JButton(jawapan[1]);
      btn3 = new JButton(jawapan[2]);
      btn4 = new JButton(jawapan[3]);
      btn5 = new JButton(jawapan[4]);
      btn6 = new JButton(jawapan[5]);
      btn7 = new JButton(jawapan[6]);
      btn8 = new JButton(jawapan[7]);
      btn9 = new JButton(jawapan[8]);
      btn11 = new JButton("Restart");
      btn11.setLayout(null);
      btn11.setLocation(400, 80);
      btn11.setSize(new Dimension(100,25));
      btn11.addActionListener(this);
      btn1.setLayout(null);
      btn1.setLocation(30, 80);
      btn1.setSize(new Dimension(100, 100));
      
      btn2.setLayout(null);
      btn2.setLocation(130, 80);
      btn2.setSize(new Dimension(100, 100));
   
      btn3.setLayout(null);
      btn3.setLocation(230, 80);
      btn3.setSize(new Dimension(100, 100));
      
      btn4.setLayout(null);
      btn4.setLocation(30, 180);
      btn4.setSize(new Dimension(100, 100));      
      
      btn5.setLayout(null);
      btn5.setLocation(130, 180);
      btn5.setSize(new Dimension(100, 100));
      
      btn6.setLayout(null);
      btn6.setLocation(230, 180);
      btn6.setSize(new Dimension(100, 100));
      
      btn7.setLayout(null);
      btn7.setLocation(30, 280);
      btn7.setSize(new Dimension(100, 100));
      
      btn8.setLayout(null);
      btn8.setLocation(130, 280);
      btn8.setSize(new Dimension(100, 100));
      
      btn9.setLayout(null);
      btn9.setLocation(230, 280);
      btn9.setSize(new Dimension(100, 100));
      
      //UBAH FONT
      
      btn1.setFont(new Font("Arial", Font.PLAIN, 40));
      btn2.setFont(new Font("Arial", Font.PLAIN, 40));
      btn3.setFont(new Font("Arial", Font.PLAIN, 40));
      btn4.setFont(new Font("Arial", Font.PLAIN, 40));
      btn5.setFont(new Font("Arial", Font.PLAIN, 40));
      btn6.setFont(new Font("Arial", Font.PLAIN, 40));
      btn7.setFont(new Font("Arial", Font.PLAIN, 40));
      btn8.setFont(new Font("Arial", Font.PLAIN, 40));
      btn9.setFont(new Font("Arial", Font.PLAIN, 40));
   
      txtArea = new JLabel(simpan.display());
      txtArea.setLayout(null);
      txtArea.setLocation(400, 200);
      txtArea.setSize(new Dimension(400, 300));
      
      lbl = new JLabel("Giliran: "+namaPlayer1 + " (P1)");
      lbl.setLayout(null);
      lbl.setLocation(400,100);
      lbl.setSize(new Dimension(700, 100));
      
      petunjuk1 = new JLabel("Petunjuk");
      petunjuk1.setLayout(null);
      petunjuk1.setLocation(400,130);
      petunjuk1.setSize(new Dimension(700, 100));
      
      petunjuk2 = new JLabel("Player 1: "+ namaPlayer1 + " (Simbol: "+simbol1+")");
      petunjuk2.setLayout(null);
      petunjuk2.setLocation(400,150);
      petunjuk2.setSize(new Dimension(700, 100));
      
      petunjuk3 = new JLabel("Player 2: "+ namaPlayer2 + " (Simbol: "+simbol2+")");
      petunjuk3.setLayout(null);
      petunjuk3.setLocation(400,170);
      petunjuk3.setSize(new Dimension(700, 100));
      
      lbl11 = new JLabel("Pemenang");
      lbl11.setLayout(null);
      lbl11.setLocation(400,275);
      lbl11.setSize(new Dimension(100, 100));
      
      lblkeputusan = new JLabel(" ");
      lblkeputusan.setLayout(null);
      lblkeputusan.setLocation(400,200);
      lblkeputusan.setSize(new Dimension(100, 100));
      pane.add(petunjuk2);
      pane.add(petunjuk1);
      pane.add(petunjuk3);
      pane.add(lblkeputusan);
      pane.add(btn11);
      pane.add(txtArea);
      pane.add(btn1);
      pane.add(lbl11);
      pane.add(btn2);
      pane.add(btn3);
      pane.add(btn4);
      pane.add(btn5);
      pane.add(btn6);
      pane.add(btn7);
      pane.add(btn8);
      pane.add(btn9);
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);
      btn4.addActionListener(this);
      btn5.addActionListener(this);
      btn6.addActionListener(this);
      btn7.addActionListener(this);
      btn8.addActionListener(this);
      btn9.addActionListener(this);
      pane.add(lbl);
      setSize(700,480);
      setVisible(true);
      
   }
   
   public void actionPerformed(ActionEvent e){
   
      if (e.getSource()==btn11){
         for (int i=0; i<9;i++){
            dhJawab[i] = true;
            jawapan[i]="";
         }
         btn1.setText("");           
         btn2.setText("");
         btn3.setText("");
         btn4.setText("");
         btn5.setText("");
         btn6.setText("");
         btn7.setText("");
         btn8.setText("");
         btn9.setText("");
         if (sapaMulaDulu){
            statusGiliran = false;
            lbl.setText("Giliran: "+namaPlayer2+ " (P1)");
            sapaMulaDulu = false;
            petunjuk2.setText("Player 1: "+ namaPlayer2 + " (Simbol: "+simbol2+")");
            petunjuk3.setText("Player 2: "+ namaPlayer1 + " (Simbol: "+simbol1+")");
         }
         else {
            statusGiliran = true;
            lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            sapaMulaDulu = true;
            petunjuk2.setText("Player 1: "+ namaPlayer1 + " (Simbol: "+simbol1+")");
            petunjuk3.setText("Player 2: "+ namaPlayer2 + " (Simbol: "+simbol2+")");
         }
         lblkeputusan.setText("");
         txtArea.setText(simpan.display());
      }
      if (e.getSource()==btn10){
         namaPlayer1 = txtField.getText();
         namaPlayer2 = txtField2.getText();
         TTTCButton teks = new TTTCButton();
         this.dispose();
         teks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
      if (e.getSource()==btn1 && dhJawab[0]){
         if (statusGiliran){
            btn1.setText(jawapan[0]=simbol1);
         //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 0, dhJawab)==1){
               lblkeputusan.setText(namaPlayer1+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(1);
            }
            else if (checkJawapan.checkJawapan(jawapan, 0, dhJawab)==0) {
               dhJawab[0] = false;
            //check jawapan
               statusGiliran = false;
               lbl.setText("Giliran: "+namaPlayer2+ " (P2)");
            }
            if (checkJawapan.checkJawapan(jawapan, 0, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            }
         }
         else {
            btn1.setText(jawapan[0]=simbol2);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 0, dhJawab)==1){
               lblkeputusan.setText(namaPlayer2+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(2);
            }
            else if (checkJawapan.checkJawapan(jawapan, 0, dhJawab)==0){
               dhJawab[0] = false;
            //check jawapan
               statusGiliran = true;
               lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            }
            if (checkJawapan.checkJawapan(jawapan, 0, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            }
         }
         //txtField.setText("You're welcome");
      }
      if (e.getSource()==btn2 && dhJawab[1]){
         if (statusGiliran){
            btn2.setText(jawapan[1]=simbol1);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 1, dhJawab)==1){
               lblkeputusan.setText(namaPlayer1+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(1);
            }
            else if (checkJawapan.checkJawapan(jawapan, 1, dhJawab)==0){
               dhJawab[1] = false;
            //check jawapan
               statusGiliran = false;
               lbl.setText("Giliran: "+namaPlayer2+ " (P2)");
            }
            if (checkJawapan.checkJawapan(jawapan, 1, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            }
         }
         else {
            btn2.setText(jawapan[1]=simbol2);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 1, dhJawab)==1){
               lblkeputusan.setText(namaPlayer2+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(2);
            }
            else if (checkJawapan.checkJawapan(jawapan, 1, dhJawab)==0){
               dhJawab[1] = false;
            //check jawapan
               statusGiliran = true;
               lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            }
            if (checkJawapan.checkJawapan(jawapan, 1, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            }    
         }
      }
      if (e.getSource()==btn3&&dhJawab[2]){
         if (statusGiliran){
            btn3.setText(jawapan[2]=simbol1);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 2, dhJawab)==1){
               lblkeputusan.setText(namaPlayer1+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(1);
            }
            else if (checkJawapan.checkJawapan(jawapan, 2, dhJawab)==0){
               dhJawab[2] = false;
            //check jawapan
               statusGiliran = false;
               lbl.setText("Giliran: "+namaPlayer2+ " (P2)");
            }
            if (checkJawapan.checkJawapan(jawapan, 2, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            }  
         }
         else {
            btn3.setText(jawapan[2]=simbol2);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 2, dhJawab)==1){
               lblkeputusan.setText(namaPlayer2+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(2);
            }
            else if (checkJawapan.checkJawapan(jawapan, 2, dhJawab)==0){
               dhJawab[2] = false;
            //check jawapan
               statusGiliran = true;
               lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            }
            if (checkJawapan.checkJawapan(jawapan, 2, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
      }
      if (e.getSource()==btn4 && dhJawab[3]){
         if (statusGiliran){
            btn4.setText(jawapan[3]=simbol1);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 3, dhJawab)==1){
               lblkeputusan.setText(namaPlayer1+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(1);
            }
            else if (checkJawapan.checkJawapan(jawapan, 3, dhJawab)==0){
            //check jawapan
               dhJawab[3] = false;
               statusGiliran = false;
               lbl.setText("Giliran: "+namaPlayer2+ " (P2)");
            }
            if (checkJawapan.checkJawapan(jawapan, 3, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
         else {
            btn4.setText(jawapan[3]=simbol2);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 3, dhJawab)==1){
               lblkeputusan.setText(namaPlayer2+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(2);
            }
            else if (checkJawapan.checkJawapan(jawapan, 3, dhJawab)==0){
               dhJawab[3] = false;
            //check jawapan
               statusGiliran = true;
               lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            }
            if (checkJawapan.checkJawapan(jawapan, 3, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
         //txtField.setText("You're welcome");
      }
      if (e.getSource()==btn5&&dhJawab[4]){
         if (statusGiliran){
            btn5.setText(jawapan[4]=simbol1);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 4, dhJawab)==1){
               lblkeputusan.setText(namaPlayer1+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(1);
            }
            else if (checkJawapan.checkJawapan(jawapan, 4, dhJawab)==0){
               dhJawab[4] = false;
            //check jawapan
               statusGiliran = false;
               lbl.setText("Giliran: "+namaPlayer2+ " (P2)");
            }
            if (checkJawapan.checkJawapan(jawapan, 4, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
         else {
            btn5.setText(jawapan[4]=simbol2);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 4, dhJawab)==1){
               lblkeputusan.setText(namaPlayer2+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(2);
            }
            else if (checkJawapan.checkJawapan(jawapan, 4, dhJawab)==0){
               dhJawab[4] = false;
            //check jawapan
               statusGiliran = true;
               lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            }
            if (checkJawapan.checkJawapan(jawapan, 4, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
         //txtField.setText("You're welcome");
      }
      if (e.getSource()==btn6&&dhJawab[5]){
         if (statusGiliran){
            btn6.setText(jawapan[5]=simbol1);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 5, dhJawab)==1){
               lblkeputusan.setText(namaPlayer1+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }   
               simpanPmnng(1);
            }
            else if (checkJawapan.checkJawapan(jawapan, 5, dhJawab)==0){
               dhJawab[5] = false;
            //check jawapan
               statusGiliran = false;
               lbl.setText("Giliran: "+namaPlayer2+ " (P2)");
            }
            if (checkJawapan.checkJawapan(jawapan, 5, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
         else {
            btn6.setText(jawapan[5]=simbol2);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 5, dhJawab)==1){
               lblkeputusan.setText(namaPlayer2+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(2);
            }
            else if (checkJawapan.checkJawapan(jawapan, 5, dhJawab)==0){
            //check jawapan
               dhJawab[5] = false;
               statusGiliran = true;
               lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            }
            if (checkJawapan.checkJawapan(jawapan, 5, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
         //txtField.setText("You're welcome");
      }
      if (e.getSource()==btn7 &&dhJawab[6]){
         if (statusGiliran){
            btn7.setText(jawapan[6]=simbol1);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 6, dhJawab)==1){
               lblkeputusan.setText(namaPlayer1+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }   
               simpanPmnng(1);
            }
            else if (checkJawapan.checkJawapan(jawapan, 6, dhJawab)==0){
               dhJawab[6] = false;
            //check jawapan
               statusGiliran = false;
               lbl.setText("Giliran: "+namaPlayer2+ " (P2)");
            }
            if (checkJawapan.checkJawapan(jawapan, 6, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
         else {
            btn7.setText(jawapan[6]=simbol2);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 6, dhJawab)==1){
               lblkeputusan.setText(namaPlayer2+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(2);
            }
            else if (checkJawapan.checkJawapan(jawapan, 6, dhJawab)==0){
               dhJawab[6] = false;
            //check jawapan
               statusGiliran = true;
               lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            }
            if (checkJawapan.checkJawapan(jawapan, 6, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
      }
      if (e.getSource()==btn8&&dhJawab[7]){
         if (statusGiliran){
            btn8.setText(jawapan[7]=simbol1);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 7, dhJawab)==1){
               lblkeputusan.setText(namaPlayer1+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }            
               simpanPmnng(1);
            }
            else if (checkJawapan.checkJawapan(jawapan, 7, dhJawab)==0){
               dhJawab[7] = false;
               statusGiliran = false;
               lbl.setText("Giliran: "+namaPlayer2+ " (P2)");
            }
            if (checkJawapan.checkJawapan(jawapan, 7, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
         else {
            btn8.setText(jawapan[7]=simbol2);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 7, dhJawab)==1){
               lblkeputusan.setText(namaPlayer2+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(2);  
            }
            else if (checkJawapan.checkJawapan(jawapan, 7, dhJawab)==0){
               dhJawab[7] = false;
               statusGiliran = true;
               lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            }
            if (checkJawapan.checkJawapan(jawapan, 7, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
      }
      if (e.getSource()==btn9&&dhJawab[8]){
         if (statusGiliran){
            btn9.setText(jawapan[8]=simbol1);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 8, dhJawab)==1){
               lblkeputusan.setText(namaPlayer1+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }           
               simpanPmnng(1);
            }
            else if (checkJawapan.checkJawapan(jawapan, 8, dhJawab)==0){
               dhJawab[8] = false;
            //check jawapan
               statusGiliran = false;
               lbl.setText("Giliran: "+namaPlayer2+ " (P2)");
            }
            if (checkJawapan.checkJawapan(jawapan, 8, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
         else {
            btn9.setText(jawapan[8]=simbol2);
                                       //check jawapan
            if (checkJawapan.checkJawapan(jawapan, 8, dhJawab)==1){
               lblkeputusan.setText(namaPlayer2+" Menang");
               for (int i=0; i<9;i++){
                  dhJawab[i] = false;
               }
               simpanPmnng(2);          
            }
            else if (checkJawapan.checkJawapan(jawapan, 8, dhJawab)==0){
               dhJawab[8] = false;
            //check jawapan
               statusGiliran = true;
               lbl.setText("Giliran: "+namaPlayer1+ " (P1)");
            }
            if (checkJawapan.checkJawapan(jawapan, 8, dhJawab)==2) {
               lbl.setText("");
               lblkeputusan.setText("Draw!");
            } 
         }
      }
   }
   public static void main(String[] args){
      TTTCButton reqNama = new TTTCButton(5);
      reqNama.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   public void simpanPmnng(int no){
      try {
         if (no == 1){
            simpan.save(namaPlayer1);
         }
         else if (no == 2){
            simpan.save(namaPlayer2);
         }
      }
      catch (IOException ab){}
   }
}
