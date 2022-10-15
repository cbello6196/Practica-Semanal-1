package Problema3;


class Dispositivo{
    int numero;
    int puntuacion;
    
    public Dispositivo(int numero,int puntuacion){
        this.numero=numero;
        this.puntuacion=puntuacion;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
