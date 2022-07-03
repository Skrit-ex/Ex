package HomeWork;

public class PrintAbleDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Last");
        Book book2 = new Book("Srawe");
        Magazine magazine1 = new Magazine("Brav");
        Magazine magazine2 = new Magazine("SAd");

        PrintAble[] printAbles = {book1,book2,magazine1,magazine2};
        for(PrintAble printAble: printAbles){
            System.out.print(printAble);
        }


    }
}
