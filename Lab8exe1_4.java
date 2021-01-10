/*Создать приложения для демонстрации примеров 1 – 5 из раздела 1.
Для примера 5 дополнительно вывести последовательность обхода дерева рекурсивных вызовов.
Отработать код с помощью отладчика и привести скриншоты минимум трех точек обработанных отладчиком. */



public class Lab8exe1_4 {
    public static int fact(int n) {
        int result;
        if (n == 1) return 1;
        else {
            result = fact(n - 1) * n;
            return result;
        }}
        public static void main(String[] args) {
        int n = 3;
            System.out.print("The Factorial from "+n + " is "+fact(n));
    }
}
