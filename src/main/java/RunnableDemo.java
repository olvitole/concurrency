
public class RunnableDemo {

    public static void main(String args[]){
        Runnable task = () -> System.out.println("Hello from Olvi");
        Thread thread = new Thread(task);
        thread.start();
    }

}
