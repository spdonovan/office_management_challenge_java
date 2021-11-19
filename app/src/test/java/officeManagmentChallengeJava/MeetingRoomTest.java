package officeManagmentChallengeJava;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MeetingRoomTest {
    @Test public void testAddRoom() {
        MeetingRoom TestRoom = new MeetingRoom("Conference Room Test");
        assertEquals(TestRoom.addRoom(), "Conference Room Test");
    }

    @Test public void testListRooms(){
        MeetingRoom TestRoom1 = new MeetingRoom("Conference Room Test 1");
        TestRoom1.addRoom();
        MeetingRoom TestRoom2 = new MeetingRoom("Conference Room Test 2");
        TestRoom2.addRoom();
        MeetingRoom TestRoom3 = new MeetingRoom("Conference Room Test 3");
        TestRoom3.addRoom();
        assertTrue(MeetingRoom.listRooms().contains("Conference Room Test 1"));
        assertTrue(MeetingRoom.listRooms().contains("Conference Room Test 2"));
        assertTrue(MeetingRoom.listRooms().contains("Conference Room Test 3"));
    }
}
