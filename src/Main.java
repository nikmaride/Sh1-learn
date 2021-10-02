public class Main {

    public static void main(String[] args) {
        FixedQueue q1;
        q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3;
        q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        //Помещение ряда символов в очередь фиксированного размера
        for(i=0; i < 10; i++)
            iQ.put((char) ('A'+i));
        //Отображение содержимого очереди
        System.out.println("Содержимое фиксированной очереди: ");
        for (i=0; i<10; i++) {
            ch=iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ= q2;
        //помещение ряда символов в динамическую модель
        for(i=0; i < 10; i++)
            iQ.put((char)('Z'-i));
        //отображение элементов очереди
        System.out.print("Содержимое динамической очереди: ");
        for (i=0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();

        iQ = q3;
        //помещение ряда символов в кольцевую очередь
        for (i=0; i < 10; i++)
            iQ.put((char)('A'+i));
        //отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i=0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        //помещение больше символов в кольцевую очередь
        for (i=10; i < 20; i++)
            iQ.put((char)('A'+i));
        //отображение содержимого очереди
        System.out.print("Содержимое кольцевой очереди: ");
        for (i=0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println("\nCoxpaнeниe и использование данных" +
                " кольцевой очереди");
        //помещение символов в кольцевую очередь и извлечение их оттуда
        for (i=0; i < 20; i++) {
            iQ.put ( (char) ( 'А' + i));
            ch = iQ.get() ;
            System.out.print(ch);
        }

    }
    }

