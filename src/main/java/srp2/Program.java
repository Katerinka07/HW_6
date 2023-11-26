package srp2;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        InputOrderData inputOrderData = new InputOrderData(order);
        inputOrderData.inputFromConsole();
        SaveFile saveFile = new SaveFile(order);
        saveFile.saveToJson();



    }
}
