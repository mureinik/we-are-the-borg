package org.starfleet.chronometer;

/**
 * An interface representing a {@link Chronometer} where the time can be controlled by the user
 */
public interface HolodeckChronometer extends Chronometer {
    /**
     * Sets the current time to a predetermined value
     * @param currentTimeMillies The time to set, represented in milliseconds from midnight, January 1, 1970 UTC.
     */
    void freezeTime(long currentTimeMillies);

    /**
     * Releases the <code>HolodeckChronometer</code> to resume tracking the real time
     */
    void unfreezeTime();

    /**
     * If {@link #freezeTime(long)} had been called, returns the time it was frozen to, otherwise return the real time.
     * @return A time represented as milliseconds from midnight, January 1, 1970 UTC
     */
    @Override
    long currentTimeMillis();
}
