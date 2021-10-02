public class CircularQueue implements ICharQ {
    //кольцевая очередь
        private final char[] q; //массив для хранения элементов очереди
        private int putloc, getloc; //индексы вставляемых и извлекаемых элементов
        //создание пустой очереди заданного массива
        public CircularQueue (int size) {
            q=new char[size+1];//выделение памяти под очередь
            putloc=getloc=0;
        }
        //помещение символа в очередь
        public void put (char ch) {
            /* Очередь считается полной, если индекс putloc на единицу меньше индекса getloc
            или если индекс putloc указывает на конец массива, а индекс getloc - на его начало */
            if(putloc+1==getloc| ((putloc==q.length-1) & (getloc==0))) {
                System.out.println("Очередь заполнена");
                return;
            }
            putloc++;
            if (putloc== q.length) putloc=0;
            q[putloc]=ch;
        }
        //извлечение символа из очереди
        public char get() {
            if(getloc==putloc) {
                System.out.println("Очередь пуста");
                return (char) 0;
            }
            getloc++;
            if(getloc==q.length) getloc = 0;//возвращение в начало очереди
            return q[getloc];
        }
    }

