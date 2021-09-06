package chapter10;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.*;
import java.util.Locale;

/**
 * @author YangYunhe
 * @date 2021-01-08 14:26
 * @description
 */
public class DateTimeTest {

    public static final LocalDateTime DATE_TIME = LocalDateTime.of(2021, 1, 1, 12, 0, 0);

    @Test
    public void testLocalDateTime() {
        System.out.println("------------------------------------------------------------");
        LocalDate date = LocalDate.of(2021, 1, 1);
        System.out.println(String.format("日期 \t%s", date));
        System.out.println(String.format("年份 \t%s", date.getYear()));
        System.out.println(String.format("是否是闰年 \t%s", date.isLeapYear()));
        System.out.println(String.format("月份 \t%s", date.getMonth()));
        System.out.println(String.format("几号 \t%s", date.getDayOfMonth()));
        System.out.println(String.format("星期几 \t%s", date.getDayOfWeek()));
        System.out.println(String.format("本月天数 \t%s", date.lengthOfMonth()));
        System.out.println("------------------------------------------------------------");
        LocalDate now = LocalDate.now();
        System.out.println(String.format("当前日期 \t%s", LocalDate.now()));
        System.out.println(String.format("年份 \t%s", now.get(ChronoField.YEAR)));
        System.out.println(String.format("月份 \t%s", now.get(ChronoField.MONTH_OF_YEAR)));
        System.out.println(String.format("几号 \t%s", now.get(ChronoField.DAY_OF_MONTH)));
        System.out.println("------------------------------------------------------------");
        LocalTime time = LocalTime.of(13, 45, 20);
        System.out.println(String.format("时间 \t%s", time));
        System.out.println(String.format("几点 \t%s", time.getHour()));
        System.out.println(String.format("几分 \t%s", time.getMinute()));
        System.out.println(String.format("几秒 \t%s", time.getSecond()));
        System.out.println("------------------------------------------------------------");
        LocalDate parseDate = LocalDate.parse("2014-03-18");
        LocalTime parseTime = LocalTime.parse("13:45:20");
        System.out.println(String.format("解析Date(2014-03-18)\t%s", parseDate));
        System.out.println(String.format("解析Time(13:45:20)\t%s", parseTime));
        System.out.println(String.format("创建DateTime\t%s", LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20)));
        System.out.println(String.format("创建DateTime\t%s", LocalDateTime.of(parseDate, parseTime)));
        System.out.println(String.format("创建DateTime\t%s", LocalDate.of(2021, 1, 1).atTime(LocalTime.of(12, 0, 0))));
        System.out.println(String.format("创建DateTime\t%s", LocalDate.of(2021, 1, 1).atTime(13, 13, 13)));
        System.out.println(String.format("创建DateTime\t%s", LocalTime.of(16, 48, 30).atDate(parseDate)));
        System.out.println(String.format("创建Date\t%s", DATE_TIME.toLocalDate()));
        System.out.println(String.format("创建Time\t%s", DATE_TIME.toLocalTime()));
    }

    @Test
    public void testInstant() {
        Instant instant1 = Instant.ofEpochSecond(3);
        Instant instant2 = Instant.ofEpochSecond(3, 0);
        Instant instant3 = Instant.ofEpochSecond(3, 1000000000);
        Instant instant4 = Instant.ofEpochSecond(3, -1000000000);
        System.out.println(String.format("EPOCH\t%s", Instant.EPOCH.getEpochSecond()));
        System.out.println(String.format("instant1\t%s", instant1.getEpochSecond()));
        System.out.println(String.format("instant1\t%s", instant2.getEpochSecond()));
        System.out.println(String.format("instant1\t%s", instant3.getEpochSecond()));
        System.out.println(String.format("instant1\t%s", instant4.getEpochSecond()));
    }

    @Test
    public void testDurationAndPeriod() {
        /*
         * java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Seconds
         * Duration duration2 = Duration.between(LocalDate.of(2020, 9, 28), LocalDate.of(2021, 8, 7));
         * System.out.println(String.format("duration2\t%s", duration2));
         */
        Duration duration1 = Duration.between(LocalTime.of(12, 0, 0), LocalTime.of(12, 1, 6));
        Duration duration2 = Duration.between(LocalDateTime.of(2014, 3, 8, 12, 0, 0), LocalDateTime.of(2014, 3, 18, 13, 0, 0));
        Duration duration3 = Duration.between(Instant.ofEpochSecond(100), Instant.ofEpochSecond(1048676));
        Duration duration4 = Duration.ofMinutes(3);
        Duration duration5 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(String.format("duration1\t%s", duration1.getSeconds()));
        System.out.println(String.format("duration2\t%s", duration2.getSeconds()));
        System.out.println(String.format("duration3\t%s", duration3.getSeconds()));
        System.out.println(String.format("duration4\t%s", duration4.getSeconds()));
        System.out.println(String.format("duration5\t%s", duration5.getSeconds()));
        System.out.println("------------------------------------------------------------");
        Period period1 = Period.between(LocalDate.of(2021, 8, 7), LocalDate.of(2020, 9, 28));
        Period period2 =Period.ofDays(10);
        Period period3 = Period.ofWeeks(3);
        Period period4 = Period.of(2, 6, 1);
        System.out.println(String.format("2021-08-07~2020-09-28相差年份: %s", period1.getYears()));
        System.out.println(String.format("2021-08-07~2020-09-28相差年份: %s", period1.get(ChronoUnit.YEARS)));
        System.out.println(String.format("2021-08-07~2020-09-28相差月份: %s", period1.getMonths()));
        System.out.println(String.format("2021-08-07~2020-09-28相差天数: %s", period1.getDays()));
        System.out.println(String.format("2021-08-07~2020-09-28相差时间是负数吗: %s", period1.isNegative()));
        System.out.println(String.format("2021-08-07~2020-09-28相差时间是0吗: %s", period1.isZero()));
        System.out.println(String.format("2020-01-08加上这个差值后的日期是: %s", period1.addTo(LocalDate.of(2020, 1, 8))));
        System.out.println(String.format("这个差值减去10天: %s", period1.minus(period2)));
        System.out.println(String.format("这个差值乘以3: %s", period1.multipliedBy(3)));
        System.out.println(String.format("这个差值加10天: %s", period1.plus(period1)));
        System.out.println(String.format("这个差值.negated(): %s", period1.negated()));
        System.out.println(String.format("2020-01-08减去这个差值: %s", period4.subtractFrom(LocalDate.of(2020, 1, 8))));
        System.out.println(String.format("3周的时间间隔是: %s", Period.from(period3)));
    }

    @Test
    public void testUpdate() {
        // 修改年份
        System.out.println(String.format("[2020-01-01 12:00:00]修改为2011年: [%s]", DATE_TIME.withYear(2011)));
        System.out.println(String.format("[2020-01-01 12:00:00]修改为25号: [%s]", DATE_TIME.withDayOfMonth(25)));
        System.out.println(String.format("[2020-01-01 12:00:00]修改为9月份: [%s]", DATE_TIME.with(ChronoField.MONTH_OF_YEAR, 9)));
        System.out.println(String.format("[2020-01-01 12:00:00]过3天是: [%s]", DATE_TIME.plusDays(3)));
        System.out.println(String.format("[2020-01-01 12:00:00]过3周是: [%s]", DATE_TIME.plusWeeks(3)));
        System.out.println(String.format("[2020-01-01 12:00:00]3年前是: [%s]", DATE_TIME.minusYears(3)));
        System.out.println(String.format("[2020-01-01 12:00:00]6个月后是: [%s]", DATE_TIME.plus(6, ChronoUnit.MONTHS)));
        // 2021-01-01 同月份第3个星期一
        System.out.println(String.format("[2020-01-01 12:00:00]该月第3个星期一: [%s]", DATE_TIME.with(TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.MONDAY))));
        // 2021-01-01 本月第一天
        System.out.println(String.format("[2020-01-01 12:00:00]该月第一天: [%s]", DATE_TIME.with(TemporalAdjusters.firstDayOfMonth())));
        // 2021-01-01 下月第一天
        System.out.println(String.format("[2020-01-01 12:00:00]下月第一天: [%s]", DATE_TIME.with(TemporalAdjusters.firstDayOfNextMonth())));
        // 2021-01-01 明年第一天
        System.out.println(String.format("[2020-01-01 12:00:00]明年第一天: [%s]", DATE_TIME.with(TemporalAdjusters.firstDayOfNextYear())));
        // 2021-01-01 本月第一个星期日
        System.out.println(String.format("[2020-01-01 12:00:00]该月第一个星期日: [%s]", DATE_TIME.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY))));
        // 2021-01-01 本月最后一天
        System.out.println(String.format("[2020-01-01 12:00:00]该月最后一天: [%s]", DATE_TIME.with(TemporalAdjusters.lastDayOfMonth())));
        // 2021-01-01 本年最后一天
        System.out.println(String.format("[2020-01-01 12:00:00]该年最后一天: [%s]", DATE_TIME.with(TemporalAdjusters.lastDayOfYear())));
        // 2021-01-01 最后一个星期日
        System.out.println(String.format("[2020-01-01 12:00:00]该月最后一个星期日: [%s]", DATE_TIME.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY))));
        // 2021-01-01 下一个星期日
        System.out.println(String.format("[2020-01-01 12:00:00]该月下一个星期日: [%s]", DATE_TIME.with(TemporalAdjusters.next(DayOfWeek.SUNDAY))));
        // 2021-01-01 上一个星期日
        System.out.println(String.format("[2020-01-01 12:00:00]上一个星期日: [%s]", DATE_TIME.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY))));
        // 2021-01-01 下一个星期日，如果当天就是星期日，返回当天
        System.out.println(String.format("[2020-01-01 12:00:00]下一个星期日: [%s]", DATE_TIME.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY))));
        // 2021-01-01 上一个星期日，如果当天就是星期日，返回当天
        System.out.println(String.format("[2020-01-01 12:00:00]上一个星期日: [%s]", DATE_TIME.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY))));
        // 2021-01-01 下一个工作日
        TemporalAdjuster nextWorkingDay = TemporalAdjusters.ofDateAdjuster(temporal -> {
            DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int dayToAdd = 1;
            if (dow == DayOfWeek.FRIDAY) {
                dayToAdd = 3;
            } else if (dow == DayOfWeek.SATURDAY) {
                dayToAdd = 2;
            }
            return temporal.plus(dayToAdd, ChronoUnit.DAYS);
        });
        System.out.println(String.format("[2020-01-01 12:00:00]下一个工作日: [%s]",  DATE_TIME.with(nextWorkingDay)));
        LocalDate date = LocalDate.of(2021, 1, 1).with(temporal -> {
            DayOfWeek dow = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            int dayToAdd = 1;
            if (dow == DayOfWeek.FRIDAY) {
                dayToAdd = 3;
            } else if (dow == DayOfWeek.SATURDAY) {
                dayToAdd = 2;
            }
            return temporal.plus(dayToAdd, ChronoUnit.DAYS);
        });
        System.out.println(String.format("[2020-01-01 12:00:00]下一个工作日: [%s]", date));
    }

    @Test
    public void testFormatter() {
        System.out.println(String.format("ISO_LOCAL_DATE_TIME\t%s", DATE_TIME.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)));
        System.out.println(String.format("ISO_DATE_TIME\t%s", DATE_TIME.format(DateTimeFormatter.ISO_DATE_TIME)));
        System.out.println(String.format("ISO_LOCAL_DATE\t%s", DATE_TIME.format(DateTimeFormatter.ISO_LOCAL_DATE)));
        System.out.println(String.format("ISO_DATE\t%s", DATE_TIME.format(DateTimeFormatter.ISO_DATE)));
        System.out.println(String.format("BASIC_ISO_DATE\t%s", DATE_TIME.format(DateTimeFormatter.BASIC_ISO_DATE)));
        System.out.println(String.format("ISO_ORDINAL_DATE\t%s", DATE_TIME.format(DateTimeFormatter.ISO_ORDINAL_DATE)));
        System.out.println(String.format("ISO_WEEK_DATE\t%s", DATE_TIME.format(DateTimeFormatter.ISO_WEEK_DATE)));
        System.out.println(String.format("ISO_LOCAL_TIME\t%s", DATE_TIME.format(DateTimeFormatter.ISO_LOCAL_TIME)));
        System.out.println(String.format("ISO_TIME\t%s", DATE_TIME.format(DateTimeFormatter.ISO_TIME)));
        /*
         * java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: InstantSeconds
         * System.out.println(String.format("ISO_INSTANT\t%s", DATE_TIME.format(DateTimeFormatter.ISO_INSTANT)));
         *
         * java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: OffsetSeconds
         * System.out.println(String.format("ISO_OFFSET_DATE_TIME\t%s", DATE_TIME.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)));
         * System.out.println(String.format("ISO_ZONED_DATE_TIME\t%s", DATE_TIME.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)));
         * System.out.println(String.format("RFC_1123_DATE_TIME\t%s", DATE_TIME.format(DateTimeFormatter.RFC_1123_DATE_TIME)));
         * System.out.println(String.format("ISO_OFFSET_DATE\t%s", DATE_TIME.format(DateTimeFormatter.ISO_OFFSET_DATE)));
         * System.out.println(String.format("ISO_OFFSET_TIME\t%s", DATE_TIME.format(DateTimeFormatter.ISO_OFFSET_TIME)));
         */
    }

    @Test
    public void testParse() {
        System.out.println(DATE_TIME.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(DATE_TIME.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(LocalDateTime.parse("2021-01-01 12:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        // d. MMMM yyyy
        DateTimeFormatter myFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(". ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.CHINA);
        System.out.println(DATE_TIME.format(myFormatter));
        System.out.println(DATE_TIME.format(DateTimeFormatter.ofPattern("d. MMMM yyyy")));
    }

    @Test
    public void testZone() {
        // ZoneId.getAvailableZoneIds().forEach(System.out::println);
        // System.out.println(TimeZone.getDefault().toZoneId());
        // System.out.println(ZoneId.systemDefault());
        ZoneId shanghai = ZoneId.of("Asia/Shanghai");
        ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
        System.out.println(LocalDate.of(2021, 1, 1).atStartOfDay(shanghai));
        System.out.println(DATE_TIME.atZone(shanghai));
        System.out.println(DATE_TIME.atZone(losAngeles));
        System.out.println(Instant.now().atZone(shanghai));
        System.out.println(Instant.now().atZone(losAngeles));
        System.out.println(LocalDateTime.ofInstant(Instant.now(), shanghai));
        System.out.println(LocalDateTime.ofInstant(Instant.now(), losAngeles));
    }

    public static class NextWorkingDay implements TemporalAdjuster {
        @Override
        public Temporal adjustInto(Temporal temporal) {
            // 获取当前日期
            DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
            // 正常情况加1天
            int dayToAdd = 1;
            if (dayOfWeek == DayOfWeek.FRIDAY) {
                // 周五加3天
                dayToAdd = 3;
            } else if (dayOfWeek == DayOfWeek.SATURDAY) {
                // 周六加2天
                dayToAdd = 2;
            }
            return temporal.plus(dayToAdd, ChronoUnit.DAYS);
        }
    }

}
