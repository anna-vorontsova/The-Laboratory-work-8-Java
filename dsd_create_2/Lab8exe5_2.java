/*Создать два проекта, в которых продемонстрировать два способа создания линейного однонаправленного списка
(с головы и с хвоста) согласно примеру 2 из второго раздела.
 Отработать код с помощью отладчика и привести скриншоты минимум трех точек обработанных отладчиком
 */
package dsd_create_2;
public class Lab8exe5_2 {

        public int value; public Lab8exe5_2 next;
        Lab8exe5_2(int value, Lab8exe5_2 next) {
            this.value = value; this.next = next; }}
    class dsd_create_2 {
        public static void main(String[] args) {
            Lab8exe5_2 head = null;
            for (int i = 9; i >= 0; i--) {
                head = new Lab8exe5_2(i, head);}
            Lab8exe5_2 ref = head;
            while (ref != null) {
                System.out.print(" " + ref.value);
                ref = ref.next; }
        }}
