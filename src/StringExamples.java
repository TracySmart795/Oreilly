public class StringExamples {
    public static void main(String[] args){

        String colors = "blue, red, green, orange, purple";
        String[] colorsArray = colors.split(", ");
        for(String color : colorsArray){
            System.out.println(color);
        }

        addTwoNumbers(5, 9);

        
    }
    public static void addTwoNumbers(int numberOne, int numberTwo){
        System.out.println(numberOne + numberTwo);
            
    }
}
