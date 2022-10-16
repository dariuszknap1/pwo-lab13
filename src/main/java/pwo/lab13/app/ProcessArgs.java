package pwo.lab13.app;

import java.util.List;
import java.util.ArrayList;
import pwo.lab13.app.ProcessData.Action;

public class ProcessArgs {

    /*
 Wyszukuje w tablicy stringów pozycję, która może być
 zinterpretowana jako wartość typu ProcessData.Action.
 Wielkość czcionki nie ma znaczenia. Obowiązuje
 pierwsze dopasowanie. Jeżeli nie znajdzie to zwraca
 wartość UNDEFINE.
     */
    public static Action getAction(String[] args) {
        for (int i = 0; i < args.length; i++) {
            args[i] = args[i].toUpperCase();
            if (args[i].contains(Action.MAX.toString())) {
                return Action.MAX;
            }
            if (args[i].contains(Action.SUM.toString())) {
                return Action.SUM;
            }
        }
        return Action.UNDEFINE;
    }

    /*
 Wyszukuje w tablicy stringów pozycje, które mogą być
 zinterpretowane jako liczby. Tworzy z tych liczb
 tablicę. Jeżeli nie ma liczb to zwraca pustą tablicę.
     */
    public static double[] getNumbers(String[] args) {
        //double[] numbers = new double[args.length - 1];
        List<Double> numbers = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            try {
                numbers.add(Double.parseDouble(args[i]));
            } catch (NumberFormatException e) {

            }
        }
        if (numbers.isEmpty()) {
            double[] empty = {};
            return empty;
        }
        double[] nums = numbers.stream().mapToDouble(Double::doubleValue).toArray();
        return nums;
    }
}
