package controlador;

import conexion.conector;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.articulo;

public class controladorArticulo {

    ResultSet rs = null;
    PreparedStatement ps = null;
    conector conexion = new conector();

    public void ingresarArticlos(articulo nuevoArticulo) {
        String sqlInsert
                = "insert into articulos (nombre,descripcion,precio) values(?,?,?)";
        try {
            ps = conexion.getConxion().prepareStatement(sqlInsert);
            ps.setString(1, nuevoArticulo.getNombre());
            ps.setString(2, nuevoArticulo.getDescripcion());
            ps.setFloat(3, nuevoArticulo.getPrecio());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
        } catch (SQLException ex) {
            System.err.println("error: " + ex);
            JOptionPane
                    .showMessageDialog(null, "Error al ingresar datos");
            //Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BuscarDatosPorIdNombre(String tipoBusqueda, String valorABuscar) throws SQLException { //
        if (tipoBusqueda.equalsIgnoreCase("ID")) {
            int IdArticulo = Integer.parseInt(valorABuscar);
            String sqlSelectID
                    = "select * from articulos where idArticulo = ?";
            ps = conexion
                    .getConxion()
                    .prepareStatement(sqlSelectID);
            ps.setInt(1, IdArticulo);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("nombre: " + rs.getString(2));
                System.out.println("descripcion: " + rs.getString(3));
                System.out.println("precio: " + rs.getFloat(4));
            }
        }
        if (tipoBusqueda.equalsIgnoreCase("nombre")) {
            // SELECT * FROM Customers
            //WHERE CustomerName LIKE '%mar';
            String sqlSelectID
                    = "select * from articulos where nombre LIKE " + "'%" + valorABuscar + "%'" + "";
            System.out.println(sqlSelectID);
            ps = conexion
                    .getConxion()
                    .prepareStatement(sqlSelectID);
            //ps.setString(1, valorABuscar);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("nombre: " + rs.getString(2));
                System.out.println("descripcion: " + rs.getString(3));
                System.out.println("precio: " + rs.getFloat(4));
            }
        }
        if (tipoBusqueda.equalsIgnoreCase("ninguno")) {
            String sqlSelectID
                    = "select * from articulos";
            ps = conexion
                    .getConxion()
                    .prepareStatement(sqlSelectID);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("nombre: " + rs.getString(2));
                System.out.println("descripcion: " + rs.getString(3));
                System.out.println("precio: " + rs.getFloat(4));
            }
        }
    }

    public ArrayList obtenerDatos() throws SQLException {
        ArrayList<articulo> listaNombres = new ArrayList<>();
        String selectDatos = "select * from articulos";
        ps = conexion.getConxion().prepareStatement(selectDatos);
        rs = ps.executeQuery();
        while (rs.next()) {
            articulo art = new articulo();
            art.setNombre(rs.getString(2));
            art.setDescripcion(rs.getString(3));
            art.setPrecio(rs.getInt(4));
            listaNombres.add(art);
        }
        return listaNombres;
    }

    public void acrualizar() {
        String queryUpdate = "update articulos set nombre = ? where idArticulo = ?";
        try {
            ps = conexion.getConxion().prepareStatement(queryUpdate);
            ps.setString(1, "valor");
            ps.setInt(2, 2);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void eliminarRegistro() {
        String delete = "delete from articulos where nombre = ?";
        try {
            ps = conexion.getConxion().prepareStatement(delete);
            ps.setString(1, "nintendo");
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(controladorArticulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
