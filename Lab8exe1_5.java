/*Создать приложения для демонстрации примеров 1 – 5 из раздела 1.
Для примера 5 дополнительно вывести последовательность обхода дерева рекурсивных вызовов.
Отработать код с помощью отладчика и привести скриншоты минимум трех точек обработанных отладчиком. */



public class Lab8exe1_5 {
    public static int fibo(int n) {
        if (n==0){
            return 0;
        }else
        if (n==1){ return 1;
        } else {
            return fibo(n-2)+fibo(n-1);
        }}
        public static void main(String[] args) {
        int n = 6;
            System.out.print("The Fibonacci count from "+n+ " is "+fibo(n));
    }}
