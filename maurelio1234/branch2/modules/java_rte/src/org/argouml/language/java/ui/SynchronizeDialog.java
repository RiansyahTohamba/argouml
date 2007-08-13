// $Id$
// Copyright (c) 1996-2005 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies.  This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason.  IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.argouml.language.java.ui;

import java.awt.Cursor;
import java.awt.event.WindowAdapter;
import java.awt.GridBagLayout;

/**
 * This dialog offers the controls to synchronize model and code.
 *
 * @author  Thomas Neustupny
 */
public class SynchronizeDialog extends javax.swing.JDialog {

    /**
     * Creates new form SynchronizeDialog.
     *
     * @param parent the parent frame
     * @param modal true if modal
     */
    public SynchronizeDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        buttonPause.requestFocus();
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() { //GEN-BEGIN:initComponents
        java.awt.GridBagConstraints gridBagConstraints;

        labelModel = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        labelUpdCod = new javax.swing.JLabel();
        buttonGen = new javax.swing.JButton();
        buttonRenCod = new javax.swing.JButton();
        labelUpdMod = new javax.swing.JLabel();
        buttonImp = new javax.swing.JButton();
        buttonRenMod = new javax.swing.JButton();
        labelCode = new javax.swing.JLabel();
        tableModel = new javax.swing.JTable();
        tableCode = new javax.swing.JTable();
        labelStatus = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        buttonPause = new javax.swing.JButton();
        buttonClose = new javax.swing.JButton();

        getContentPane().setLayout(new GridBagLayout());

        setTitle("Synchronize Model/Code Dialog");
        addWindowListener(new WindowAdapter() {
	    public void windowClosing(java.awt.event.WindowEvent evt) {
		closeDialog(evt);
	    }
	});

        labelModel.setText("found in model only:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(labelModel, gridBagConstraints);

        actionPanel.setLayout(new java.awt.GridLayout(0, 1, 2, 2));

        labelUpdCod.setText("code update:");
        actionPanel.add(labelUpdCod);

        buttonGen.setText("Generate");
        buttonGen.setToolTipText(
                "Adds the selected model element to the source code");
        buttonGen.setEnabled(false);
        actionPanel.add(buttonGen);

        buttonRenCod.setText("Rename");
        buttonRenCod.setToolTipText(
            "Renames all occurences of the selected source code element"
            + " to the name of the selected model element");
        buttonRenCod.setEnabled(false);
        actionPanel.add(buttonRenCod);

        labelUpdMod.setText("model update:");
        actionPanel.add(labelUpdMod);

        buttonImp.setText("Import");
        buttonImp.setToolTipText(
                "Adds the selected source code element to the model");
        buttonImp.setEnabled(false);
        actionPanel.add(buttonImp);

        buttonRenMod.setText("Rename");
        buttonRenMod.setToolTipText(
            "Renames all occurences of the selected model element to "
            + "the name of the selected source code element" );
        buttonRenMod.setEnabled(false);
        actionPanel.add(buttonRenMod);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(actionPanel, gridBagConstraints);

        labelCode.setText("found in code only:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(labelCode, gridBagConstraints);

        tableModel.setBorder(new javax.swing.border.EtchedBorder());
        tableModel.setForeground(new java.awt.Color(0, 0, 0));
        tableModel.setModel(new ModelTableModel());
        tableModel.setEnabled(false);
        tableModel.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableModelKeyPressed(evt);
            }
        });

