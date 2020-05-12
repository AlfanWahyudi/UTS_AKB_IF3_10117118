package com.example.tugas_uts_akb_if3_10117118.Data.Sqlite;

import android.provider.BaseColumns;
/** NIM : 10117118
 * Nama : Alfan Wahyudi
 * Kelas : IF-3
 * Tanggal : 12-05-2020**/

public class DatabaseAtribut {

    static String TABLE_NAME = "friend";

    public static final class NoteColumns implements BaseColumns {
        public static String NIM = "nim";
        public static String NAMA = "nama";
        public static String KELAS = "kelas";
        public static String TELPON = "telpon";
        public static String EMAIL = "email";
        public static String INSTAGRAM = "ig";
        public static String DATE = "date";
    }
}
