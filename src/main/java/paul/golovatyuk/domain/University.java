package paul.golovatyuk.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    private List<Teacher> teachers;
    private List<Classroom> classrooms;
    private List<Group> groups;
    private List<Subject> subjects;
    private List<Student> students;
    private List<Clazz> clazzes;

    public University() {
        teachers = new ArrayList<>();
        classrooms = new ArrayList<>();
        groups = new ArrayList<>();
        subjects = new ArrayList<>();
        students = new ArrayList<>();
        clazzes = new ArrayList<>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Clazz> getClazzes() {
        return clazzes;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }
    public void addClassroom(Classroom classroom){
        classrooms.add(classroom);
    }
    public void removeClassroom(Classroom classroom){
        classrooms.remove(classroom);
    }
    public void addGroup(Group group){
        groups.add(group);
    }
    public void removeGroup(Group group){
        groups.remove(group);
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
    public void addSubject(Subject subject){
        subjects.add(subject);
    }
    public void removeSubject(Subject subject){
        subjects.remove(subject);
    }
    public void addClass(Clazz clazz){
        clazzes.add(clazz);
    }
    public void removeClass(Clazz clazz){
        clazzes.remove(clazz);
    }
    public Map <LocalDateTime, Subject> getStudentsScheduleForDay(Student student){
        Map <LocalDateTime, Subject> resultMap = new HashMap<>();
        for (Clazz clazz : clazzes) {
                if (clazz.getSubject().getGroup().equals(student.getGroup())){
                    resultMap.put(clazz.getDateTime(), clazz.getSubject());
                }

        }
        return resultMap;
    }
}
