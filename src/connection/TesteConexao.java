/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class TesteConexao {
       public static void main (String [] args)throws ClassNotFoundException, SQLException{
        try{
            new Conexao().getConnection();
            JOptionPane.showMessageDialog(null,"Conectado com sucesso"); /*sempre usara quando quiser uma mensagem pop up*/
           
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Erro de conexão"+e);
        }
    }
}
