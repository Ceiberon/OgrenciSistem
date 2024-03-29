public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    int verbalmat;

    int verbalfiz;

    int verbalkim;

    int matort;

    int fizort;

    int kimort;



    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
        this.verbalmat  = verbalmat;
        this.verbalfiz  = verbalfiz;
        this.verbalkim  = verbalkim;
        this.matort = matort;
        this.fizort = fizort;
        this.kimort = kimort;

    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int verbalmat, int verbalfiz, int verbalkim) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = (int) (mat * 0.8 + verbalmat * 0.2);

        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = (int) (fizik * 0.8 + verbalfiz * 0.2);

        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = (int) (kimya * 0.8 + verbalkim * 0.2);


        }
        calcAvarage();
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
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);

    }

}