package linkedList;


import java.util.Stack;

public class MyLindekList {
    LinkedElement head;

    //1) on ajoute 5 au debut de la liste  5-> 18(head) -> 218 ->928

    void addHead(int newValue){
        LinkedElement elementToAdd = new LinkedElement(newValue);//(5,null)
        elementToAdd.setNext(head);//(5, 18)
        head = elementToAdd; //l'element ajouté devient le nouveau head
    }

    //2) on ajoute  99 a la fin de la liste  5(head)-> 18 -> 218 ->928 --99

    void insertTail (int val){
        LinkedElement elementToAdd = new LinkedElement(val);//(99, null)
        if(head == null){
            head = elementToAdd;
            return;
        }
        LinkedElement cursor = head;
        while (cursor.getNext() != null){
            cursor = cursor.getNext();
        }
        cursor.setNext(elementToAdd);//l'ancien tail update son next pour etre son next.
    }

    void printList(){
        LinkedElement cursor = head;
        while (cursor != null){
            System.out.print(cursor.getValue()+ " -> ");
            cursor = cursor.getNext();
        }
    }

    boolean isPalindrome() {
    // on cree notre stack
        Stack<LinkedElement> stack = new Stack<>(); // Stack de java liste qui respect le LIFO
    // on identifie le milieu de la list
        LinkedElement fast = this.head;
        LinkedElement slow = this.head;

    // identifier le milieu de la list
            while ((fast != null) && (fast.getNext() != null)) {
                stack.push(slow);
                slow = slow.getNext();
                fast = fast.getNext().getNext();
            }
            while (!stack.isEmpty() && slow != null){
                LinkedElement stackTop = stack.pop();
                if(stackTop.getValue() != slow.getValue()) return false;
                slow = slow.getNext();
            }
            if (stack.isEmpty() && slow == null) return true;

            return false;
        }



    public static void main(String[] args) {
    MyLindekList myLindekList = new MyLindekList();
    // 52 -> 111 -> 88
        myLindekList.insertTail(52);
        myLindekList.insertTail(111);
        myLindekList.insertTail(88);

        // afficher
        myLindekList.printList();
        // tester si palindrome
        myLindekList.isPalindrome();

    }
}
