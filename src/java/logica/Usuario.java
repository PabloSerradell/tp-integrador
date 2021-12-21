package logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Usuario implements Serializable {
    
    // Atributos, mapeo y relaciones:
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_usuario;
    @Basic
    private String nombre_usuario;
    private String contrasenia;
    private boolean activo;
    
    @OneToOne
    private Empleado unEmpleado;
    @OneToMany
    private List<Venta> listaVentasUsu;
    
    // Constructores, vacío y con parámetros:

    public Usuario() {
    }

    public Usuario(long id_usuario, String nombre_usuario, String contrasenia, boolean activo, Empleado unEmpleado, List<Venta> listaVentasUsu) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
        this.activo = activo;
        this.unEmpleado = unEmpleado;
        this.listaVentasUsu = listaVentasUsu;
    }
    
    // Getters y setters:

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Empleado getUnEmpleado() {
        return unEmpleado;
    }

    public void setUnEmpleado(Empleado unEmpleado) {
        this.unEmpleado = unEmpleado;
    }

    public List<Venta> getListaVentasUsu() {
        return listaVentasUsu;
    }

    public void setListaVentasUsu(List<Venta> listaVentasUsu) {
        this.listaVentasUsu = listaVentasUsu;
    }
    
}
