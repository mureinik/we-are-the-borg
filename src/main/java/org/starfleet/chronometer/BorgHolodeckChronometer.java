package org.starfleet.chronometer;

/**
 * A Borg implementation of the {@link HolodeckChronometer} interface.
 * It can be instantiated an arbitrary number of times, but they'll all have the same state
 */
public class BorgHolodeckChronometer implements HolodeckChronometer {
    /**
     * The frozen time.
     * Note that it is <code>static</code>, meaning all the <code>BorgHolodeckChronometer</code>s will have the same
     * state.
     */
    private static long frozenTime = -1L;

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
