import java.util.concurrent.Semaphore;

public class mozos {

    private static final Semaphore semaforo2 = new Semaphore(2, true); //los mozos solo pueden descargar dos camiones

    public static void Descarga(camion camion){ //crea el metodo descarga

        try{
            semaforo2.acquire();
            System.out.println(camion.getName()+" descargando");
            int tiempo = (int) (Math.random()*(1000)+5000); //variable de tiempo
            Thread.sleep(tiempo); //el hilo camion se espera esa cantidad de tiempo
            System.out.println(camion.getName()+" descargado");
            semaforo2.release();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
