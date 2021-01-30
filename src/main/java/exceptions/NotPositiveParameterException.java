package exceptions;

import org.slf4j.helpers.MessageFormatter;

import java.security.InvalidParameterException;

public class NotPositiveParameterException extends InvalidParameterException {
    public NotPositiveParameterException(String err) {
        super(MessageFormatter.format("Not positive argument : {}",err).getMessage());
    }
}
