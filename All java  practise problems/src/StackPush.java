
public class StackPush {

    static int STACK [] = new int[5];
    static int top = -1; //member data or instance class

    public static boolean isEmpty(){
        return top == -1;
    }
    public static boolean isFull(){
        return top == STACK.length-1;
    }

    public static void push(int data){
        // STEP 1: TO CHECK OVER FLOW
        if(isFull()){
            System.out.println("Stack over flow");

        }
        // STEP 2 : INCREASE TOP BY 1
        top++;

        // STEP 3 : ASSIGN VALUE INTO THE STACK
        STACK[top] = data;
        System.out.println("Data insert into the stack is success");

    }

    public static void display(){
        if ( isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Print Data of the Stack");
            for ( int i = top; i >= 0 ; i--){
                System.out.println("====>" + STACK[i]);
            }
        }
    }
    public static void main (String args[]){
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        display();
    }

}

