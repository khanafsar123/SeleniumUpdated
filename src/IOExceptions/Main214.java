package IOExceptions;

public class Main214 {
}
class SyntaxStudentException extends Exception{

    SyntaxStudentException(String message) {
        super(message);
    }

}
class Main {

    public static void studentGrade(int grade) throws SyntaxStudentException {
        if(grade>90) {
            throw new SyntaxStudentException ("You are an exceptionally awesome student");
        }
        else if(grade<90){
            System.out.println("You are a great student");
        }
    }

    public static void main(String[] args) {
        try{
            studentGrade(99);
        } catch(Exception e) {
            System.out.println(e);
        }

    }

}

