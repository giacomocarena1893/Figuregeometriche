public class Rettangolo extends Forma{
    private double lunghezza;
    private double altezza;



public Rettangolo (double lunghezza, double altezza){
    this.lunghezza = lunghezza;
    this.altezza = altezza;
}


public double area(){
    return lunghezza * altezza;
}

public double perimeter(){
    return 2*(lunghezza + altezza);
}
}