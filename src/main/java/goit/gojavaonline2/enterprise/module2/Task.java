package goit.gojavaonline2.enterprise.module2;

public interface Task<E> {
    void execute();

    E getResult();

}
