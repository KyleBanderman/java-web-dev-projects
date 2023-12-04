package org.launchcode;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return String.format("%s is the instructor for %s and they have %d students enrolled",
                this.instructor, this.topic, this.enrolledStudents.size());
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public String getTopic() {return this.topic;}
    public Teacher getInstructor() {return this.instructor;}
    public ArrayList<Student> getEnrolledStudents() {return this.enrolledStudents;}

    public boolean equals(Object compared) {
        if (compared == this) {
            return true;
        }
        if (compared == null) {
            return false;
        }
        if (compared.getClass() != getClass()) {
            return false;
        }
        Course course = (Course) compared;
        return course.getInstructor() == getInstructor();
    }

}
