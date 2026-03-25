//230255639 - Aidan Barends
//Date Completed 25 March

package za.ac.cput.repository;

public interface IRepository <T,ID>{

    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}
