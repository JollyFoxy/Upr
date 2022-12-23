public class Main {
    public static void main(String[] args) {
        String name = "Павел";
        String str = "Прыгать на одной ноге рано утром одной";
        System.out.println(name);
        System.out.println("Длинна имнеи равна: " + name.length());
        if (name.equals("Павел"))
            System.out.println("Привет"+name);
        else
            System.out.println("Привет кто бы ты ни был");
        System.out.print("Перенос\nстроки");
        System.out.println("\tТабуляция");
        System.out.println("Спец смволы\\,\"");
        String str1 = "Сложение ";
        String str2 = "строк";
        System.out.println(str1 + str2);
        System.out.println("Замена " + str.replace("одной ноге", "двух ногах"));
        System.out.println("Нличие подстроки \"на\" в строке "+str.contains("на"));
        System.out.println("Проверка на то что: строка начинаеться на \"Прыгать\", а заканчиваеться на \"одной\" "+(str.startsWith("Прыгать") & str.endsWith("одной")));
        System.out.println("Седьмой символ строки "+str.charAt(6));
        System.out.println("Индекс первого вхождения подстроки \"одной\" в строку "+str.indexOf("одной"));
        System.out.println("Индекс последнего вхождения подстроки \"одной\" в строку  "+str.lastIndexOf("одной"));
    }
}