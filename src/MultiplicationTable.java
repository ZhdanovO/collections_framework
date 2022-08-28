public class MultiplicationTable {
    public void printInConsole() {
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 10; k++) {
                System.out.print(k * i + " ");
            }
            System.out.println("");
        }
    }
}
