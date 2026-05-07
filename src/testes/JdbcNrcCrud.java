/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testes;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author u71744222177
 */
public class JdbcNrcCrud {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url="jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user="marcos_vilhanueva";
            password="marcos_vilhanueva";
//            url="jdbc://mysql/localhost/db_nureen_centurion";
//            user="nureen_centurion";
//            password="nureen_centurion";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password); 
            //110   
            //Statement stm = cnt.createStatement();
            //stm.executeUpdate("insert into mpv_usuarios (mpv_idusuarios, mpv_nome, mpv_apelido, mpv_cpf ) values(110, 'nureen', 'nuri', '781.788.645-56')");
            
//            String sql = "update mpv_usuarios set mpv_nome=?,"
//                    + "mpv_apelido=?, mpv_cpf=?"
//                    + "where mpv_idusuarios=?";

            String sql = "delete from mpv_usuarios where mpv_idusuarios =?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1,210);        
//            pst.setString(1, "Nureeeen");
//            pst.setString(2, "nrc");
//            pst.setString(3, "4759387098");
            pst.executeUpdate();
            
                                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcNrcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("rodou");
    }
}
