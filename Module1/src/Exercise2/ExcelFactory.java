package Exercise2;


//ExcelFactory.java
public class ExcelFactory extends DocumentFactory {
 public Document createDocument() {
     return new ExcelDocument();
 }
}