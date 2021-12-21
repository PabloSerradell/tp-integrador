package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class PaqueteTuristico implements Serializable {
    
    // Atributos, mapeo y relaciones:
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_paquete;
    @Basic
    private double costo_paquete;
    private boolean activo;
    
    @ManyToMany
    private List<ServicioTuristico> listaServicios;
    @OneToMany
    private List<Venta> listaVentasPaq;
    
    // Constructores, vacío y con parámetros:
    
    public PaqueteTuristico() {
    }

    public PaqueteTuristico(long codigo_paquete, double costo_paquete, boolean activo, List<ServicioTuristico> listaServicios, List<Venta> listaVentasPaq) {
        this.codigo_paquete = codigo_paquete;
        this.costo_paquete = costo_paquete;
        this.activo = activo;
        this.listaServicios = listaServicios;
        this.listaVentasPaq = listaVentasPaq;
    }

    // Getters y setters:
    
    public long getCodigo_paquete() {
        return codigo_paquete;
    }

    public void setCodigo_paquete(long codigo_paquete) {
        this.codigo_paquete = codigo_paquete;
    }

    public double getCosto_paquete() {
        return costo_paquete;
    }

    public void setCosto_paquete(double costo_paquete) {
        this.costo_paquete = costo_paquete;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<ServicioTuristico> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<ServicioTuristico> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public List<Venta> getListaVentasPaq() {
        return listaVentasPaq;
    }

    public void setListaVentasPaq(List<Venta> listaVentasPaq) {
        this.listaVentasPaq = listaVentasPaq;
    }
    
}
