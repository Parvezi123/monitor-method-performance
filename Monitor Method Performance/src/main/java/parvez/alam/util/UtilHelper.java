package parvez.alam.util;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

public class UtilHelper {

    public Long currentTimeFormatted() {
        return System.currentTimeMillis()/1000;
    }
}
