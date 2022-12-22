public class Main {
    public static void main(String[] args) {
        String name = "Павел";
        String str = "Прыгать на одной ноге рано утром одной";
        System.out.println(name);
        System.out.println("Длинна имнеи равна: " + name.length());
        if (name.equals("Павел"))
            System.out.println(1);
        else
            System.out.println(0);
        System.out.print("Перенос\nстроки");
        System.out.println("\tТабуляция");
        System.out.println("Спец смволы\\,\"");
        String str1 = "Сложение ";
        String str2 = "строк";
        System.out.println(str1 + str2);
        System.out.println("Замена " + str.replace("одной ноге", "двух ногах"));
        System.out.println(str.contains("на"));
        System.out.println(str.startsWith("Прыгать") & str.endsWith("утром"));
        System.out.println(str.charAt(6));
        System.out.println(str.indexOf("одной"));
        System.out.println(str.lastIndexOf("одной"));
    }
}