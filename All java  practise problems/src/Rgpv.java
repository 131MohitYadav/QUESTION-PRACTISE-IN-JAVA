//abstract  class Rgpv {
//
//    public abstract void lab();
//    public abstract  void cctv();
//    public  void copyCheck(){
//        System.out.println("This is copycheck method");
//
//    }
//    // college is child class if we extends any abstract  so we declaer child class also abstract clsss

//    abstract  class College extends Rgpv{
//
//
//    }
//
//
//}


abstract  class Rgpv{
    // default constructor

    public Rgpv(){
        System.out.println("This is Rgpv class cosntructor");
    }
    public abstract void lab();
    public abstract void cctv();
    public abstract void Attendance();
    public void copyCheck(){
        System.out.println("This is Copy check method of Rgpv class and this is non abstract method");
    }
}

// Child class
class  College extends Rgpv{
    public  College(){
        System.out.println("This is college class constructor");

    }
    public void cctv(){
        System.out.println("This is Rgpv cctv method");
    }
    public void lab(){
        System.out.println("This is rgpv lab method");
    }
    public  void staff(){
        System.out.println("This is college staff method");
    }


    public void Attendance() {
        System.out.println("This is rgpv attendance");

    }

    public static void main(String args[]){
        Rgpv r = new College(); // cannot create object of abstract class but child
        // can take reference of abstract class
        r.cctv();
        r.lab();
        r.copyCheck();


        System.out.println("<----------------------------------->");
        // for calling  college class method  or we  create object of child class kiyu ki vo abstract nhi hai

        College c = new College();
        c.cctv();
        c.lab();
        c.copyCheck();
        c.staff();

    }
}
