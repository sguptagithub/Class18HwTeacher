package class18HwTeacher;

public class Teacher {

        private String name;
        private int age;

        public Teacher(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void teach() {
            System.out.println("The teacher is teaching.");
        }

        public void grade() {
            System.out.println("The teacher is grading.");
        }
    }

    class MathTeacher extends Teacher {
        public MathTeacher(String name, int age) {
            super(name, age);
        }

        public void teach() {
            System.out.println("The math teacher is teaching math.");
        }
    }

    class ChemistryTeacher extends Teacher {
        public ChemistryTeacher(String name, int age) {
            super(name, age);
        }

        public void teach() {
            System.out.println("The chemistry teacher is teaching chemistry.");
        }
    }

    class PianoTeacher extends Teacher {
        public PianoTeacher(String name, int age) {
            super(name, age);
        }

        public void teach() {
            System.out.println("The piano teacher is teaching piano.");
        }
    }


