package application;
import java.util.ArrayList;
import java.util.List;

public class Main {
    final static int CURRENT_YEAR = 2026;


    public static void main(String[] args) {

        final String GREETING_MESSAGE = "saludo estufdiantes de java";
        String[] nameStudents = {"juan", "maria", "pedro", "ana", "isa"};
        int[] birthYears = {2000, 2020, 2008, 2009, 2001};
        List<int[]> ageStudentList = new ArrayList<>();
showMessage(GREETING_MESSAGE);



        }





    static void showMessage(String message){
        System.out.println(message);
    }

    static int calculate(int bithYear) {
        return CURRENT_YEAR - bithYear;

    }



}
