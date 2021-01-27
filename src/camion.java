

public class camion extends Thread { //crea la clse camion

    darsena darsena;

    public camion(darsena darsena){this.darsena = darsena;}
    public void run(){
        darsena.entrada(this);
    }

}
