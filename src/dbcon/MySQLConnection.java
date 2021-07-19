/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import libs.uilib.Login;
import libs.uilib.Main;
/**
 *
 * @author Nicolas
 */
public class MySQLConnection extends DBConnection{
    private Connection con;
    private String url;
    private String user;
    private String port;
    private String password;
    private final String database_name = "bibliotecalms";
    
    
    /**
    * @param database_name Comprueba si la base de datos existe en el catálogo.
     * @return 
    */
    @Override
    protected boolean checkIfDBExists(String database_name){
        String database_namechecker;
        if("".equals(getPort())){
            this.setPort("3306");
        }
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            setCon(DriverManager.getConnection("jdbc:mysql://" + getUrl() + ":" + getPort() + "?verifyServerCertificate=false&useSSL=true", getUser(), getPassword()));
            try(ResultSet rs = getCon().getMetaData().getCatalogs()){
                while(rs.next()){
                    database_namechecker = rs.getString(1);
                    if(database_namechecker.equals(database_name)){
                        return true;
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, "No se pudo establecer la conexión con el servidor. Revise url e intente nuevamente.", ex);
            } catch (InstantiationException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    /**
     * 
     * @return con Establece una conexión con la base de datos del servidor.    
     * De no existir, se creará una base de datos por defecto.
     */
    @Override
    public Connection getConnection(){
        
        if("".equals(getPort())){
            this.setPort("3306");//establece el puerto por defecto en caso que no se establezca
        }
        
        if(checkIfDBExists(this.database_name) == true){
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://" + this.url + ":" + this.port + "/" + this.database_name + "?verifyServerCertificate=false&useSSL=true",
                        this.user, this.password);
                new Main().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, "No se pudo establecer la conexión con el servidor. Revise url e intente nuevamente.", ex);
                JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión con el servidor. Revise url e intente nuevamente.");
                System.gc();
                new Login().setVisible(true);
            }
            
        }
        else if(checkIfDBExists(this.database_name) == false){
            try{
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                setCon(DriverManager.getConnection("jdbc:mysql://" + getUrl() + ":" + getPort() + "?verifyServerCertificate=false&useSSL=true", getUser(), getPassword()));
                int respuesta = JOptionPane.showConfirmDialog(null, "Esta debe ser la primera vez que corre esta aplicación en este equipo. La base de datos se creará con el nombre 'bibliotecalms'. ¿Desea continuar y crear un nuevo esquema?",
                        "Crear nuevo Esquema.", JOptionPane.YES_NO_OPTION);
                if(respuesta == JOptionPane.YES_OPTION){
                    try {
                        PreparedStatement ps = con.prepareStatement("CREATE DATABASE "+this.database_name+";");
                        int rs = ps.executeUpdate();                
                    } catch (SQLException ex) {
                        Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, "No se pudo establecer la conexión con el servidor. Revise url e intente nuevamente.", ex);
                        }
            new Main().setVisible(true);
            }                              
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(MySQLConnection.class.getName()).log(Level.SEVERE, "No se pudo establecer la conexión con el servidor. Revise url e intente nuevamente.", ex);
                JOptionPane.showMessageDialog(null, "No se pudo establecer la conexión con el servidor. Revise url e intente nuevamente.");
                System.gc();
                new Login().setVisible(true);
            }          
        }       
        
        return con;
    }

    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }

    /**
     * @return the database_name
     */
    private String getDatabase_name() {
        return database_name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param con the con to set
     */
    public void setCon(Connection con) {
        this.con = con;
    }


    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
    
}
