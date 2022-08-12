public class ReferenceTypesInfo {

    java.util.Date today;
    String greeting = "How are you?";


    public static void main(String[] args) {
        ReferenceTypesInfo ref = new ReferenceTypesInfo();


        System.out.println(ref.today.toString());
        System.out.println(ref.greeting);
    }



}
