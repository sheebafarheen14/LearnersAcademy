package com.simplilearn.model;

public class Class {

	private String classId;
    private String className;
    private String teacherName;
    private int roomNumber;

    // Constructors
    public Class() {
    }

    public Class(String classId, String className, String teacherName, int roomNumber) {
        this.classId = classId;
        this.className = className;
        this.teacherName = teacherName;
        this.roomNumber = roomNumber;
    }

    // Getter and Setter methods
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
