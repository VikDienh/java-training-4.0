public class Student {
    private int rating;
    private String name;

    private static int studentCount = 0;
    private static double totalRating = 0.0;

    public Student(String name) {
        this.name = name;
        this.rating = 0;
        studentCount++;
    }

    public static double getAvgRating() {
        if (studentCount == 0){
            return 0.0;
        }
        return totalRating / studentCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        totalRating += rating;
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        return this.getRating() > student.getRating();
    }

    public void changeRating(int rating) {
        totalRating -= this.rating;
        this.rating = rating;
        totalRating += rating;
    }

    public static void removeStudent(Student student) {
        totalRating -= student.getRating();
        studentCount--;
    }

    @Override
    public String toString() {
        return "name " + name + ", rating" + rating;
    }
}