public interface vehiculo {
    void mover();
}
class Automovil implements vehiculo{
    @java.lang.Override
    public void mover() {
        System.out.println("Se mueve utilizando un motor");
    }
}
class Bicicleta implements vehiculo{
    @java.lang.Override
    public void mover() {
        System.out.println("Se mueve pedaleando");
    }
}
class Motocicleta implements vehiculo{
    @java.lang.Override
    public void mover() {
        System.out.println("Se mueve utilizando un motor");
    }
}
 class MainInterface{
    public static void main(String[] args){
        Automovil miAutomovil = new Automovil();
        miAutomovil.mover();

        Bicicleta miBicicleta = new Bicicleta();
        miBicicleta.mover();

        Motocicleta miMotocicleta = new Motocicleta();
        miMotocicleta.mover();
    }
}