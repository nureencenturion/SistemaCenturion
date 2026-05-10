/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import testes.JdbcNrcCrud;
import bean.NrcFornecedores;
import java.sql.Date;

/**
 *
 * @author u71744222177
 */
public class DaoNrcFornecedores extends DaoAbstract{

    @Override
    public void insert(Object object) {
       NrcFornecedores nrcFornecedores = (NrcFornecedores) object;
       try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_nureen_centurion";
            user="nureen_centurion";
            password="nureen_centurion";
            
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password); 
            

            String sql = "insert into nrc_fornecedores values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);    
            pst.setInt(1, nrcFornecedores.getNrcIdFornecedores());
            pst.setString(2, nrcFornecedores.getNrcNome());
            pst.setString(3, nrcFornecedores.getNrcCnpj());
            pst.setInt(4, nrcFornecedores.getNrcCategoria());
            pst.setString(5, nrcFornecedores.getNrcTelefone());
            pst.setString(6, nrcFornecedores.getNrcEmail());
            pst.setString(7, nrcFornecedores.getNrcBairro());
            pst.setString(8, nrcFornecedores.getNrcLogradouro());
            pst.setString(9, nrcFornecedores.getNrcNumero());
            pst.setString(10, nrcFornecedores.getNrcCidade());
            pst.setString(11, nrcFornecedores.getNrcEstado());
            pst.setString(12, nrcFornecedores.getNrcCep());
            pst.setString(13, nrcFornecedores.getNrcHorarioAtendimento());
            pst.setString(14, nrcFornecedores.getNrcSite());
            pst.setInt(15, nrcFornecedores.getNrcStatus());
            pst.setString(16, nrcFornecedores.getNrcDiasEntrega());
            pst.executeUpdate();
            
                                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
       NrcFornecedores nrcFornecedores = (NrcFornecedores) object; 
    }

    @Override
    public void delete(Object object) {
       NrcFornecedores nrcFornecedores = (NrcFornecedores) object; 
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
       try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_nureen_centurion";
            user="nureen_centurion";
            password="nureen_centurion";
            
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password); 
            

            String sql = "select * from nrc_fornecedores ";
            PreparedStatement pst = cnt.prepareStatement(sql);    
            ResultSet rs = pst.executeQuery();
            while (rs.next()== true){
                System.out.println("id:" + rs.getInt("nrc_id_fornecedores"));
                System.out.println("nome:" + rs.getString("nrc_nome"));
                
            }
            
                                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
    }
    
}
