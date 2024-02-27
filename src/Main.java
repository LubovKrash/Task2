//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int start = 200;
        int amount = 1500;
        int bonus = amount / 100;
        int total;
        if (amount > 1000) {
            total = start + amount + bonus;
        } else {
            total = start + amount;
        }
        System.out.println(total);
    }
}