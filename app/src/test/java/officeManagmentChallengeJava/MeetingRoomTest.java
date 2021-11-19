package officeManagmentChallengeJava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeetingRoomTest {
    @Test public void testAddRoom() {
        MeetingRoom TestRoom = new MeetingRoom("Conference Room Test");
        assertEquals(TestRoom.addRoom(), "Conference Room Test");
    }
}
