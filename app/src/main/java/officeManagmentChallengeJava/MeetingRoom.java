package officeManagmentChallengeJava;

import java.util.ArrayList;
import java.util.Collection;

public class MeetingRoom {
    static ArrayList<String> roomList = new ArrayList<String>();

    private String name;

    //Constructor
    public MeetingRoom(String name) {this.name = name; }

    //Getter
    public String getRoomName() { return this.name; }

    public static void main(String[] args) {
        MeetingRoom office1 = new MeetingRoom("Conference Room 1");
        office1.addRoom();
        MeetingRoom office2 = new MeetingRoom("Conference Room 2");
        office2.addRoom();
        MeetingRoom office3 = new MeetingRoom("Conference Room 3");
        office3.addRoom();
        MeetingRoom.listRooms();
    }

    public String addRoom() {
        name = getRoomName(); {
            roomList.add(name);
        }
        return name;
    }

    public static ArrayList<String> listRooms() {
        String line = String.format("List of all meeting rooms: %s",(roomList));
        System.out.println(line);
        return roomList;
    }
}


