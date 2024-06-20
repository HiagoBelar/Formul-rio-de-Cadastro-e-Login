
package br.com.formbelar.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class FormDAO {
    
    public void cadastrarUsuario (String nome, String email, String senha)throws SQLException{
        
        Connection conexao = new Conexao ().getConnection();
        
        
        String sql = "INSERT INTO usuario (nome, email, senha) VALUES ('"+nome+"', '"+email+"', '"+senha+"')";
        PreparedStatement stm = conexao.prepareStatement (sql);
        stm.execute();
        conexao.close();
    }
    
}
