package redesmonopolyserver.Dominio;

public class Jugador {

    public Jugador(int codigo, String nombre, String icono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dinero = 0;
        this.carcelLibre = 0;
        this.icono = icono;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getCarcelLibre() {
        return carcelLibre;
    }

    public void setCarcelLibre(int carcelLibre) {
        this.carcelLibre = carcelLibre;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
    private int codigo;
    private String nombre;
    private int dinero;
    private int carcelLibre;
    private String icono;
}
