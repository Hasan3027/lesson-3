package uz.shift;

public class Group {
    private int id;

    private String name;

    private Timetable[] timetables;

    public Group(int id, String name, Timetable[] timetables) {
        this.id = id;
        this.name = name;
        this.timetables = timetables;
    }
}
