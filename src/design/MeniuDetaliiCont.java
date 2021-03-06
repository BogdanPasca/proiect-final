package design;

import entities.Bank;
import entities.Client;

public class MeniuDetaliiCont extends javax.swing.JDialog {

    /**
     * Creates new form AccountDetailsPage
     * @param parent
     * @param modal
     * @param bank
     * @param customer
     */
    public MeniuDetaliiCont(java.awt.Frame parent, boolean modal, Bank bank, Client customer) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);

        setTitle(String.format("Detalii cont - %s %s", customer.getPrenume(), customer.getNume()));

        prenumeField.setText(customer.getPrenume());
        numeField.setText(customer.getNume());
        cnpField.setText(customer.getCnp());
        tipContField.setText(customer.getCont().getAccountType().name());
        numarContField.setText(String.valueOf(customer.getCont().getNumarCont()));
        soldField.setText(String.format("Lei %.2f", customer.getCont().getSold()));
        rataDobanziiField.setText(String.valueOf(bank.verificaDobanda(customer.getCont().getSold(), 0) * 100) + "%");
        comisionField.setText(String.format("Lei %.2f", bank.getComision(customer.getCont().getAccountType())));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prenumeLabel = new javax.swing.JLabel();
        prenumeField = new javax.swing.JLabel();
        numeLabel = new javax.swing.JLabel();
        numeField = new javax.swing.JLabel();
        cnpLabel = new javax.swing.JLabel();
        cnpField = new javax.swing.JLabel();
        tipContLabel = new javax.swing.JLabel();
        tipContField = new javax.swing.JLabel();
        numarContLabel = new javax.swing.JLabel();
        numarContField = new javax.swing.JLabel();
        soldLabel = new javax.swing.JLabel();
        soldField = new javax.swing.JLabel();
        rataDobanziiLabel = new javax.swing.JLabel();
        rataDobanziiField = new javax.swing.JLabel();
        comisionLabel = new javax.swing.JLabel();
        comisionField = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(9, 2, 5, 5));

        prenumeLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        prenumeLabel.setText("Prenume:");
        getContentPane().add(prenumeLabel);

        prenumeField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(prenumeField);

        numeLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        numeLabel.setText("Nume:");
        getContentPane().add(numeLabel);

        numeField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(numeField);

        cnpLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cnpLabel.setText("Cnp:");
        getContentPane().add(cnpLabel);

        cnpField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(cnpField);

        tipContLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tipContLabel.setText("Tipul contului:");
        getContentPane().add(tipContLabel);

        tipContField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(tipContField);

        numarContLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        numarContLabel.setText("Numărul contului:");
        getContentPane().add(numarContLabel);

        numarContField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(numarContField);

        soldLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        soldLabel.setText("Sold:");
        getContentPane().add(soldLabel);

        soldField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(soldField);

        rataDobanziiLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        rataDobanziiLabel.setText("Rata dobânzii:");
        getContentPane().add(rataDobanziiLabel);

        rataDobanziiField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(rataDobanziiField);

        comisionLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        comisionLabel.setText("Comision tranzacție:");
        getContentPane().add(comisionLabel);

        comisionField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(comisionField);

        okButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        okButton.setForeground(new java.awt.Color(0, 0, 0));
        okButton.setText("OK");
        okButton.setBorder(null);
        okButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        getContentPane().add(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cnpField;
    private javax.swing.JLabel cnpLabel;
    private javax.swing.JLabel comisionField;
    private javax.swing.JLabel comisionLabel;
    private javax.swing.JLabel numarContField;
    private javax.swing.JLabel numarContLabel;
    private javax.swing.JLabel numeField;
    private javax.swing.JLabel numeLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel prenumeField;
    private javax.swing.JLabel prenumeLabel;
    private javax.swing.JLabel rataDobanziiField;
    private javax.swing.JLabel rataDobanziiLabel;
    private javax.swing.JLabel soldField;
    private javax.swing.JLabel soldLabel;
    private javax.swing.JLabel tipContField;
    private javax.swing.JLabel tipContLabel;
    // End of variables declaration//GEN-END:variables
}
