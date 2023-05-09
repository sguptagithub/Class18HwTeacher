package class18HwTeacher;

public class TestTeacher {

        public static void main(String[] args) {
            Teacher teacher = new Teacher("John", 35);
            MathTeacher mathTeacher = new MathTeacher("Alice", 30);
            ChemistryTeacher chemistryTeacher = new ChemistryTeacher("Bob", 40);
            PianoTeacher pianoTeacher = new PianoTeacher("Carol", 25);

            System.out.println(teacher.getName() + " is a teacher.");
            teacher.teach();
            teacher.grade();

            System.out.println(mathTeacher.getName() + " is a math teacher.");
            mathTeacher.teach();
            mathTeacher.grade();

            System.out.println(chemistryTeacher.getName() + " is a chemistry teacher.");
            chemistryTeacher.teach();
            chemistryTeacher.grade();

            System.out.println(pianoTeacher.getName() + " is a piano teacher.");
            pianoTeacher.teach();
            pianoTeacher.grade();
        }
    }


