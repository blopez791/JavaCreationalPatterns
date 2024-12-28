package org.example.prototype;

public interface IPrototype<T extends IPrototype> extends Cloneable{
    /**
     * Clonación simple
     * @return
     */
    public T clone();

    /**
     * Clonacion profunda
     * @return
     */
    public T deepClone();
}
