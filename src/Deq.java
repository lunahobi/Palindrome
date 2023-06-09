public class Deq extends Queue{
    private final static int DEFSIZE = 16;
    public Deq(int capacity){
        super(capacity);
    }
    public Deq(){
        super();
    }
    //Вернуть индекс предыдущего за данным элемента.
    public int backward(int index) {
        return --index >= 0 ? index : size()-1;
    }
    //Добавить число в конец дека
    public void pushBack(char val) throws Exception{
        super.push(val);
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
    public char popFront() throws Exception{
        return super.pop();
    }
    //Удалить последний элемент дека.
    public char popBack() throws Exception {
        char val = back();
        tail = backward(tail);
        size -= 1;
        return val;
    }
}
