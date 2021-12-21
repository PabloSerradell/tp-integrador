package logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente implements Serializable {
    
    // Atributos, mapeo y relaciones:
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_cliente;
    @Basic
    private String nombre;
    private String apellido;
    private String direccion;
    private String dni;
    private String nacionalidad;
    private long celular;
    private String email;
    private boolean activo;
    @Temporal(TemporalType.DATE)
    private Date fecha_nac;
    
    @OneToMany
    private List<Venta> listaVentasCli;
    
    // Constructores, vacío y con parámetros:
    
    public Cliente() {
    }

    public Cliente(long id_cliente, String nombre, String apellido, String direccion, String dni, String nacionalidad, long celular, String email, boolean activo, Date fecha_nac, List<Venta> listaVentasCli) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        this.celular = celular;
        this.email = email;
        this.activo = activo;
        this.fecha_nac = fecha_nac;
        this.listaVentasCli = listaVentasCli;
    }
    
    // Getters y setters:

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public List<Venta> getListaVentasCli() {
        return listaVentasCli;
    }

    public void setListaVentasCli(List<Venta> listaVentasCli) {
        this.listaVentasCli = listaVentasCli;
    }
    
}
