class LowPercentageException extends Exception {
    public LowPercentageException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private double percentage;

    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public void checkBacklog() throws LowPercentageException {
        if (percentage < 40) {
            throw new LowPercentageException(name + " has a backlog in the end term examination.");
        } else {
            System.out.println(name + " does not have any backlog.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 75);
        Student student2 = new Student("Jane", 35);

        try {
            student1.checkBacklog();
            student2.checkBacklog();
        } catch (LowPercentageException e) {
            System.out.println(e.getMessage());
        }
    }
}