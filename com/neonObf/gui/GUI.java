/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neonObf.gui;

import com.neonObf.Main;
import com.neonObf.ProductInfo;
import java.io.File;
import javax.swing.filechooser.FileFilter;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 * @author moofMonkey
 */
public class GUI extends javax.swing.JFrame {
    protected class JTextAreaPrintStream extends OutputStream {
        private final javax.swing.JTextArea textArea;
        
        public JTextAreaPrintStream(javax.swing.JTextArea textArea) {
            this.textArea = textArea;
        }
        
        @Override
        public void write(int b) throws java.io.IOException {
            textArea.append(new String(new char[] {(char)b}));
        }
        
        @Override
        public void write(byte b[], int off, int len) throws java.io.IOException {
            String mess = new String(b, off, len);
            if (textArea != null)
                textArea.append(mess);
            
            textArea.setCaretPosition(textArea.getDocument().getLength());
        }
    }
    
    private java.io.PrintStream ps;
    static final java.io.PrintStream out = System.out;
    static final java.io.PrintStream err = System.err;
    JFileChooser chooserDialog;
    
    /**
     * Creates new form NeonObfDialog2
     */
    public GUI() {
        background = new javax.swing.JLabel(new javax.swing.ImageIcon(GUI.class.getResource("background.png")));
        setContentPane(background);
	setLayout(new java.awt.FlowLayout());
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

        sourceChooser = new javax.swing.JButton();
        sourceField = new javax.swing.JTextField();
        destinationField = new javax.swing.JTextField();
        destinationChooser = new javax.swing.JButton();
        classPathField = new javax.swing.JTextField();
        classPathChooser = new javax.swing.JButton();
        transformersFielld = new javax.swing.JTextField();
        runButton = new javax.swing.JButton();
        sourceLabel = new javax.swing.JLabel();
        destinationLabel = new javax.swing.JLabel();
        classPathLabel = new javax.swing.JLabel();
        transformersLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logArea = new javax.swing.JTextArea();
        nameObfField = new javax.swing.JTextField();
        nameObfLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setResizable(false);

        sourceChooser.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        sourceChooser.setForeground(new java.awt.Color(0, 255, 0));
        sourceChooser.setText("...");
        sourceChooser.setOpaque(false);
        sourceChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceChooserActionPerformed(evt);
            }
        });

        sourceField.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        sourceField.setForeground(new java.awt.Color(0, 255, 0));
        sourceField.setText("IN.jar");
        sourceField.setOpaque(false);

        destinationField.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        destinationField.setForeground(new java.awt.Color(0, 255, 0));
        destinationField.setText("OUT.jar");
        destinationField.setOpaque(false);

        destinationChooser.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        destinationChooser.setForeground(new java.awt.Color(0, 255, 0));
        destinationChooser.setText("...");
        destinationChooser.setOpaque(false);
        destinationChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationChooserActionPerformed(evt);
            }
        });

        classPathField.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        classPathField.setForeground(new java.awt.Color(0, 255, 0));
        classPathField.setText("libs/");
        classPathField.setOpaque(false);

        classPathChooser.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        classPathChooser.setForeground(new java.awt.Color(0, 255, 0));
        classPathChooser.setText("...");
        classPathChooser.setOpaque(false);
        classPathChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classPathChooserActionPerformed(evt);
            }
        });

        transformersFielld.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        transformersFielld.setForeground(new java.awt.Color(0, 255, 0));
        transformersFielld.setText("SourceFileRemover;CodeHider;LineNumberObfuscation;FinalRemover;LocalVariableNameObfuscator;BasicTypesEncryption;GotoFloodObfuscation");
        transformersFielld.setOpaque(false);

        runButton.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        runButton.setForeground(new java.awt.Color(0, 255, 0));
        runButton.setText("Just run");
        runButton.setOpaque(false);
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        sourceLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        sourceLabel.setForeground(new java.awt.Color(0, 255, 0));
        sourceLabel.setText("Source:");

        destinationLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        destinationLabel.setForeground(new java.awt.Color(0, 255, 0));
        destinationLabel.setText("Destination:");

        classPathLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        classPathLabel.setForeground(new java.awt.Color(0, 255, 0));
        classPathLabel.setText("Classpath:");

        transformersLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        transformersLabel.setForeground(new java.awt.Color(0, 255, 0));
        transformersLabel.setText("Transformers:");

        logArea.setEditable(false);
        logArea.setColumns(20);
        logArea.setFont(new java.awt.Font("Consolas", 0, 9)); // NOI18N
        logArea.setForeground(new java.awt.Color(0, 255, 0));
        logArea.setLineWrap(true);
        logArea.setRows(5);
        logArea.setWrapStyleWord(true);
        logArea.setName("logArea"); // NOI18N
        logArea.setOpaque(false);
        jScrollPane1.setViewportView(logArea);
        logArea.getAccessibleContext().setAccessibleName("");
        logArea.getAccessibleContext().setAccessibleDescription("");

        nameObfField.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        nameObfField.setForeground(new java.awt.Color(0, 255, 0));
        nameObfField.setText("min/morm/max");
        nameObfField.setToolTipText("");
        nameObfField.setOpaque(false);

        nameObfLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        nameObfLabel.setForeground(new java.awt.Color(0, 255, 0));
        nameObfLabel.setText("Name obf:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(runButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(destinationLabel)
                                .addComponent(sourceLabel)
                                .addComponent(classPathLabel)
                                .addComponent(transformersLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(classPathField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(destinationField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sourceField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(classPathChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(destinationChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(sourceChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(transformersFielld, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(nameObfLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameObfField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinationChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classPathChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classPathField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classPathLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(transformersLabel)
                    .addComponent(transformersFielld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameObfLabel)
                    .addComponent(nameObfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(runButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        new Thread() {
            @Override
            public void run() {
                logArea.setText("");
                runButton.setEnabled(false);
                System.setOut(ps);
                System.setErr(ps);
                try {
                    com.neonObf.Main.main (
                        new String[] {
                            sourceField.getText(),
                            destinationField.getText(),
                            classPathField.getText(),
                            transformersFielld.getText(),
							nameObfField.getText()
                        }
                    );
                    com.neonObf.Main.getInstance().join();
                } catch (Throwable ex) {
                    String msg = ex.getMessage();
                    if(msg != null)
                        System.err.println(msg);
                }
                System.setOut(out);
                System.setErr(err);
        
                runButton.setEnabled(true);
            }
        }.start();
    }//GEN-LAST:event_runButtonActionPerformed

    private void sourceChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceChooserActionPerformed
        sourceField.setText(showFileSelectDialog(true).getPath());
    }//GEN-LAST:event_sourceChooserActionPerformed

    private void destinationChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationChooserActionPerformed
        destinationField.setText(showFileSelectDialog(true).getPath());
    }//GEN-LAST:event_destinationChooserActionPerformed

    private void classPathChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classPathChooserActionPerformed
        classPathField.setText(showFileSelectDialog(false).getPath());
    }//GEN-LAST:event_classPathChooserActionPerformed

    private File showFileSelectDialog(boolean isJAR) {
        chooserDialog = new JFileChooser();
        chooserDialog.setCurrentDirectory(new File("."));
        
        if(isJAR)
            chooserDialog.setFileFilter(new FileFilter() {
                @Override
                public boolean accept(File f) {
                    return f.getName().endsWith(".jar") || f.isDirectory();
                }
                @Override
                public String getDescription() {
                    return "Исполняемый файл Java (*.jar)";
                }
            });
        else
            chooserDialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        chooserDialog.setAcceptAllFileFilterUsed(true);
        int state = chooserDialog.showDialog(null, "Выбрать файл");
        if (state == JFileChooser.APPROVE_OPTION) {
            File in = chooserDialog.getSelectedFile();
            if (isJAR && !in.getName().endsWith(".jar"))
                return null;
            
            return in;
        }
        
        return null;
    }
    
    public void init() {
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            setTitle(ProductInfo.getTitle() + " " + ProductInfo.getVersion() + " (" + ProductInfo.getBuildId() + ")");
            jScrollPane1.setOpaque(false);
            logArea.setOpaque(false);
            jScrollPane1.getViewport().setOpaque(false);
            setVisible(true);
            pack();
            setLocationRelativeTo(null);
            toFront();
            //System.out.println(getContentPane().getSize());
            ps = new java.io.PrintStream(new JTextAreaPrintStream(logArea));
        });
    }
    private final javax.swing.JLabel background;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classPathChooser;
    private javax.swing.JTextField classPathField;
    private javax.swing.JLabel classPathLabel;
    private javax.swing.JButton destinationChooser;
    private javax.swing.JTextField destinationField;
    private javax.swing.JLabel destinationLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea logArea;
    private javax.swing.JTextField nameObfField;
    private javax.swing.JLabel nameObfLabel;
    private javax.swing.JButton runButton;
    private javax.swing.JButton sourceChooser;
    private javax.swing.JTextField sourceField;
    private javax.swing.JLabel sourceLabel;
    private javax.swing.JTextField transformersFielld;
    private javax.swing.JLabel transformersLabel;
    // End of variables declaration//GEN-END:variables
}
