package officeManagmentChallengeJava;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoomAvailabilityTest {
    @Test public void testRoomIsAvailable() {
        Availability TestRoom = new Availability(new MeetingRoom("Conference Room 1"));
        assertTrue(TestRoom.isAvailable(Availability.roomName));
    }

    @Test public void testRoomIsNotAvailable() {
        Availability TestRoom = new Availability(new MeetingRoom("Conference Room 1"));
        assertFalse(TestRoom.isNotAvailable(Availability.roomName));
    }

    @Test public void testMakeRoomAvailable() {
        Availability TestRoom = new Availability(new MeetingRoom("Conference Room 1"));
        TestRoom.isNotAvailable("Conference Room 1");
        assertTrue(TestRoom.vacateRoom(Availability.roomName));
    }
}
