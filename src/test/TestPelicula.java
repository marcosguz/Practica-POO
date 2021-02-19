package test;

import cine.Categoria;
import cine.Pelicula;

/**
 *
 * @author Marcos
 */
public class TestPelicula {
    public static void main(String[] args) {
        
        Pelicula matrix = new Pelicula();
        Categoria categoria = new Categoria();
        matrix.setNombre("Matrix");
        matrix.setCategoria(categoria);
        categoria.setId(0);
        categoria.setNombre("Accion");
        categoria.setDescripcion("Arnas y ficcion");
        categoria.setEstado(true);
        
    }
}
