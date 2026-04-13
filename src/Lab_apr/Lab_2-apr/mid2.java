public class mid2 {
    public static int count = 0;

    public static boolean t(){
        count++;
        return true; 
    }
    public static boolean f(){
        count++;
        return false;
    }

    public static void main(String[] args) {
        if(t()){
            if(t() || f()){
                System.out.println("true");
            }
            if(t() && f()){
                System.out.println("false");
            } 
            if(!(t() && f())){
                System.out.println("true");}
            } 
            if(f()){
                System.out.println("welcome to false land");
            } 
            System.out.println("total count: "+count); }
        }
// result
//true
//true
// total count: 7