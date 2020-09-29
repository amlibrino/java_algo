package linkedList;

public class LinkedElement {
    private int value;//valeur
    private LinkedElement next;//reference a l'element suivant

    //conscructeur
    public LinkedElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //setteur pour remplir le champs next
    public void setNext(LinkedElement next) {
        this.next = next;
    }

    public LinkedElement getNext() {
        return next;
    }
}
