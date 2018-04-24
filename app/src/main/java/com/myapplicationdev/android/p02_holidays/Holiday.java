package com.myapplicationdev.android.p02_holidays;

public class Holiday {
    private String holidayName;
    private String date;

    public Holiday(String holidayName, String date) {
        this.holidayName = holidayName;
        this.date = date;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
