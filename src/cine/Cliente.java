package cine;

import java.util.Date;

/**
 *
 * @author Marcos
 */
public class Cliente extends Persona{
    private String fechaCumpleaños;
    private String ruc;
    private CategoriaCliente categoriaCliente;
    private Boolean estado;

    public String getFechaCumpleaños() {
        return fechaCumpleaños;
    }

    public void setFechaCumpleaños(String fechaCumpleaños) {
        this.fechaCumpleaños = fechaCumpleaños;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public CategoriaCliente getCategoriaCliente() {
        return categoriaCliente;
    }

    public void setCategoriaCliente(CategoriaCliente categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
 
    
    
}
