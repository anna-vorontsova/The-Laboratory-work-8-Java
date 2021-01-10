/*Выполнить пример 1 из раздела 2.
Отработать код с помощью отладчика и привести скриншоты
минимум трех точек обработанных отладчиком.*/

package DSD_manual;
class Lab8exe4 { // КЛАСС – СТРУКТУРА ЭЛЕМЕНТА СПИСКА
    public int value; // значение
    public Lab8exe4 next; // поле – ссылка (указатель) на следующий узел
    Lab8exe4(int value, Lab8exe4 next) { // конструктор класса
        this.value = value;
        this.next = next;
    }}
class DSD_manual { // ГЛАВНЫЙ КЛАСС
    public static void main(String[] args) { // создание несвязанных узлов с помощью конструктора
        Lab8exe4 node0 = new Lab8exe4(0, null); // 0-й узел – будет головой в списке
        Lab8exe4 node1 = new Lab8exe4(1, null); Lab8exe4 node2 = new Lab8exe4(2, null);
        Lab8exe4 node3 = new Lab8exe4(3, null); // последний узел – будет хвостом в списке
// связывание узлов в список с помощью ссылок
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        // вывод списка с использованием вспомогательной переменной ref,
        // соответствующей текущему значению ссылки при прохождении по списку
        Lab8exe4 ref = node0; // для перемещения по списку достаточно помнить голову
        while (ref != null) {
        System.out.print(" " + ref.value);
        ref = ref.next;
    } }}


