package officeManagmentChallengeJava;

public class Availability {

    public static String roomName;
    boolean available = true;

    public Availability(MeetingRoom name) {
        roomName = name.getRoomName();
    }

    public boolean isAvailable(String roomName) {
        System.out.printf("%s is available \n", roomName);
        return available;
    }

    public boolean isNotAvailable(String roomName) {
        available = false;
        System.out.printf("%s is unavailable \n", roomName);
        return available;
    }

    public boolean vacateRoom(String roomName) {
        available = true;
        System.out.printf("%s is now available \n", roomName);
        return available;
    }
}
