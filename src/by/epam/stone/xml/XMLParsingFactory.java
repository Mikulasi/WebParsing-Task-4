package by.epam.stone.xml;

public class XMLParsingFactory {

    private static XMLParsingFactory instance;
    private static SAXParser saxParser;
    private static DOMParser domParser;
    private static StAXParser staxParser;

    public static XMLParsingFactory getInstance() {
        if (instance == null) {
            instance = new XMLParsingFactory();
        }
        return instance;
    }


    public SAXParser getSAXParser() {
        if (saxParser == null) {
            saxParser = new SAXParser();
        }
        return saxParser;
    }

    public DOMParser getDOMParser() {
        if (domParser == null) {
            domParser = new DOMParser();
        }
        return domParser;
    }

    public StAXParser getStAXReader() {
        if (staxParser == null) {
            staxParser = new StAXParser();
        }
        return staxParser;
    }

}