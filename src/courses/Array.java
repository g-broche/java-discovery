package courses;
public class Array {
    int arrayLength = 10;
    int[] numberArray = new int[arrayLength]; //possibility to define a max length for an array
    
    public void fillArray(){
        int count = 0;
        while (count < this.arrayLength) {
            count++;
            this.numberArray[count-1] = count;
        }
    }

    public void printArray(){
        String stringifiedArray="";
        for (int i = 0; i < this.numberArray.length; i++) {
            String newStringPart = i == 0 ? "index "+i+": "+Integer.toString(numberArray[i]) : ", index "+i+": "+Integer.toString(numberArray[i]);
            stringifiedArray += newStringPart;
        }
        System.out.print(stringifiedArray);
    }
}
