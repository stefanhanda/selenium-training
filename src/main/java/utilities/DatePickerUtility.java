package utilities;

public class DatePickerUtility extends Utility
{
    /*
    * Method for transforming the month name into number AND verify if the month has 31 days
    * ======================================================================================
    * e.g. month = March ---> month = 03
    * IF Day passed is 31 but the month doesn't have 31 days ==>> go back one month
    */
    public static String getMonthNumberAndCheckDay(String month, String day)
    {
        if (month == null || month.isEmpty()) {
            throw new IllegalArgumentException("Month name cannot be null or empty");
        }

        // Normalize input to handle case-insensitivity
        month = month.trim().toLowerCase();

        int monthNumber;
        boolean has31Days = false;
        switch (month) {
            case "january":
                monthNumber = 1;
                has31Days = true;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                has31Days = true;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                has31Days = true;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                has31Days = true;
                break;
            case "august":
                monthNumber = 8;
                has31Days = true;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                has31Days = true;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                has31Days = true;
                break;
            default:
                throw new IllegalArgumentException("Invalid month name: " + month);
        }
        // Format the number as two digits
        if(!has31Days && day.equals("31"))
        {
            monthNumber -=1;
        }
        return String.format("%02d", monthNumber);
    }
}