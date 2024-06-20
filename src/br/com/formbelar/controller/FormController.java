/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.formbelar.controller;

import br.com.formbelar.view.CadastroView;
import java.sql.Connection;
import br.com.formbelar.dao.Conexao;
import br.com.formbelar.dao.FormDAO;
import java.sql.SQLException;

/**
 *
 * @author HigorMedVet
 */
public class FormController {
    
    public void cadastrarUsuario (CadastroView view)throws SQLException{
      
        Connection conexao = new Conexao ().getConnection() ;
        FormDAO form = new FormDAO ();
        form.cadastrarUsuario(view.getTf_Nome().getText(), view.getTf_Email().getText(), view.getTf_Senha().getText());
    }
    
}
