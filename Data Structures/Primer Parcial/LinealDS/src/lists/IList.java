/*
 */
package lists;
/*
 */
public interface IList <T>{
    
    public void add(T e);
    public void add(int i, T e);
    public T buscar(T e);
    public void obtener(int i);
    public void remove(int i);
    public void remove(T e);
    public T siguiente(int pos);
    public T siguiente(T e);
    public T previo(int i);
    public T previo(T e);
    public void clear();
    public T peek();
    public String print();
    
}
