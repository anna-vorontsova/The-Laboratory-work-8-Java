/*Разработать проект, в котором для ввода, вывода и изменения односвязного линейного списка создать следующие методы:
а) с использованием цикла:
– ввод с головы createHead();
– ввод с хвоста createTail();
– вывод (возвращается строка, сформированная из элементов списка) dispToString();V
– добавление элемента в начало списка AddFirst();V
– добавление элемента в конец списка AddLast();V
– вставка элемента в список с указанным номером Insert();V
– удаление элемента с головы списка RemoveFirst();V
– удаление последнего элемента списка RemoveLast();V
– удаление из списка элемента с указанным номером Remove();V
а) с использованием рекурсии:
– ввод с головы createHeadRec();
– ввод с хвоста createTailRec();
– вывод (возвращается строка, сформированная из элементов списка) toStringRec().
*/
public class Lab8exe6_1 {
static class Link {
        public int iData; // Данные
        public Link next; // Следующий элемент в списке
        public Link(int id) // Конструктор
        {
            iData = id; // Инициализация данных
        }

        public void displayLink(){ // Вывод содержимого элемента
            {
                System.out.print(iData + ", ");
            }
    }}

static class LinkList {
    //класс LinkList содержит один элемент данных ссылку first, last на первый и последний элемен списка
    private Link first; // Ссылка на первый элемент списка
    private Link last; // Ссылка на последний элемент списка

    public LinkList() {// Конструктор LinkList
        first = null; // Список не содержит элементов
        last = null;
            }

    public boolean isEmpty() // true, если список пуст
    {
        return first == null;
    }

    // Вставка элемента в начало списка AddFirst
/*Выполнение метода начинается с создания нового элемента на основании данных, переданных в аргументах.
Затем ссылки изменяются так, чтобы оно first указывало на только что вставленный элемент.е:*/
    public Link AddFirst(int id) {
        Link newLink = new Link(id); // Создание нового элемента через конструктор Link
        if (isEmpty()) // Если список пуст,
            last = newLink; // newLink <-- last
        newLink.next = first; // newLink --> старое значение first
        first = newLink; // first --> newLink
        return newLink;

    }


    //добавление элемента в конец списка AddLast
    public Link AddLast(int id) {
        Link newLink = new Link(id); // Создание нового элемента
        if (isEmpty()) // Если список пуст,
            first = newLink; // first --> newLink
        else
            last.next = newLink; // Старое значение last --> newLink
        last = newLink;
        return newLink;

    }

//вставка элемента в список с указанным номером Insert();
public Link Insert(int idnew){
    Link insertLink = new Link(idnew);
        Link t = first;
    int k =1;
        while (t.next!=null&&(k<2)){
t=t.next;
k++;}
    insertLink.next=t.next.next;
        t.next=insertLink;
    return insertLink;
}




    // Удаление элемента c головы RemoveFirst
//в поле first заносится ссылка на второй элемент (который находится по значению поля next в первом элементе):
    public int RemoveFirst() {
        System.out.println("Delete from head (RemoveFirst): ");
        int tempFirst = first.iData; // Сохранение ссылки
        if (first.next == null) ;
        last = null;
        first = first.next;
        return tempFirst;
    }
    // Удаление элемента c хвоста RemoveLast
   public void RemoveLast() {
       System.out.println("Delete from Tail (RemoveLast): ");

       if (first == null || first.next == null) {
           return;
       }
       Link tmp = first;
       while (tmp.next.next != null) {
           tmp = tmp.next;
       }
       tmp.next = null;
   }
       //удаление из списка элемента с указанным номером Remove();
       public void Remove(int key) {
           System.out.println("Delete from any place (Remove): ");
           Link current = first; // Поиск элемента
           Link previous = first;
           while(current.iData != key)
           {
               if(current.next == null)
                   return; // Элемент не найден
               else
               {
                   previous = current; // Перейти к следующему элементу
                   current = current.next;
               }
           } // Совпадение найдено
           if(current == first) // Если первый элемент,
               first = first.next; // изменить first
           else // В противном случае
               previous.next = current.next; // обойти его в списке

       }


public void dispToString() {
            System.out.print("List: ");
            Link current = first; // От начала списка
            while (current != null) // Перемещение до конца списка
            {
                current.displayLink(); // Вывод данных
                current = current.next; // Переход к следующему элементу
            }
            System.out.println("");
 }
}

//class LinkListApp{
public static void main(String[] args) {
    LinkList theList = new LinkList();
    ; // Создание нового списка
    theList.AddFirst(10); // Вставка элементов
    theList.AddFirst(11);
    theList.AddFirst(12);
    theList.AddLast(15);
    theList.AddLast(14);
    theList.AddLast(13);

    theList.dispToString(); // Вывод содержимого списка
    // while( !theList.isEmpty() ) // Пока остаются элементы,
// Добавление элемента с головы AddFirst
    Link aLink = theList.AddFirst(21);
    System.out.print("Add from head (AddFirst): "); // Вывод удаленного элемента
    aLink.displayLink();
    System.out.println("");
    theList.dispToString();
// Добавление элемента с хвоста AddLast
    Link bLink = theList.AddLast(25);
    System.out.print("Add from tail (AddLast): ");
    bLink.displayLink();
    System.out.println("");
    theList.dispToString();

//добаление элемента в любое место Insert
    Link сLink = theList.Insert(15);
    System.out.print("Insert in any place (Insert): ");
    сLink.displayLink();
    System.out.println("");
    theList.dispToString();

// Удаление элемента c головы RemoveFirst
    theList.RemoveFirst();
    theList.dispToString();

// Удаление элемента c хвоста RemoveLast
    theList.RemoveLast();
    theList.dispToString();

// Удаление заданного элемента Remove
    theList.Remove(15);
    theList.dispToString();
}}