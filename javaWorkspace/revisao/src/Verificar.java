public class Verificar {
    private float resultado;
    
    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public float verificarHora(float a){
        resultado = (float) (a * 12.25);

        return resultado;
    }
}
