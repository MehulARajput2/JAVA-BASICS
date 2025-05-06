import java.util.ArrayList;
import java.util.LinkedList;

class ListDemo {
    public static void main(String args[]) {
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesdayday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("saturday");
        days.add("Sunday");

        System.out.println("Weekdays=" + days);

        LinkedList<String> months = new LinkedList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        months.add("May");
        months.add("Jun");
        months.add("Jul");
        months.add("Aug");
        months.add("Sep");
        months.add("Oct");
        months.add("nov");
        months.add("Dec");
        System.out.println("Months=" + months);

    }
}
