package za.co.no9.util;

public class EnumerationUtils {
    public static <T> Optional<T> first(FilteredEnumeration<T> enumeration) {
        return enumeration.hasMoreElements() ? Optional.of(enumeration.nextElement()) : Optional.<T>empty();
    }

    public static <T> long size(FilteredEnumeration<T> enumeration) {
        long size = 0;
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement();
            size += 1;
        }
        return size;
    }
}
