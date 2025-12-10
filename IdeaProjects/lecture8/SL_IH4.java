package lecture8;

class Book{
    void read(){
        System.out.println("I'm reading the book.");
    }
}
class Novel extends Book{
    void storyLine(){
        System.out.println("The storyline of the novel is Doop..");
    }
}
public class SL_IH4 {
    public static void main(String[] args){
        Novel N= new Novel();
        N.read();
        N.storyLine();
    }
}
