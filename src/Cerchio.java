public class Cerchio extends Forma {
    private double raggio;

    public Cerchio(double raggio){

        this.raggio = raggio;
    }

    public double area() {
        return Math.PI * Math.pow(raggio, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * raggio;
}

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

}