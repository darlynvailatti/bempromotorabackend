package architecture.util;

import java.text.MessageFormat;

public class EnsuresThat {

    public static void isTrue(boolean expression, String messageValidation, Object... objects) throws Exception{
        if(expression) return;

        if(ExpectThat.isNullAndEmpty(messageValidation)){
            String defaultMessageValidation = "is not a true expression";
            throwNewCustomMessageValidationBussinesLogicException(defaultMessageValidation);
            return;
        }
        throwNewCustomMessageValidationBussinesLogicException(messageValidation, objects);
    }

    public static void isFalse(boolean expression, String messageValidation, Object... objects) throws Exception{
        if(!expression) return;

        if(ExpectThat.isNullAndEmpty(messageValidation)){
            String defaultMessageValidation = "is not a false expression";
            throwNewCustomMessageValidationBussinesLogicException(defaultMessageValidation);
            return;
        }
        throwNewCustomMessageValidationBussinesLogicException(messageValidation, objects);
    }

    public static void isNotNull(Object object, String messageValidation, Object... parameters) throws Exception {
        if(ExpectThat.isNotNull(object)) return;

        if(ExpectThat.isNullAndEmpty(messageValidation)){
            String defaultMessageValidation = "{0} cannot be NULL";
            String formatedMessageValidation = getFormatedMessageValidation(defaultMessageValidation, object.getClass().getSimpleName());
            throwNewCustomMessageValidationBussinesLogicException(formatedMessageValidation);
        }

        throwNewCustomMessageValidationBussinesLogicException(messageValidation, parameters);

    }

    public static void isNull(Object object, String messageValidation, Object... parameters) throws Exception {
        if(ExpectThat.isNull(object)) return;

        if(ExpectThat.isNullAndEmpty(messageValidation)){
            String defaultMessageValidation = "{0} cannot be NULL";
            String formatedMessageValidation = getFormatedMessageValidation(defaultMessageValidation, object.getClass().getSimpleName());
            throwNewCustomMessageValidationBussinesLogicException(formatedMessageValidation);
        }

        throwNewCustomMessageValidationBussinesLogicException(messageValidation, parameters);
    }

    private static void throwNewCustomMessageValidationBussinesLogicException(String messageValidation, Object... objects) throws Exception {
        String formatedMessageValidation = getFormatedMessageValidation(messageValidation, objects);
        throw new Exception(formatedMessageValidation);
    }

    private static void throwNewCustomMessageValidationBussinesLogicException(String messageValidation) throws Exception {
        throw new Exception(messageValidation);
    }

    private static String getFormatedMessageValidation(String messageValidation, Object... objects){
        return MessageFormat.format(messageValidation, objects);
    }
}
