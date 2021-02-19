package cine;

/**
 *
 * @author Marcos
 */
public class CategoriaCliente {
    
    private Integer idCategoriaCliente;
    private String nombre;
    private String descripcion;
    private Boolean estado;

    public Integer getIdCategoriaCliente() {
        return idCategoriaCliente;
    }

    public void setIdCategoriaCliente(Integer idCategoriaCliente) {
        this.idCategoriaCliente = idCategoriaCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
}
