/*
 * Evan Robertson
 * December 7th 2018
 * Uses algorithms to find numbers
 */

package algorithms;

/**
 *
 * @author evrob0095
 */
public class algorithms extends javax.swing.JFrame {

    /**
     * Creates new form algorithms
     */
    public algorithms() {
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

        jPanel1 = new javax.swing.JPanel();
        fibonacci3Label = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        fibonacciLabel = new javax.swing.JLabel();
        userInput3 = new javax.swing.JTextField();
        fibonacciButton = new javax.swing.JButton();
        factorialLabel = new javax.swing.JLabel();
        factorialLabel2 = new javax.swing.JLabel();
        userInput1 = new javax.swing.JTextField();
        factorialButton = new javax.swing.JButton();
        primeNumberLabel = new javax.swing.JLabel();
        primeNumber2Label = new javax.swing.JLabel();
        fibonacci2Label = new javax.swing.JLabel();
        userInput2 = new javax.swing.JTextField();
        primeNumberButton = new javax.swing.JButton();
        isValidLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fibonacci3Label.setFont(new java.awt.Font("SouvenirGreek Md BT", 0, 14)); // NOI18N
        fibonacci3Label.setText("location value if the fibonacci sequence");
        jPanel1.add(fibonacci3Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        titleLabel.setFont(new java.awt.Font("SouvenirGreek Md BT", 0, 18)); // NOI18N
        titleLabel.setText("Algorithm Program");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        fibonacciLabel.setFont(new java.awt.Font("SouvenirGreek Md BT", 0, 14)); // NOI18N
        fibonacciLabel.setText("Fibonacci");
        jPanel1.add(fibonacciLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        userInput3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInput3ActionPerformed(evt);
            }
        });
        jPanel1.add(userInput3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 60, -1));

        fibonacciButton.setText("Fibonnacci");
        fibonacciButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fibonacciButtonActionPerformed(evt);
            }
        });
        jPanel1.add(fibonacciButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 90, -1));

        factorialLabel.setFont(new java.awt.Font("SouvenirGreek Md BT", 0, 14)); // NOI18N
        factorialLabel.setText("Factorial");
        jPanel1.add(factorialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        factorialLabel2.setFont(new java.awt.Font("SouvenirGreek Md BT", 0, 14)); // NOI18N
        factorialLabel2.setText("Enter an integer to find it's factorial");
        jPanel1.add(factorialLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        userInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInput1ActionPerformed(evt);
            }
        });
        jPanel1.add(userInput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 60, -1));

        factorialButton.setText("Factorial");
        factorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialButtonActionPerformed(evt);
            }
        });
        jPanel1.add(factorialButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        primeNumberLabel.setFont(new java.awt.Font("SouvenirGreek Md BT", 0, 14)); // NOI18N
        primeNumberLabel.setText("Prime Number");
        jPanel1.add(primeNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        primeNumber2Label.setFont(new java.awt.Font("SouvenirGreek Md BT", 0, 14)); // NOI18N
        primeNumber2Label.setText("Enter an integer to find if it's a prime number");
        jPanel1.add(primeNumber2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        fibonacci2Label.setFont(new java.awt.Font("SouvenirGreek Md BT", 0, 14)); // NOI18N
        fibonacci2Label.setText("Enter an integer to find the it's");
        jPanel1.add(fibonacci2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        userInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInput2ActionPerformed(evt);
            }
        });
        jPanel1.add(userInput2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 60, -1));

        primeNumberButton.setText("Prime");
        primeNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeNumberButtonActionPerformed(evt);
            }
        });
        jPanel1.add(primeNumberButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 70, -1));

        isValidLabel.setFont(new java.awt.Font("SouvenirGreek Md BT", 0, 14)); // NOI18N
        jPanel1.add(isValidLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userInput3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInput3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInput3ActionPerformed
/**
 * Fibonacci button takes user input and finds the value at the input's location in the Fibonacci sequence
 * @param evt 
 */
    private void fibonacciButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fibonacciButtonActionPerformed
        String input;
        int number;
        double a = 0;
        double b = 1;
        input = userInput3.getText();
        if (isValid(input)) {
            number = Integer.parseInt(input);
            for (int i = 1; i <= number; i++) {
                a = a + b;
                b = a - b;
            }
            isValidLabel.setText("The value in the fibonacci sequence is " + a);
        }
        else {
            isValidLabel.setText("Must enter an integer");
        }
    }//GEN-LAST:event_fibonacciButtonActionPerformed

    private void userInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInput1ActionPerformed
/**
 * Factorial Button takes input from the user and finds it's factorial.
 * @param evt 
 */
    private void factorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialButtonActionPerformed
        String input;
        int number;
        input = userInput1.getText();
        if (isValid(input)) {
            number = Integer.parseInt(input);
            for (int i = number -1; i >= 1; i--) {
                number = number * i;
            }
            isValidLabel.setText("The factorial is " + number);
        }
        else {
            isValidLabel.setText("Must enter an integer");
        }
    }//GEN-LAST:event_factorialButtonActionPerformed

    private void userInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInput2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userInput2ActionPerformed
/**
 * Prime Number button takes input from user and finds if the number is prime
 * @param evt 
 */
    private void primeNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeNumberButtonActionPerformed
        String input;
        int number;
        boolean isPrime= false;
        input = userInput2.getText();
        if (isValid(input)) {
            number = Integer.parseInt(input);
            if (number < 0) {
                isPrime = true;
            }
            for (int i =2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime) {
            isValidLabel.setText(number + " is not a Prime Number");
            }
            else {
            isValidLabel.setText(number + " is a Prime Number");
            }
        }
        else {
            isValidLabel.setText("Must enter an integer");
        }
        
    }//GEN-LAST:event_primeNumberButtonActionPerformed
    
    /**
     * isValid ensures that what the user has entered is a valid entry.
     * @param number
     * @return boolean 
     */
    public boolean isValid (String number) {
        int valid;
        try {
            valid = Integer.parseInt(number);
        }
        catch (NumberFormatException e) {
            System.err.println("Must use integer" + e);
            
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(algorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(algorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(algorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(algorithms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new algorithms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton factorialButton;
    private javax.swing.JLabel factorialLabel;
    private javax.swing.JLabel factorialLabel2;
    private javax.swing.JLabel fibonacci2Label;
    private javax.swing.JLabel fibonacci3Label;
    private javax.swing.JButton fibonacciButton;
    private javax.swing.JLabel fibonacciLabel;
    private javax.swing.JLabel isValidLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel primeNumber2Label;
    private javax.swing.JButton primeNumberButton;
    private javax.swing.JLabel primeNumberLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField userInput1;
    private javax.swing.JTextField userInput2;
    private javax.swing.JTextField userInput3;
    // End of variables declaration//GEN-END:variables
}
