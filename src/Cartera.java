public class Cartera extends Usuario{

    private int gasto;
    private String fecha;
    private int ingresosMensuales, ingresosAdicionales;

    public Cartera(String username, String nombre, String email, String password, int ingresosMensuales, int gasto, String fecha, int ingresosMensuales1, int ingresosAdicionales) {
        super(username, nombre, email, password);
        this.gasto = gasto;
        this.fecha = fecha;
        this.ingresosMensuales = ingresosMensuales1;
        this.ingresosAdicionales = ingresosAdicionales;
    }

    public int getGasto() {
        return gasto;
    }

    public String getFecha() {
        return fecha;
    }

    public int getIngresosMensuales() {
        return ingresosMensuales;
    }

    public int getIngresosAdicionales() {
        return ingresosAdicionales;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIngresosMensuales(int ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public void setIngresosAdicionales(int ingresosAdicionales) {
        this.ingresosAdicionales = ingresosAdicionales;
    }

    public int totalIngresos(int ingresosMensuales,int ingresosAdicionales){
        return ingresosAdicionales+ingresosMensuales;
    }
     public int totalEgresos(int gasto){
        return gasto;
     }

}
