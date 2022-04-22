package org.starfleet.chronometer;

/**
 * An interface representing a chronometer, capable of telling the time
 */
public interface Chronometer {
    /**
     * @return the difference, measured in milliseconds, between the current time and midnight, January 1, 1970 UTC.
     */
    long currentTimeMillis();
}
