class ObjectCounter {
    private static int count = 0;

    ObjectCounter() {
        count++;
        if (count == 5) {
            System.out.println("Will Do...");
        } else if (count < 5) {
            System.out.println("Too Less...");
        } else {
            System.out.println("Exceeding the Limits...");
        }
    }

    static int getObjectCount() {
        return count;
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();
        ObjectCounter obj4 = new ObjectCounter();
        ObjectCounter obj5 = new ObjectCounter();
        ObjectCounter obj6 = new ObjectCounter();
    }
}
