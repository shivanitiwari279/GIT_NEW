package lecture6;

//LOCAL VARIABLE ACCESSIBILITY

//public class variable_type {
//    public static void main(String[] args){
//        int a=5;
//        System.out.println(a);
//    }
//}

//STATIC VARIABLE ACCESSIBILITY

//public class variable_type {
//     static int a=5;
//    public static void main(String[] args){
//        System.out.println(a);
//    }
//}

//NON-STATIC VARIABLE ACCESSIBILITY

public class variable_type {
    int a=5;
    public static void main(String[] args){
        variable_type obj=new variable_type();
        System.out.println(obj.a);
    }
}