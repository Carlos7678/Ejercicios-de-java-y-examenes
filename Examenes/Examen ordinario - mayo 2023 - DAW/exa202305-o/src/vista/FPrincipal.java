/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.ActionListener;

/**
 *
 * @author Carlos Soriano
 */
public class FPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FPrincipal
     */
    public FPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
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
        taPantalla = new javax.swing.JTextArea();
        eEscons = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miEntraEscons = new javax.swing.JMenuItem();
        miEntraVotsBlancs = new javax.swing.JMenuItem();
        miEntraVotsPartit = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miEixir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miVeureDades = new javax.swing.JMenuItem();
        miVeureQuocients = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taPantalla.setColumns(20);
        taPantalla.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        taPantalla.setRows(5);
        jScrollPane1.setViewportView(taPantalla);

        eEscons.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eEscons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eEscons.setText("escons");

        jMenu1.setText("Introduir");

        miEntraEscons.setText("nombre d'escons");
        miEntraEscons.setActionCommand("entra nombre d'escons");
        jMenu1.add(miEntraEscons);

        miEntraVotsBlancs.setText("vots en blanc");
        miEntraVotsBlancs.setActionCommand("entra vots en blanc");
        jMenu1.add(miEntraVotsBlancs);

        miEntraVotsPartit.setText("vots d'un partit");
        miEntraVotsPartit.setActionCommand("entra vots d'un partit");
        jMenu1.add(miEntraVotsPartit);
        jMenu1.add(jSeparator1);

        miEixir.setText("eixir");
        jMenu1.add(miEixir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Veure");

        miVeureDades.setText("dades partits");
        miVeureDades.setActionCommand("veure dades partits");
        jMenu2.add(miVeureDades);

        miVeureQuocients.setText("quocients");
        miVeureQuocients.setActionCommand("veure quocients");
        jMenu2.add(miVeureQuocients);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eEscons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 933, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(eEscons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eEscons;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem miEixir;
    private javax.swing.JMenuItem miEntraEscons;
    private javax.swing.JMenuItem miEntraVotsBlancs;
    private javax.swing.JMenuItem miEntraVotsPartit;
    private javax.swing.JMenuItem miVeureDades;
    private javax.swing.JMenuItem miVeureQuocients;
    private javax.swing.JTextArea taPantalla;
    // End of variables declaration//GEN-END:variables

    /**
     * assigna l'oïdor als botons.
     *
     * @param oidor gestor dels esdeveniments d'acció
     */
    public void setOidor(ActionListener oidor) {
        miEixir.addActionListener(oidor);
        miEntraEscons.addActionListener(oidor);
        miEntraVotsBlancs.addActionListener(oidor);
        miEntraVotsPartit.addActionListener(oidor);
        miVeureDades.addActionListener(oidor);
        miVeureQuocients.addActionListener(oidor);
    }

    /**
     * mostra un text en pantalla. el text substitueix a l'anterior
     *
     * @param text a mostrar
     */
    public void mostra(String text) {
        taPantalla.setText(text);
    }

    /**
     * mostra els escons que hi ha en joc.
     *
     * @param nombre d'escons
     */
    public void mostraEscons(int nombre) {
        eEscons.setText(String.format("Hi ha %d escons a repartir", nombre));
    }

}
