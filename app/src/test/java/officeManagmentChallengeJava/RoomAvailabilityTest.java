package officeManagmentChallengeJava;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RoomAvailabilityTest {
    @Test public void testRoomIsAvailable() {
        Availability TestRoom = new Availability(new MeetingRoom("Conference Room 1"));
        assertTrue(TestRoom.isAvailable(Availability.roomName));
    }
}
