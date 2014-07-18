package by.epam.stone.xml;

import by.epam.stone.entities.Stone;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DOMParser {
    public static final Logger LOGGER = Logger.getLogger(DOMParser.class);

    public ArrayList<Stone> stones;

    public ArrayList<Stone> parse() {
        try {
            File fXmlFile = new File("src/resources/stone.xml");
            stones = new ArrayList<>();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            LOGGER.info("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList stoneList = doc.getElementsByTagName("stone");


            for (int temp = 0; temp < stoneList.getLength(); temp++) {

                Node nNode = stoneList.item(temp);

                LOGGER.info("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    LOGGER.info("Stone id : " + eElement.getAttribute("id"));
                    LOGGER.info("Preciousness : " + eElement.getElementsByTagName("preciousness").item(0).getTextContent());
                    LOGGER.info("Origin : " + eElement.getElementsByTagName("origin").item(0).getTextContent());
                    LOGGER.info("Color : " + eElement.getElementsByTagName("color").item(0).getTextContent());
                    LOGGER.info("Transparency : " + eElement.getElementsByTagName("transparency").item(0).getTextContent());
                    LOGGER.info("Number of faces : " + eElement.getElementsByTagName("faces").item(0).getTextContent());
                    LOGGER.info("Value : " + eElement.getElementsByTagName("value").item(0).getTextContent());

                }
            }
        } catch (ParserConfigurationException |SAXException |IOException ex){
            ex.printStackTrace();

        }return stones;
    }
}
