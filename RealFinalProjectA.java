import java.util.Scanner;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.HashMap; 
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
        
public class RealFinalProjectA extends javax.swing.JFrame {

    public RealFinalProjectA() {
        initComponents();
    }
    
    static String strToBinary(String s) 
    { 
        int n = s.length(); 
        String result = "";
  
        for (int i = 0; i < n; i++)  
        { 
            
            int val = Integer.valueOf(s.charAt(i)); 
            String bin = ""; 
            while (val > 0)  
            { 
                if (val % 2 == 1) 
                { 
                    bin += '1'; 
                } 
                else
                    bin += '0'; 
                val /= 2; 
            } 
            bin = reverse(bin); 
  
            result += bin + " "; 
        }
        return result;
    } 
  
    static String reverse(String input)  
    { 
        char[] a = input.toCharArray(); 
        int l, r = 0; 
        r = a.length - 1; 
  
        for (l = 0; l < r; l++, r--) 
        { 
            char temp = a[l]; 
            a[l] = a[r]; 
            a[r] = temp; 
        } 
        return String.valueOf(a); 
    } 
    
public static String ASCIItoHEX(String ascii)
    {
       
        String hex = "";
 
     
        for (int i = 0; i < ascii.length(); i++) {
 

            char ch = ascii.charAt(i);
 
           
            int in = (int)ch;
 
       
            String part = Integer.toHexString(in);
 
        
            hex += part;
        }
       
        return hex;
    }

    String hexToBinary(String hex) 
    { 
  
     
        String binary = ""; 
  
        
        hex = hex.toUpperCase(); 
  
        HashMap<Character, String> hashMap = new HashMap<Character, String>(); 
  
        hashMap.put('0', "0000"); 
        hashMap.put('1', "0001"); 
        hashMap.put('2', "0010"); 
        hashMap.put('3', "0011"); 
        hashMap.put('4', "0100"); 
        hashMap.put('5', "0101"); 
        hashMap.put('6', "0110"); 
        hashMap.put('7', "0111");
        hashMap.put('8', "1000"); 
        hashMap.put('9', "1001"); 
        hashMap.put('A', "1010"); 
        hashMap.put('B', "1011"); 
        hashMap.put('C', "1100"); 
        hashMap.put('D', "1101"); 
        hashMap.put('E', "1110"); 
        hashMap.put('F', "1111"); 
  
        int i; 
        char ch; 
  
        
        for (i = 0; i < hex.length(); i++) { 
            ch = hex.charAt(i); 
  
             
            if (hashMap.containsKey(ch)) 
  
                
                binary += hashMap.get(ch) + " "; 
  

            else { 
                binary = "Invalid Hexadecimal String"; 
                return binary; 
            } 
        } 
        return binary; 
    } 
    
    public static String hexToASCII(String hex) 
    { 
        String ascii = ""; 
  
        for (int i = 0; i < hex.length(); i += 2) { 
  
            String part = hex.substring(i, i + 2); 
  
            char ch = (char)Integer.parseInt(part, 16); 
  
            ascii = ascii + ch; 
        } 
  
        return ascii; 
    } 
 
