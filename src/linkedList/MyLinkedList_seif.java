package linkedList;

public class MyLinkedList_seif {

    LinkedElement head;


// 5 ->  18 (head) -> 218 -> (928, elemetToAdd)  -->99

    void insertHead(int newValue) {

        LinkedElement elementToAdd = new LinkedElement(newValue);// (5, null)
        elementToAdd.setNext(head); //(5, 18)
        head = elementToAdd; //l element ajouté devient le nouveau head
    }

    void insertTail(int val) {
        LinkedElement elementToAdd = new LinkedElement(val);// (99, null)
        if (head == null) {
            head = elementToAdd;
            return;
        }
        LinkedElement cursor = head;
        while (cursor.getNext() != null) {
            cursor = cursor.getNext();
        }
        cursor.setNext(elementToAdd); //l'ancien tail update son next
    }

    void printList() {
        LinkedElement cursor = head;
        while (cursor != null) {
            System.out.print(cursor.getValue() + "--");
            cursor = cursor.getNext();
        }
    }

    String[] createArrayFromList() {
        String result = "";
        String delimiter = ",";
        LinkedElement cursor = head;
        while (cursor != null && cursor.getNext() != null) {
            result += cursor.getValue() + delimiter;
            cursor = cursor.getNext();
        }
        result += cursor.getValue();
        String[] split = result.split(delimiter);// 1 | 2 |3  => {1, 2,3}
        return split; //"125"
    }

    private boolean isPalindromeTableau(String[] array) {
        if(array == null || array.length <= 1) return true;
        int i = 0;
        int length = array.length - 1;
        while (i < length / 2) {
            String left = array[i];
            String right= array[length - i];
            if (!left.equals(right)) { // pour comparer 2 strings, jamais utiliser == ou !=
                return false;
            }
            i++;
        }
        return true;
    }
   /* boolean isPalindrome() {
        //  11 -> 2222 -> 2222 -> 11

// on implémente 2 curseurs fast et slow

        Stack<LinkedElement> stack = new Stack<>(); //stack de java

        //identifier milieu de la liste
        LinkedElement fast = this.head;
        LinkedElement slow = this.head;
        while ((fast != null) && (fast.getNext() != null)) {  //1+>2->3-  > 3  --> 2 - 1-> 4;    1221; 1 2 1 2 1
                stack.push(slow);   // stack :  ;  2eme moitie : 4
                slow = slow.getNext();
                fast = fast.getNext().getNext();
        }

          // )à ce niveau, slow pointe au milieu de la linkedlist
       while(!stack.isEmpty() && slow != null) {
           LinkedElement stackTop = stack.pop();
           if(stackTop.getValue() != slow.getValue()) return false;
           slow = slow.getNext();
       }
       if(stack.isEmpty() && slow == null) return true;
        return false;
    }

*/

    public static void main(String[] args) {
        MyLinkedList_seif myLinkedList = new MyLinkedList_seif();
        // 52 -> 111 ->88
        myLinkedList.insertTail(52);
        myLinkedList.insertTail(111);
        myLinkedList.insertTail(52);

        //print list
        myLinkedList.printList();

        //tester si palindrome
        String[] array = myLinkedList.createArrayFromList();
        boolean isPalindrome = myLinkedList.isPalindromeTableau(array);
        System.out.println("\n isPalindrome : " + isPalindrome);
    }
}
