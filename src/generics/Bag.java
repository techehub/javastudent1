package generics;

public class Bag <T> {

    T [] items;

    public Bag(int size)
    {
        items=  (T[]) new Object [size];
    }

    public T getItems(int index) {

        return items[index];
    }

    public void keepItems(T item, int i)
    {
        this.items[i] = (T)item;
    }

    public T[] getItems(){
        return (T[])items;
    }

}
