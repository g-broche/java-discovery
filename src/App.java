import courses.Array;
import courses.Instruction;

public class App {
    public static void main(String[] args) throws Exception {
        
        Instruction.calculateResults();
        System.out.println();

        Array arrayDemo = new Array();
        arrayDemo.fillArray();
        arrayDemo.printArray();
        System.out.println();
    }
}