        tableModel.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableModelMousePressed(evt);
            }
        });

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(tableModel, gridBagConstraints);

        tableCode.setBorder(new javax.swing.border.EtchedBorder());
        tableCode.setModel(
	    new javax.swing.table.DefaultTableModel(new Object [][] {
	        {null, null, null},
	        {null, null, null},
	        {null, null, null},
	        {null, null, null},
	        {null, null, null},
	        {null, null, null},
	        {null, null, null},
	        {null, null, null},
	        {null, null, null},
	        {null, null, null},
	        {null, null, null},
	        {null, null, null}
	    },
	    new String [] {
		"Title 1",
		"Title 2",
		"Title 3"
	    }
	    )
	{
	    private boolean[] canEdit = new boolean [] {
		false, false, false
	    };

	    public boolean isCellEditable(int rowIndex, int columnIndex) {
		return canEdit [columnIndex];
	    }
	});
        tableCode.setEnabled(false);
        tableCode.addKeyListener(new java.awt.event.KeyAdapter()
        {
	    public void keyPressed(java.awt.event.KeyEvent evt) {
		tableCodeKeyPressed(evt);
	    }
	});

        tableCode.addMouseListener(new java.awt.event.MouseAdapter()
        {
	    public void mousePressed(java.awt.event.MouseEvent evt) {
		tableCodeMousePressed(evt);
	    }
	});

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(tableCode, gridBagConstraints);

        labelStatus.setBackground(new java.awt.Color(204, 204, 204));
        labelStatus.setFont(new java.awt.Font("Dialog", 0, 10));
        labelStatus.setForeground(new java.awt.Color(0, 0, 0));
        labelStatus.setText("Running...");
        labelStatus.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(labelStatus, gridBagConstraints);

        bottomPanel.setLayout(new java.awt.GridLayout(1, 0, 2, 2));

        buttonPause.setText("Pause");
        buttonPause.addActionListener(new java.awt.event.ActionListener()
	{
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
		buttonPauseActionPerformed(evt);
	    }
	});

        bottomPanel.add(buttonPause);

        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener()
        {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
		buttonCloseActionPerformed(evt);
	    }
	});

        bottomPanel.add(buttonClose);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        getContentPane().add(bottomPanel, gridBagConstraints);

        pack();
    } //GEN-END:initComponents

    private void buttonPauseActionPerformed(java.awt.event.ActionEvent evt) {
        //GEN-FIRST:event_buttonPauseActionPerformed
        tableModel.setEnabled(isBusy);
        tableCode.setEnabled(isBusy);
        if (isBusy) {
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            updateActionButtons();
            labelStatus.setText("Paused.");
            buttonPause.setText("Continue");
        } else {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            buttonGen.setEnabled(false);
            buttonImp.setEnabled(false);
            buttonRenMod.setEnabled(false);
            buttonRenCod.setEnabled(false);
            labelStatus.setText("Running...");
            buttonPause.setText("Pause");
        }
        buttonPause.requestFocus();
        isBusy = !isBusy;
    } //GEN-LAST:event_buttonPauseActionPerformed

    private void tableModelKeyPressed(java.awt.event.KeyEvent evt)
    { //GEN-FIRST:event_tableModelKeyPressed
        updateActionButtons();
    } //GEN-LAST:event_tableModelKeyPressed

    private void tableModelMousePressed(java.awt.event.MouseEvent evt)
    { //GEN-FIRST:event_tableModelMousePressed
        updateActionButtons();
    } //GEN-LAST:event_tableModelMousePressed

    private void tableCodeKeyPressed(java.awt.event.KeyEvent evt)
    { //GEN-FIRST:event_tableCodeKeyPressed
        updateActionButtons();
    } //GEN-LAST:event_tableCodeKeyPressed

    private void tableCodeMousePressed(java.awt.event.MouseEvent evt)
    { //GEN-FIRST:event_tableCodeMousePressed
        updateActionButtons();
    } //GEN-LAST:event_tableCodeMousePressed

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt)
    { //GEN-FIRST:event_buttonCloseActionPerformed
        setVisible(false);
        dispose();
    } //GEN-LAST:event_buttonCloseActionPerformed

    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt)
    { //GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    } //GEN-LAST:event_closeDialog

    private void updateActionButtons() {
        boolean renameable =
            tableModel.getSelectedRowCount() == 1
            && tableCode.getSelectedRowCount() == 1;
        if (tableModel.isEnabled()) {
            buttonGen.setEnabled(tableModel.getSelectedRowCount() > 0);
            buttonRenMod.setEnabled(renameable);
        }
        if (tableCode.isEnabled()) {
            buttonImp.setEnabled(tableCode.getSelectedRowCount() > 0);
            buttonRenCod.setEnabled(renameable);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new SynchronizeDialog(new javax.swing.JFrame(), true).setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGen;
    private javax.swing.JTable tableModel;
    private javax.swing.JButton buttonImp;
    private javax.swing.JButton buttonRenMod;
    private javax.swing.JButton buttonRenCod;
    private javax.swing.JPanel actionPanel;
    private javax.swing.JLabel labelUpdMod;
    private javax.swing.JButton buttonClose;
    private javax.swing.JButton buttonPause;
    private javax.swing.JLabel labelUpdCod;
    private javax.swing.JTable tableCode;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelCode;
    // End of variables declaration//GEN-END:variables
    private boolean isBusy = true;
}
