// STEP FOR POP OPERATION IN STACK

// STEP 1 -> Check Under Flow
// if ( isEmpty(){
// sout("stack is overlfow');

// STEP 2 -> Stoere top elemt data into another variable
/// int v = STACK[] = top;

// STEP 3 -> Decrease top by 1
// top--;

// STEP 4 => return the deleted element


public class StackPop {

    static int STACK[] = new int[5];
    static int top = -1;
    public static  boolean isEmpty(){
        return  top == -1;
    }
    public static boolean isFull(){
        return  top == STACK.length - 1;
    }

    public static int pop(){
        // check underflow condtion
        int v = -1;
        if ( isEmpty()){
            System.out.println("Stack is underflow");
        }
        else{
            // assign data into another variable
            v = STACK[top];

            // decreaes top by 1m
            top--;

        }

        // return deleted element
        return v;
    }

    public static void display(){
        if ( isEmpty()){
            System.out.println("Stack is emppty");
        }
        else{
            System.out.println("Print  data of the stack");
            for ( int i = top ; i >= 0 ; i--){
                System.out.println("--->" + STACK[i]);
            }
        }
    }

    public static void main(String args[]){


    }
}
