package by.epam.stone.model.exception;

public class XMLReaderSAXException extends XMLReaderException {
    public XMLReaderSAXException() {
    }

    public XMLReaderSAXException(String message) {
        super(message);
    }

    public XMLReaderSAXException(String message, Throwable cause) {
        super(message, cause);
    }

    public XMLReaderSAXException(Throwable cause) {
        super(cause);
    }

    public XMLReaderSAXException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
