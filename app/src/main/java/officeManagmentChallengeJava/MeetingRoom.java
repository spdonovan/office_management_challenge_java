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
    }

    public String addRoom() {
        name = getRoomName(); {
            roomList.add(name);
        }
        return name;
    }

    public static ArrayList<String> listRooms() {
        return roomList;
    }
}


