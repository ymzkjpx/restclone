package rest.clone.valid;


import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class DateTimeValicatorUsingDateTImeFormat implements DateTimeValidator{
    private String  dateTimeFormat;

    public DateTimeValicatorUsingDateTImeFormat(String textDateTime){
        this.dateTimeFormat = textDateTime;
    }

    @Override
    public boolean isValid(String textDateTime) {
        DateFormat dateFormat = new SimpleDateFormat(this.dateTimeFormat);
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(textDateTime);
        }catch (ParseException e){
            return false;
        }
        return true;
    }
}
