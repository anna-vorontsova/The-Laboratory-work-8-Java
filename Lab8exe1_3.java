/*Создать приложения для демонстрации примеров 1 – 5 из раздела 1.
Для примера 5 дополнительно вывести последовательность обхода дерева рекурсивных вызовов.
Отработать код с помощью отладчика и привести скриншоты минимум трех точек обработанных отладчиком. */



public class Lab8exe1_3 {
            private static int step=0;
        public static void m(int x) {
            space();
            System.out.print(""+x+"-> ");
            step++;
            if ((2*x+1) <20) {
                m(2*x+1);
            }
            step --;
            space();
            System.out.print(" "+x+" <-");
        }
        public static void space() {
            for (int i = 0; i < step; i++) {
                System.out.print(" ");
            }
        }
        public static void main(String[] args) {
            m(1);
        }
    }

