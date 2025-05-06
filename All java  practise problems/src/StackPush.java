// There are three steps  to implements stack using in array
 // STEP 1 ->  CHECK OVER FLOW CONDITION
// if ( top == s.length -1
// STEP 2 ->  INCREASE TOP VARIABLE BY 1
// top++
/// STEP 3 -> ASSIGN  VALUE IN stack
// S[top] = data;




public class StackPush {

    static  int STACK[] = new int[5];

    // member data
    static  int top = -1;

public static boolean isEmpty(){
    return  top == -1;
}


public static boolean isFull(){
    return top == STACK.length -1;
}

public static  void push(int data){

    // check overflow
    if ( isFull()){
        System.out.println("Stack is overFlow");
    }
    // increae top by 1;
    top++;
    // Assign value into the stack
    STACK[top] = data;
    System.out.println("DAta Insert into the stack is success");
}

public static void display(){
    if(isEmpty()){
        System.out.println("Stack is empty");
    }
    else {
        System.out.println("Prind data of the stack");
        for ( int i=  top ; i >= 0 ; i--){
            System.out.print("==>" + STACK[i]);
        }
    }
}

public static void main(String args[]){
    push(10);
    push(23);
    push(40);
    push(32);
    display();
}
}
