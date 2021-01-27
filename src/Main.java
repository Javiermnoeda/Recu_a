/*
1. Simular un Almacen al que han llegado 20 camiones (son hilos). Los camiones al llegar descargan su mercancía. El orden de entrada es aleatorio (1.5)
2. Hay sólo cinco dársenas, los camiones que llegan tienen que esperar (1.5)
3. Cuando el camión entra en la dársena, se debe escribir : (System.out.println("El camión X entra en su dársena")) (1)
4. Cuando tienen sitio asigando, los mozos de comienzan a descargar, sin embargo, estos mozos solo pueden engcargarse de 2 camiones a la vez
5. El primer camión en llegar es el primero en descargarse. Tardan entre 5 o 6 segundos
6. Una vez descargado el camión, este deja libre su sitio
 */

public class Main {
    public static void main(String[] args){
        //crea la clase darsena
        darsena darsena = new darsena();

        //crea camiones hasta llegar a 20
        for (int i=0;i<20;i++){
            camion o = new camion(darsena);
            o.setName("Camion "+(i+1));
            o.start();
        }
    }
}
