import java.util.*;

class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(7172, "mehul");
        students.put(7171, "Digvijay");
        students.put(7148, "Dhruv");
        students.put(7199, "Vansh");
        students.put(7102, "Jainil");

        for(Integer eno: students.keySet());
        {
            System.out.println(eno + "-" +students.get(eno));
        }

    }
}
