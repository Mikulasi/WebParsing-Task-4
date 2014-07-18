package by.epam.stone.model.exception;

public class XMLReaderStAXException extends XMLReaderException {
    public XMLReaderStAXException() {
    }

    public XMLReaderStAXException(String message) {
        super(message);
    }

    public XMLReaderStAXException(String message, Throwable cause) {
        super(message, cause);
    }

    public XMLReaderStAXException(Throwable cause) {
        super(cause);
    }

    public XMLReaderStAXException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
