public class Main {
    public static void main(String[] args) {
        int [] arr={6,47,5757,74348,838,564,66};
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i= 0;i< arr.length;i++){
            if (max<arr[i])
                max = arr[i];
            if (min>arr[i])
                min = arr[i];
            sum += arr[i];
        }
        System.out.println("Максимальное значение "+max);
        System.out.println("Минимальное значение "+min);
        System.out.println("Сумма всех элементов "+sum);
        System.out.println("Длинна мастива " +arr.length);
    }
}