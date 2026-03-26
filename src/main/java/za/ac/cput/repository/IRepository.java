//Date Completed 25 March

package za.ac.cput.repository;

import java.util.List;

public interface IRepository <T,ID>{

    T create (T t);
    T read (ID id);
    T update(T t);
    boolean delete(ID id);
    List<T> getAll();
}
