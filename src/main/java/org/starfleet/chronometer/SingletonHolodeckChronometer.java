package org.starfleet.chronometer;

/**
 * An implementation of the {@link HolodeckChronometer} interface that uses the Singleton design pattern
 */
public class SingletonHolodeckChronometer implements HolodeckChronometer {
    /** Eagerly loaded singleton instance */
    private static final SingletonHolodeckChronometer instance = new SingletonHolodeckChronometer();

    /** The frozen time, if exists */
    private long frozenTime = -1L;

    /** @return The single(ton) instance */
    public static SingletonHolodeckChronometer getInstance() {
        return instance;
    }

    /** private constructor to prevent initialization */
    private SingletonHolodeckChronometer() {}

    @Override
    public void freezeTime(long currentTimeMillies) {
        if (currentTimeMillies < 0L) {
            throw new IllegalArgumentException("currentTimeMillies must be positive");
        }
        frozenTime = currentTimeMillies;
    }

    @Override
    public void unfreezeTime() {
        frozenTime = -1L;
    }

    @Override
    public long currentTimeMillis() {
        if (frozenTime < 0L) {
            return System.currentTimeMillis();
        }
        return frozenTime;
    }
}
