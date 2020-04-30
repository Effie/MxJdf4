package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SubProductType {
    INVALID(0),
    PRODUCT_HARD_COVER_BOOKS(1),
    PRODUCT_PAPERBACK_BOOKS(2),
    PRODUCT_PERFECT_BOOKLETS(3),
    PRODUCT_WIRO_BOOKLETS(4),
    PRODUCT_LOOP_BOOKLETS(5),
    PRODUCT_STAPLED_BOOKLETS(6),
    PRODUCT_MAGAZINES(7),
    PRODUCT_CATALOGS(8),
    PRODUCT_BOOKLETS(9),
    PRODUCT_ZINES(10),
    PRODUCT_COMIC_BOOKS(11),
    PRODUCT_ART_PRINTS(12),
    PRODUCT_MANGA(13);

    private final int value;

    SubProductType(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }
}
