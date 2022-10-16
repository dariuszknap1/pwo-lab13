package pwo.lab13.app;

public class ProcessData {

    public enum Action {
        UNDEFINE, SUM, MAX
    }

    public Double process(Action action, double[] numbers) {
        switch (action) {
            case SUM:
                return sum(numbers);
            case MAX:
                return max(numbers);
            default:
                return null;
        }
    }

    /*
 Sumuje liczby przekazane jako tablica i zwraca wynik.
 Jeżeli tablica jest pusta, to zwraca null.
     */
    private Double sum(double[] numbers) {
        if(numbers.length == 0)
            return null;
        
        double sumOfNumbers = 0;
        for(int i =0; i < numbers.length; i++)
        {
            sumOfNumbers += numbers[i];
        }
        return sumOfNumbers;
    }

    /*
 Przeszukuje przekazaną tablicę liczb i zwraca
 maksymalną. Jeżeli tablica jest pusta, to zwraca null.
     */
    private Double max(double[] numbers) {
        if(numbers.length == 0)
            return null;
        
        double maxNumber = numbers[0];
        for(int i =1; i < numbers.length; i++)
        {
            if(numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }
        return maxNumber;
    }
}
