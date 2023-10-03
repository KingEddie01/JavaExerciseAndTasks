import MentruationCycleApplication.MenstrualCycle;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

    public class MenstrualCycleTest {

        @Test
        public void testPeriodStartDate() {
            MenstrualCycle menstrualCycle = new MenstrualCycle();
            LocalDate previousPeriodEndDate = LocalDate.of(2023, 1, 1);
            int cycleDuration = 28;

            LocalDate result = menstrualCycle.periodStartDate(previousPeriodEndDate, cycleDuration);

            LocalDate expectedStartDate = LocalDate.of(2023, 1, 29);

            assertEquals(expectedStartDate, result);
        }

        @Test
        public void testPeriodEndDate() {
            MenstrualCycle menstrualCycle = new MenstrualCycle();
            LocalDate previousPeriodEndDate = LocalDate.of(2023, 1, 1);
            int periodDuration = 5;
            LocalDate result = menstrualCycle.periodEndDate(previousPeriodEndDate, periodDuration);
            LocalDate expectedEndDate = LocalDate.of(2023, 1, 6);
            assertEquals(expectedEndDate, result);
        }

        @Test
        public void testOvulationStartDate() {
            MenstrualCycle menstrualCycle = new MenstrualCycle();
            LocalDate previousPeriodEndDate = LocalDate.of(2023, 1, 1);
            int cycleDuration = 28;

            LocalDate result = menstrualCycle.ovulationStartDate(previousPeriodEndDate, cycleDuration);

            LocalDate expectedOvulationStartDate = LocalDate.of(2023, 1, 15);

            assertEquals(expectedOvulationStartDate, result);
        }

        @Test
        public void testOvulationEndDate() {
            MenstrualCycle menstrualCycle = new MenstrualCycle();
            LocalDate previousPeriodEndDate = LocalDate.of(2023, 1, 1);
            int cycleDuration = 28;

            LocalDate result = menstrualCycle.ovulationEndDate(previousPeriodEndDate, cycleDuration);

            LocalDate expectedOvulationEndDate = LocalDate.of(2023, 1, 16);

            assertEquals(expectedOvulationEndDate, result);
        }

        @Test
        public void testFirstSafePeriodStartDate() {
            MenstrualCycle menstrualCycle = new MenstrualCycle();
            LocalDate previousPeriodEndDate = LocalDate.of(2023, 1, 1);
            int periodDuration = 5;
            int cycleDuration = 28;

            List<LocalDate> result = menstrualCycle.firstSafePeriodStartDate(previousPeriodEndDate, periodDuration, cycleDuration);

            LocalDate expectedSafeDate1 = LocalDate.of(2023, 1, 7);
            LocalDate expectedSafeDate2 = LocalDate.of(2023, 1, 8);
            LocalDate expectedSafeDate3 = LocalDate.of(2023, 1, 9);

            assertEquals(List.of(expectedSafeDate1, expectedSafeDate2, expectedSafeDate3), result);
        }

        @Test
        public void testFirstSafePeriodEndDate() {
            MenstrualCycle menstrualCycle = new MenstrualCycle();
            LocalDate previousPeriodEndDate = LocalDate.of(2023, 1, 1);
            int cycleDuration = 28;

            LocalDate result = menstrualCycle.firstSafePeriodEndDate(previousPeriodEndDate, cycleDuration);

            LocalDate expectedEndDate = LocalDate.of(2023, 1, 18);

            assertEquals(expectedEndDate, result);
        }

        @Test
        public void testUnSafePeriodStartDate() {
            MenstrualCycle menstrualCycle = new MenstrualCycle();
            LocalDate previousPeriodEndDate = LocalDate.of(2023, 1, 1);
            int cycleDuration = 28;
            int periodDuration = 5;

            LocalDate result = menstrualCycle.unSafePeriodStartDate(previousPeriodEndDate, cycleDuration, periodDuration);

            LocalDate expectedUnSafeStartDate = LocalDate.of(2023, 1, 8);

            assertEquals(expectedUnSafeStartDate, result);
        }

        @Test
        public void testUnSafePeriodEndDate() {
            MenstrualCycle menstrualCycle = new MenstrualCycle();
            LocalDate previousPeriodEndDate = LocalDate.of(2023, 1, 1);
            int cycleDuration = 28;

            LocalDate result = menstrualCycle.unSafePeriodEndDate(previousPeriodEndDate, cycleDuration);

            LocalDate expectedUnSafeEndDate = LocalDate.of(2023, 1, 18);

            assertEquals(expectedUnSafeEndDate, result);
        }

        @Test
        public void testNextSafePeriodDate() {
            MenstrualCycle menstrualCycle = new MenstrualCycle();
            LocalDate previousPeriodEndDate = LocalDate.of(2023, 1, 1);
            int cycleDuration = 28;
            int periodDuration = 5;

            List<LocalDate> result = menstrualCycle.nextSafePeriodDate(previousPeriodEndDate, cycleDuration, periodDuration);

            LocalDate expectedSafeDate1 = LocalDate.of(2023, 1, 12);
            LocalDate expectedSafeDate2 = LocalDate.of(2023, 1, 13);
            LocalDate expectedSafeDate3 = LocalDate.of(2023, 1, 14);

            assertEquals(List.of(expectedSafeDate1, expectedSafeDate2, expectedSafeDate3), result);
        }
    }


