/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u71744222177
 */
public class JbdcNrcSelect {
    public static void main(String[] args) {
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
        System.out.println("rodou");
    }
}
