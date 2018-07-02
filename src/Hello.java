
public class Hello implements Phone {

    public static void main(String[] args) {

        Hello hello = new Hello();
        hello.call();
        hello.sms();
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