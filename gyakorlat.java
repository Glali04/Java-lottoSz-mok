import java.util.Random;

public class gyakorlat {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            writeList(generateLotoNumbers());
        }
    }
    public static int[] generateLotoNumbers() {
        int[] listOfLotoNumbers = new int[7];
        Random random = new Random();
        int number = random.nextInt(9) +1;
        listOfLotoNumbers[0] = number;
        for (int index = 1; index < listOfLotoNumbers.length; index++) {
            do {
                number = random.nextInt(9) +1;
            } while (alreadyHave(listOfLotoNumbers, number));
            listOfLotoNumbers[index] = number;
        }
        return listOfLotoNumbers;
    }

    public static boolean alreadyHave(int[] list, int generatedNumber) {
        for (int index = 0; index < list.length; index++) {
            if (list[index] == generatedNumber) {
                return true;
            }
        }
        return false;
    }

    public static void writeList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
        System.out.println();
    }
}
