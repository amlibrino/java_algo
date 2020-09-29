package class_abstraite;

public  class cloun extends Cirque{

    // la class fille est obligé de prendre la méthode du cirque
    @Override
    public void mouvement() {
        System.out.println("je bouge ");
    }
}
