
public class Main {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.setNumbers(5,10);
        System.out.println(add.getResult());
        add.setNumbers(5,10,15);
        System.out.println(add.getResult());

        Subtraction minus = new Subtraction();
        minus.setNumbers(50,40);
        System.out.println(minus.getResult());
    }
}
class Calculator{
    int sum = 0;
    int difference = 0;
}

class Addition extends Calculator{
    private int num1;
    private int num2;
    private int num3;


    // Getter
    public int getResult() {
        return sum;
    }

    // Setter
    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        sum = num1 + num2;
    }
    public void setNumbers(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        sum = num1 + num2 + num3;
    }

}
class Subtraction extends Calculator{
    private int num1;
    private int num2;

    // Getter
    public int getResult() {
        return difference;
    }

    // Setter
    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        difference = num1 - num2;
    }
}
