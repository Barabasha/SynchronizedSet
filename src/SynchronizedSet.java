
public class SynchronizedSet {

    public static void main(String[] args) throws InterruptedException {
        String str = "Это механизм синхронизации не статического метода или не статического блока кода, такой, что только один поток сможет выполнить данный блок или метод на данном экземпляре класса.\n" +
                "Это нужно делать всегда, когда необходимо сделать данные на уровне экземпляра потокобезопасными.";
        Resource resourceObj = new Resource(str);
        Thread thread1 = new Thread(new ThreadSet(resourceObj));
        Thread thread2 = new Thread(new ThreadSet(resourceObj));
        thread1.start();
        thread2.start();
        Thread.sleep(1000);
        System.out.println(resourceObj.getSize());
        System.out.println(resourceObj.getSet());
        thread1.interrupt();
        thread2.interrupt();

    }
}
