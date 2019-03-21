/**
 * 
 */

/**
 * @author maflo
 *
 */
public class Association <K,V>{
    
    protected K theKey;
    protected V theValue;

    public Association(K key, V value)
    {
        
        theKey = key;
        theValue = value;
    }

    public Association(K key)
    {
        this(key,null);
    }

    public boolean equals(Object other)
    {
        Association<?, ?> otherAssoc = (Association<?, ?>)other;
        return getKey().equals(otherAssoc.getKey());
    }
    
    public int hashCode()
    {
        return getKey().hashCode();
    }
    public V getValue()
    {
        return theValue;
    }

    public K getKey()
    {
        return theKey;
    }

    public V setValue(V value)
    {
        V oldValue = theValue;
        theValue = value;
        return oldValue;
    }
    
}