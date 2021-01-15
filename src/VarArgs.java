public class VarArgs {
    public static void main(String args[]) {
        String[] strings = {"One", "Two"};
        printStrings("One", "Two", "Three");
        printStrings(strings);
        printStrings();
    }

    public static void printStrings(String... strings){
        for(String s : strings){
            System.out.println(s);
        }
    }
}
