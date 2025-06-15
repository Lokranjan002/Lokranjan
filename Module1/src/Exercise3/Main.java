package Exercise3;

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer.Builder()
            .setCPU("Intel i7")
            .setRAM("16GB")
            .setStorage("512GB SSD")
            .build();
        pc.showSpecs();
    }
}
