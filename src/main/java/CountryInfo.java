public class CountryInfo {
    private String nombrePais;
    private float casos;
    private int dia;

    public CountryInfo(){ }

    public CountryInfo(String nombrePais, float casos, int dia){
        this.nombrePais = nombrePais;
        this.casos = casos;
        this.dia = dia;
    }

    public float getCasos() {
        return casos;
    }
    public int getDia() {
        return dia;
    }
    public String getNombrePais() {
        return nombrePais;
    }
    public void setCasos(float casos) {
        this.casos = casos;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
}
