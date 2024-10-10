package com.hakancivelek.b2bshop.cleanarch.domain.model.util;

import java.util.UUID;

public class RandomStringGenerator {

    public static String generatate(int length) {
        UUID uuid = UUID.randomUUID();
        String idString = uuid.toString().substring(0, length-1).replaceAll("_", "");
        return idString;
    }
}