    static void createMap(Map<String, Character> um)
{
    um.put("0000", '0');
    um.put("0001", '1');
    um.put("0010", '2');
    um.put("0011", '3');
    um.put("0100", '4');
    um.put("0101", '5');
    um.put("0110", '6');
    um.put("0111", '7');
    um.put("1000", '8');
    um.put("1001", '9');
    um.put("1010", 'A');
    um.put("1011", 'B');
    um.put("1100", 'C');
    um.put("1101", 'D');
    um.put("1110", 'E');
    um.put("1111", 'F');
}
 
    
static String convertBinToHex(String bin)
{
    int l = bin.length();
    int t = bin.indexOf('.');
 
    int len_left = t != -1 ? t : l;
 

    for(int i = 1; 
            i <= (4 - len_left % 4) % 4; 
            i++)
        bin = '0' + bin;
 
    if (t != -1)
    {
         
        int len_right = l - len_left - 1;
 
       
        for(int i = 1; 
                i <= (4 - len_right % 4) % 4;
                i++)
            bin = bin + '0';
    }
 
 
    Map<String, 
        Character> bin_hex_map = new HashMap<String,
                                             Character>();
    createMap(bin_hex_map);
 
    int i = 0;
    String hex = "";
 
    while (true)
    {
         
 
        hex += bin_hex_map.get(
            bin.substring(i, i + 4));
        i += 4;
         
        if (i == bin.length())
            break;
 
      
        if (bin.charAt(i) == '.')
        {
            hex += '.';
            i++;
        }
    }
 
    return hex;
}





    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetConverter = new javax.swing.JButton();
        Select1 = new javax.swing.JComboBox<>();
        Select2 = new javax.swing.JComboBox<>();
        TypeHere1 = new javax.swing.JTextField();
        Input1 = new javax.swing.JLabel();
        Input2 = new javax.swing.JLabel();
        ConverterTitle = new javax.swing.JLabel();
        OutputAnswer = new javax.swing.JLabel();
        StartConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONVERTER");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        SetConverter.setText("Set Converter");
        SetConverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetConverterActionPerformed(evt);
            }
        });

        Select1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------------------------------------------", "Hex", "ASCII", "Binary", "Decimal", "Base64" }));
        Select1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Select1ItemStateChanged(evt);
            }
        });
        Select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select1ActionPerformed(evt);
            }
        });

        Select2.setSelectedItem(Select1);
        Select2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Select2ItemStateChanged(evt);
            }
        });
        Select2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select2ActionPerformed(evt);
            }
        });

        TypeHere1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TypeHere1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeHere1ActionPerformed(evt);
            }
        });

        Input1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Input1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Input1.setText(".....");
        Input1.setToolTipText("");

        Input2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        Input2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Input2.setText(".....");

        ConverterTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ConverterTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ConverterTitle.setText("Hex, ASCII, Binary, Decimal, Base64 Converter");

        OutputAnswer.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        OutputAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OutputAnswer.setText("......");

        StartConvert.setText("Convert");
        StartConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartConvertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConverterTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TypeHere1)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Input2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(OutputAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetConverter)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Select1, 0, 395, Short.MAX_VALUE)
                                .addComponent(Select2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(StartConvert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(ConverterTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Select1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Select2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SetConverter, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TypeHere1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(StartConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutputAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SetConverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetConverterActionPerformed
        if(Select1.getSelectedItem().equals("-------------------------------------------")){
            ConverterTitle.setText("ERROR");
            Input1.setText("ERROR");
            Input2.setText("ERROR");
            OutputAnswer.setText("ERROR");
        }
        else{
            ConverterTitle.setText(Select1.getSelectedItem().toString() + " to " + Select2.getSelectedItem().toString() + " Converter");
            Input1.setText(Select1.getSelectedItem().toString());
            Input2.setText(Select2.getSelectedItem().toString());   
        }    
    }//GEN-LAST:event_SetConverterActionPerformed

    private void TypeHere1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeHere1ActionPerformed
        // TODO add your handling code here:
        
        

       
    }//GEN-LAST:event_TypeHere1ActionPerformed

    private void StartConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartConvertActionPerformed
        
        if (Select1.getSelectedItem().equals("Hex") && Select2.getSelectedItem().equals("ASCII")){
            String result = hexToASCII(TypeHere1.getText());
            OutputAnswer.setText(result);

        }
        
        if (Select1.getSelectedItem().equals("Hex") && Select2.getSelectedItem().equals("Binary")){
            
            String hex = TypeHere1.getText();

            hex.toUpperCase(); 

            // printing and calling the 
            // hexToBinary() function 
            OutputAnswer.setText(hexToBinary(hex));
        }
        
        if (Select1.getSelectedItem().equals("Hex") && Select2.getSelectedItem().equals("Decimal")){
            
        }
        
        if (Select1.getSelectedItem().equals("Hex") && Select2.getSelectedItem().equals("Base64")){
            
        }
        
        if (Select1.getSelectedItem().equals("ASCII") && Select2.getSelectedItem().equals("Hex")){
            String s = TypeHere1.getText(); 
            OutputAnswer.setText(ASCIItoHEX(s));
        }

        
        if (Select1.getSelectedItem().equals("ASCII") && Select2.getSelectedItem().equals("Binary")){
            
            String s = TypeHere1.getText(); 
            OutputAnswer.setText(strToBinary(s));
        }
        
        if (Select1.getSelectedItem().equals("ASCII") && Select2.getSelectedItem().equals("Decimal")){
            
        }
        
        if (Select1.getSelectedItem().equals("ASCII") && Select2.getSelectedItem().equals("Base64")){
            
        }
        
        if (Select1.getSelectedItem().equals("Binary") && Select2.getSelectedItem().equals("Hex")){
            String bin = TypeHere1.getText();
            OutputAnswer.setText(convertBinToHex(bin));
        }
        
        if (Select1.getSelectedItem().equals("Binary") && Select2.getSelectedItem().equals("ASCII")){
            String input = TypeHere1.getText();

            String raw = Arrays.stream(input.split(" "))
                .map(binary -> Integer.parseInt(binary, 2))
                .map(Character::toString)
                .collect(Collectors.joining());

            OutputAnswer.setText(raw);    
        }
        
        if (Select1.getSelectedItem().equals("Binary") && Select2.getSelectedItem().equals("Decimal")){
            
        }
        
        if (Select1.getSelectedItem().equals("Binary") && Select2.getSelectedItem().equals("Base64")){
            
        }
        
        if (Select1.getSelectedItem().equals("Decimal") && Select2.getSelectedItem().equals("Hex")){
            
        }
        
        if (Select1.getSelectedItem().equals("Decimal") && Select2.getSelectedItem().equals("ASCII")){
            
        }
        
        if (Select1.getSelectedItem().equals("Decimal") && Select2.getSelectedItem().equals("Binary")){
            
        }
        
        if (Select1.getSelectedItem().equals("Decimal") && Select2.getSelectedItem().equals("Base64")){
            
        }
        
        if (Select1.getSelectedItem().equals("Base64") && Select2.getSelectedItem().equals("Hex")){
            
        }
        
        if (Select1.getSelectedItem().equals("Base64") && Select2.getSelectedItem().equals("ASCII")){
            
        }
        
        if (Select1.getSelectedItem().equals("Base64") && Select2.getSelectedItem().equals("Binary")){
            
        }
        
        if (Select1.getSelectedItem().equals("Base64") && Select2.getSelectedItem().equals("Decimali")){
            
        }
        
//                String s = TypeHere1.getText();
//                int n = s.length(); 
//
//                for (int i = 0; i < n; i++)  
//                { 
//                    // convert each char to 
//                    // ASCII value 
//                    int val = Integer.valueOf(s.charAt(i)); 
//
//                    // Convert ASCII value to binary 
//                    String bin = ""; 
//                    while (val > 0)  
//                    { 
//                        if (val % 2 == 1) 
//                        { 
//                            bin += '1'; 
//                        } 
//                        else
//                            bin += '0'; 
//                        val /= 2; 
//                    } 
//                    
//                    String input = bin;
//                    char[] a = input.toCharArray(); 
//                    int l, r = 0; 
//                    r = a.length - 1; 
//
//                    for (l = 0; l < r; l++, r--) 
//                    { 
//                        // Swap values of l and r  
//                        char temp = a[l]; 
//                        a[l] = a[r]; 
//                        a[r] = temp; 
//                    } 
////                    return String.valueOf(a);
//                    
//                    bin = String.valueOf(a); 
//
//                    OutputAnswer.setText(bin); 
//                } 
//                
//            } 
    }//GEN-LAST:event_StartConvertActionPerformed
    private void Select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select1ActionPerformed
        // TODO add your handling code here:
        
        

        
    }//GEN-LAST:event_Select1ActionPerformed

    private void Select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select2ActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_Select2ActionPerformed

    private void Select2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Select2ItemStateChanged
        // TODO add your handling code here:
        
        
