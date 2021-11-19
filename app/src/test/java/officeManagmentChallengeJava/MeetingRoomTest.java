package officeManagmentChallengeJava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeetingRoomTest {
    @Test public void testAddRoom() {
        MeetingRoom office1 = new MeetingRoom("Conference Room 1");
        assertEquals(office1.addRoom(), "Conference Room 1");
    }
}
