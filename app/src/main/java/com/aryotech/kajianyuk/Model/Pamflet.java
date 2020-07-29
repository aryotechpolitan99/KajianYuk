package com.aryotech.kajianyuk.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Pamflet implements Parcelable {

    private String date;
    private String desc;
    private String name;
    private String detail;
    private String time;
    private String loc;
    private int photo;

    public Pamflet(String date, String desc, String name, String detail, String time, String loc, int photo) {
        this.date = date;
        this.desc = desc;
        this.name = name;
        this.detail = detail;
        this.time = time;
        this.loc = loc;
        this.photo = photo;
    }

    protected Pamflet(Parcel in) {
        date = in.readString();
        desc = in.readString();
        name = in.readString();
        detail = in.readString();
        time = in.readString();
        loc = in.readString();
        photo = in.readInt();
    }

    public Pamflet() {

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(date);
        dest.writeString(desc);
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeString(time);
        dest.writeString(loc);
        dest.writeInt(photo);
    }

    public static final Creator<Pamflet> CREATOR = new Creator<Pamflet>() {
        @Override
        public Pamflet createFromParcel(Parcel in) {
            return new Pamflet(in);
        }

        @Override
        public Pamflet[] newArray(int size) {
            return new Pamflet[size];
        }
    };
}
