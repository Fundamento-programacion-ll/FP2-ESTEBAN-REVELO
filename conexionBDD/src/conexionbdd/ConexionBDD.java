package conexionbdd;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.articulo;

public class ConexionBDD {

    public static void main(String[] args) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        conector stringConexion = new conector();
        stringConexion.getConxion();
        articulo nuevoArticulo = new articulo();
        //nuevoArticulo.setNombre("nintendo");
        //nuevoArticulo.setDescripcion("mariooo");
        //nuevoArticulo.setPrecio(250);        
        // Insert 
        String select
                = "select * "
                + "from articulos"
                + " where idArticulo = ?";
        try {
            ps = stringConexion
                    .getConxion()
                    .prepareStatement(select);
            ps.setInt(1, 3);
            rs = ps.executeQuery(); // obtener resultados
            while (rs.next()) {
                // 1 id
                // ver todo lo de id = 2
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getFloat(4));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
