package de.anna.utils;

import java.util.List;

public class CollectionsUtils {

    public static <T> T getLastElementOfList(List<T> list) {
        int lastIndexInDerTabelle = list.size() - 1;
        return list.get(lastIndexInDerTabelle);
    }
}
