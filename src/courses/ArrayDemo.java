package courses;
/**
 * Arrays are used for collections with a capped length. While lacking flexibility they offer better optimization.
 */
public class ArrayDemo {
    int arrayLength = 10;
    int[] numberArray = new int[arrayLength]; //an array has a max length
    
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
