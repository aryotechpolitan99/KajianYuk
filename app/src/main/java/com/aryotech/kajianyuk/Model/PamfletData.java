package com.aryotech.kajianyuk.Model;

import com.aryotech.kajianyuk.R;

import java.util.ArrayList;

public class PamfletData {

    private static String[] pamfletName = {
            "Ust. Asep Sobari, Lc",
            "Ust. Ubaidillah Chalid, Lc",
            "Ust. Anto Apriyanto, M.E.I",
            "Ust. Syukron Muchtar, Lc",
            "Ust. Lucky B Rouf",
            "Ust. Maqbullah Zein, MA",
            "Ust. Khoirudin",
            "Ust.Kemal Adityawarman, Lc",
            "Syaikh Ahmad Al Misry",
            "Coach Evants Afrian Nugraha"
    };

    private static String[] pamfletDetails = {

            "SIRAH DAN PERADABAN ISLAM UNTUK GENERASI MILENIAL",
            "QADHA DAN QADAR DALAM RUKUN IMAN",
            "MENJADI PEDAGANG AHLI SURGA",
            "MENEJEMEN CINTA",
            "PERSIAPAN PRA DAN PASCA NIKAH",
            "FIQIH MUNAKAHAT DAN ARTI CIINTA",
            "DAUROH KITAB AR-RISALAH AL-JAMIAH WAT-TADZKIRATUN NAFIAH",
            "ADAB, ULAMA PUN MEMPELAJARINYA",
            "MENJADI PRIBADI BERAKHLAK AL QUR'AN",
            "STRATEGI PEBISNIS BERTAHAN DI TENGAH PANDEMI"
    };

    private static int[] pamfletImages = {

            R.drawable.asep_sobari,
            R.drawable.ubaidillah,
            R.drawable.anto_apriyanto,
            R.drawable.syukron,
            R.drawable.lucky,
            R.drawable.maqbullah,
            R.drawable.khoirudin,
            R.drawable.kemal,
            R.drawable.ahmad_almisry,
            R.drawable.evants
    };

    private static String[] pamfletDate = {

            "Ahad, 27 Oktober 2019",
            "Ahad, 10 November 2019",
            "Ahad, 17 November 2019",
            "Ahad, 24 November 2019",
            "Ahad, 15 Desember 2019",
            "Ahad, 1 Desember 2019",
            "Ahad, 1 Maret 2020",
            "Ahad, 14 Juni 2020",
            "Ahad, 26 April 2020",
            "Ahad, 16 Mei 2020"
    };

    private static String[] pamfletTime = {
            "Pukul. 09.30 - 11.30 WIB",
            "Pukul. 09.30 - 11.30 WIB",
            "Pukul. 09.30 - 11.30 WIB",
            "Pukul. 09.30 - 11.30 WIB",
            "Pukul. 09.30 - 11.30 WIB",
            "Pukul. 09.30 - 11.30 WIB",
            "Pukul. 09.30 - 11.30 WIB",
            "Pukul. 09.30 - 11.30 WIB",
            "Pukul. 09.30 - 11.30 WIB",
            "Pukul. 16.00 - 17.00 WIB"
    };

    private static String[] pamfletLocation = {

            "Masjid Asy Syarif Al Azhar BSD",
            "Masjid Asy Syarif Al Azhar BSD",
            "Masjid Asy Syarif Al Azhar BSD",
            "Masjid Asy Syarif Al Azhar BSD",
            "Masjid Asy Syarif Al Azhar BSD",
            "Masjid Asy Syarif Al Azhar BSD",
            "Masjid Asy Syarif Al Azhar BSD",
            "Live on Instagram @sahabatkarib",
            "Live on Instagram @sahabatkarib",
            "Live on Instagram @sahabatkarib"
    };

    private static String[] description = {

            "Yukkk pahami dan ketahui lebih dalam tentang Sirah dan Peradaban Islam, sebagai kaum milenial kita wajib tahu tentang sejarah islam",
            "Kali ini akan membahas tentang Qadha dan Qadar. Apakah sama dengan takdir dan nasib? bisa kah diubah? yuuk cari tahu di kajian ini",
            "Kajian kali ini akan membahas bagaimana menjadi pedagang ahli surga. Memangnya ada pedagang ahli neraka? Mari kita hadiri bersama kajian ini",
            "Perlukah menejemen cinta? Kali ini kita akan membahas menejemen cinta agar gak kebablasan",
            "Mari persiapkan apa saja yang diperlukan dalam pernikahan baik sebelum dan sesudahnya",
            "Ingin menikah? Ketahui dahulu tentang fiqih pernikahan, agar segalanya lancar dan membawa keberkahan",
            "Kitab ini akan membahas Aqidah, Fiqih dan Akhlak karangan Al Habib Ahmad bin Zein Al Habsy",
            "Sebelum belajar pentingnya kita mengetahui adab-adabnya terlebih dahulu",
            "Bagaimana cara menjadi pribadi berakhlak Al Qur'an, Syaik Ahmad Al Misry akan membahasnya pada kajian kali ini",
            "Di masa pandemi hampir semua sektor bisnis terkena dampaknya. Bagaimana cara agar tetap bertahan dan survive di masa pandemi ini"
    };

    public static ArrayList<Pamflet>getListData(){

        ArrayList<Pamflet> list = new ArrayList<>();
        for (int position = 0; position < pamfletName.length; position++){

            Pamflet pamflet = new Pamflet();
            pamflet.setName(pamfletName[position]);
            pamflet.setDetail(pamfletDetails[position]);
            pamflet.setPhoto(pamfletImages[position]);
            pamflet.setDate(pamfletDate[position]);
            pamflet.setDesc(description[position]);
            pamflet.setTime(pamfletTime[position]);
            pamflet.setLoc(pamfletLocation[position]);
            list.add(pamflet);
        }

        return list;
    }
}
