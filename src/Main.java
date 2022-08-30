import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arrayInput = new ArrayList<>();

        Scanner lengthInput = new Scanner(System.in);
        System.out.println("Length of list: ");
        int length = Integer.parseInt(lengthInput.next());

        for (int i = 0; i < length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Add number: ");
            arrayInput.add(Double.parseDouble(input.next()));
        }

        Scanner sortInput = new Scanner(System.in);
        System.out.println("Type '<' to go from least to greatest; Type '>' to go from greatest to least: ");
        String sortType = sortInput.next();

        Sorter sorter = new Sorter(arrayInput, sortType);

        int arraySize = sorter.getArrayOutput().size();

        for (int i = 0; i < arraySize; i++) {
            System.out.println(sorter.getArrayOutput().get(i));
        }
    }
}