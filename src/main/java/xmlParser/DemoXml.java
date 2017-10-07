package xmlParser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.net.URL;

public class DemoXml {
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(Rss.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Rss sc = (Rss) unmarshaller.unmarshal(new URL("https://www.anekdot.ru/rss/export_j.xml"));
        System.out.println(sc.channel.item[1].description);
    }
}
