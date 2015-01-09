/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;

/**
 *
 * @author Jaime Alvarez Luna
 */
public class Conexión {

    private static Preferences preferences = Preferences.userNodeForPackage(Conexión.class);
    private static Connection con;

    public static void setData(String user, String password, String host, String schema) {
        preferences.put("host", host);
        preferences.put("schema", schema);
        preferences.put("password", password);
        preferences.put("user", user);
    }

    public static String getValue(String value) {
        return preferences.get(value, null);
    }

    public static void setValue(String key, String value) {
        preferences.put(key, value);
    }

    public static void conectar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + getValue("host") + "/" + getValue("schema"), getValue("user"), getValue("password"));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexión.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void desconectar() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                con = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexión.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<Object[]> consulta(String SQL) {
        try {
            Conexión.conectar();
            CallableStatement statement = con.prepareCall(SQL);
            ResultSet resultSet = statement.executeQuery();

            List<Object[]> tuplas = new ArrayList<>();
            ResultSetMetaData data = (ResultSetMetaData) resultSet.getMetaData();
            Object object[];
            while (resultSet.next()) {
                object = new Object[data.getColumnCount()];
                for (int i = 0; i < data.getColumnCount(); i++) {
                    object[i] = resultSet.getObject(i + 1);
                }
                tuplas.add(object);
            }
            return tuplas;
        } catch (SQLException ex) {
            Logger.getLogger(Conexión.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexión.desconectar();
        }
        return null;
    }
}
