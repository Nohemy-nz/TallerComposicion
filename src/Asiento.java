public class Asiento{
    private String codigo;
    private boolean ocupado;

    public Asiento(String codigo){
        this.codigo = codigo;
        ocupado = false;
    }

    public String getCodigo(){
        return codigo;
    }

    public boolean getOcupado(){
        return ocupado;
    }

    public void ocupar(){
        if (ocupado == true){
            System.out.println("El asiento " + codigo + " ya esta ocupado");
        }else{
            ocupado = true;
            System.out.println("Asiento " + codigo + " ocupado");
        }
    }

    public void liberar(){
        ocupado = false;
        System.out.println("Asiento " + codigo + " liberado");
    }

    public void mostrarEstado() {

        if (ocupado == true) {
            System.out.println("Asiento " + codigo + ": ocupado");
        } else {
            System.out.println("Asiento " + codigo + ": libre");
        }
    }

}