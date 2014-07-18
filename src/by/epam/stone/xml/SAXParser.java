package by.epam.stone.xml;

import by.epam.stone.entities.Stone;
import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SAXParser {
    public static final Logger LOGGER = Logger.getLogger(SAXParser.class);
    private List<Stone> tempList;

    public List<Stone> parsingSAX(){

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            tempList = new ArrayList<>();
            javax.xml.parsers.SAXParser saxParser = saxParserFactory.newSAXParser();
            SAXHandler handler = new SAXHandler();
            saxParser.parse(new File("src/resources/stone.xml"), handler);
            for (Stone st : handler.stoneList) {
                LOGGER.info(st);
            }
        }catch (ParserConfigurationException e){
            LOGGER.error("Parser config error: " +e);
        } catch (SAXException e) {
            LOGGER.error("SAX Parser exception: " +e);
        } catch (IOException e){
            LOGGER.error("I/O exception: " +e);
        }
        return tempList;
    }
}
