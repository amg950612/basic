public class Sony implements Phone {

    public static void main(String[] args) {

        Sony sony = new Sony();
        sony.call();
        sony.sms();

    }

    @Override
    public void call() {
        System.out.println("Sony is calling");
    }

    @Override
    public void sms() {
        System.out.println("SMS is sending");
    }
}
