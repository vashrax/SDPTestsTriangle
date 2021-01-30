package exceptions;

import org.slf4j.helpers.MessageFormatter;

import java.security.InvalidParameterException;

public class NotATriangleException extends InvalidParameterException {
    public NotATriangleException(String arguments) {
        super(MessageFormatter.format("Not possible to create triangle with following arguments : {}", arguments).getMessage());
    }

}
