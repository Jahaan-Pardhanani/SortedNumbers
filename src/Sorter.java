import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Sorter {
    ArrayList<Double> arrayInput;
    ArrayList<Double> arrayOutput = new ArrayList<>();

    public Sorter(ArrayList<Double> arrayInput, String order) {
        this.arrayInput = arrayInput;

        int arrayStartSize = arrayInput.size();

        for (int i = 0; i < arrayStartSize; i++) {
            if (Objects.equals(order, "<")) {
                this.arrayOutput.add(Collections.min(this.arrayInput));
                this.arrayInput.remove(Collections.min(this.arrayInput));
            } else if (Objects.equals(order, ">")) {
                this.arrayOutput.add(Collections.max(this.arrayInput));
                this.arrayInput.remove(Collections.max(this.arrayInput));
            }
        }
    }

    public ArrayList<Double> getArrayOutput() {
        return arrayOutput;
    }
}