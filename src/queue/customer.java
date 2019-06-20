package queue;

import java.util.Comparator;

public class customer {
    private int id;
    private String name;

    public customer(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  static Comparator<customer> idComparator = new Comparator<customer>(){
        @Override
        public int compare(customer c1,customer c2){
            return c2.id-c1.id;
        }
    };
    @Override
    public String toString(){
        return "{id:"+id+",name:"+name+"}";
    }
}
