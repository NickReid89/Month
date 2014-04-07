public class Month {

    // month of month object as a variable.
    public int monthNumber;

    // Months of the year. I put the array up here to avoid redundent code in the SetMonth and Get Month method.
    final static String[] months = {"Janurary", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    // Defualt contructor
    public Month() {
        monthNumber = 1;
    }

    // Allows user to put in month.
    public Month(int month) {
        if (month > -1 && month < 12) {
            monthNumber = month;
        } else {
            monthNumber = 1;
        }
    }

    // Returns a month  number match to a string.
    public Month(String month) {

        for (int i = 0; i < months.length; i++) {
            if (months[i].toString().equals(month)) {
                monthNumber = i;
            }
        }

    }

    // set an object of the Month class to a new month.
    public void SetMonthNumber(int month) {
        if (month > 0 && month < 12) {
            monthNumber = month - 1;

        } else {
            monthNumber = 1;
        }

    }

    // Sends the month as an int back to the user.
    public int GetMonthNumber() {
        return monthNumber + 1;
    }

    // Sends the months name as a string to the user.
    public String GetMonthName() {
        return months[monthNumber].toString();
    }

    // Over rides the toString method and calls GetMonthName and returns the month as a string.
    @Override
    public String toString() {

        return GetMonthName();
    }

    // Checks if months are equal.
    public boolean equals(Month month) {
        return this.monthNumber == month.monthNumber;

    }

    // checks if month is greater.
    public boolean greaterThan(Month month) {
        return month.monthNumber > this.monthNumber;

    }

    // checks if month is less.
    public boolean lessThan(Month month) {
        return month.monthNumber < this.monthNumber;

    }

}
