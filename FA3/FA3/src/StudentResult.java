import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Devon
 */
public class StudentResult extends javax.swing.JFrame {
public double HighestResult;
public double LowestResult;
public double average;
public int StudentNumber;
    /**
     * Creates new form StudentResult
     */
    public StudentResult() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstInfo = new javax.swing.JList<>();
        btnSearch = new javax.swing.JButton();
        lblAve = new javax.swing.JLabel();
        lblHigh = new javax.swing.JLabel();
        lblLow = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lblAveR = new javax.swing.JLabel();
        lblHighR = new javax.swing.JLabel();
        lblLowR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lstInfo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lstInfo.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstInfoValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstInfo);

        btnSearch.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblAve.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAve.setText("Average Results:");

        lblHigh.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblHigh.setText("Highest Result:");

        lblLow.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblLow.setText("Lowest Results:");

        btnSave.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblAveR.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblHighR.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblLowR.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHigh)
                            .addComponent(lblLow)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHighR, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(lblLowR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAve)
                        .addGap(22, 22, 22)
                        .addComponent(lblAveR, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAveR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHigh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHighR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLow)
                            .addComponent(lblLowR, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       getList();
    }//GEN-LAST:event_formWindowOpened

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        int[] studentArray = ArrayInfo();
        StudentNumber = getSelectedItem(); //finds selected icas in listbox
        int[] Grades = new int[3];      //Enters grades in new array to do calculations
        
        for(int x = 0; x < studentArray.length; x++) //Finds selected icas and inserts the correct marks
        {
            if(studentArray[x] == StudentNumber)
            {
                Grades[0] = studentArray[x + 1];
                Grades[1] = studentArray[x + 2];
                Grades[2] = studentArray[x + 3];
            }
        }
        // max, min, Average
        average = Ave(Grades);
        HighestResult = getMax(Grades);
        LowestResult = getMin(Grades);
        
        //Set the text of the Labels
        lblAveR.setText(average + "%");
        lblHighR.setText(HighestResult + "%");
        lblLowR.setText(LowestResult + "%");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void lstInfoValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstInfoValueChanged
        getSelectedItem();
    }//GEN-LAST:event_lstInfoValueChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try{
        //Esablish connection to the database
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentresult" , "root" , "2009@Vianca");
        

           //SQL INSERT statement
        String query = "INSERT INTO resulttable (StudentNumber ,HighestResult ,LowestResult , Average)"
                + " values (? , ?, ?, ?)";

                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setInt(1, (StudentNumber));
                preparedStmt.setFloat(2, (float) HighestResult);
                preparedStmt.setFloat(3, (float) LowestResult);
                preparedStmt.setFloat(4, (float) average);


                preparedStmt.execute();
                JOptionPane.showMessageDialog(this,"Data Saved Succesfully");
                conn.close();
              }catch (Exception e) 
              {
                JOptionPane.showMessageDialog(this,"Error Occured in saving to the database");
              }
    }//GEN-LAST:event_btnSaveActionPerformed
    //Inserts Icas numbers in Listbox
    public void getList()
    {
        //reads txt file and truns into a list
        ArrayList<String> result = new ArrayList<String>();
        try
        {   
            Scanner x = new Scanner(new File ("E:\\CTU\\CTU assesments\\MCSD\\JD522\\FA3_1\\Students.txt"));
            
            while(x.hasNext()){
            result.add(x.next());
            }
            x.close();
            
            //Finds and displays Icas numbers which is found in every 4th line of txt file
            DefaultListModel listModel = new DefaultListModel();
            for(int y = 0; y < result.size(); y = y + 4)
            {
                listModel.addElement(result.get(y));
            }
            lstInfo.setModel(listModel);
        }
        catch(FileNotFoundException ex)
        {
            Logger.getLogger(StudentResult.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int[] ArrayInfo()
    {
    ArrayList<Integer> list = new ArrayList<Integer>();
         try {
            Scanner s = new Scanner(new File("E:\\CTU\\CTU assesments\\MCSD\\JD522\\FA3_1\\Students.txt"));

            while (s.hasNext()){
                list.add(Integer.parseInt(s.next()));
            }
            s.close();
             } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentResult.class.getName()).log(Level.SEVERE, null, ex);
             } 
          int[] arrInfo = list.stream().mapToInt(i -> i).toArray();  //convert IntegerList to normal array of type Int 
         return(arrInfo);
    }
    
    //gets selected ICAS from listbox
    public Integer getSelectedItem()
    {
        String x = (String) lstInfo.getSelectedValue();
        return(Integer.parseInt(x));
    }
    
    //Calculates the average
    public double Ave(int[] Grades)
    {
        float Average = 0;
        for( int x = 0; x < Grades.length; x++)
        {
            Average = Average + Grades[x];
        }
        Average = Average / 3;
        BigDecimal x = new BigDecimal(Average).setScale(2, RoundingMode.HALF_UP);
        double AverageDecimal = x.doubleValue();
        return (AverageDecimal);
    }
    
    //Calculate the max value
    public static float getMax(int[] numbers)
    {
        float maxValue = numbers[0];
         for( int x = 0; x < numbers.length; x++)
        {
            if (numbers[x] > maxValue)
            {
                maxValue = numbers[x];
            }
        }
         return maxValue;
    }
    
    //Calculate min value
    public static double getMin(int[] numbers)
    {
        double minValue = numbers[0];
         for( int x = 0; x < numbers.length; x++)
        {
            if (numbers[x] > minValue)
            {
                minValue = numbers[x];
            }
        }
         return minValue;
    }
      
    public static void main(String args[]) throws FileNotFoundException, IOException {
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
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResult().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAve;
    private javax.swing.JLabel lblAveR;
    private javax.swing.JLabel lblHigh;
    private javax.swing.JLabel lblHighR;
    private javax.swing.JLabel lblLow;
    private javax.swing.JLabel lblLowR;
    private javax.swing.JList<String> lstInfo;
    // End of variables declaration//GEN-END:variables
}
