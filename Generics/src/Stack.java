import java.util.*;

public class Stack<T> {
    
    private ArrayList<T> stk_list =   stk_list = new ArrayList<T>();

   
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

    public T peek()
    {
         return stk_list.get(0);
    }

    public boolean isEmpty() {
        if (stk_list.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
}
