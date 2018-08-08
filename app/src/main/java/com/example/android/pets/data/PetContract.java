package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {

    private PetContract() {
    }

    public static class PetEntry implements BaseColumns {
        public static final String TABLE_NAME = "pets";

        public static final String COLUMN_PET_ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "subtitle";
        public static final String COLUMN_PET_BREED = "subtitle";
        public static final String COLUMN_PET_GENDER = "subtitle";
        public static final String COLUMN_PET_WEIGHT = "subtitle";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
