public class DynQueue implements ICharQ{
    //динамическая очередь
        private char[] q; //массив для хранения элементов очереди
        private int putloc, getloc; //индексы вставляемых и извлекаемых элементов

        //Создание пустой очереди
        public DynQueue (int size) {
            q=new char[size+1];//выделение памяти под очередь
            putloc=getloc=0;
        }
        public void put (char ch) {
            if (putloc==q.length-1) {
                char t[] = new char[q.length * 2];
                for (int i=0; i < q.length; i++)
                    t[i] = q[i];
                q=t;
            }
            putloc++;
            q[putloc] = ch;
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

