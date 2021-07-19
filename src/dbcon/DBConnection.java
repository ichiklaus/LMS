/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbcon;

import java.sql.Connection;

/**
 *
 * @author Nicolas
 */
abstract public class DBConnection {
    abstract protected boolean checkIfDBExists(String database_name);
    abstract public Connection getConnection();
}
