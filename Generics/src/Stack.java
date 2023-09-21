import java.util.*;

public class Stack<T> {
    
    private ArrayList<T> stk_list; 

    public Stack<T>()
    {
        stk_list = new ArrayList<T>();
    }
    public void push(T new_val)
    {
        stk_list.add(new_val);
    }

    public T pop()
    {
        T obj_removed = stk_list.get(0);
        stk_list.remove(0);
        return obj_removed;
    }
}
