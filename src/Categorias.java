public class Categorias extends Cartera{
  private int gastHogar,gastTransporte,gastAlimentacion,gastModa,gastEntretenimiento,gastSalud,gastEduca;

    public Categorias(String username, String nombre, String email, String password, int ingresosMensuales, int gasto, String fecha, int ingresosMensuales1, int ingresosAdicionales, int gastHogar, int gastTransporte, int gastAlimentacion, int gastModa, int gastEntretenimiento, int gastSalud, int gastEduca) {
        super(username, nombre, email, password, ingresosMensuales, gasto, fecha, ingresosMensuales1, ingresosAdicionales);
        this.gastHogar = gastHogar;
        this.gastTransporte = gastTransporte;
        this.gastAlimentacion = gastAlimentacion;
        this.gastModa = gastModa;
        this.gastEntretenimiento = gastEntretenimiento;
        this.gastSalud = gastSalud;
        this.gastEduca = gastEduca;
    }

    public int getGastHogar() {
        return gastHogar;
    }

    public void setGastHogar(int gastHogar) {
        this.gastHogar = gastHogar;
    }

    public int getGastTransporte() {
        return gastTransporte;
    }

    public void setGastTransporte(int gastTransporte) {
        this.gastTransporte = gastTransporte;
    }

    public int getGastAlimentacion() {
        return gastAlimentacion;
    }

    public void setGastAlimentacion(int gastAlimentacion) {
        this.gastAlimentacion = gastAlimentacion;
    }

    public int getGastModa() {
        return gastModa;
    }

    public void setGastModa(int gastModa) {
        this.gastModa = gastModa;
    }

    public int getGastEntretenimiento() {
        return gastEntretenimiento;
    }

    public void setGastEntretenimiento(int gastEntretenimiento) {
        this.gastEntretenimiento = gastEntretenimiento;
    }

    public int getGastSalud() {
        return gastSalud;
    }

    public void setGastSalud(int gastSalud) {
        this.gastSalud = gastSalud;
    }

    public int getGastEduca() {
        return gastEduca;
    }

    public void setGastEduca(int gastEduca) {
        this.gastEduca = gastEduca;
    }
}