//        if(Select1.getSelectedItem().equals("Hex")){
//            Select2.removeAllItems();
//            Select2.addItem("ASCII");
//            Select2.addItem("Binary");
//              
//        }
//        else if(Select1.getSelectedItem().equals("ASCII")){
//            Select2.removeAllItems();
//            Select2.addItem("Hex");
//            Select2.addItem("Binary");
//        }
//        else if(Select1.getSelectedItem().equals("Binary")){
//            Select2.removeAllItems();
//            Select2.addItem("ASCII");
//            Select2.addItem("Hex");
//        }
//            
//              
        
    }//GEN-LAST:event_Select2ItemStateChanged

    private void Select1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Select1ItemStateChanged
        // TODO add your handling code here:
        if(Select1.getSelectedItem().equals("-------------------------------------------")){
            Select2.removeAllItems();        
        }
        else if(Select1.getSelectedItem().equals("Hex")){
            Select2.removeAllItems();
            Select2.addItem("ASCII");
            Select2.addItem("Binary"); 
            Select2.addItem("Decimal");
            Select2.addItem("Base64");
        }
        else if(Select1.getSelectedItem().equals("ASCII")){
            Select2.removeAllItems();
            Select2.addItem("Hex");
            Select2.addItem("Binary");
            Select2.addItem("Decimal");
            Select2.addItem("Base64");
        }
        else if(Select1.getSelectedItem().equals("Binary")){
            Select2.removeAllItems();
            Select2.addItem("Hex");
            Select2.addItem("ASCII");
            Select2.addItem("Decimal");
            Select2.addItem("Base64");
        }
        else if(Select1.getSelectedItem().equals("Decimal")){
            Select2.removeAllItems();
            Select2.addItem("Hex");
            Select2.addItem("ASCII");
            Select2.addItem("Binary");
            Select2.addItem("Base64");
        }
        else if(Select1.getSelectedItem().equals("Base64")){
            Select2.removeAllItems();
            Select2.addItem("Hex");
            Select2.addItem("ASCII");
            Select2.addItem("Binary");
            Select2.addItem("Decimal");
        }
    }//GEN-LAST:event_Select1ItemStateChanged

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
            java.util.logging.Logger.getLogger(RealFinalProjectA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealFinalProjectA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealFinalProjectA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealFinalProjectA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealFinalProjectA().setVisible(true);
            }
        });
        
//        RealFinalpro strToHex = new RealFinalpro();
//        System.out.println("\n***** Convert ASCII to Hex *****");
//        String str = TypeHere1.getText();
                
        
    
//        System.out.println("Original input : " + str);
//
//        String hex = strToHex.convertStringToHex(str);
//
//        System.out.println("Hex : " + hex);
//
//        System.out.println("\n***** Convert Hex to ASCII *****");
//        System.out.println("Hex : " + hex);
//        System.out.println("ASCII : " + strToHex.convertHexToString(hex));
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConverterTitle;
    private javax.swing.JLabel Input1;
    private javax.swing.JLabel Input2;
    private javax.swing.JLabel OutputAnswer;
    private javax.swing.JComboBox<String> Select1;
    private javax.swing.JComboBox<String> Select2;
    private javax.swing.JButton SetConverter;
    private javax.swing.JButton StartConvert;
    private javax.swing.JTextField TypeHere1;
    // End of variables declaration//GEN-END:variables
}

