package by.epam.stone.model.exception;

public class XMLReaderException extends Exception {
    public XMLReaderException() {
    }

    public XMLReaderException(String message) {
        super(message);
    }

    public XMLReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public XMLReaderException(Throwable cause) {
        super(cause);
    }

    public XMLReaderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
