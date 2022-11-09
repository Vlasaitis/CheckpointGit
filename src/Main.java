public class Main {
    public static void main(String[] args) {
        System.out.println("Some text");
        ExtraClass extra = new ExtraClass("Vytis");
        extra.printName();
        HappyPrint hello = new HappyPrint("Vytis");
        hello.printGreeting();
    }
}