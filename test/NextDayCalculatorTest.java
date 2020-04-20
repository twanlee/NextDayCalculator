import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDay() {
        Date date = new Date(2020,4,20);
        Date expected = new Date(2020,4,21);
        Date result = NextDayCalculator.nextDay(date);
        assertEquals(result,expected);

    }
}