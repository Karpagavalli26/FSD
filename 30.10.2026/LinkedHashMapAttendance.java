package Oct_30;

import java.util.*;

public class LinkedHashMapAttendance {
    public static void main(String args[]) {

        LinkedHashMap<String, String> attendance = new LinkedHashMap<>();

        attendance.put("Monday", "Present");
        attendance.put("Tuesday", "Absent");
        attendance.put("Wednesday", "Present");
        attendance.put("Thursday", "Present");

        System.out.println("Attendance Details:");

        for (String day : attendance.keySet()) {
            System.out.println(day + " : " + attendance.get(day));
        }
    }
}