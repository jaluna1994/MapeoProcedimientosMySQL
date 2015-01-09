
import DAL.Conexión;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jaime Alvarez Luna
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        ocultar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        dlgGuardar = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpENUM = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpProcedimiento = new javax.swing.JTextPane();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtHost = new javax.swing.JTextField();
        txtSchema = new javax.swing.JTextField();
        pwtxtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 0), new java.awt.Dimension(120, 32767));

        dlgGuardar.setAcceptAllFileFilterUsed(false);
        dlgGuardar.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        dlgGuardar.setCurrentDirectory(new java.io.File("C:\\Users\\Jaime Alvarez Luna\\Documents\\NetBeansProjects"));
        dlgGuardar.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Directorios root";
            }
        });
        dlgGuardar.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(131, 181, 221));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(131, 181, 221));
        jTabbedPane1.setFocusable(false);
        jTabbedPane1.setFont(new java.awt.Font("Lucida Sans", 3, 14)); // NOI18N
        jTabbedPane1.setOpaque(true);

        tpENUM.setEditable(false);
        tpENUM.setBackground(java.awt.SystemColor.textInactiveText);
        tpENUM.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        tpENUM.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tpENUM);

        jTabbedPane1.addTab("Enum", jScrollPane1);

        tpProcedimiento.setEditable(false);
        tpProcedimiento.setBackground(new java.awt.Color(170, 177, 176));
        tpProcedimiento.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        tpProcedimiento.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tpProcedimiento);

        jTabbedPane1.addTab("Procedimientos", jScrollPane2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(131, 181, 221));

        jButton3.setFont(new java.awt.Font("Lucida Sans", 3, 14)); // NOI18N
        jButton3.setText("Generar");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);

        jButton4.setFont(new java.awt.Font("Lucida Sans", 3, 14)); // NOI18N
        jButton4.setText("Configuración");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);

        getContentPane().add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel4.setBackground(new java.awt.Color(131, 181, 221));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel1.setText("User");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setText("HostName");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel4.setText("Schema");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        jPanel1.add(jLabel4, gridBagConstraints);

        txtUser.setColumns(15);
        txtUser.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        jPanel1.add(txtUser, gridBagConstraints);

        txtHost.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        jPanel1.add(txtHost, gridBagConstraints);

        txtSchema.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        jPanel1.add(txtSchema, gridBagConstraints);

        pwtxtPassword.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        jPanel1.add(pwtxtPassword, gridBagConstraints);

        jPanel2.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Lucida Sans", 3, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setFont(new java.awt.Font("Lucida Sans", 3, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jPanel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(filler2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
        jPanel4.add(jPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weighty = 0.1;
        jPanel4.add(filler1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel4.add(filler3, gridBagConstraints);

        getContentPane().add(jPanel4, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conexión.setData(txtUser.getText(), new String(pwtxtPassword.getPassword()), txtHost.getText(), txtSchema.getText());
        ocultar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        List<Object[]> objects = Conexión.consulta("SELECT R.SPECIFIC_NAME,(SELECT COUNT(P.SPECIFIC_NAME) FROM INFORMATION_SCHEMA.PARAMETERS AS P WHERE P.SPECIFIC_SCHEMA='" + Conexión.getValue("schema") + "' AND P.SPECIFIC_NAME=R.SPECIFIC_NAME) AS Cantidad FROM INFORMATION_SCHEMA.ROUTINES AS R WHERE R.ROUTINE_SCHEMA = '" + Conexión.getValue("schema") + "' AND R.ROUTINE_TYPE='PROCEDURE'");
        tpENUM.setText("package DAL;/**\n"
                + " *\n"
                + " * @author Jaime Alvarez Luna\n"
                + " */\n"
                + "public enum Procedimientos {\n");
        String valores = "";
        for (Object[] object : objects) {
            long cantidadIncognitas = (long) object[1];
            String incognitas = "";
            for (int i = 1; i <= cantidadIncognitas; i++) {
                incognitas = incognitas.concat(i != cantidadIncognitas ? "?," : "?");
            }
            valores = valores.concat("\t" + object[0].toString().toUpperCase() + "(\"{CALL " + object[0].toString() + " (" + incognitas + ")}\"),\n");
        }
        valores = valores.substring(0, valores.length() - 3) + ");";

        tpENUM.setText(tpENUM.getText() + "\n" + valores + "\n\n"
                + "\tprivate final String procedimiento;\n"
                + "\n"
                + "\tprivate Procedimientos(String procedimiento) {\n"
                + "\t\tthis.procedimiento = procedimiento;\n"
                + "\t}\n"
                + "\n"
                + "\tpublic String SQL() {\n"
                + "\t\treturn procedimiento;\n"
                + "\t}\n"
                + "}");

        String metodos = "";

        for (Object[] object : objects) {
            String parametro = "";
            String datos = "";
            if (object[0].toString().toLowerCase().contains("buscar") || object[0].toString().toLowerCase().contains("listar")) {
                metodos = metodos.concat("\tpublic static List<Object[]> " + object[0].toString()) + "(";
            } else {
                metodos = metodos.concat("\tpublic static String " + object[0].toString() + "(");
            }
            List<Object[]> parametros = Conexión.consulta("SELECT P.ORDINAL_POSITION,P.PARAMETER_NAME,P.DATA_TYPE  FROM information_schema.parameters AS P INNER JOIN information_schema.routines AS R ON P.SPECIFIC_NAME = R.SPECIFIC_NAME WHERE P.SPECIFIC_SCHEMA='" + Conexión.getValue("schema") + "' AND P.SPECIFIC_NAME = '" + object[0].toString() + "' AND R.ROUTINE_TYPE='PROCEDURE'");
            for (int i = 0; i < parametros.size(); i++) {
                String tipoDatoJava = "indefinido";
                switch (parametros.get(i)[2].toString()) {
                    case "int": {
                        tipoDatoJava = "Integer";
                    }
                    break;
                    case "char":
                    case "varchar": {
                        tipoDatoJava = "String";
                    }
                    break;
                    case "blob": {
                        tipoDatoJava = "Byte[]";
                    }
                    break;
                    case "decimal": {
                        tipoDatoJava = "Double";
                    }
                    break;
                    case "bit": {
                        tipoDatoJava = "Boolean";
                    }
                    break;
                    case "date":
                    case "datetime":
                    case "time": {
                        tipoDatoJava = "Date";
                    }
                    break;
                    default: {
                        System.out.println(parametros.get(i)[2].toString());
                    }
                }
                if (i != parametros.size() - 1) {
                    parametro = parametro.concat(tipoDatoJava + " " + parametros.get(i)[1].toString() + ", ");
                    datos = datos.concat(parametros.get(i)[1].toString() + ", ");
                } else {
                    parametro = parametro.concat(tipoDatoJava + " " + parametros.get(i)[1].toString());
                    datos = datos.concat(parametros.get(i)[1].toString());
                }
            }
            metodos = metodos.concat(parametro + "){\n");
            if (object[0].toString().toLowerCase().contains("buscar") || object[0].toString().toLowerCase().contains("listar")) {
                metodos = metodos.concat("\t\treturn Conexión.procedimientoQuery(Procedimientos." + object[0].toString().toUpperCase() + ",new Object[]{" + datos + "});\n\t}\n");
            } else {
                metodos = metodos.concat("\t\treturn Conexión.procedimientoMensaje(Procedimientos." + object[0].toString().toUpperCase() + "," + datos + ");\n\t}\n");
            }
        }

        tpProcedimiento.setText("package DAL;\nimport java.util.Date;\nimport java.util.List;"
                + "\n/**\n"
                + " *\n"
                + " * @author Jaime Alvarez Luna\n"
                + " */"
                + "\npublic class LLamadaProcedimientos {\n"
                + "\n" + metodos + "\n}"
        );

        int status = dlgGuardar.showSaveDialog(this);
        if (status == javax.swing.JFileChooser.APPROVE_OPTION) {
            File file = dlgGuardar.getSelectedFile();
            try {
                File procedimientos = new File(file.getPath() + "\\src\\DAL\\Procedimientos.java");
                File llamadaProcedimientos = new File(file.getPath() + "\\src/DAL/LLamadaProcedimientos.java");
                procedimientos.delete();
                llamadaProcedimientos.delete();
                llamadaProcedimientos.createNewFile();
                procedimientos.createNewFile();
                java.nio.file.Files.write(procedimientos.toPath(), tpENUM.getText().getBytes(), java.nio.file.StandardOpenOption.WRITE);
                java.nio.file.Files.write(llamadaProcedimientos.toPath(), tpProcedimiento.getText().getBytes(), java.nio.file.StandardOpenOption.WRITE);
            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        txtUser.setText(Conexión.getValue("user"));
        txtHost.setText(Conexión.getValue("host"));
        txtSchema.setText(Conexión.getValue("schema"));
        pwtxtPassword.setText(Conexión.getValue("password"));
        mostrar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ocultar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void ocultar() {
        SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                Point point = jPanel1.getLocation();
                Point meta = (Point) point.clone();
                meta.x += jPanel1.getSize().width;
                while (point.x <= meta.x) {
                    point.x += 1;
                    jPanel1.setLocation(point);
                    try {
                        Thread.sleep(5);
                    } catch (Exception ex) {
                    }
                }
                jPanel1.setVisible(false);
                return null;
            }
        };
        sw.execute();
    }

    public void mostrar() {
        SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                jPanel1.setVisible(true);
                Point point = jPanel1.getLocation();
                Point original = (Point) point.clone();
                original.x -= jPanel1.getSize().width;
                jPanel1.setLocation(point);
                while (point.x >= original.x) {
                    point.x -= 1;
                    jPanel1.setLocation(point);
                    try {
                        Thread.sleep(5);
                    } catch (Exception ex) {
                    }
                }
                return null;
            }

        };
        sw.execute();
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
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser dlgGuardar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField pwtxtPassword;
    private javax.swing.JTextPane tpENUM;
    private javax.swing.JTextPane tpProcedimiento;
    private javax.swing.JTextField txtHost;
    private javax.swing.JTextField txtSchema;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
