package Atividade_12_1;

public interface IPilha {
    public boolean Push(Object info);
    public Object Pop();
    public Object top(); //retorna sem removê-lo
    public boolean isEmpty();
    public int size();
}