//Clase para conexión a la base de datos
package Conexion;

//Importo las librerias
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //Declaro las variables de conexión
    private Connection con;
    private String usuario;
    private String password;
    private String db;
    private String servidor;
    
    //Creo el constructor e inicializo las variables
    public Conexion()
    {
        usuario = "root";
        password = "";
        db = "db_fernando";
        servidor = "jdbc:mysql://localhost/"+ db;
    }
 
    //Obtengo el valor de la conexión a la base de datos
    public Connection getConexion()
    {
        return con;
    }
    
    //Me conecto a la base de datos
    public Connection Conectar() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.gjt.mm.mysql.Driver");
        con = DriverManager.getConnection(servidor,usuario,password);
        return con;
    }
    
    //Me desconecto de la base de datos
    public void Desconectar() throws SQLException
    {
        con.close();
    }
    
    public void Commit() throws SQLException
    {
        con.commit();
    }
}