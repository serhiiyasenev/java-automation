package xmlParser;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Item {


    @XmlElement(name="title")
    public String title;

    @XmlElement(name="link")
    public String link;

    @XmlElement(name="description")
    public String description;

}
