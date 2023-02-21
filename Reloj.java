public class Reloj extends Thread {
    int segundos;

    public Reloj(int segundos){
        this.segundos= segundos;
    }

    public void run(){
        for(int i = 0; i < this.segundos; i++){
            try {
                sleep(1000);
                System.out.println( getName() + ": " +(i+1) + "s");
            } catch (Exception e) {
                
            }
        }
        System.out.println(getName() + " ha terminado");
    }
}
