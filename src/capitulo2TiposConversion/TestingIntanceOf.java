package capitulo2TiposConversion;

import java.util.Calendar;
import java.util.Date;

public class TestingIntanceOf {
    public static void main(String[] args){
        Object obj = Calendar.getInstance();
        Date timeCalendar = new Date();
        long time = 0;

        if(obj instanceof Calendar){
            timeCalendar = ((Calendar)obj).getTime();
        }

        if(obj instanceof Date){ // no ingresa en este if
            time = ((Date)obj).getTime();
        }

        System.out.println("Timepo calendario: " + timeCalendar);
        System.out.println("Tiempo: " + time);
    }
}
