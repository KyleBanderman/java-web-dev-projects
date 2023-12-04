public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        //constructor
        public Student(String aName, int aStudentId, int aNumberOfCredits, double aGpa) {
                this.name = aName;
                this.studentId = aStudentId;
                this.numberOfCredits = aNumberOfCredits;
                this.gpa = aGpa;
        }
        //getters
        public String getName() {
                return name;
        }

        public int getStudentId() {
                return studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        //setters
        private void setName(String aName) {
                name = aName;
        }

        public void setStudentId(int aStudentId) {
                studentId = aStudentId;
        }

        public void setNumberOfCredits(int aNumberOfCredits) {
                numberOfCredits = aNumberOfCredits;
        }

        public void setGpa(double aGpa) {
                gpa = aGpa;
        }

}
