import java.util.Random;
import java.util.concurrent.Semaphore;

public class darsena {

    private static final Semaphore semaforo = new Semaphore(5, false); //solo existen 5 darsenas

    public static void entrada(camion camion) { //entra un camion

        try {
            semaforo.acquire(); //se inicia el semaforo
            System.out.println("El " + camion.getName() + " entra en su darsena"); //cada vez que entre un camión escribe
            mozos.Descarga(camion); // los mozos tardan entre 5 y 6 segundos en descargar el camion
            semaforo.release(); // suelta el camión

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}


