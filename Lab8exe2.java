/*Создать приложение с использованием рекурсии
для перевода целого числа, введенного с клавиатуры, в двоичную систему счисления. */



public class Lab8exe2 {
    public static int converse(int n) {
if (n == 0)
return 0;
else
return (n % 2 + 10 * converse(n/ 2));
}
public static void main(String[] args){
        int n = 8;
System.out.println("The binary count from decimal " + n + " is " + converse(n));
}
}
