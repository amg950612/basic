
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

interface Phone
{
    void call();
    void sms();
}

// in git ignore
//.idea target out
//pwd
//git checkout
//git pull
//git merge master