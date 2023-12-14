public class Main {
    public static void main(String[] args) {
        int amount = 10_840; // Стоимость совершенной нами покупки
        int bonus = 20; // За каждые 20 рублей покупки начисляется 1 миля

        if (amount > 20) {
            System.out.println("Вам начислены мили за покупку:" + amount / 20);
        }
    }
}