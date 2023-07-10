package example.domain.type.time;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 15分単位の時間
 */
 // TODO: ドメイン(ビジネス)への移動を検討した方がいいかもしれない
public class QuarterHour {

    Minute value;

    public QuarterHour() {
        this(new Minute(0));
    }

    public QuarterHour(Minute value) {
        this.value = value;
    }

    public QuarterHour(Hour hour) {
        this(hour.toMinute());
    }

    public Minute minute() {
        return value;
    }

    public QuarterHour subtract(QuarterHour other) {
        return new QuarterHour(value.subtract(other.value));
    }

    public QuarterHour add(QuarterHour other) {
        return new QuarterHour(value.add(other.value));
    }

    @Override
    public String toString() {
        return HourAndMinute.from(value).toString();
    }

    public BigDecimal bigDecimalValue() {
        return value.bigDecimalValue().divide(BigDecimal.valueOf(60), 2, RoundingMode.UNNECESSARY);
    }

    public boolean moreThan(QuarterHour other) {
        return moreThan(other.value);
    }

    public QuarterHour overMinute(QuarterHour other) {
        return overMinute(other.value);
    }

    public boolean moreThan(Minute other) {
        return this.value.moreThan(other);
    }

    public boolean moreThan(Hour hour) {
        return moreThan(hour.toMinute());
    }

    public QuarterHour overMinute(Minute other) {
        if (value.lessThan(other)) {
            return new QuarterHour(new Minute(0));
        }
        return new QuarterHour(value.subtract(other));
    }
}
