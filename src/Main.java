public class Main {
    public static void main(String[] args) {
        System.out.println(isGoodDay(20, 23));
        System.out.println(isGoodDay(10, 15));
        System.out.println(isGoodDay(35, 19));
        System.out.println(isGoodDay(52, 40));
        System.out.println(isGoodDay(5, 30));
    }
// Hi Sensei
    public static String isGoodDay(int age, int temperature) {
        if (age >= 20 && age >= 45 && temperature >= -20 && temperature >= 30) {
            return "Можно идти гулять";
        } else if (age <= 20 && temperature <= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature >= 20) {
            return "Можно идти гулять";
        } else {
            return "Отавайтесь дома";
        }
    }
}





