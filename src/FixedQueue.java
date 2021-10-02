public class FixedQueue implements ICharQ{
    //Класс, реализующий очередь фиксированного размера для хранения символов
    private char q []; //массив для хранения элементов очереди
    private int putloc, getloc; //индексы вставляемых и извлекаемых элементов
    // создание пустой очереди заданного размера
    public FixedQueue (int size) {
        q=new char[size+1];//выделение памяти для очереди
        putloc=getloc=0;
    }
    //помещение символа в очередь
    public void put(char ch) {
        if(putloc==q.length-1) {
            System.out.println("Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc]=ch;

    }
    //извлечение символа из очереди
    public char get() {
        if (getloc==putloc) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}

