package com.cake.interview;

import java.util.*;

import static java.util.Collections.sort;

public class Meeting {

    private int startTime;
    private int endTime;

    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Meeting)) {
            return false;
        }
        final Meeting meeting = (Meeting) o;
        return startTime == meeting.startTime && endTime == meeting.endTime;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + startTime;
        result = result * 31 + endTime;
        return result;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", startTime, endTime);
    }

    public static List<Meeting> mergeRanges(List<Meeting> meetings) {

        List<Meeting> sortedListOfMeetings = new ArrayList<>();
        List<Meeting> mergedMeetings = new ArrayList<>();
        int mergedMeetingIndex = 0;

        for(Meeting meeting : meetings) sortedListOfMeetings.add(new Meeting(meeting.getStartTime(), meeting.getEndTime()));

        sort(sortedListOfMeetings, new Comparator<Meeting>(){
            @Override
            public int compare(Meeting m1, Meeting m2){
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        mergedMeetings.add(sortedListOfMeetings.get(0));


        for(int indexForSortedListOfMeetings = 1; indexForSortedListOfMeetings < sortedListOfMeetings.size(); indexForSortedListOfMeetings++){

            int nextStartTime = sortedListOfMeetings.get(indexForSortedListOfMeetings).getStartTime();
            int nextEndTime = sortedListOfMeetings.get(indexForSortedListOfMeetings).getEndTime();

            int mostRecentMergedStartTime = mergedMeetings.get(mergedMeetingIndex).getStartTime();
            int mostRecentMergedEndTime = mergedMeetings.get(mergedMeetingIndex).getEndTime();

            if (nextStartTime <= mostRecentMergedStartTime) {
                if(nextEndTime >= mostRecentMergedEndTime) {
                    mergedMeetings.get(mergedMeetingIndex).setStartTime(nextStartTime);
                    mergedMeetings.get(mergedMeetingIndex).setEndTime(nextEndTime);
                }
                else mergedMeetings.get(mergedMeetingIndex).setStartTime(nextStartTime);
            }

            else if(nextStartTime >= mostRecentMergedStartTime && nextStartTime <= mostRecentMergedEndTime) {
                if(nextEndTime >= mostRecentMergedEndTime) {
                    mergedMeetings.get(mergedMeetingIndex).setEndTime(nextEndTime);
                }
                else mergedMeetingIndex=mergedMeetings.size()-1;
            }
            else {
                mergedMeetings.add(sortedListOfMeetings.get(indexForSortedListOfMeetings));
                mergedMeetingIndex=mergedMeetings.size()-1;
            }
        }

        return mergedMeetings;
    }
}
