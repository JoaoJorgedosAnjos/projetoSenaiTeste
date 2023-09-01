/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.*;


/**
 *
 * @author Professor
 */
public class Conexao {
    public Connection getConnection(){
        try{
            Class.forName ( "com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=ESTOQUE;"; /*drive, banco, ip de conexão com o banco, porta do banco, nome do banco de dados*/
            String user = "admin";
            String password = "Prof@dm1n";
            return DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException | SQLException e){
            throw new RuntimeException ("Erro ao conectar no banco de dados"+e);
       
    }
    }
    
}
