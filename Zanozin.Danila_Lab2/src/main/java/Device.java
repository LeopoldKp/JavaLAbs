public class Device implements Observerable{
    int temp;
    int press;
    int hum;

    public void notifyOb(int t, int p, int h) {
        if (t==temp && p==press && h==hum)
            return;

        if (t!=temp) {
            System.out.println("The temperature has changed: " + t);
            temp = t;
        }

        if (p!=press) {
            System.out.println("The pressure has changed: " + p);
            press = p;
        }

        if (h!=hum) {
            System.out.println("Humidity has changed: " + h);
            hum = h;
        }
    }
}
