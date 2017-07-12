package trelloApi.models;

public class ListOfCards {

    public String id;
    public String name;
    public String desc;

    public ListOfCards (String id, String name, String desc)
    {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "ListOfCards{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

