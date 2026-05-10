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
import bean.NrcVenda;
import java.sql.Date;

/**
 *
 * @author u71744222177
 */
public class DaoNrcVenda extends DaoAbstract{

    @Override
    public void insert(Object object) {
       NrcVenda nrcVenda = (NrcVenda) object;
       try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_nureen_centurion";
            user="nureen_centurion";
            password="nureen_centurion";
            
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password); 
            

            String sql = "insert into nrc_venda values(?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);    
            pst.setInt(1, nrcVenda.getNrcIdVenda());
            pst.setInt(2, nrcVenda.getNrcIdUsuarios());
            pst.setInt(3, nrcVenda.getNrcIdClientes());
            pst.setString(4, nrcVenda.getNrcProduto());
            pst.setDate(5, null);// nrcVenda.getNrcDataVenda());
            pst.setDouble(6, nrcVenda.getNrcValorTotal());
            pst.executeUpdate();
            
                                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Object object) {
       NrcVenda nrcVenda = (NrcVenda) object; 
    }

    @Override
    public void delete(Object object) {
       NrcVenda nrcVenda = (NrcVenda) object; 
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
            

            String sql = "select * from nrc_venda ";
            PreparedStatement pst = cnt.prepareStatement(sql);    
            ResultSet rs = pst.executeQuery();
            while (rs.next()== true){
                System.out.println("id:" + rs.getInt("nrc_id_venda"));
                System.out.println("produto:" + rs.getString("nrc_produto"));
                
            }
            
                                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
    }
    
}
