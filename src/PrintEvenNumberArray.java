public class PrintEvenNumberArray {

    public static void PrintEvenNumberArray(){
        int[] arrayNumber = new int[20];
        int index = 0;

        for (int i = 1; i <= 40; i++) {
            if (i % 2 == 0) {
                arrayNumber[index] = i;
                index++;
            }
        }

        for (int number : arrayNumber) {
            System.out.print(number + "\t");
        }
    }

}
