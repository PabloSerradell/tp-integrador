package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ServicioTuristico implements Serializable {
    
    // Atributos, mapeo y relaciones:
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo_servicio;
    @Basic
    private String nombre;
    private String descripcion_breve;
    private String destino_servicio;
    private double costo_servicio;
    private boolean activo;
    @Temporal(TemporalType.DATE)
    private Date fecha_servicio;
    
    @ManyToMany
    private List<PaqueteTuristico> listaPaquetes;
    @OneToMany
    private List<Venta> listaVentasServ;
    
    // Constructores, vacío y con parámetros:

    public ServicioTuristico() {
    }

    public ServicioTuristico(long codigo_servicio, String nombre, String descripcion_breve, String destino_servicio, double costo_servicio, boolean activo, Date fecha_servicio, List<PaqueteTuristico> listaPaquetes, List<Venta> listaVentasServ) {
        this.codigo_servicio = codigo_servicio;
        this.nombre = nombre;
        this.descripcion_breve = descripcion_breve;
        this.destino_servicio = destino_servicio;
        this.costo_servicio = costo_servicio;
        this.activo = activo;
        this.fecha_servicio = fecha_servicio;
        this.listaPaquetes = listaPaquetes;
        this.listaVentasServ = listaVentasServ;
    }
    
    // Getters y setters:

    public long getCodigo_servicio() {
        return codigo_servicio;
    }

    public void setCodigo_servicio(long codigo_servicio) {
        this.codigo_servicio = codigo_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion_breve() {
        return descripcion_breve;
    }

    public void setDescripcion_breve(String descripcion_breve) {
        this.descripcion_breve = descripcion_breve;
    }

    public String getDestino_servicio() {
        return destino_servicio;
    }

    public void setDestino_servicio(String destino_servicio) {
        this.destino_servicio = destino_servicio;
    }

    public double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFecha_servicio() {
        return fecha_servicio;
    }

    public void setFecha_servicio(Date fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
    }

    public List<PaqueteTuristico> getListaPaquetes() {
        return listaPaquetes;
    }

    public void setListaPaquetes(List<PaqueteTuristico> listaPaquetes) {
        this.listaPaquetes = listaPaquetes;
    }

    public List<Venta> getListaVentasServ() {
        return listaVentasServ;
    }

    public void setListaVentasServ(List<Venta> listaVentasServ) {
        this.listaVentasServ = listaVentasServ;
    }
    
}
