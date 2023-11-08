public class StudentUyan {
    /*Tek Sorumluluk İlkesi, bir sınıfın yalnızca bir nedenden dolayı değişmesi gerektiğini ifade eder. 
    Yani bir sınıfın yalnızca bir görevi (sorumluluğu) olmalıdır. */
    private String name;
    private String rollNumber;

    public StudentUyan(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Getter ve setter metotları burada

    public void displayStudentInfo() {
        System.out.println("Öğrenci Adı: " + name);
        System.out.println("Öğrenci Numarası: " + rollNumber);
    }    
}
