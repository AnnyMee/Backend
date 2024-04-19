public class Student {
    private String name;
    private int missedLessons;
    private boolean jobcenter;

    public Student(String name, int missedLessons, boolean jobcenter){
        this.name = name;
        this.missedLessons = missedLessons;
        this.jobcenter = jobcenter;
    }

    @Override
    public String toString() {
        return "\n Name: " + name + ", \n   Lessons missed: " + missedLessons + ", \n   Jobcenter: " + jobcenter;
    }
    public String getName() {
        return name;
    }

    public int getMissedLessons() {
        return missedLessons;
    }

    public boolean isJobcenter() {
        return jobcenter;
    }
}
