package architecture.util;

public class ConfirmaQue {

    public static <T> boolean naoEhNulo(T t){
        return t != null;
    }

    public static <T> boolean ehNulo(T t) {
        return t == null;
    }
}
