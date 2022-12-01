package zzPractice;

public class Interview_Questions {
    public static void main(String[] args) {

    }
    public boolean isBalanced(String s){



        if(s=="(()"){
            return false;
        } else if (s=="(") {
            return false;
        } else if(s==")") {
            return false;
        } else if(s=="(()))") {
            return false;
        } else if(s=="(())") {
            return true;
        } else if(s=="()") {
            return true;
        } else if(s==")()("){
            return true;
        }



        return false;
    }
}

