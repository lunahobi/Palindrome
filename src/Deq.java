public class Deq extends Queue{
    private final static int DEFSIZE = 16;
    public Deq(int capacity){
        array = new char[capacity];
        clear();
    }
    public Deq(){
        this(DEFSIZE);
    }
    //Вернуть индекс предыдущего за данным элемента.
    public int backward(int index) {
        return --index >= 0 ? index : size()-1;
    }
    //Добавить число в начало дека
    public void pushFront(char val) throws Exception{
        if(++size > array.length)
            throw new Exception();
        array[head = backward(head)] = val;
    }
    //Получить последний элемент дека (не удаляя его).
    public char back() throws Exception {
        if(empty())
            throw new Exception();
        return array[tail];
    }
    //Удалить последний элемент дека.
    public char popBack() throws Exception {
        char val = back();
        tail = backward(tail);
        size -= 1;
        return val;
    }
}
