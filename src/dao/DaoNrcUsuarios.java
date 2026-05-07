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
import bean.NrcUsuarios;
import java.sql.Date;

/**
 *
 * @author u71744222177
 */
public class DaoNrcUsuarios extends DaoAbstract{

    @Override
    public void insert(Object object) {
       NrcUsuarios nrcUsuarios = (NrcUsuarios) object;
       try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_nureen_centurion";
            user="nureen_centurion";
            password="nureen_centurion";
            
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password); 
            

            String sql = "insert into nrc_usuarios values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);    
            pst.setInt(1, nrcUsuarios.getNrcIdUsuarios());
            pst.setString(2, nrcUsuarios.getNrcNome());
            pst.setString(3, nrcUsuarios.getNrcApelido());
            pst.setString(4, nrcUsuarios.getNrcCpf());
            pst.setDate(5, null);// nrcUsuarios.getMpvDataNascimento());
            pst.setInt(6, nrcUsuarios.getNrcNivel());
            pst.setString(7, nrcUsuarios.getNrcSenha());
            pst.setString(8, nrcUsuarios.getNrcAtivo());
            pst.executeUpdate();
            
                                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
       NrcUsuarios nrcUsuarios = (NrcUsuarios) object; 
    }

    @Override
    public void delete(Object object) {
       NrcUsuarios nrcUsuarios = (NrcUsuarios) object; 
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
            

            String sql = "select * from nrc_usuarios ";
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
