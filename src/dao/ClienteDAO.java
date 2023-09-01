/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import connection.Conexao;
import model.ClienteModel;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class ClienteDAO {
    
    private Connection con;
    
    public ClienteDAO(){
        
        con = new Conexao().getConnection();
    }
    public void cadastrarCliente(ClienteModel obj) throws SQLException{
        try{
            String sql = "insert into cliente (cod, nome, email, cep, bairro, rg, celular, cidade, complemento, cpf, telefone, uf)"+
            "values ( ?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, obj.getCod());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getEmail());
            stmt.setString(4, obj.getCep());
            stmt.setString(5, obj.getBairro());
            stmt.setString(6, obj.getRg());
            stmt.setString(7, obj.getCelular());
            stmt.setString(8, obj.getCidade());
            stmt.setString(9, obj.getComplemento());
            stmt.setString(10, obj.getCpf());
            stmt.setString(11, obj.getTelefone());
            stmt.setString(12, obj.getUf());
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso" );
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"error:"+ e);
        }
    }
    // public void atualizarCliente(){
        
    //}
      //public void excluirCliente(){
        
    //}
    
}
