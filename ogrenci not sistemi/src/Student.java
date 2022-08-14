public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat , int matQuiz, int fizik, int fizikQuiz, int kimya, int kimyaQuiz) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
            
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (matQuiz >= 0 && matQuiz <= 100) {
            this.mat.quiz = matQuiz;
        }

        if (fizikQuiz >= 0 && fizikQuiz <= 100) {
            this.fizik.quiz = fizikQuiz;
        }

        if (kimyaQuiz >= 0 && kimyaQuiz <= 100) {
            this.kimya.quiz = kimyaQuiz;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.8) + (this.fizik.quiz * 0.2)) + ((this.kimya.note * 0.8) + (this.kimya.quiz * 0.2) ) + ((this.mat.note * 0.8) + (this.mat.quiz * 0.2))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + "\nMatematik Quiz Notu : " + this.mat.quiz);
        System.out.println("Fizik Notu : " + this.fizik.note + "\nFizik Quiz Notu : " + this.fizik.quiz);
        System.out.println("Kimya Notu : " + this.kimya.note + "\nKimya Quiz Notu : " + this.kimya.quiz);
    }

}
