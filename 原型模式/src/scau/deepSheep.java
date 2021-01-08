package scau;

import java.io.Serializable;

public class deepSheep implements Serializable,Cloneable {
    public String name;
    public deepSheep(String name){
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
