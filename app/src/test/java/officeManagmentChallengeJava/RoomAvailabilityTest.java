package officeManagmentChallengeJava;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test public void testListOfAvailableRooms() {
        Availability TestRoom2 = new Availability(new MeetingRoom("Conference Room 2"));
        TestRoom2.isNotAvailable("Conference Room 2");
        assertFalse(MeetingRoom.listRooms().contains("Conference Room 2"));

    }
}
