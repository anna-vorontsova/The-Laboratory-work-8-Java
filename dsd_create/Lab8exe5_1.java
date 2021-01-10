/*Создать два проекта, в которых продемонстрировать два способа создания линейного однонаправленного списка
(с головы и с хвоста) согласно примеру 2 из второго раздела.
 Отработать код с помощью отладчика и привести скриншоты минимум трех точек обработанных отладчиком
 */


package dsd_create;
    class Lab8exe5_1 {
        public int value; public Lab8exe5_1  next;
        Lab8exe5_1(int value, Lab8exe5_1 next) {
            this.value = value; this.next = next;
}}
    class dsd_create {
        public static void main(String[] args) {
            Lab8exe5_1 head=new Lab8exe5_1(0, null); Lab8exe5_1 tail=head;
            for (int i = 0; i <9; i++) { tail.next=new Lab8exe5_1(i+1, null);
                tail=tail.next; }
            Lab8exe5_1 ref = head;
            while (ref != null) { System.out.print(" " + ref.value); ref = ref.next;
} }}
