
public class Samsung implements Phone {

    public static void main(String[] args) {

        Samsung samsung = new Samsung();
        samsung.call();
        samsung.sms();
    }
    @Override
    public void call() {
        System.out.println("Phone is calling");
    }

    @Override
    public void sms() {
        System.out.println("SMS is sending");
    }
}


// in git ignore
//.idea target out
//pwd
//git checkout
//git pull
//git merge master