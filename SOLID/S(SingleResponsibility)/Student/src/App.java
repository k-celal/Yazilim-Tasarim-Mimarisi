public class App {

    public static void main(String[] args) {
        StudentUymayan studentuymayan = new StudentUymayan("John Doe", "12345");
        studentuymayan.displayStudentInfo();

        studentuymayan.saveToDatabase(); // Bu, SRP'ye aykırıdır
        StudentUyan studentuyan = new StudentUyan("John Doe", "12345");
        studentuyan.displayStudentInfo();

        StudentRepository repository = new StudentRepository();
        repository.saveToDatabase(studentuyan);
    }
}
