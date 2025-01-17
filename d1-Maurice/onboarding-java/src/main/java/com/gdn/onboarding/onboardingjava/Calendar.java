package com.gdn.onboarding.onboardingjava;

public class Calendar {
    private Calendar (){}

    private static class CalendarHelper{
        private static final Calendar INSTANCE = new Calendar();
    }

    public String getMonth(int value) {
        String result;
        switch (value) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                return null;
        }
        return result;
    }

    public static Calendar getInstance(){
        return CalendarHelper.INSTANCE;
    }
}
