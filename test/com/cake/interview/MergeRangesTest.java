package com.cake.interview;

import static com.cake.interview.Meeting.mergeRanges;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MergeRangesTest {

    @Test
    public void meetingsOverlapTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(2, 4));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(1, 4));
        assertEquals(expected, actual);
    }

    @Test
    public void  meetingsTouchTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(5, 6), new Meeting(6, 8));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(5, 8));
        assertEquals(expected, actual);
    }

    @Test
    public void meetingContainsOtherMeetingTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 8), new Meeting(2, 5));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(1, 8));
        assertEquals(expected, actual);
    }

    @Test
    public void meetingsStaySeparateTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(4, 8));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(
                new Meeting(1, 3), new Meeting(4, 8)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void multipleMergedMeetingsTest() {
        final List<Meeting> meetings = Arrays.asList(
                new Meeting(1, 4), new Meeting(2, 5), new Meeting (5, 8));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(1, 8));
        assertEquals(expected, actual);
    }

    @Test
    public void meetingsNotSortedTest() {
        final List<Meeting> meetings = Arrays.asList(
                new Meeting(5, 8), new Meeting(1, 4), new Meeting(6, 8));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(
                new Meeting(1, 4), new Meeting(5, 8)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void oneLongMeetingContainsSmallerMeetingsTest() {
        final List<Meeting> meetings = Arrays.asList(
                new Meeting(1, 10), new Meeting(2, 5), new Meeting(6, 8),
                new Meeting(9, 10), new Meeting(10, 12)
        );
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(
                new Meeting(1, 12)
        );
        assertEquals(expected, actual);
    }

    @Test
    public void sampleInputTest() {
        final List<Meeting> meetings = Arrays.asList(
                new Meeting(0, 1), new Meeting(3, 5), new Meeting(4, 8),
                new Meeting(10, 12), new Meeting(9, 10)
        );
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(
                new Meeting(0, 1), new Meeting(3, 8), new Meeting(9, 12)
        );
        assertEquals(expected, actual);
    }
}
