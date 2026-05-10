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
import bean.NrcClientes;
import java.sql.Date;

/**
 *
 * @author u71744222177
 */
public class DaoNrcClientes extends DaoAbstract{

    @Override
    public void insert(Object object) {
       NrcClientes nrcClientes = (NrcClientes) object;
       try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_nureen_centurion";
            user="nureen_centurion";
            password="nureen_centurion";
            
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password); 
            

            String sql = "insert into nrc_clientes values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);    
            pst.setInt(1, nrcClientes.getNrcIdClientes());
            pst.setString(2, nrcClientes.getNrcNome());
            pst.setString(3, nrcClientes.getNrcSobrenome());
            pst.setString(4, nrcClientes.getNrcRg());
            pst.setString(5, nrcClientes.getNrcCpf());
            pst.setDate(6, null);// nrcClientes.getMpvDataNascimento());
            pst.setInt(7, nrcClientes.getNrcSexo());
            pst.setString(8, nrcClientes.getNrcCep());
            pst.setString(9, nrcClientes.getNrcTelefone());
            pst.setString(10, nrcClientes.getNrcEmail());
            pst.setString(11, nrcClientes.getNrcBairro());
            pst.setString(12, nrcClientes.getNrcRua());
            pst.setString(13, nrcClientes.getNrcNumero());
            pst.setString(14, nrcClientes.getNrcCidade());
            pst.setString(15, nrcClientes.getNrcEstado());
            pst.setString(16, nrcClientes.getNrcIdade());
            pst.executeUpdate();
            
                                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
       NrcClientes nrcClientes = (NrcClientes) object; 
    }

    @Override
    public void delete(Object object) {
       NrcClientes nrcClientes = (NrcClientes) object; 
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
            

            String sql = "select * from nrc_clientes ";
            PreparedStatement pst = cnt.prepareStatement(sql);    
            ResultSet rs = pst.executeQuery();
            while (rs.next()== true){
                System.out.println("id:" + rs.getInt("nrc_idusuarios"));
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
