package Week_1.Ex_2_FactoryMethod;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document.");
    }
}
