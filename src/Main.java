public class Main {
    public static void main(String[] args) {
        String name = "Павел";
        System.out.println(name);
        System.out.println("Длинна имнеи равна: " +name.length());
        if (name.equals("Павел"))
            System.out.println(1);
        else
            System.out.println(0);
        System.out.print("Перенос\nстроки");
        System.out.println("\tТабуляция");
        System.out.println("Спец смволы\\,\"");
        String str1="Сложение ";
        String str2="строк";
        System.out.println(str1+str2);
    }
}