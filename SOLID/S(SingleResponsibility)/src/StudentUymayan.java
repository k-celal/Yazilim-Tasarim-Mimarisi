public class StudentUymayan {
    private String name;
    private String rollNumber;

    public StudentUymayan(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Getter ve setter metotları burada

    public void displayStudentInfo() {
        System.out.println("Öğrenci Adı: " + name);
        System.out.println("Öğrenci Numarası: " + rollNumber);
    }
    
    public void saveToDatabase() {
        // Öğrenci bilgilerini veritabanına kaydetme işlemi burada gerçekleştirilir
        System.out.println("Öğrenci bilgileri veritabanına kaydedildi.");
    }
}
