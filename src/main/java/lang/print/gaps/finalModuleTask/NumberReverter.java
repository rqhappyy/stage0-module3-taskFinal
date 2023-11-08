package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundred = number%10*100;
        int ed = number/100;
        int med = number%100/10*10;
        int result = ed + med + hundred;
        System.out.println(result);
    }
}
